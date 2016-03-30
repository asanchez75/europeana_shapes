/**
 * 
 */
package eu.europeana.edm.shapes.doc;

import java.awt.SystemColor;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.TreeSet;

import org.apache.commons.io.IOUtils;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.NodeIterator;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.ResIterator;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.Statement;
import org.apache.jena.rdf.model.StmtIterator;
import org.apache.jena.util.FileUtils;
import org.topbraid.spin.util.JenaUtil;
import org.apache.jena.vocabulary.DCTerms;
import org.apache.jena.vocabulary.RDF;
import org.apache.jena.vocabulary.DC;
import org.apache.jena.vocabulary.OWL;
import org.topbraid.shacl.vocabulary.SH;

import eu.europeana.edm.shapes.validation.ShapeChecker;
import static org.apache.commons.io.FileUtils.*;

/**
 * @author Hugo Manguinhas <hugo.manguinhas@europeana.eu>
 * @since 8 Mar 2016
 */
public class ShapesDocGenerator
{
    private static Map<String,String> _prefixes = new LinkedHashMap();
    private static String             CARDINALITY
        = "http://www.europeana.eu/schemas/edm/shapes/categories#cardinality";
    private static String             TYPE
        = "http://www.europeana.eu/schemas/edm/shapes/categories#type";
    private static Comparator<String> COMPARATOR = new PropertyComparator();

    static {
        _prefixes.put(RDF.uri                                   , "rdf");
        _prefixes.put("http://www.w3.org/2004/02/skos/core#"    , "skos");
        _prefixes.put("http://www.w3.org/2003/01/geo/wgs84_pos#", "wgs84_pos");
        _prefixes.put(DC.NS                                     , "dc");
        _prefixes.put(DCTerms.NS                                , "dct");
        _prefixes.put("http://xmlns.com/foaf/0.1/"              , "foaf");
        _prefixes.put("http://www.openarchives.org/ore/terms/"  , "ore");
        _prefixes.put("http://rdvocab.info/ElementsGr2/"        , "rdaGr2");
        _prefixes.put("http://www.europeana.eu/schemas/edm/"    , "edm");
        _prefixes.put(OWL.NS                                    , "owl");
        _prefixes.put(SH.NS                                     , SH.PREFIX);
    }

    private ShapesDefinitionParser _parser    = new ShapesDefinitionParser();
    private ShapeChecker           _checker   = new ShapeChecker();
    private Map<String,String>     _defs      = null;
    private Properties             _props     = null;

    public ShapesDocGenerator(Properties props) { _props = props; }

    public void genAllDocumentation(File dirDef, File dirOut) throws IOException
    {
        String[] exts = new String[] { "ttl" };
        for ( File file : (Collection<File>)listFiles(dirDef, exts, true) )
        {
            File out = new File(dirOut, getFilenameWithoutExt(file) + ".md");
            try { genDocumentation(file, out); }
            catch (Throwable t)
            {
                throw new RuntimeException(
                    "Error processing file: " + file.getName(), t);
            }
        }
    }

    public synchronized void genDocumentation(File def, File out)
           throws IOException
    {
        Model    model = loadModel(def);
        if ( !_checker.check(model) ) { return; }

        Resource shape = getShape(model);
        if ( shape == null ) { return; }

        PrintStream ps = new PrintStream(out);
        try {

            _defs = _parser.loadDefinitions(def);

            Resource scopeClass = getScopeClass(shape);
            printClassHeader(scopeClass, ps);
            printClassDescription(shape, def, ps);
            printConstraintTable(shape, ps);
            printTemplateDocument(scopeClass, ps);
            printConstraintDefinitions(shape, ps);
            ps.flush();
        }
        finally { IOUtils.closeQuietly(ps); }
    }

    private String getFilenameWithoutExt(File file)
    {
        String name = file.getName();
        int i = name.indexOf('.');
        return (i < 0 ? name : name.substring(0, i));
    }

    private Resource getShape(Model model)
    {
        ResIterator iter = model.listResourcesWithProperty(RDF.type, SH.Shape);
        return ( iter.hasNext() ? iter.next() : null );
    }

    private String getPrefixedName(Resource rsrc)
    {
        String uri = rsrc.getURI();
        for ( String ns : _prefixes.keySet() )
        {
            if ( !uri.startsWith(ns) ) { continue; }
            return (_prefixes.get(ns) + ':' + uri.substring(ns.length()));
        }
        return uri;
    }

    private String getLocalName(Resource rsrc)
    {
        String uri = rsrc.getURI();
        return uri.substring(uri.lastIndexOf('#')+1);
    }

    private String getLocalReference(Resource rsrc)
    {
        String name = getPrefixedName(rsrc);
        return name.replace("://", "_").replaceAll("[/#.:]", "_");
    }

    private String getCardinality(Resource rsrc)
    {
        Statement stmt;
        stmt = rsrc.getProperty(SH.minCount);
        String min = (stmt == null ? "?" : stmt.getLiteral().getString());

        stmt = rsrc.getProperty(SH.maxCount);
        String max = (stmt == null ? "?" : stmt.getLiteral().getString());
        return (min + ".." + max);
    }

