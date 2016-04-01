/**
 * 
 */
package eu.europeana.edm.shapes.doc;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Properties;

import org.apache.commons.io.IOUtils;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.riot.Lang;

import eu.europeana.github.MarkDownWriter;
import eu.europeana.shapes.testsuite.TestCase;
import eu.europeana.shapes.testsuite.TestSuite;

/**
 * @author Hugo Manguinhas <hugo.manguinhas@europeana.eu>
 * @since 31 Mar 2016
 */
public class ShapesTestSuiteGenerator extends DocGenerator
{
    public ShapesTestSuiteGenerator(GeneratorConfig config) { super(config); }


    /***************************************************************************
     * Public Methods
     **************************************************************************/

    public void generate()
    {
        TestSuite ts = new TestSuite();
        ts.loadTests(_config.getFile("shapes.testsuite.data")
                   , _config.getFile("shapes.testsuite.results"), Lang.TTL);
        Collection<Resource> col = 
                (Collection<Resource>)_config.get("shapes.classes");
        for ( Resource c : col ) { genFileForClass(ts, c); }
    }


    /***************************************************************************
     * Private Methods - Generation
     **************************************************************************/

    private void genFileForClass(TestSuite suite, Resource c)
    {
        Collection<TestCase> col = suite.getTestCases(c);
        MarkDownWriter w = getWriter(getOutputFile(c));
        try {
            genHeader(c, w);
            genSummaryTable(col, w);
            genListing(col, w);
            w.flush();
        }
        finally { IOUtils.closeQuietly(w); }
        
    }

    private void genHeader(Resource c, MarkDownWriter w)
    {
        w.printH2("Test cases for " + getPrefixedName(c) + " class");
    }

    private void genSummaryTable(Collection<TestCase> col, MarkDownWriter w)
    {
        w.printTableHeader("Test Case", "Results", "Status");
        for ( TestCase tc : col )
        {
            String name = tc.getDataFile().getName();
            w.printTableRow(w.newLink(name, "#" + name)
                          , tc.getResultSize()
                          , "");
        }
    }

    private void genListing(Collection<TestCase> col, MarkDownWriter w)
    {
        for ( TestCase tc : col )
        {
            String name = tc.getDataFile().getName();
            w.printH4("Test Case: "
                    + w.newLink(name, toRemote(tc.getDataFile()), name, true));
            w.printCode(tc.getDataAsString(), "XML");
            w.printItalic("Result").println();
            w.printCode(tc.getResultAsString());
        }
    }


    /***************************************************************************
     * Private Methods - Generation
     **************************************************************************/

    private File getOutputFile(Resource c)
    {
        String name = c.getLocalName() + ".md";
        return new File(_config.getFile("shapes.testsuite.doc"), name);
    }
}
