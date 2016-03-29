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

import org.apache.commons.io.IOUtils;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ResIterator;
import org.apache.jena.util.FileUtils;
import org.topbraid.spin.util.JenaUtil;

import eu.europeana.edm.shapes.LocalShapesLoader;
import eu.europeana.edm.shapes.ShapesLoader;
import eu.europeana.edm.shapes.validation.RecordValidator;
import eu.europeana.edm.shapes.validation.ShapeChecker;
import eu.europeana.edm.shapes.validation.TopBraidValidator;
import eu.europeana.edm.shapes.validation.ShapesConstants.ShapesType;
import static eu.europeana.jena.JenaUtils.*;
import static eu.europeana.rdf.FormatSupport.*;
import static eu.europeana.edm.shapes.validation.SHACLNamespace.SHACL_RESULT;
import static eu.europeana.edm.shapes.validation.ShapesConstants.*;
import static eu.europeana.edm.shapes.validation.ShapesUtils.*;

/**
 * @author Hugo Manguinhas <hugo.manguinhas@europeana.eu>
 * @since 8 Dec 2015
 */
public class RunValidator
{
    private static ShapesLoader LOADER = null;

    static {
        File dir    = new File("D:\\work\\git\\Europeana\\shapes\\shapes-edm\\");
        File shapes = new File(dir, "src\\main\\resources\\etc\\edm\\shapes");
        LOADER = new LocalShapesLoader(shapes);
    }

    public static final void main(String[] args) throws Exception
    {
        
        runShape();
    }

    private static void runShape(File example, String namespace)
            throws IOException
    {
        Model shapesModel = LOADER.load(namespace);
        if ( shapesModel == null ) { return; }

        print(new RecordValidator(new TopBraidValidator(shapesModel))
            .validate(example));
    }

    private static void print(Model results)
    {
        
    }

    public static void print(Model results, PrintStream ps)
    {
        ps.println(results);
        ResIterator iter = results.listResourcesWithProperty(
                results.getProperty(RDF_TYPE)
              , results.getResource(SHACL_RESULT));
        while(iter.hasNext()) { print(iter.nextResource(), ps); }
    }
}
