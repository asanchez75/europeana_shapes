/**
 * 
 */
package eu.europeana.edm.shapes.doc;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Properties;
import java.util.TreeSet;

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
        Collection<TestCase> col = suite.getTestCases(c, new TreeSet(new TestCaseComparator()));
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
        String className = getPrefixedName(c);
        w.printH2("Shapes test cases for " + className + " class");

        String swURL = "/shapes-doc";
        File testsuite = _config.getFile("shapes.testsuite.data");
        w.printItalic("This document was generated from the testcases available "
                    + "within this [directory] (" + toRemote(testsuite)
                    + ") using this [software](" + swURL + ")").println();

        File shapesDoc = _config.getFile("shapes.edm.doc");
        File shapeDoc  = new File(shapesDoc, c.getLocalName() + ".md");
        w.printParagraph(
            "This document contains test cases that target constraints that are"
          + " specific to resources of type " + className + " which are defined "
          + " within this [shape definition](" + toRemote(shapeDoc) + ")."
          + " The following table shows the testcases that were run:");
    }

    private void genSummaryTable(Collection<TestCase> col, MarkDownWriter w)
    {
        w.printTableHeader("Test Case", "Results", "Status");
        w.printTableCols('l', 'r', 'c');
        for ( TestCase tc : col )
        {
            String name = tc.getDataFile().getName();
            String id   = tc.getID();
            String dataRef   = "#" + id + "_data";
            String resultRef = "#" + id + "_result";
            Integer size = tc.getResultSize();
            w.printTableRow(w.newLink(name              , dataRef)
                          , w.newLink(size == null ? "?" : String.valueOf(size)
                                    , resultRef)
                          , "");
        }
    }

    private void genListing(Collection<TestCase> col, MarkDownWriter w)
    {
        for ( TestCase tc : col )
        {
            String id = tc.getID();
            String dataRef   = id + "_data";
            String resultRef = id + "_result";
            w.printH4("Test Case: "
                    + w.newLink(tc.getDataFile().getName()
                              , toRemote(tc.getDataFile()), dataRef, true));
            w.printSeparator();
            w.printCode(tc.getDataAsString(), "XML");
            w.printAnchor(resultRef);
            w.printItalic("Below is the output generated by "
                        + "TopBraid SHACL validator in Turtle syntax:").println();
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

    private static class TestCaseComparator implements Comparator<TestCase>
    {
        @Override
        public int compare(TestCase tc1, TestCase tc2)
        {
            Integer s1 = tc1.getResultSize();
            Integer s2 = tc2.getResultSize();
            if ( s1 != s2 ) {
                if ( (s1 != null) && (s1 == 0) ) { return -1; }
                if ( (s2 != null) && (s2 == 0) ) { return  1; }
            }
            return tc1.getDataFile().compareTo(tc2.getDataFile());
        }
    }
}