    private String getType(Resource rsrc)
    {
        Statement stmt = rsrc.getProperty(SH.nodeKind);
        return (stmt == null ? "" : getLocalName(stmt.getResource()));
    }

    private Collection<String> getProperties(Resource c)
    {
        Collection<String> ret = new TreeSet(COMPARATOR);
        NodeIterator iter = c.getModel().listObjectsOfProperty(SH.predicate);
        while(iter.hasNext())
        {
            ret.add(iter.next().asResource().getURI());
        }
        return ret;
    }

    private Collection<Resource> getConstraints(Resource shape, Resource scope)
    {
        Collection<String> constrs = new TreeSet();
        getConstraints(shape, scope, SH.inverseProperty, constrs);
        getConstraints(shape, scope, SH.property       , constrs);
        getConstraints(shape, scope, SH.constraint     , constrs);

        Model model = shape.getModel();
        Collection<Resource> ret = new ArrayList(constrs.size());
        for ( String c : constrs ) { ret.add(model.getResource(c)); }

        return ret;
    }

    private void getConstraints(Resource shape, Resource scope, Property p
                              , Collection<String> col)
    {
        StmtIterator iter = shape.listProperties(p);
        while(iter.hasNext())
        {
            Resource constr = iter.next().getObject().asResource();
            if ( isAboutProperty(constr, scope) ) { col.add(constr.getURI()); }
        }
    }

    private Resource getScopeClass(Resource shape)
    {
        StmtIterator iter = shape.listProperties(SH.scopeClass);
        while ( iter.hasNext() )
        {
            return iter.next().getObject().asResource();
        }
        return null;
    }

    private String getMetadataDescription(Resource constraint)
    {
        StmtIterator iter = constraint.listProperties(SH.description);
        while ( iter.hasNext() )
        {
            return iter.next().getObject().asLiteral().getString();
        }
        return "";
    }

    private boolean isCardinalityConstraint(Resource c)
    {
        return c.hasProperty(DC.type, c.getModel().getResource(CARDINALITY));
    }

    private boolean isTypeConstraint(Resource c)
    {
        return c.hasProperty(DC.type, c.getModel().getResource(TYPE));
    }

    private boolean isAboutProperty(Resource constraint, Resource scopeProp)
    {
        String ref = getLocalReference(scopeProp);
        return ( constraint.isURIResource()
              && constraint.getURI().contains(ref) );
    }

//PRINTING
    private String getRemoteURL(File file)
    {
        return (_props.getProperty("shapes.src") + file.getName());
    }

    private void printClassHeader(Resource c, PrintStream ps)
    {
        ps.println("## Shapes definitions for "
                 + getPrefixedName(c) + " class");
    }

    private void printClassDescription(Resource shape, File file
                                     , PrintStream ps)
    {
        String swURL = "https://github.com/hugomanguinhas/europeana_shapes/tree/master/shapes-doc";
        ps.println("*This document was generated from the [shapes file]("
                 + getRemoteURL(file) + ") using [this software](" + swURL 
                 + ")*");
        StmtIterator iter = shape.listProperties(SH.description);
        while ( iter.hasNext() )
        {
            ps.println("> " + iter.next().getLiteral().getString()
                                  .replaceAll("\\s+", " "));
        }
        ps.println();
        ps.println("The following table shows an overview of the contraints "
                 + "divided per property:");
        ps.println();
    }

    private void printPropertyHeader(Resource prop, PrintStream ps)
    {
        ps.print("#### Property ");
        String uri = prop.getURI();
        printReference(uri, uri, getLocalReference(prop), true, ps);
        ps.println();
        ps.println("------");
    }

    private void printConstraintHeader(Resource constraint, PrintStream ps)
    {
        String ref = getLocalReference(constraint);
        String uri = constraint.getURI();
        ps.print("###### ");
        printReference(uri, uri, ref, true, ps);
        ps.println();
        ps.println("------");
    }

    private void printReference(String name, String url
                              , String id, boolean target, PrintStream ps)
    {
        String strID  = (id == null ? "" : "id=\"" + id + "\" ");
        String strTrg = (target ? "target=\"_blank\" " : "");
        ps.print("<a " + strID + strTrg + "href=\"" + url + "\">"
               + name + "</a>");
    }

    private void printCardinalityConstraint(Collection<Resource> constraints
                                          , PrintStream ps)
    {
        for ( Resource constraint : constraints )
        {
            if ( !isCardinalityConstraint(constraint) ) { continue; }

            printReference(getCardinality(constraint)
                         , "#" + getLocalReference(constraint)
                         , null, false, ps);
        }
    }

    private void printTypeConstraint(Collection<Resource> constraints
                                   , PrintStream ps)
    {
        for ( Resource constraint : constraints )
        {
            if ( !isTypeConstraint(constraint) ) { continue; }
            
            printReference(getType(constraint)
                         , "#" + getLocalReference(constraint)
                         , null, false, ps);
        }
    }

