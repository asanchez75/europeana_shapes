/**
 * 
 */
package eu.europeana.edm.shapes.validation;

import java.io.InputStream;
import java.net.URI;
import java.util.UUID;

import org.apache.jena.graph.Graph;
import org.apache.jena.graph.compose.MultiUnion;
import org.apache.jena.query.Dataset;
import org.topbraid.shacl.arq.SHACLFunctions;
import org.topbraid.shacl.constraints.ModelConstraintValidator;
import org.topbraid.shacl.vocabulary.SH;
import org.topbraid.spin.arq.ARQFactory;
import org.topbraid.spin.util.JenaUtil;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.util.FileUtils;

import eu.europeana.edm.shapes.validation.ShapesConstants.ShapesType;
import static eu.europeana.edm.shapes.validation.SHACLNamespace.*;
import static eu.europeana.edm.shapes.validation.ShapesUtils.*;

/**
 * @author Hugo Manguinhas <hugo.manguinhas@europeana.eu>
 * @since 8 Dec 2015
 */
public class TopBraidValidator implements ModelValidator
{
    private ModelConstraintValidator _validator         = null;
    private Model                    _validationModel   = null;
    private URI                      _shapesURI         = null;

    public TopBraidValidator(Model shapesModel)
    {
        _validator       = ModelConstraintValidator.get();
        _validationModel = getValidationModel(shapesModel);

     // (here, using a temporary URI for the shapes graph)
        String uuid      = UUID.randomUUID().toString();
        _shapesURI = URI.create("urn:x-shacl-shapes-graph:" + uuid);
    }


    /***************************************************************************
     * Public Methods
     **************************************************************************/

    public Model validate(Model data)
    {
        Dataset dataset = ARQFactory.get().getDataset(data);
        dataset.addNamedModel(_shapesURI.toString(), _validationModel);

        Model results = null;
        long time = System.currentTimeMillis();

        try {
            results = _validator.validateModel(dataset, _shapesURI
                                             , null, false, null);
        }
        catch (InterruptedException e) {}

        long elapsed = System.currentTimeMillis() - time;
        System.out.println("Validator executed in " + elapsed + "ms");
        results.setNsPrefix(SHACL_PREFIX, SHACL_NS);

        return results;
    }


    /***************************************************************************
     * Public Static Methods
     **************************************************************************/

    private static Model getSHACL()
    {
        Model m = JenaUtil.createDefaultModel();
        InputStream is = SH.class.getResourceAsStream("/etc/shacl.ttl");
        m.read(is, SH.BASE_URI, FileUtils.langTurtle);
        return m;
    }

    private static Model getValidationModel(Model shapesModel)
    {
        MultiUnion unionGraph = new MultiUnion(new Graph[] {
            getSHACL().getGraph(), shapesModel.getGraph()
        });
        Model m = ModelFactory.createModelForGraph(unionGraph);

        // Make sure all sh:Functions are registered
        // Note that we don't perform validation of the shape definitions themselves.
        // To do that, activate the following line to make sure that all required triples are present:
        // dataModel = SHACLUtil.withDefaultValueTypeInferences(shapesModel);
        SHACLFunctions.registerFunctions(m);
        return m;
    }
}
