/**
 * 
 */
package eu.europeana.shapes_validation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.apache.commons.io.IOUtils;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.util.FileUtils;
import org.topbraid.spin.util.JenaUtil;

import eu.europeana.edm.shapes.validation.ShapeChecker;
import eu.europeana.edm.shapes.validation.TopBraidValidator;
import eu.europeana.edm.shapes.validation.ShapesConstants.ShapesType;
import static eu.europeana.jena.JenaUtils.*;
import static eu.europeana.rdf.FormatSupport.*;
import static eu.europeana.edm.shapes.validation.ShapesConstants.*;
import static eu.europeana.edm.shapes.validation.ShapesUtils.*;

/**
 * @author Hugo Manguinhas <hugo.manguinhas@europeana.eu>
 * @since 8 Dec 2015
 */
public class RunValidator
{
    public static final void main(String[] args) throws Exception
    {
        runExternalSplitted();
    }

    private static void runExternalFull() throws IOException
    {
        runShape("/etc/edm/data/external/example1.xml"
               , "/etc/edm/shapes/external/edm_full.ttl");
    }

    private static void runExternalSplitted() throws IOException
    {
        Model model = getShapesForEDMExternal();
        new ShapeChecker().check(model);
        runShape("/etc/edm/data/external/example1.xml", model);
    }

    private static void runInclosedOntology() throws IOException
    {
        runShape("/etc/edm/data/external/example1.xml"
               , "/etc/edm/shapes/external/edm-provided-cho.ttl");
    }

    private static void runShape(String example, String shapes)
            throws IOException
    {
        Class c = RunValidator.class;
        runShape(example, getShapesModel(c.getResourceAsStream(shapes)));
    }

    private static void runShape(String example, Model shapes)
            throws IOException
    {
        InputStream isExample = RunValidator.class.getResourceAsStream(example);

        Model vModel = TopBraidValidator.getValidationModel(shapes);

        store(new TopBraidValidator(vModel)
            .validate(isExample, RDFXML.getMimetype()), System.out);
    }
}
