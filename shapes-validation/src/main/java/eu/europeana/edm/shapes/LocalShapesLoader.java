/**
 * 
 */
package eu.europeana.edm.shapes;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.ResIterator;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.StmtIterator;
import org.apache.jena.riot.Lang;
import org.apache.jena.riot.RDFLanguages;
import org.apache.jena.util.FileUtils;
import org.apache.jena.vocabulary.OWL;
import org.apache.jena.vocabulary.RDF;
import org.topbraid.shacl.vocabulary.SH;

import eu.europeana.edm.shapes.check.ShapeChecker;

/**
 * @author Hugo Manguinhas <hugo.manguinhas@europeana.eu>
 * @since 25 Mar 2016
 */
public class LocalShapesLoader implements ShapesLoader
{
    private Map<String,Model> _cache   = new HashMap();
    private ShapeChecker      _checker = new ShapeChecker();

    public LocalShapesLoader() {}

    @Override
    public Model load(String url) { return _cache.get(url); }

    public void inspect(File file)
    {
        if ( !file.isDirectory() ) { loadModel(file); return; }

        for ( File f : file.listFiles() ) { inspect(f); }
    }

    private void loadModel(File file)
    {
        //Lang lang = RDFLanguages.filenameToLang(file.getName());
        //if ( lang == null ) { return; }

        //InputStream is = null;
        try {
            //is = new FileInputStream(file);
            Model m = ModelFactory.createDefaultModel();
            //System.err.println(lang.getLabel());
            m.read(file.getCanonicalPath());
            registerModel(m);
        }
        catch (Throwable t)
        {
            newErr("Loading file: " + file.getName()
                 + ", reason: " + t.getMessage());
        }
        //finally { IOUtils.closeQuietly(is); }
    }

    private void registerModel(Model model)
    {
        if ( !_checker.check(model) ) { return; }

        Resource resource = getOntology(model);
        if ( resource != null ) { _cache.put(resource.getURI(), model); }
    }

    private Resource getOntology(Model model)
    {
        ResIterator iter = model.listResourcesWithProperty(RDF.type
                                                         , OWL.Ontology);
        try { return ( iter.hasNext() ? iter.next() : null ); }
        finally { iter.close(); }
    }

    public void importDependencies()
    {
        for ( Model model : _cache.values() ) { importDependencies(model); }
    }

    private void importDependencies(Model model)
    {
        Resource ontology = getOntology(model);
        importDependencies(ontology, OWL.imports);
        importDependencies(ontology, SH.shapesGraph);
    }

    private void importDependencies(Resource ontology, Property prop)
    {
        StmtIterator iter = ontology.listProperties(prop);
        try {
            while ( iter.hasNext() )
            {
                String uri = iter.next().getResource().getURI();
                if ( filterImport(uri) ) { continue; }

                Model  m   = _cache.get(uri);
                if ( m != null ) { ontology.getModel().add(m); continue; }

                newErr("Could not find resource <" + uri + ">");
            }
        }
        finally { iter.close(); }
    }

    private boolean filterImport(String uri)
    {
        return uri.equals("http://www.europeana.eu/schemas/edm/rdf/edm.owl")
            || uri.equals(SH.BASE_URI);
    }

    private void newErr(String msg)
    {
        System.err.println("Error: " + msg);
    }
}
