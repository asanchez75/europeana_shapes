/**
 * 
 */
package eu.europeana.edm.shapes.report;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
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
public class HTMLReportGenerator implements ReportGenerator
{
    private String   _query;
    private Model    _shapes;

    private List<String> _sumCols = Arrays.asList("perRecord", "total");
    private Map<String,String> _prefixes;

    public HTMLReportGenerator(String query, Model shapes)
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
        Cluster tree = loadResultsAsTree(model);

        printHeaders(ps);
        printResult(tree, 0 , ps);
        ps.println("<table>");
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

    private void printResult(Cluster cluster, int index, PrintStream ps)
    {
        if ( !cluster.isTree() ) { printGrouping(cluster, index, ps); }

        index = index + 1;
        Collection col = cluster.values();
        for ( Object o : col )
        {
            if ( o instanceof Entry ) { printEntry((Entry)o, index, ps); }
            else { printResult((Cluster)o, index, ps); }
        }
    }

    private void printHeaders(PrintStream ps)
    {
        ps.println("<table><tr><td></td>");
        for ( String col : _sumCols )
        {
            ps.print("<td>" + col + "</td>");
        }
        ps.print("</tr>");
    }

    private void printEntry(Entry entry, int index, PrintStream ps)
    {
        ps.print("<tr><td>");
        for ( int i = 1; i < index; i++ ) { ps.print("&nbsp;&nbsp;&nbsp;&nbsp;"); }
        ps.print(getTitle(entry.getValue()));
        ps.println("</td>");
        printSumCols(entry, ps);
        ps.println("</tr>");
    }

    private void printGrouping(Cluster cluster, int index, PrintStream ps)
    {
        ps.print("<tr><td>");
        for ( int i = 1; i < index; i++ ) { ps.print("&nbsp;&nbsp;&nbsp;&nbsp;"); }
        ps.print(getTitle(cluster.getValue()));
        ps.println("</td>");
        
        //printSumCols(entry, ps);
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
        String ns = r.getNameSpace();
        return (_shapes.getNsURIPrefix(ns) + ":" + r.getLocalName());
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

        if ( isType(r2, SH.Constraint) 
          || isType(r2, SH.PropertyConstraint)
          || isType(r2, SH.ConstraintTemplate) ) {
            return getConstraintTitle(r1, r2);
        }
        if ( isType(r2, SH.Shape)      ) { return getShapeTitle(r2);          }
        return "";
    }

    private String getConstraintTitle(Resource r1, Resource r2)
    {
        String value = getPropertyValue(r2, SH.description);
        if ( value != null ) { return value; }

        value = getPropertyValue(r1, SH.message);
        return (value != null ? value : r1.getURI());
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

    private Cluster loadResultsAsTree(Model model)
    {
        Cluster tree = new Cluster(null, null);
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

    private void fillCluster(Cluster tree, Map<String,RDFNode> entry, String pivot)
    {
        Cluster iter = tree;
        for ( String col : entry.keySet() )
        {
            if ( col.equals(pivot) ) {
                Entry e = new Entry(pivot, entry.get(col));
                e.putAll(entry);
                iter.put(entry.get(col), e);
                break;
            }

            RDFNode node = entry.get(col);
            Cluster c    = (Cluster)iter.get(node);
            if ( c == null ) { c = new Cluster(col, node); iter.put(node, c); }
            iter = c;
        }
    }

    private class Cluster extends LinkedHashMap
    {
        private String  _col;
        private RDFNode _value;

        public Cluster(String col, RDFNode value)
        {
            _col = col;
            _value = value;
        }

        public String  getColumn() { return _col;   }
        public RDFNode getValue()  { return _value; }

        public boolean isTree()   { return (_col == null); }
    }

    private class Entry extends Cluster
    {
        public Entry(String col, RDFNode value)
        {
            super(col, value);
        }
    }
}
