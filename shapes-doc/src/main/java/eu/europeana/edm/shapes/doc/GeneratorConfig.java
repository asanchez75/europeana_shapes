/**
 * 
 */
package eu.europeana.edm.shapes.doc;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Properties;

import org.apache.commons.io.IOUtils;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.ResourceFactory;
import org.topbraid.shacl.vocabulary.SH;

/**
 * @author Hugo Manguinhas <hugo.manguinhas@europeana.eu>
 * @since 31 Mar 2016
 */
public class GeneratorConfig extends Properties
{
    private static final long            serialVersionUID = 1L;
    private static final GeneratorConfig config = new GeneratorConfig();
    private static final String          CONFIG_FILE = "etc/config.prop";

    public static GeneratorConfig getConfig() { return config; }

    public GeneratorConfig()
    {
        if ( config != null ) { this.putAll(config); }

        InputStream is = ClassLoader.getSystemResourceAsStream(CONFIG_FILE);
        try { load(is); }
        catch (IOException e) { e.printStackTrace(); }
        finally { IOUtils.closeQuietly(is); }

        loadEDMClasses();
    }

    public File getFile(String key)
    {
        String path = getProperty(key);
        return ( path == null ? null : new File(path) );
    }

    public String toRemote(File file)
    {
        String dir = getProperty("shapes.local");
        if ( !file.getAbsolutePath().startsWith(dir) ) { return null; }

        String relative = file.getAbsolutePath().substring(dir.length());
        String baseurl = getProperty("shapes.remote");
        return (baseurl + relative.replaceAll("\\\\", "/"));
    }

    public String getPrefixedName(Resource rsrc)
    {
        String prefix = rsrc.getModel().getNsURIPrefix(rsrc.getNameSpace());
        return ( prefix == null ? rsrc.getURI()
                                : prefix + ":" + rsrc.getLocalName() );
    }

    public String getShapeOntologyRef(Resource edmClass)
    {
        return toRemote(new File(getFile("shapes.edm.doc")
                               , edmClass.getLocalName() + ".md"));
    }

    public Resource getShapeForConstraint(Resource c)
    {
        String uri = c.getURI();
        String ns  = getProperty("shapes.edm.ns");
        if ( !uri.startsWith(ns) ) { return null; }

        int i = uri.indexOf('/', ns.length());
        String cURI = uri.substring(0, i);
        return c.getModel().getResource(cURI);
    }

    public String getShapeConstraintRef(Resource c)
    {
        Resource shape = getShapeForConstraint(c);
        if ( shape == null ) { return null; }

        String ref = getShapeOntologyRef(shape);
        return ref + "#" + getShapeConstraintLocalRef(c);
    }

    public String getShapeConstraintLocalRef(Resource c)
    {
        String ns   = getProperty("shapes.edm.ns");
        String uri  = c.getURI();
        String name = uri.substring(uri.indexOf('/', ns.length())+1);
        return name.replace("://", "_").replaceAll("[/#.:]", "_");
    }

    private void loadEDMClasses()
    {
        Collection<Resource> c = new ArrayList();
        c.add(resource("http://www.europeana.eu/schemas/edm/ProvidedCHO"));
        c.add(resource("http://www.europeana.eu/schemas/edm/WebResource"));
        c.add(resource("http://www.openarchives.org/ore/terms/Aggregation"));
        c.add(resource("http://www.europeana.eu/schemas/edm/Agent"));
        c.add(resource("http://www.europeana.eu/schemas/edm/Place"));
        c.add(resource("http://www.w3.org/2004/02/skos/core#Concept"));
        c.add(resource("http://www.europeana.eu/schemas/edm/TimeSpan"));
        put("shapes.classes", c);
    }

    protected static final Resource resource(String uri)
    {
        return ResourceFactory.createResource(uri);
    }
}
