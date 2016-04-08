/**
 * 
 */
package eu.europeana.edm.shapes.doc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

import org.apache.commons.io.IOUtils;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.NodeIterator;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.RDFList;
import org.apache.jena.rdf.model.RDFNode;
import org.apache.jena.rdf.model.ResIterator;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.Statement;
import org.apache.jena.rdf.model.StmtIterator;
import org.apache.jena.util.FileUtils;
import org.topbraid.spin.util.JenaUtil;
import org.apache.jena.vocabulary.RDF;
import org.apache.jena.vocabulary.DC;
import org.topbraid.shacl.vocabulary.SH;

import eu.europeana.edm.shapes.check.ShapeChecker;
import eu.europeana.github.MarkDownWriter;
import static org.apache.commons.io.FileUtils.*;

/**
 * @author Hugo Manguinhas <hugo.manguinhas@europeana.eu>
 * @since 8 Mar 2016
 */
public class ShapesDataGenerator extends DocGenerator
{
    private static String             CARDINALITY
        = "http://www.europeana.eu/schemas/edm/shapes/categories#cardinality";
    private static String             TYPE
        = "http://www.europeana.eu/schemas/edm/shapes/categories#type";
    private static Comparator<String> COMPARATOR = new PropertyComparator();

    private ShapesDefinitionParser _parser    = new ShapesDefinitionParser();
    private ShapeChecker           _checker   = new ShapeChecker();
    private Map<String,String>     _defs      = null;

    public ShapesDataGenerator(GeneratorConfig config) { super(config); }


    /***************************************************************************
     * Public Methods
     **************************************************************************/
    @Override
    public void generate()
    {
        genAllDocumentation(_config.getFile("shapes.edm.data")
                          , _config.getFile("shapes.edm.doc"));
    }


    /***************************************************************************
     * Private Methods - Generation
     **************************************************************************/

