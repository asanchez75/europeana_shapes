/**
 * 
 */
package eu.europeana.shapes.validation;

import java.io.File;
import java.util.Collection;

import org.apache.jena.riot.Lang;

import eu.europeana.edm.shapes.LocalShapesLoader;
import eu.europeana.edm.shapes.ShapesLoader;
import eu.europeana.edm.shapes.validation.TopBraidValidator;
import eu.europeana.shapes.testsuite.TestResult;
import eu.europeana.shapes.testsuite.TestSuite;

/**
 * @author Hugo Manguinhas <hugo.manguinhas@europeana.eu>
 * @since 8 Dec 2015
 */
public class RunTestSuite
{
    private static File         DIR    = new File("D:\\work\\git\\Europeana\\shapes\\shapes-edm\\");
    private static ShapesLoader LOADER = null;
    private static String       NS     = "http://www.europeana.eu/schemas/edm/shapes/external/";

    static {
        LOADER = new LocalShapesLoader(
                 new File(DIR, "src\\main\\resources\\etc\\edm\\shapes"));
    }

    public static final void main(String[] args) throws Exception
    {
        File dirTS = new File(DIR, "src\\test\\resources\\etc\\edm\\data\\external");
        File dirRS = new File(DIR, "src\\test\\resources\\etc\\edm\\results\\external");
        TestSuite ts = new TestSuite().loadTests(dirTS, dirRS, Lang.TTL);
        Collection<TestResult> ret = ts.run(new TopBraidValidator(LOADER.load(NS)));

        for ( TestResult tr : ret )
        {
            System.out.println("Test <" + tr.getTestCase().getDataFile().getName()
                             + ">: " + tr.isOK());
        }
    }

    /*
    public static void print(Model results, PrintStream ps)
    {
        ps.println(results);
        ResIterator iter = results.listResourcesWithProperty(
                results.getProperty(RDF_TYPE)
              , results.getResource(SHACL_RESULT));
        while(iter.hasNext()) { print(iter.nextResource(), ps); }
    }
    */
}
