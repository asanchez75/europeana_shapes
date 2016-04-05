/**
 * 
 */
package eu.europeana.shapes.validation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.URL;
import java.util.Properties;

import org.apache.commons.io.IOUtils;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ResIterator;
import org.apache.jena.util.FileUtils;
import org.topbraid.spin.util.JenaUtil;

import eu.europeana.edm.shapes.LocalShapesLoader;
import eu.europeana.edm.shapes.ShapesLoader;
import eu.europeana.edm.shapes.validation.DatasetValidator;
import eu.europeana.edm.shapes.validation.RecordValidator;
import eu.europeana.edm.shapes.validation.ShapeChecker;
import eu.europeana.edm.shapes.validation.TopBraidValidator;
import eu.europeana.edm.shapes.validation.ValidationUtils;

/**
 * @author Hugo Manguinhas <hugo.manguinhas@europeana.eu>
 * @since 8 Dec 2015
 */
public class RunDatasetValidator
{
    private static String       NS     = "http://www.europeana.eu/schemas/edm/shapes/external/";

    public static final void main(String[] args) throws Exception
    {
        File file = new File("D:\\work\\git\\Europeana\\shapes\\shapes-validation\\src\\test\\resources\\etc\\agents_sample.xml");
        Properties props = new Properties();
        props.load(ClassLoader.getSystemResourceAsStream("etc/config.prop"));
        LocalShapesLoader loader    = new LocalShapesLoader(new File(props.getProperty("shapes.edm.data")));
        DatasetValidator  validator = new DatasetValidator(new TopBraidValidator(loader.load(NS)));
        Model result = validator.validate(file);

        ValidationUtils.storeModel(result, getOutputFile(file));
    }

    private static final File getOutputFile(File file)
    {
        String name = file.getName();
        File parent = file.getParentFile();
        String ext  = FileUtils.getFilenameExt(name);
        return new File(parent, name.replaceFirst(ext, "validation.xml"));
    }
}
