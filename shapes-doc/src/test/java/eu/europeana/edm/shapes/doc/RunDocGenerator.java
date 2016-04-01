/**
 * 
 */
package eu.europeana.edm.shapes.doc;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import eu.europeana.edm.shapes.doc.ShapesDocGenerator;

/**
 * @author Hugo Manguinhas <hugo.manguinhas@europeana.eu>
 * @since 8 Mar 2016
 */
public class RunDocGenerator
{

    public static final void main(String[] args) throws IOException
    {
//        ClassLoader cl = RunDocGenerator.class.getClassLoader();
//        File dir  = new File(cl.getResource(EDM_EXTERNAL_SHAPES_LOCATION).getFile());
//        File file = new File(dir.getParentFile(), "Shapes.md");

        File dir = new File("D:\\work\\git\\Europeana\\shapes\\shapes-edm\\");
        File in  = new File(dir, "src\\main\\resources\\etc\\edm\\shapes\\external");
        File out = new File(dir, "doc\\external\\");

        Properties prop = new Properties();
        
        prop.setProperty("shapes.local", "D:\\work\\git\\Europeana\\shapes\\shapes-edm\\");
        prop.setProperty("shapes.remote", "/");
        //prop.setProperty("shapes.remote", "../../src/main/resources/etc/edm/shapes/external/");

        prop.setProperty("data.templates.agent", "etc/edm/data/external/agent_ok1.xml");

        new ShapesDocGenerator(prop).genAllDocumentation(in, out);
    }
}
