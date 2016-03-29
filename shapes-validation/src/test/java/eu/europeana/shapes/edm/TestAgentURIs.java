/**
 * 
 */
package eu.europeana.shapes.edm;

import java.io.File;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.ResIterator;
import org.apache.jena.vocabulary.RDF;

/**
 * @author Hugo Manguinhas <hugo.manguinhas@europeana.eu>
 * @since 29 Mar 2016
 */
public class TestAgentURIs
{
    public static final void main(String[] args)
    {
        File dir  = new File("D:\\work\\git\\Europeana\\shapes\\shapes-edm\\src\\main\\resources\\etc\\edm\\shapes\\external\\");
        File file = new File(dir, "WebResource.ttl");

        try {
            Model m = ModelFactory.createDefaultModel()
                                  .read(file.getCanonicalPath());
            ResIterator iter = m.listResourcesWithProperty(RDF.type);
            while ( iter.hasNext() )
            {
                System.err.println(iter.next().getURI());
            }
        }
        catch (Throwable t)
        {
            System.err.println("Loading file: " + file.getName()
                             + ", reason: " + t.getMessage());
        }
    }

}
