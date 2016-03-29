/**
 * 
 */
package eu.europeana.edm.shapes.validation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.URL;

import org.apache.commons.io.IOUtils;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ResIterator;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.util.FileUtils;
import org.topbraid.shacl.vocabulary.SH;
import org.topbraid.spin.util.JenaUtil;

import static eu.europeana.edm.shapes.validation.SHACLNamespace.*;
import static eu.europeana.edm.shapes.validation.ShapesConstants.*;

/**
 * @author Hugo Manguinhas <hugo.manguinhas@europeana.eu>
 * @since 8 Dec 2015
 */
public class ShapesUtils
{
    /***************************************************************************
     * Public Methods
     **************************************************************************/


    // Load the shapes Model (here, includes the dataModel 
    // because that has templates in it)
    public static Model getShapesModel(InputStream is)
    {
        Class c = ShapesUtils.class;
        Model model = JenaUtil.createMemoryModel();
        model.read(is, "urn:dummy", FileUtils.langTurtle);
        return model;
    }

    public static Model getShapesForEDMExternal() throws IOException
    {
        return loadAll(EDM_EXTERNAL_SHAPES_LOCATION, EDM_EXTERNAL_RESOURCES);
    }

    public static Model loadModel(Model m, InputStream is)
    {
        return m.read(is, "urn:dummy", FileUtils.langTurtle);
    }

    public static void print(Model results, PrintStream ps)
    {
        ps.println(results);
        ResIterator iter = results.listResourcesWithProperty(
                results.getProperty(RDF_TYPE)
              , results.getResource(SHACL_RESULT));
        while(iter.hasNext()) { print(iter.nextResource(), ps); }
    }

    private static void print(Resource r, PrintStream ps)
    {
        System.out.println(r);
    }

    private static Model loadAll(String root, String... nested)
            throws IOException
    {
        Model model = JenaUtil.createMemoryModel();
        Class c = RunValidator.class;
        URL rootURL  = c.getResource(root);
        if ( rootURL == null ) { return model; }

        InputStream is = rootURL.openStream();
        try { model.read(is, "urn:dummy", FileUtils.langTurtle); }
        finally { IOUtils.closeQuietly(is); }

        File rootFile = new File(rootURL.getFile()).getParentFile();
        for ( String n : nested )
        {
            is = new FileInputStream(new File(rootFile, n));
            try { model.read(is, "urn:dummy", FileUtils.langTurtle); }
            finally { IOUtils.closeQuietly(is); }
        }
        return model;
    }
}
