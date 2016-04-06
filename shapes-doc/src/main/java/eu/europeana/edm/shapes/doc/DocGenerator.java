/**
 * 
 */
package eu.europeana.edm.shapes.doc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.jena.rdf.model.Resource;
import org.apache.jena.vocabulary.DC;
import org.apache.jena.vocabulary.DCTerms;
import org.apache.jena.vocabulary.OWL;
import org.apache.jena.vocabulary.RDF;
import org.topbraid.shacl.vocabulary.SH;

import eu.europeana.github.MarkDownWriter;
import eu.europeana.shapes.testsuite.TestCase;

/**
 * @author Hugo Manguinhas <hugo.manguinhas@europeana.eu>
 * @since 31 Mar 2016
 */
public abstract class DocGenerator
{
    static Map<String,String> _prefixes = new LinkedHashMap();

    static {
        _prefixes.put(RDF.uri                                   , "rdf");
        _prefixes.put("http://www.w3.org/2004/02/skos/core#"    , "skos");
        _prefixes.put("http://www.w3.org/2003/01/geo/wgs84_pos#", "wgs84_pos");
        _prefixes.put(DC.NS                                     , "dc");
        _prefixes.put(DCTerms.NS                                , "dct");
        _prefixes.put("http://xmlns.com/foaf/0.1/"              , "foaf");
        _prefixes.put("http://www.openarchives.org/ore/terms/"  , "ore");
        _prefixes.put("http://rdvocab.info/ElementsGr2/"        , "rdaGr2");
        _prefixes.put("http://www.europeana.eu/schemas/edm/"    , "edm");
        _prefixes.put(OWL.NS                                    , "owl");
        _prefixes.put(SH.NS                                     , SH.PREFIX);
    }

    protected GeneratorConfig _config = null;

    public DocGenerator(GeneratorConfig config) { _config = config; }


    /***************************************************************************
     * Public Methods
     **************************************************************************/

    public abstract void generate();


    /***************************************************************************
     * Protected Methods
     **************************************************************************/

    protected MarkDownWriter getWriter(File file)
    {
        try {
            File dir = file.getParentFile();
            if ( !dir.exists() ) { dir.mkdirs(); }
            return new MarkDownWriter(file);
        }
        catch (FileNotFoundException e) { throw new RuntimeException(e); }
    }

    protected String getPrefixedName(Resource rsrc)
    {
        String uri = rsrc.getURI();
        for ( String ns : _prefixes.keySet() )
        {
            if ( !uri.startsWith(ns) ) { continue; }
            return (_prefixes.get(ns) + ':' + uri.substring(ns.length()));
        }
        return uri;
    }
}
