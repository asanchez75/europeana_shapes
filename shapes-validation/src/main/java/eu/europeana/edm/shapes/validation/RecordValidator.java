/**
 * 
 */
package eu.europeana.edm.shapes.validation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.httpclient.HttpException;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.riot.Lang;
import org.apache.jena.riot.RDFLanguages;
import org.apache.jena.util.FileUtils;
import org.topbraid.spin.util.JenaUtil;

import eu.europeana.ld.deref.Dereferencer;
import static org.apache.commons.io.IOUtils.*;

/**
 * @author Hugo Manguinhas <hugo.manguinhas@europeana.eu>
 * @since 8 Dec 2015
 */
public class RecordValidator
{
    private ModelValidator _validator;
    private Dereferencer   _dereference;

    public RecordValidator(ModelValidator validator
                         , String defaultMime)
    {
        _validator   = validator;
        _dereference = new Dereferencer(defaultMime);
    }

    public RecordValidator(ModelValidator validator)
    {
        this(validator, Lang.RDFXML.getContentType().getType());
    }

    public Model validate(File file) throws IOException
    {
        Model m = createModel();

        String ext  = FileUtils.getFilenameExt(file.getName());
        Lang   lang = RDFLanguages.fileExtToLang(ext);
        if ( lang == null ) { return m; }

        InputStream is = new FileInputStream(file);
        try     { m.read(is, "", lang.getLabel()); }
        finally { closeQuietly(is);                }

        return validate(m);
    }

    public Model validate(File file, String mime) throws IOException
    {
        return validate(new FileInputStream(file), mime);
    }

    public Model validate(InputStream is, String mime) throws IOException
    {
        Model m = createModel();

        Lang lang = RDFLanguages.contentTypeToLang(mime);
        if ( lang == null ) { return null; }

        try     { m.read(is, "", lang.getLabel()); }
        finally { closeQuietly(is);                }

        return validate(m);
    }

    public Model validate(String url) throws HttpException
    {
        return validate(_dereference.dereference(url));
    }

    public Model validate(String url, String mime) throws HttpException
    {
        return validate(_dereference.dereference(url, mime));
    }

    protected Model createModel() { return JenaUtil.createDefaultModel(); }

    protected Model validate(Model data) { return _validator.validate(data); }
}