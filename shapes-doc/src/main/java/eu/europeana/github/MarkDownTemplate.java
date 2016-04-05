/**
 * 
 */
package eu.europeana.github;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
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

    private Set<String> _keywords;
    private String      _text;

    public void parse(File file) throws IOException
    {
        parse(org.apache.commons.io.FileUtils.readFileToString(file));
    }

    public void parse(InputStream is) throws IOException
    {
        try     { parse(FileUtils.readWholeFileAsUTF8(is)); }
        finally { IOUtils.closeQuietly(is);                 }
    }

    public void parse(String s)
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
    }

    public void print(File file, Map<String,String> replacements)
           throws IOException
    {
        PrintStream ps = new PrintStream(file);
        try     { print(ps, replacements);  }
        finally { IOUtils.closeQuietly(ps); }
    }

    public void print(PrintStream ps, Map<String,String> replacements)
    {
        String text = _text;
        for ( String keyword : _keywords )
        {
            String value = replacements.get(keyword);
            text = text.replaceAll(PREFIX + keyword + SUFFIX
                                 , (value == null ? "" : value));
        }
        ps.print(text);
        ps.flush();
    }
}
