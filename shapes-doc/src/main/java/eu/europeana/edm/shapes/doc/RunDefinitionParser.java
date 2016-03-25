/**
 * 
 */
package eu.europeana.edm.shapes.doc;

import java.io.File;
import java.io.IOException;
import java.util.Map;

/**
 * @author Hugo Manguinhas <hugo.manguinhas@europeana.eu>
 * @since 8 Mar 2016
 */
public class RunDefinitionParser
{

    public static final void main(String[] args) throws IOException
    {
        File file = new File("D:\\work\\github\\edm-shapes\\src\\main\\resources\\etc\\edm\\shapes\\external\\ProvidedCHO.ttl");

        ShapesDefinitionParser p = new ShapesDefinitionParser();
        Map<String,String> map = p.loadDefinitions(file);
        for ( String key : map.keySet() )
        {
            System.out.println("Definition: " + key);
            System.out.println(map.get(key));
        }
    }
}
