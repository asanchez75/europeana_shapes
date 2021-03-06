/**
 * 
 */
package eu.europeana.edm.shapes.report;

import java.io.IOException;
import java.io.PrintStream;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.Resource;

/**
 * @author Hugo Manguinhas <hugo.manguinhas@europeana.eu>
 * @since 4 Apr 2016
 */
public interface ReportGenerator
{

    public void generate(Model model, PrintStream ps) throws IOException;

    public interface ReferenceGenerator
    {
        public String generate(Resource r);
    }
}
