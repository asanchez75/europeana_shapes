/**
 * 
 */
package eu.europeana.edm.shapes.check;

import java.util.regex.Pattern;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.ResIterator;
import org.apache.jena.rdf.model.Resource;

import static org.apache.jena.vocabulary.RDF.*;
import static org.topbraid.shacl.vocabulary.SH.*;

/**
 * @author Hugo Manguinhas <hugo.manguinhas@europeana.eu>
 * @since 3 Mar 2016
 */
public class ShapeChecker
{
    private static String PATTERN_PREFIX
        = "http[:][/][/]www[.]europeana[.]eu[/]"
        + "schemas[/]edm[/]shapes[/]external[/]";
    private static String PATTERN_CLASS
        = PATTERN_PREFIX + "[A-Za-z]+";
    private static String PATTERN_PROPERTY
        = PATTERN_CLASS  + "[/][A-Za-z0-9]+[_][A-Za-z]+";

    private static Pattern PATTERN_CLASS_RULE
        = Pattern.compile("^" + PATTERN_CLASS + "[#].*$");
    private static Pattern PATTERN_PROPERTY_RULE
        = Pattern.compile("^" + PATTERN_PROPERTY + "[#].*$");

    public static boolean isPropertyConstraint(String uri)
    {
        if ( uri == null ) { return false; }
        return PATTERN_PROPERTY_RULE.matcher(uri).matches();
    }

    public static boolean isPropertyConstraint(Resource rsrc)
    {
        return isPropertyConstraint(rsrc.getURI());
    }

    public static boolean isShapeConstraint(String uri)
    {
        if ( uri == null ) { return false; }
        return PATTERN_CLASS_RULE.matcher(uri).matches();
    }

    public static boolean isShapeConstraint(Resource rsrc)
    {
        return isShapeConstraint(rsrc.getURI());
    }

    public static boolean isShapeOrPropertyConstraint(String uri)
    {
        return ( isPropertyConstraint(uri) || isShapeConstraint(uri) );
    }


    public boolean check(Model model)
    {
        boolean ret = true;
        ret = checkPropertyConstraints(model)    || ret;
        ret = checkInvPropertyConstraints(model) || ret;
        ret = checkConstraints(model)            || ret;

        return ret;
    }

    private boolean checkConstraints(Model model)
    {
        boolean ret = true;
        ResIterator iter = model.listSubjectsWithProperty(type, Constraint);
        while ( iter.hasNext() ) { ret = checkConstraint(iter.next()) || ret; }
        return ret;
    }

    private boolean checkPropertyConstraints(Model model)
    {
        boolean ret = true;
        ResIterator iter = model.listSubjectsWithProperty(
            type, PropertyConstraint);
        while ( iter.hasNext() )
        {
            ret = checkProperty(iter.next(), property) || ret;
        }
        return ret;
    }

    private boolean checkInvPropertyConstraints(Model model)
    {
        boolean ret = true;
        ResIterator iter = model.listSubjectsWithProperty(
            type, InversePropertyConstraint);
        while ( iter.hasNext() )
        {
            ret = checkProperty(iter.next(), inverseProperty) | ret;
        }
        return ret;
    }

    private boolean checkConstraint(Resource rsrc)
    {
        boolean ret = true;
        String uri = rsrc.getURI();
        if ( !isShapeOrPropertyConstraint(uri) ) { 
            ret = false;
            System.err.println("Illegal URI: " + uri);
        }

        Model model = rsrc.getModel();
        ResIterator iter = model.listResourcesWithProperty(constraint, rsrc);
        if ( !iter.hasNext() ) {
            ret = false;
            System.err.println("Constraint not being referenced: " + uri);
        }

        return ret;
    }

    private boolean checkProperty(Resource rsrc, Property p)
    {
        boolean ret = true;
        String uri = rsrc.getURI();
        if ( !isPropertyConstraint(uri) ) { 
            ret = false;
            System.err.println("Illegal URI: " + uri);
        }

        Model model = rsrc.getModel();
        ResIterator iter = model.listResourcesWithProperty(p, rsrc);
        if ( !iter.hasNext() ) {
            ret = false;
            System.err.println("Property constraint not being referenced: " + uri);
        }

        return ret;
    }
}
