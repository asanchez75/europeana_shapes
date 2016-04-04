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
import static eu.europeana.edm.shapes.validation.ValidationUtils.*;

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


    /***************************************************************************
     * Public Methods
     **************************************************************************/

    public Model validate(File file) throws IOException
    {
        return validate(loadModel(file));
    }

    public Model validate(File file, String mime) throws IOException
    {
        return validate(new FileInputStream(file), mime);
    }

    public Model validate(InputStream is, String mime) throws IOException
    {
        return validate(loadModel(is, mime));
    }

    public Model validate(String url) throws HttpException
    {
        return validate(_dereference.dereference(url));
    }

    public Model validate(String url, String mime) throws HttpException
    {
        return validate(_dereference.dereference(url, mime));
    }


    /***************************************************************************
     * Protected Methods
     **************************************************************************/

    protected Model createModel() { return JenaUtil.createDefaultModel(); }

    protected Model validate(Model data) { return _validator.validate(data); }
}