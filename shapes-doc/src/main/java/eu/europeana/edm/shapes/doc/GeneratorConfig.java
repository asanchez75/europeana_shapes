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
