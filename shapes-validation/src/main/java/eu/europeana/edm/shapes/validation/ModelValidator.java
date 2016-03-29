/**
 * 
 */
package eu.europeana.edm.shapes.validation;

import org.apache.jena.rdf.model.Model;

/**
 * @author Hugo Manguinhas <hugo.manguinhas@europeana.eu>
 * @since 25 Mar 2016
 */
public interface ModelValidator
{
    public Model validate(Model data);
}
