/**
 * 
 */
package eu.europeana.shapes.validation;

import java.io.File;
import java.util.Collection;
import java.util.Properties;

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
    private static String       NS     = "http://www.europeana.eu/schemas/edm/shapes/external/";

    public static final void main(String[] args) throws Exception
    {
        Properties props = new Properties();
        props.load(ClassLoader.getSystemResourceAsStream("etc/config.prop"));

        LocalShapesLoader loader = new LocalShapesLoader(new File(props.getProperty("shapes.edm.data")));

        File dirTS = new File(props.getProperty("shapes.testsuite.data"));
        File dirRS = new File(props.getProperty("shapes.testsuite.results"));
        TestSuite ts = new TestSuite().loadTests(dirTS, dirRS, Lang.TTL);
        Collection<TestResult> ret = ts.run(new TopBraidValidator(loader.load(NS)));

        for ( TestResult tr : ret )
        {
            System.out.println("Test <" + tr.getTestCase().getDataFile().getName()
                             + ">: " + tr.isOK());
        }
    }
}
