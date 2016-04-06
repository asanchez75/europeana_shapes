/**
 * 
 */
package eu.europeana.edm.shapes.doc;

/**
 * @author Hugo Manguinhas <hugo.manguinhas@europeana.eu>
 * @since 1 Apr 2016
 */
public class ShapesDocGenerator extends DocGenerator
{
    public ShapesDocGenerator(GeneratorConfig config) { super(config); }

    @Override
    public void generate()
    {
        new ShapesDataGenerator(_config).generate();
        new ShapesTestSuiteGenerator(_config).generate();
        new ShapesDatasetValidationGenerator(_config).generate();
    }
}
