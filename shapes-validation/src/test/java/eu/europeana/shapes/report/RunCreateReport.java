/**
 * 
 */
package eu.europeana.shapes.report;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.RDFNode;
import org.apache.jena.sparql.engine.http.QueryEngineHTTP;

import eu.europeana.edm.shapes.LocalShapesLoader;
import eu.europeana.edm.shapes.report.HTMLReportGenerator;
import eu.europeana.edm.shapes.validation.ValidationUtils;

/**
 * @author Hugo Manguinhas <hugo.manguinhas@europeana.eu>
 * @since 4 Apr 2016
 */
public class RunCreateReport
{
    private static String       NS     = "http://www.europeana.eu/schemas/edm/shapes/external/";

    public static final void main(String[] args) throws IOException
    {
        File dir = new File("D:\\work\\git\\Europeana\\shapes\\shapes-validation\\src\\test\\resources\\etc\\");
        File src = new File(dir, "agents_sample.validation.xml");
        File rpt = new File(dir, "agents_sample.validation.html");

        String query = FileUtils.readFileToString(new File("D:\\work\\git\\Europeana\\shapes\\shapes-validation\\src\\main\\resources\\etc\\report.sparql"));
        Model model = ValidationUtils.loadModel(src);

        File file = new File("D:\\work\\git\\Europeana\\shapes\\shapes-validation\\src\\test\\resources\\etc\\agents_sample.xml");
        Properties props = new Properties();
        props.load(ClassLoader.getSystemResourceAsStream("etc/config.prop"));
        LocalShapesLoader loader = new LocalShapesLoader(new File(props.getProperty("shapes.edm.data")));
        Model shapes = loader.load(NS);

        PrintStream ps = new PrintStream(rpt);
        try {
            ps.print("<html><body>");
            new HTMLReportGenerator(query, shapes).generate(model, ps);
            ps.print("</body></html>");
        }
        finally { IOUtils.closeQuietly(ps); }
    }

    
}
