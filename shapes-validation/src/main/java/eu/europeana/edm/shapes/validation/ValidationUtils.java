/**
 * 
 */
package eu.europeana.edm.shapes.validation;

import static org.apache.commons.io.IOUtils.closeQuietly;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.riot.Lang;
import org.apache.jena.riot.RDFLanguages;
import org.apache.jena.util.FileUtils;
import org.topbraid.spin.util.JenaUtil;

/**
 * @author Hugo Manguinhas <hugo.manguinhas@europeana.eu>
 * @since 1 Apr 2016
 */
public class ValidationUtils
{
    public static Model loadModel(File file) throws IOException
    {
        Model m = JenaUtil.createDefaultModel();
        try { m.read(file.toURL().toString()); }
        catch (Throwable t)
        {
            throw new IOException("Error reading file: " + file.getName(), t);
        }
        return m;
    }

    public static Model loadModel(InputStream is, String mime) 
           throws IOException
    {
        Model m = JenaUtil.createDefaultModel();

        Lang lang = RDFLanguages.contentTypeToLang(mime);
        if ( lang == null ) { return null; }

        try     { m.read(is, "", lang.getLabel()); }
        finally { closeQuietly(is);                }

        return m;
    }
}
