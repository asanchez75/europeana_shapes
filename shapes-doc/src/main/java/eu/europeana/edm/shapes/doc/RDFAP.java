/**
 * 
 */
package eu.europeana.edm.shapes.doc;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Hugo Manguinhas <hugo.manguinhas@europeana.eu>
 * @since 9 Mar 2016
 */
public class RDFAP
{
    private static final String BASE_URL
        = "http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/";
    private static Map<String,String> _requirements = new HashMap();

    static {
        _requirements.put("R-10-DEFINE-DISJOINT-PROPERTIES"
                        , getURL("17"));
        _requirements.put("R-30-DEFINE-VALUE-LISTS"
                        , getURL("37"));
        _requirements.put("R-43-LITERAL-VALUE-COMPARISON"
                        , getURL("50"));
        _requirements.put("R-44-PATTERN-MATCHING-ON-RDF-LITERALS"
                        , getURL("51"));
        _requirements.put("R-47-SPECIFY-AND-VALIDATE-LANGUAGE-TAGS"
                        , getURL("54"));
        _requirements.put("R-48-MISSING-LANGUAGE-TAGS"
                        , getURL("55"));
        _requirements.put("R-49-PROPERTY-OCCURS-ONCE-PER-LANGUAGE-TAG"
                        , getURL("56"));
        _requirements.put("R-67-BOOLEAN-PROPERTY-PATTERNS"
                        , getURL("74"));
        _requirements.put("R-68-REQUIRED-PROPERTIES"
                        , getURL("75"));
        _requirements.put("R-171-VALIDATION-OF-URIS-BY-DEREFERENCING"
                        , getURL("286"));
        _requirements.put("R-171bis-VALIDATE-RESOURCE-MEDIA-TYPE-FROM-DEREFERENCING"
                        , getURL("455"));
        _requirements.put("R-210-DEFINE-EXCLUSIVELY-ALLOWED-PROPERTIES"
                        , getURL("423"));
        _requirements.put("R-211-CARDINALITY-CONSTRAINTS"
                        , getURL("424"));
        _requirements.put("R-224-USE-SUB-SUPER-RELATIONS-IN-VALIDATION"
                        , getURL("451"));
        _requirements.put("R-225-VALIDATION-OF-CLASS-ASSOCIATION"
                        , getURL("453"));

    }

    public static String getRequirementURL(String reqID)
    {
        return _requirements.get(reqID);
    }

    private static String getURL(String id) { return (BASE_URL + id); }
}
