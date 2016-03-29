/**
 * 
 */
package eu.europeana.shapes.testsuite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.riot.Lang;
import org.apache.jena.riot.RDFLanguages;
import org.apache.jena.util.FileUtils;

import eu.europeana.edm.shapes.validation.RecordValidator;

/**
 * @author Hugo Manguinhas <hugo.manguinhas@europeana.eu>
 * @since 29 Mar 2016
 */
public class TestCase
{
    private File    _data    = null;
    private File    _fResult = null;
    private Model   _mResult = null;

    public TestCase(File data, File result)
    {
        _data    = data;
        _fResult = result;
    }

    public File getDataFile()   { return _data;    }
    public File getResultFile() { return _fResult; }

    public Model getResultModel(boolean refresh)
    {
        if ( !_fResult.exists()          ) { return null;     }
        if ( _mResult != null && !refresh) { return _mResult; }

        _mResult = ModelFactory.createDefaultModel();

        String ext  = FileUtils.getFilenameExt(_fResult.getName());
        Lang   lang = RDFLanguages.fileExtToLang(ext);
        if ( lang == null ) { return _mResult; }

        InputStream is = null;
        try {
            is = new FileInputStream(_fResult);
            _mResult.read(is, lang.getLabel());
        }
        catch (IOException e)
        {
            logError("Error reading to file: " + _fResult.getAbsolutePath(), e);
        }
        finally { IOUtils.closeQuietly(is); }

        return _mResult;
    }

    private void saveResult(TestResult result)
    {
        Lang lang = RDFLanguages.filenameToLang(_fResult.getName());
        if ( lang == null ) { return; }

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(_fResult);
            result.getOutput().write(fos, lang.getLabel());
            fos.flush();
        }
        catch (IOException e)
        {
            logError("Error writing to file: " + _fResult.getAbsolutePath(), e);
        }
        finally { IOUtils.closeQuietly(fos); }
    }

    public TestResult run(RecordValidator v)
    {
        try
        {
            TestResult tr = new TestResult(this, v.validate(_data));
            if ( !_fResult.exists() ) { saveResult(tr); }
            return tr;
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    private void logError(String msg, Throwable t)
    {
        System.err.println(msg + ", reason: " + t.getMessage());
    }
}