    private void printConstraintReferences(Collection<Resource> constraints
                                         , PrintStream ps)
    {
        boolean first = true;
        for( Resource constraint : constraints )
        {
            if ( isCardinalityConstraint(constraint) ) { continue; }
            if ( isTypeConstraint(constraint)        ) { continue; }

            String name = getLocalName(constraint);
            if ( first ) { first = false; } else { ps.print(", "); }

            printReference(name, "#" + getLocalReference(constraint), null
                         , false, ps);
        }
    }

    private void printConstraintTable(Resource shape, PrintStream ps)
    {
        ps.println("| Property | Cardinality | Value Type | Constraints |");
        ps.println("| --- | --- | --- | --- |");
        for(String uri : getProperties(shape))
        {
            Resource prop = shape.getModel().getResource(uri);
            Collection<Resource> constraints = getConstraints(shape, prop);
            ps.print("|");
            String name = getPrefixedName(prop);
            printReference(name, "#" + getLocalReference(prop)
                         , null, false, ps);
            ps.print("|");
            printCardinalityConstraint(constraints, ps);
            ps.print("|");
            printTypeConstraint(constraints, ps);
            ps.print("|");
            printConstraintReferences(constraints, ps);
            ps.println("|");
        }
    }

    private void printTemplateDocument(Resource scopeClass, PrintStream ps)
    {
        String name = scopeClass.getLocalName();
        String rsrc = _props.getProperty("data.templates." + name.toLowerCase());
        if ( rsrc == null ) { return; }

        try
        {
            ps.println();
            ps.println("**** An example of a " + scopeClass + " class resource");
            String str = FileUtils.readWholeFileAsUTF8(
                    ClassLoader.getSystemResourceAsStream(rsrc));
            ps.println("*Shape definition in Turtle syntax:*");
            ps.println("```");
            ps.println(str);
            ps.println("```");
            ps.println();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void printConstraintDefinitions(Resource shape, PrintStream ps)
    {
        for(String uri : getProperties(shape))
        {
            Resource prop = shape.getModel().getResource(uri);

            printPropertyHeader(prop, ps);

            Collection<Resource> consts = getConstraints(shape, prop);
            for ( Resource c : consts ) { printConstraintDefinition(c, ps); }
        }
    }

    private void printConstraintDefinition(Resource constraint, PrintStream ps)
    {
        printConstraintHeader(constraint, ps);
        printMetadata(constraint, ps);
        printRule(constraint, ps);
    }

    private void printMetadata(Resource constraint, PrintStream ps)
    {
        ps.println("<table>");
        printMetadataDescription(constraint, ps);
        printMetadataSubject(constraint, ps);
        printMetadataType(constraint, ps);
        ps.println("</table>");
    }

    private void printMetadataDescription(Resource constraint, PrintStream ps)
    {
        ps.print("<tr><th align=\"right\">description</th><td>");
        ps.print(getMetadataDescription(constraint));
        ps.println("</td></tr>");
    }

    private void printMetadataSubject(Resource constraint, PrintStream ps)
    {
        ps.print("<tr><th align=\"right\">subject</th><td>");

        boolean first = true;
        StmtIterator iter = constraint.listProperties(DC.subject);
        while ( iter.hasNext() )
        {
            if ( first ) { first = false; } else { ps.print(", "); }

            String subject = iter.next().getObject().asLiteral().getString();
            printReference(subject, RDFAP.getRequirementURL(subject)
                         , null, true, ps);
        }

        ps.println("</td></tr>");
    }

    private void printMetadataType(Resource constraint, PrintStream ps)
    {
        ps.print("<tr><th align=\"right\">type</th><td>");

        boolean first = true;
        StmtIterator iter = constraint.listProperties(DC.type);
        while ( iter.hasNext() )
        {
            if ( first ) { first = false; } else { ps.print(", "); }

            String type = iter.next().getObject().asResource().getURI();
            printReference(type, type, null, true, ps);
        }

        ps.println("</td></tr>");
    }

    private void printRule(Resource constraint, PrintStream ps)
    {
        ps.println("*Shape definition in Turtle syntax:*");
        ps.println("```");
        ps.print(_defs.get(constraint.getURI()));
        ps.println("```");
    }

    private Model loadModel(File file) throws FileNotFoundException
    {
        FileInputStream fis = new FileInputStream(file);
        try {
            Model model = JenaUtil.createMemoryModel();
            model.read(fis, "urn:dummy", FileUtils.langTurtle);
            return model;
        }
        finally { IOUtils.closeQuietly(fis); }
    }

    private static class PropertyComparator implements Comparator<String>
    {

        @Override
        public int compare(String p1, String p2)
        {
            int i1 = getNamespaceIndex(p1);
            int i2 = getNamespaceIndex(p2);
            return (i1 == i2 ? p1.compareTo(p2) : i1-i2);
        }

        private int getNamespaceIndex(String p)
        {
            int index = 0;
            for ( String uri : _prefixes.keySet() )
            {
                if ( p.startsWith(uri) ) { return index; }
                index++;
            }
            return index;
        }
    }
}
