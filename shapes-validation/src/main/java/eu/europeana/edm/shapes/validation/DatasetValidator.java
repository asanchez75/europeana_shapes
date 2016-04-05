/**
 * 
 */
package eu.europeana.edm.shapes.validation;

import java.io.File;
import java.io.IOException;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.Resource;

import static eu.europeana.edm.shapes.validation.ValidationUtils.*;

/**
 * @author Hugo Manguinhas <hugo.manguinhas@europeana.eu>
 * @since 1 Apr 2016
 */
public class DatasetValidator
{
    private ModelValidator _validator;

    public DatasetValidator(ModelValidator validator) { _validator = validator;}

    public Model validate(File file) throws IOException
    {
        Model model = _validator.validate(loadModel(file));
        return model;
    }
}
