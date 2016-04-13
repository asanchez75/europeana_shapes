/**
 * 
 */
package eu.europeana.edm.shapes.doc;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import eu.europeana.edm.shapes.doc.ShapesDataGenerator;

/**
 * @author Hugo Manguinhas <hugo.manguinhas@europeana.eu>
 * @since 8 Mar 2016
 */
public class RunShapesDocGeneration
{

    public static final void main(String[] args) throws IOException
    {
//        ClassLoader cl = RunDocGenerator.class.getClassLoader();
//        File dir  = new File(cl.getResource(EDM_EXTERNAL_SHAPES_LOCATION).getFile());
//        File file = new File(dir.getParentFile(), "Shapes.md");

        //File dir = new File("D:\\work\\git\\Europeana\\shapes\\shapes-edm\\");
        //File in  = new File(dir, "src\\main\\resources\\etc\\edm\\shapes\\external");
        //File out = new File(dir, "doc\\external\\");

        GeneratorConfig config = GeneratorConfig.getConfig();
        new ShapesDocGenerator(config).generate();
    }
}
