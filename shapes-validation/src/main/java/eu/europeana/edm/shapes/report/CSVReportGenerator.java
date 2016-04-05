/**
 * 
 */
package eu.europeana.edm.shapes.report;

import java.io.IOException;
import java.io.PrintStream;
import java.util.List;
import java.util.Map;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.io.IOUtils;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.RDFNode;

/**
 * @author Hugo Manguinhas <hugo.manguinhas@europeana.eu>
 * @since 5 Apr 2016
 */
public class CSVReportGenerator implements ReportGenerator
{
    private String   _query;

    public CSVReportGenerator(String query) { _query  = query; }


    /***************************************************************************
     * Public Methods
     **************************************************************************/
    @Override
    public void generate(Model model, PrintStream ps) throws IOException
    {
        CSVPrinter p = new CSVPrinter(ps, CSVFormat.EXCEL);
        QueryExecution eng = QueryExecutionFactory.create(_query, model);
        try {
            ResultSet rs = eng.execSelect();
            List<String> cols = rs.getResultVars();

            printCols(cols, p);
            while ( rs.hasNext() ) { printResult(rs.next(), cols, p); }
        }
        finally { eng.close(); }
    }


    /***************************************************************************
     * Private Methods
     **************************************************************************/

    private void printCols(List<String> cols, CSVPrinter p) throws IOException
    {
        for ( String col : cols ) { p.print(col); }
        p.println();
    }

    private void printResult(QuerySolution qs, List<String> cols
                           , CSVPrinter p) throws IOException
    {
        for ( String col : cols ) { p.print(toString(qs.get(col))); }
        p.println();
    }

    private String toString(RDFNode node)
    {
        if ( node == null      ) { return "";                           }
        if ( node.isResource() ) { return node.asResource().getURI();   }
        if ( node.isLiteral()  ) { return node.asLiteral().getString(); }
        return "";
    }
}