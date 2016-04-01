/**
 * 
 */
package eu.europeana.shapes.testsuite;

import static eu.europeana.edm.shapes.validation.SHACLNamespace.SHACL_RESULT;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

import org.apache.commons.io.IOUtils;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.ResIterator;
import org.apache.jena.riot.Lang;
import org.apache.jena.riot.RDFLanguages;
import org.apache.jena.util.FileUtils;
import org.apache.jena.vocabulary.RDF;
import org.topbraid.shacl.vocabulary.SH;

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
