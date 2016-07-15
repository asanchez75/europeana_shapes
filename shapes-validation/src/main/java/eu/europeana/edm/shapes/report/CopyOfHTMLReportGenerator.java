/**
 * 
 */
package eu.europeana.edm.shapes.report;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.jena.query.Query;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.RDFNode;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.StmtIterator;
import org.apache.jena.vocabulary.RDF;
import org.topbraid.shacl.vocabulary.SH;

/**
 * @author Hugo Manguinhas <hugo.manguinhas@europeana.eu>
 * @since 4 Apr 2016
 */
public class CopyOfHTMLReportGenerator implements ReportGenerator
{
    private List<String> _sumCols = Arrays.asList("perRecord", "total");
    private String   _query;
    private Model    _shapes;

    public CopyOfHTMLReportGenerator(String query, Model shapes)
    {
        _query  = query;
        _shapes = shapes;
    }


    /***************************************************************************
     * Public Methods
     **************************************************************************/
    @Override
    public void generate(Model model, PrintStream ps)
    {
        Map tree = loadResultsAsTree(model);

        for ( String group )

        
    }


    /***************************************************************************
     * Private Processing Methods
     **************************************************************************/

    private void processResult(Map tree
                             , PrintStream ps)
    {
        int size = cursor.keySet().size();
        int varCols = size - _sumCols.length;
        Iterator<String> iter = cursor.keySet().iterator();
        int    i   = 0;
        String col = null;
        for ( ; i < varCols; i++)
        {
            col = iter.next();
            if (equals(cursor.get(col), previous.get(col))) { continue; }

            printGrouping(i, col, cursor, ps);
        }
        printEntry(i, col, cursor, ps);
    }


    /***************************************************************************
     * Private Auxiliar Methods
     **************************************************************************/

    private boolean equals(RDFNode node1, RDFNode node2)
    {
        if ( node1 == node2 )                     { return true;  }
        if ( (node1 == null) || (node2 == null) ) { return false; }
        return node1.equals(node2);
    }

    private Map newEntry(List<String> cols)
    {
        Map map = new LinkedHashMap(cols.size());
        for ( String col : cols ) { map.put(col, null); }
        return map;
    }

    private Map<String,RDFNode> toMap(QuerySolution qs, List<String> cols)
    {
        Map map = new LinkedHashMap();
        for ( String col : cols ) { map.put(col, qs.get(col)); }
        return map;
    }


    /***************************************************************************
     * Private Printing Methods 
     **************************************************************************/

    private void printHeaders(PrintStream ps)
    {
        ps.println("<table><tr><td></td>");
        for ( String col : _sumCols )
        {
            ps.print("<td>" + col + "</td>");
        }
        ps.print("</tr>");
    }

    private void printEntry(int index, String key
                          , Map<String,RDFNode> entry, PrintStream ps)
    {
        ps.println("<tr><td>" + getTitle(entry.get(key)) + "</td>");
        printSumCols(entry, ps);
        ps.println("</tr>");
    }

    private void printGrouping(int index, String key
                             , Map<String,RDFNode> entry, PrintStream ps)
    {
        ps.print("<tr><td>" + getTitle(entry.get(key)) + "</td>");
        printSumCols(entry, ps);
        ps.println("</tr>");
    }

    private void printSumCols(Map<String,RDFNode> entry, PrintStream ps)
    {
        for ( String col : _sumCols )
        {
            ps.print("<td align='right'>");
            ps.print(getValue(entry.get(col)));
            ps.print("</td>");
        }
    }


    /***************************************************************************
     * Private Methods - Titles and Values 
     **************************************************************************/

    private String getPrefixedName(Resource r)
    {
        Model m = r.getModel();
        System.out.println(m.getNsPrefixMap());
        System.out.println("Namespace=" + r.getNameSpace());
        return (m.getNsPrefixURI(r.getNameSpace()) + ":" + r.getLocalName());
    }

    private String getPropertyValue(Resource r, Property p)
    {
        StmtIterator iter = r.listProperties(p);
        try {
            while ( iter.hasNext() ) { return iter.next().getString(); }
        }
        finally { iter.close(); }

        return null;
    }

    private String getTitle(RDFNode node)
    {
        if ( !node.isResource()          ) { return ""; }
        Resource r1 = node.asResource();
        Resource r2 = _shapes.getResource(r1.getURI());

        if ( isType(r2, SH.Constraint) ) { return getConstraintTitle(r1, r2); }
        if ( isType(r2, SH.Shape)      ) { return getShapeTitle(r2);          }
        return "";
    }

    private String getConstraintTitle(Resource r1, Resource r2)
    {
        String value = getPropertyValue(r2, SH.description);
        return (value != null ? value : getPropertyValue(r1, SH.message));
    }

    private String getShapeTitle(Resource r)
    {
        Resource c = r.getPropertyResourceValue(SH.scopeClass);
        if ( c == null ) {
            String value = getPropertyValue(r, SH.description);
            return (value != null ? value : "");
        }
        return getPrefixedName(c);
    }

    private String getValue(RDFNode node)
    {
        if ( node == null ) { return ""; }
        return (node.isLiteral() ? node.asLiteral().getString() : "");
    }

    private boolean isType(Resource rsrc, Resource type)
    {
        return rsrc.hasProperty(RDF.type, type);
    }

    /***************************************************************************
     * Private Methods - Cluster
     **************************************************************************/

    private List<Map> loadResultsAsList(Model model)
    {
        List<Map> list = new ArrayList();
        QueryExecution eng = QueryExecutionFactory.create(_query, model);
        try {
            ResultSet    rs   = eng.execSelect();
            List<String> cols = rs.getResultVars();
            while ( rs.hasNext() ) { list.add(toMap(rs.next(), cols)); }
        }
        finally { eng.close(); }
        return list;
    }

    private Map loadResultsAsTree(Model model)
    {
        Map tree = new LinkedHashMap();
        QueryExecution eng = QueryExecutionFactory.create(_query, model);
        try {
            ResultSet    rs    = eng.execSelect();
            List<String> cols  = rs.getResultVars();
            String       pivot = cols.get(cols.size() - _sumCols.size() - 1);
            while ( rs.hasNext() )
            {
                fillCluster(tree, toMap(rs.next(), cols), pivot);
            }
        }
        finally { eng.close(); }

        return tree;
    }

    private List<String> getGroupCols(List<String> cols)
    {
        List<String> groupCols = new ArrayList();
        int max = cols.size() - _sumCols.size();
        for ( int i = 0; i < max ; i++ ) { groupCols.add(cols.get(i)); }
        return groupCols;
    }

    private void fillCluster(Map tree, Map<String,RDFNode> entry, String pivot)
    {
        Map iter = tree;
        for ( String col : entry.keySet() )
        {
            if ( col.equals(pivot) ) { iter.put(entry.get(col), entry); break; }

            RDFNode node = entry.get(col);
            Map     m    = (Map)iter.get(node);
            if ( m != null ) { m = new LinkedHashMap(); iter.put(node, m); }
            iter = m;
        }
    }
}
