/**
 * 
 */
package eu.europeana.shapes.testsuite;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

import org.apache.jena.rdf.model.Resource;

import eu.europeana.edm.shapes.validation.ModelValidator;
import eu.europeana.edm.shapes.validation.RecordValidator;

/**
 * @author Hugo Manguinhas <hugo.manguinhas@europeana.eu>
 * @since 25 Mar 2016
 */
public class TestSuite extends ArrayList<TestCase>
{
    public TestSuite() {}

    public TestSuite loadTests(File data, File result)
    {
        if ( !data.isDirectory() ) {
            add(new TestCase(data, result)); 
            return this; 
        }

        for ( File f : data.listFiles() )
        {
            loadTests(f, new File(result, f.getName()));
        }
        return this;
    }

    public Collection<TestCase> getTestCases(Resource c)
    {
        Collection<TestCase> ret = new ArrayList();
        String keyword = c.getLocalName().toLowerCase();
        for ( TestCase tc : this )
        {
            if (tc.getDataFile().getName().startsWith(keyword)) { ret.add(tc); }
        }
        return ret;
    }

    public boolean run(ModelValidator validator, Collection<TestResult> results)
    {
        boolean ret = true;
        RecordValidator v = new RecordValidator(validator);
        for ( TestCase tc : this )
        {
            TestResult tr = tc.run(v);
            results.add(tr);
            ret = ret && tr.isOK();
        }
        return ret;
    }

    public Collection<TestResult> run(ModelValidator validator)
    {
        Collection<TestResult> ret = new ArrayList();
        run(validator, ret);
        return ret;
    }
}
