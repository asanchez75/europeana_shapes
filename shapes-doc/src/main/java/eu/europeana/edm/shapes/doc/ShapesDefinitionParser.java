/**
 * 
 */
package eu.europeana.edm.shapes.doc;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;

/**
 * @author Hugo Manguinhas <hugo.manguinhas@europeana.eu>
 * @since 9 Mar 2016
 */
public class ShapesDefinitionParser
{
    private DefaultState       _sDefault    = new DefaultState();
    private DefinitionState    _sDefinition = new DefinitionState();
    private Map<String,String> _definitions;

    public synchronized Map<String,String> loadDefinitions(File file) 
           throws IOException
    {
        _definitions = new HashMap();
        String content = FileUtils.readFileToString(file, "UTF-8");
        State  state = _sDefault;
        String[] lines = content.split("\n");
        for ( int i = 0; i < lines.length; i++ )
        {
            state = state.newLine(lines[i]);
        }
        return _definitions;
    }

    private static interface State
    {
        public State newLine(String line);
    }

    private class DefaultState implements State 
    {
        private Map<String,String> _prefixes = new HashMap();
        private String            _base      = null;

        public State newLine(String line)
        {
            line = line.trim();
            if ( line.isEmpty()             ) { return this; }
            if ( line.startsWith("#")       ) { return this; }
            if ( line.startsWith("@base")   ) { return newBase(line); }
            if ( line.startsWith("@prefix") ) { return newPrefix(line); }
            if ( line.indexOf(":") >= 0     ) { return newStartWithPrefix(line); }
            if ( line.startsWith("<")       ) { return newStartWithURI(line); }
            return this;
        }

        private State newBase(String line)
        {
            int i1 = line.indexOf('<');
            int i2 = line.lastIndexOf('>');
            _base  = line.substring(i1+1, i2).trim();
            return this;
        }

        private State newPrefix(String line)
        {
            int iSep = line.indexOf(':');
            int i1   = line.indexOf('<');
            int i2   = line.lastIndexOf('>');

            String prefix = line.substring(8, iSep).trim();
            String ns     = line.substring(i1+1, i2).trim();
            _prefixes.put(prefix, ns);
            return this;
        }

        private State newStartWithPrefix(String line)
        {
            int    i   = line.indexOf(":");
            String ns  = _prefixes.get(line.substring(0,i));
            String uri = ns + line.substring(i+1);

            return _sDefinition.start(line, uri);
        }

        private State newStartWithURI(String line)
        {
            String uri = line.substring(1, line.indexOf('>'));
            if (uri.startsWith("http")) { return _sDefinition.start(line,uri); }

            return _sDefinition.start(line, (_base == null ? "" : _base) + uri);
        }
    }

    private class DefinitionState implements State
    {
        private StringBuilder _sb  = new StringBuilder(1024);
        private String        _uri = null;

        public State start(String line, String uri)
        {
            _uri = uri; _sb.setLength(0);
            _sb.append("<").append(uri).append(">\n");
            return this;
        }

        public State newLine(String line)
        {
            _sb.append(line).append('\n');
            if ( line.trim().equals(".") ) { return newDefinition(); }
            return this;
        }

        private State newDefinition()
        {
            _definitions.put(_uri, _sb.toString());
            _sb.setLength(0);
            _uri = null;
            return _sDefault;
        }
    }
}
