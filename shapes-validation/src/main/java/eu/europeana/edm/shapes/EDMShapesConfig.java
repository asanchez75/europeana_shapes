/**
 * 
 */
package eu.europeana.edm.shapes;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.io.IOUtils;
import org.apache.jena.rdf.model.Model;

/**
 * @author Hugo Manguinhas <hugo.manguinhas@europeana.eu>
 * @since 5 Apr 2016
 */
public class EDMShapesConfig
{
    private static final String CONFIG_FILE = "etc/config.prop";
    private static final ShapesLoader _shapesLoader;
    private static final Model        _edmShapesModel;

    static {
        Properties props = loadConfig();
        _shapesLoader   = newShapesLoader(props);
        _edmShapesModel = loadEDMShapesModel(props);
    }

    public static Model        getEDMShapes()    { return _edmShapesModel; }
    public static ShapesLoader getShapesLoader() { return _shapesLoader;   }


    private static Properties loadConfig()
    {
        Properties props = new Properties();
        InputStream is = ClassLoader.getSystemResourceAsStream(CONFIG_FILE);
        try                   { props.load(is);      }
        catch (IOException e) { e.printStackTrace(); }
        finally { IOUtils.closeQuietly(is); }

        return props;
    }

    public static ShapesLoader newShapesLoader(Properties props)
    {
        String shapes  = props.getProperty("shapes.edm.data");
        String library = props.getProperty("shapes.edm.library");
        LocalShapesLoader loader = new LocalShapesLoader();
        loader.inspect(new File(shapes));
        loader.inspect(new File(library));
        loader.importDependencies();
        return loader;
    }

    private static Model loadEDMShapesModel(Properties props)
    {
        String ns = props.getProperty("shapes.edm.ns");
        return _shapesLoader.load(ns);
    }
}
