/**
 * 
 */
package eu.europeana.shapes.testsuite;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

import org.apache.jena.rdf.model.Resource;
import org.apache.jena.riot.Lang;
import org.apache.jena.riot.RDFLanguages;
import org.apache.jena.util.FileUtils;

import eu.europeana.edm.shapes.validation.ModelValidator;
import eu.europeana.edm.shapes.validation.RecordValidator;

/**
 * @author Hugo Manguinhas <hugo.manguinhas@europeana.eu>
 * @since 25 Mar 2016
 */
public class TestSuite extends ArrayList<TestCase>
{
    public TestSuite() {}

    public TestSuite loadTests(File data, File result, Lang lang)
    {
        if ( !data.isDirectory() ) {
            add(new TestCase(getID(data), data, getResult(result, lang)));
            return this;
        }

        for ( File f : data.listFiles() )
        {
            loadTests(f, new File(result, f.getName()), lang);
        }
        return this;
    }

    public Collection<TestCase> getTestCases(Resource c)
    {
        return getTestCases(c, new ArrayList());
    }

    public Collection<TestCase> getTestCases(Resource c, Collection<TestCase> col)
    {
        String keyword = c.getLocalName().toLowerCase();
        for ( TestCase tc : this )
        {
            File file = tc.getDataFile().getParentFile();
            if (file.getName().equals(keyword)) { col.add(tc); }
        }
        return col;
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

    private String getID(File file)
    {
        String name = file.getName();
        int index = name.lastIndexOf('.');
        return (index > 0 ? name.substring(0, index) : name);
    }

    private File getResult(File file, Lang lang)
    {
        String name = file.getName();
        Lang l = RDFLanguages.filenameToLang(name);
        if ( RDFLanguages.sameLang(l, lang) ) { return file; }

        String ext = FileUtils.getFilenameExt(name);
        name = name.replace(ext, lang.getFileExtensions().get(0));
        return new File(file.getParentFile(), name);
    }
}