    private void genAllDocumentation(File dirDef, File dirOut)
    {
        dirOut.mkdirs();

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

    private synchronized void genDocumentation(File def, File out)
           throws IOException
    {
        Model    model = loadModel(def);
        if ( !_checker.check(model) ) { return; }

        Resource shape = getShape(model);
        if ( shape == null ) { return; }

        MarkDownWriter w = new MarkDownWriter(out);
        try {

            _defs = _parser.loadDefinitions(def);

            Resource scopeClass = getScopeClass(shape);
            printClassHeader(scopeClass, w);
            printClassDescription(shape, def, w);
            printConstraintTable(shape, w);
            printTemplateDocument(scopeClass, w);
            printConstraintDefinitions(shape, w);
            w.flush();
        }
        finally { IOUtils.closeQuietly(w); }
    }


    /***************************************************************************
     * Private Methods - Printing
     **************************************************************************/

    private void printClassHeader(Resource c, MarkDownWriter ps)
    {
        ps.printH2("Shapes definitions for " + _config.getPrefixedName(c) + " class");
    }

    private void printClassDescription(Resource shape, File file
                                     , MarkDownWriter w)
    {
        w.printItalic("This document was generated from the [shapes file]("
                    + _config.toRemote(file) + ") using this [software](/shapes-doc)")
                    .println();
        StmtIterator iter = shape.listProperties(SH.description);
        while ( iter.hasNext() )
        {
            String s = iter.next().getLiteral().getString();
            w.printQuoted(s.replaceAll("\\s+", " "));
        }
    }

    private void printPropertyHeader(Resource prop, MarkDownWriter w)
    {
        w.print("#### Property ");
        String uri = prop.getURI();
        w.printLink(uri, uri, getLocalReference(prop), true);
        w.println();
        w.printSeparator();
    }

    private void printConstraintHeader(Resource constraint, MarkDownWriter w)
    {
        String ref = _config.getShapeConstraintLocalRef(constraint);
        String uri = constraint.getURI();
        w.printH5("Constraint " + w.newLink(uri, uri, ref, true));
    }

    private void printCardinalityConstraint(Collection<Resource> constraints
                                          , MarkDownWriter w)
    {
        for ( Resource constraint : constraints )
        {
            if ( !isCardinalityConstraint(constraint) ) { continue; }

            w.printLink(getCardinality(constraint)
                      , "#" + _config.getShapeConstraintLocalRef(constraint)
                      , null, false);
            return;
        }
        w.print("0..*");
    }

    private void printTypeConstraint(Collection<Resource> constraints
                                   , MarkDownWriter w)
    {
        for ( Resource constraint : constraints )
        {
            if ( !isTypeConstraint(constraint) ) { continue; }
            
            w.printLink(getType(constraint)
                      , "#" + _config.getShapeConstraintLocalRef(constraint)
                      , null, false);
        }
    }

    private void printConstraintReferences(Collection<Resource> constraints
                                         , MarkDownWriter w)
    {
        boolean first = true;
        for( Resource constraint : constraints )
        {
            if ( isCardinalityConstraint(constraint) ) { continue; }
            if ( isTypeConstraint(constraint)        ) { continue; }

            String name = getLocalName(constraint);
            if ( first ) { first = false; } else { w.print(", "); }

            w.printLink(name, "#" + _config.getShapeConstraintLocalRef(constraint)
                      , null, false);
        }
    }

    private void printConstraintTable(Resource shape, MarkDownWriter w)
    {
        Model model = shape.getModel();
        w.printParagraph("The following constraints apply to shape or are not "
                       + "restricted to a specific property:");
        printClassConstraintsTable(shape, w);

        w.printParagraph("The following table shows an overview of the "
                       + "constraints divided per property:");
        w.printTableHeader("Property","Cardinality","Value Type","Constraints");
        w.printTableCols('l', 'c', 'c', 'l');
        for(String uri : getProperties(shape))
        {
            Resource prop = model.getResource(uri);
            Collection<Resource> constraints = getConstraints(shape, prop);
            w.print("|");
            String name = _config.getPrefixedName(prop);
            w.printLink(name, "#" + getLocalReference(prop), null, false);
            w.print("|");
            printCardinalityConstraint(constraints, w);
            w.print("|");
            printTypeConstraint(constraints, w);
            w.print("|");
            printConstraintReferences(constraints, w);
            w.println("|");
        }
    }

    private void printClassConstraintsTable(Resource shape, MarkDownWriter w)
    {
        w.println("<table>");
        w.print("<tr><th align=\"right\">Constraints</th><td width='100%'>");
        printConstraintReferences(getClassConstraints(shape), w);
        w.println("</td></tr>");
        w.println("</table>");
    }

    private void printTemplateDocument(Resource c, MarkDownWriter w)
    {
        String name = c.getLocalName();
        String rsrc = _config.getProperty("shapes.data.templates."
                                        + name.toLowerCase());
        if ( rsrc == null ) { return; }

        try
        {
            w.printParagraph("Below is an example of a resource of type " 
                           + _config.getPrefixedName(c) + ": ");
            String str = FileUtils.readWholeFileAsUTF8(
                    ClassLoader.getSystemResourceAsStream(rsrc));
//            ps.println("*Shape definition in Turtle syntax:*");
            w.printCode(str);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void printConstraintDefinitions(Resource shape, MarkDownWriter w)
    {
        w.printH4("Shape Body").printSeparator();
        printShapeBody(shape, w);

        w.printH4("Shape level constraints").printSeparator();
        for ( Resource c : getClassConstraints(shape))
        {
            printConstraintDefinition(c, w);
        }

        Model model = shape.getModel();
        for(String uri : getProperties(shape))
        {
            Resource prop = model.getResource(uri);

            printPropertyHeader(prop, w);

            Collection<Resource> consts = getConstraints(shape, prop);
            for ( Resource c : consts ) { printConstraintDefinition(c, w); }
        }
    }

    private void printShapeBody(Resource shape, MarkDownWriter w)
    {
        w.printItalic("Shape body in Turtle syntax:").println();
        w.printCode(_defs.get(shape.getURI()));
    }

    private void printConstraintDefinition(Resource constraint,MarkDownWriter w)
    {
        printConstraintHeader(constraint, w);
        printMetadata(constraint, w);
        printRule(constraint, w);
    }

    private void printMetadata(Resource constraint, MarkDownWriter w)
    {
        w.println("<table>");
        printMetadataDescription(constraint, w);
        printMetadataSubject(constraint, w);
        printMetadataType(constraint, w);
        w.println("</table>");
    }

    private void printMetadataDescription(Resource constraint, PrintStream ps)
    {
        ps.print("<tr><th align=\"right\">description</th><td>");
        ps.print(getMetadataDescription(constraint));
        ps.println("</td></tr>");
    }

    private void printMetadataSubject(Resource constraint, MarkDownWriter w)
    {
        w.print("<tr><th align=\"right\">subject</th><td>");

        boolean first = true;
        StmtIterator iter = constraint.listProperties(DC.subject);
        while ( iter.hasNext() )
        {
            if ( first ) { first = false; } else { w.print(", "); }

            String subject = iter.next().getObject().asLiteral().getString();
            w.printLink(subject, RDFAP.getRequirementURL(subject), null, true);
        }

        w.println("</td></tr>");
    }

    private void printMetadataType(Resource constraint, MarkDownWriter w)
    {
        w.print("<tr><th align=\"right\">type</th><td>");

        boolean first = true;
        StmtIterator iter = constraint.listProperties(DC.type);
        while ( iter.hasNext() )
        {
            if ( first ) { first = false; } else { w.print(", "); }

            String type = iter.next().getObject().asResource().getURI();
            w.printLink(type, type, null, true);
        }

        w.println("</td></tr>");
    }

    private void printRule(Resource constraint, MarkDownWriter w)
    {
        w.printItalic("Shape definition in Turtle syntax:");
        w.println();
        w.printCode(_defs.get(constraint.getURI()));
    }


    /***************************************************************************
     * Private Methods - Other
     **************************************************************************/

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

    private String getLocalName(Resource rsrc)
    {
        String uri = rsrc.getURI();
        return uri.substring(uri.lastIndexOf('#')+1);
    }

    private String getLocalReference(Resource rsrc)
    {
        String name = _config.getPrefixedName(rsrc);
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

    private Collection<String> getProperties(Resource s)
    {
        Collection<String> ret = new TreeSet(COMPARATOR);

        Model model = s.getModel();
        Property p = model.getProperty(SH.NS + "ignoredProperties");
        StmtIterator iter = model.listStatements(null, p, (RDFNode)null);
        while ( iter.hasNext() )
        {
            Statement stmt = iter.next();
            if ( !s.hasProperty(SH.constraint,stmt.getSubject()) ) { continue; }

            RDFNode node = stmt.getObject();
            if ( !node.canAs(RDFList.class) ) { continue; }

            Iterator<RDFNode> iter2 = node.as(RDFList.class).iterator();
            while ( iter2.hasNext() )
            {
                ret.add(iter2.next().asResource().getURI());
            }
        }

        return ret;
    }

    private Collection<Resource> getClassConstraints(Resource shape)
    {
        Collection<Resource> col = new ArrayList();
        StmtIterator iter = shape.listProperties(SH.constraint);
        while(iter.hasNext())
        {
            Resource constr = iter.next().getObject().asResource();
            String   uri    = constr.getURI();
            if ( ShapeChecker.isShapeConstraint(uri) ) { col.add(constr); }
        }
        return col;
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
