/**
 * 
 */
package eu.europeana.github;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.commons.io.IOUtils;
import org.apache.jena.util.FileUtils;


/**
 * @author Hugo Manguinhas <hugo.manguinhas@europeana.eu>
 * @since 5 Apr 2016
 */
public class MarkDownTemplate
{
    private static final String PREFIX = "#?";
    private static final String SUFFIX = "?#";

    private Set<String>        _keywords = new HashSet();
    private String             _text;
    private Map<String,String> _replacements = new HashMap();

    public MarkDownTemplate parse(File file) throws IOException
    {
        return parse(org.apache.commons.io.FileUtils.readFileToString(file));
    }

    public MarkDownTemplate parse(InputStream is) throws IOException
    {
        try     { return parse(FileUtils.readWholeFileAsUTF8(is)); }
        finally { IOUtils.closeQuietly(is);                        }
    }

    public MarkDownTemplate parse(String s)
    {
        int cursor = 0;
        while ( true )
        {
            int iS = s.indexOf(PREFIX, cursor);
            if (iS < 0) { break; }

            int iE = s.indexOf(SUFFIX, iS);
            if (iE < 0) { break; }

            _keywords.add(s.substring(iS+2, iE));

            cursor = iE + 2;
        }
        _text = s;
        return this;
    }

    public MarkDownTemplate clearReplacements()
    {
        _replacements.clear(); return this;
    }

    public MarkDownTemplate newReplacements(Map<String,String> replacements)
    {
        for ( Map.Entry<String, String> entry : replacements.entrySet() )
        {
            newReplacement(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public MarkDownTemplate newReplacement(String key, String value)
    {
        if ( _keywords.contains(key) ) { _replacements.put(key, value); }
        return this;
    }

    public MarkDownTemplate print(File file) throws IOException
    {
        PrintStream ps = new PrintStream(file);
        try { print(ps); } finally { IOUtils.closeQuietly(ps); }
        return this;
    }

    public MarkDownTemplate print(PrintStream ps)
    {
        String text = _text;
        for ( String keyword : _keywords )
        {
            String value = _replacements.get(keyword);
            text = text.replace(PREFIX + keyword + SUFFIX
                              , (value == null ? "" : value));
        }
        ps.print(text);
        ps.flush();
        return this;
    }

    /*
    private void buildFile(File doc) throws FileNotFoundException
    {
        PrintStream ps = null;
        try {
            ps = new PrintStream(doc);
            int cursor = 0;
            int len    = _template.length();
            while ( true )
            {
                int iS = _template.indexOf("#?", cursor);
                if (iS < 0) { ps.append(_template, cursor, len); break; }

                int iE = _template.indexOf("?#", iS);
                if (iE < 0) { ps.append(_template, cursor, len); break; }

                String key = _template.substring(iS+2, iE);
                ps.append(_template, cursor, iS);
                ps.append(_replace.get(key));

                cursor = iE + 2;
            }
            ps.flush();
        }
        finally { IOUtils.closeQuietly(ps); }
    }
    */
}
