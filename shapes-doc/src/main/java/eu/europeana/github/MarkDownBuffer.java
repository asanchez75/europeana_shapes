/**
 * 
 */
package eu.europeana.github;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

/**
 * @author Hugo Manguinhas <hugo.manguinhas@europeana.eu>
 * @since 30 Mar 2016
 */
public class MarkDownBuffer
{
    private StringBuilder _sb = new StringBuilder(1024);

    public MarkDownBuffer() {}


    /***************************************************************************
     * Public Methods
     **************************************************************************/

    public MarkDownBuffer append(Object... objs)
    {
        for ( Object o : objs ) { _sb.append(o); }
        return this;
    }

    public MarkDownBuffer appendln(Object... objs)
    {
        append(objs); _sb.append('\n');
        return this;
    }

    public String flushBuffer()
    {
        try { return _sb.toString(); } finally { clear(); }
    }

    public MarkDownBuffer clear() { _sb.setLength(0); return this; }


    /***************************************************************************
     * Public Methods - MarkDown
     **************************************************************************/

    public MarkDownBuffer appendHeader(int l, String msg)
    {
        append("\n");
        for ( int i = 0; i < l; i++ ) { append('#'); }
        return append(" ", msg);
    }

    public MarkDownBuffer appendH1(String msg) { return appendHeader(1, msg); }
    public MarkDownBuffer appendH2(String msg) { return appendHeader(2, msg); }
    public MarkDownBuffer appendH3(String msg) { return appendHeader(3, msg); }
    public MarkDownBuffer appendH4(String msg) { return appendHeader(4, msg); }
    public MarkDownBuffer appendH5(String msg) { return appendHeader(5, msg); }

    public MarkDownBuffer appendSeparator()
    {
        return append("------");
    }

    public MarkDownBuffer appendParagraph(String txt)
    {
        return append("\n", txt);
    }

    public MarkDownBuffer appendTableHeader(String... strs)
    {
        append("\n|");
        for ( String s : strs ) { append(" ", s, " |"); }
        return append("\n");
    }

    public MarkDownBuffer appendTableCols(char... cols)
    {
        append("|");
        for ( char col : cols )
        {
            switch (col) {
                case 'l': append(" :--- "); break;
                case 'r': append(" ---: "); break;
                case 'c': append(" :--: "); break;
            }
            append("|");
        }
        return append("\n");
    }

    public MarkDownBuffer appendTableRow(Object... cells)
    {
        append("|");
        for ( Object o : cells ) { append(" ", o, " |"); }
        return append("\n");
    }

    public MarkDownBuffer appendBold(String txt)
    {
        return append("**", txt, "**");
    }

    public MarkDownBuffer appendItalic(String txt)
    {
        return append('_', txt, '_');
    }

    public MarkDownBuffer appendBoldItalic(String txt)
    {
        return append("**_", txt, "_**");
    }

    public MarkDownBuffer appendStrike(String txt)
    {
        return append("~~", txt, "~~");
    }

    public MarkDownBuffer appendQuoted(String txt)
    {
        return appendln("> ", txt);
    }

    public MarkDownBuffer appendAnchor(String id)
    {
        return append("<a id=\"", id, "\">&nbsp;</a>");
    }

    public MarkDownBuffer appendLink(String label, String url)
    {
        return append('[', label, ']', '(', url, ')');
    }

    public MarkDownBuffer appendLink(String label, String url
                                   , String id, boolean target)
    {
        String strID  = (id == null ? "" : "id=\"" + id + "\" ");
        String strTrg = (target ? "target=\"_blank\" " : "");
        return append("<a ", strID, strTrg, "href=\"", url, "\">"
                    , label, "</a>");
    }

    public MarkDownBuffer appendLinkItem(int indent, String txt)
    {
        for ( int i = 0; i < indent; i++ ) { append("  "); }
        return appendln("- ", txt);
    }

    public MarkDownBuffer appendLinkItem(int indent, int order, String txt)
    {
        for ( int i = 0; i < indent; i++ ) { append("  "); }
        return appendln(order, ". ", txt);
    }

    public MarkDownBuffer appendTaskItem(boolean checked, String txt)
    {
        return append("- [", (checked ? 'x' : ' '), "] ", txt);
    }

    public MarkDownBuffer appendUser(String user)
    {
        return append('@', user, ' ');
    }

    public MarkDownBuffer appendEMOJI(String emoji)
    {
        return append(':', emoji, ':');
    }

    public MarkDownBuffer appendEscaped(String msg)
    {
        return append(msg.replaceAll("[*_\\-:@]", "\\%0"));
    }
}
