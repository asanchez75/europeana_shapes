/**
 * 
 */
package eu.europeana.shapes.testsuite;

import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ResIterator;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.vocabulary.RDF;
import org.topbraid.shacl.vocabulary.SH;

/**
 * @author Hugo Manguinhas <hugo.manguinhas@europeana.eu>
 * @since 25 Mar 2016
 */
public class TestResult
{
    private TestCase _test;
    private Model    _output;
    private boolean  _isOK;

    public TestResult(TestCase test, Model output)
    {
        _test   = test;
        _output = output;
        _isOK   = validate(test.getResultModel(false), output);
    }

    public TestCase getTestCase() { return _test;   }
    public Model    getOutput()   { return _output; }
    public Boolean  isOK()        { return _isOK;   }

    private boolean validate(Model m1, Model m2)
    {
        boolean ret = true;
        if ( m1 == null || m1 == m2 ) { return ret; }

        return m1.isIsomorphicWith(m2);
        /*
        Collection<Resource> c1 = loadResults(m1);
        Collection<Resource> c2 = loadResults(m2);
        for ( Resource r : c1 )
        {
            if ( !c2.contains(r) ) { ret = false && ret; continue; }
            ret = compare(m1.getResource(uri), m2.getResource(uri)) && ret;
        }
        for ( String uri : c2 )
        {
            if ( !c2.contains(uri) ) { ret = false && ret; }
        }
        return ret;
         */
    }

    private boolean compare(Resource r1, Resource r2)
    {
        return true;
    }

    private Collection<Resource> loadResults(Model r)
    {
        Collection<Resource> col = new HashSet();
        ResIterator iter = r.listResourcesWithProperty(RDF.type
                                                     , SH.ValidationResult);
        try {
            while(iter.hasNext()) { col.add(iter.next()); }
        }
        finally { iter.close(); }

        return col;
    }
}
