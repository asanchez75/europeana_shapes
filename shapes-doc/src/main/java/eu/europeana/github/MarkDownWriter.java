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
public class MarkDownWriter extends PrintStream
{
    private StringBuilder _sb = new StringBuilder();

    public MarkDownWriter(File file) throws FileNotFoundException
    {
        super(file);
    }

    public MarkDownWriter(File file, String csn)
           throws FileNotFoundException, UnsupportedEncodingException
    {
        super(file, csn);
    }

    public MarkDownWriter(OutputStream out)
    {
        super(out);
    }

    public MarkDownWriter(OutputStream out, boolean autoFlush)
    {
        super(out, autoFlush);
    }

    public MarkDownWriter(OutputStream out, boolean autoFlush, String encoding)
           throws UnsupportedEncodingException
    {
        super(out, autoFlush, encoding);
    }

    public MarkDownWriter(String fileName) throws FileNotFoundException
    {
        super(fileName);
    }

    public MarkDownWriter(String fileName, String csn)
           throws FileNotFoundException, UnsupportedEncodingException
    {
        super(fileName, csn);
    }

    public MarkDownWriter printSeparator() { println("------"); return this; }

    public MarkDownWriter printHeader(int l, String msg)
    {
        println();
        for ( int i = 0; i < l; i++ ) { print('#'); }
        print(' '); println(msg);
        return this;
    }

    public MarkDownWriter printH1(String msg) { return printHeader(1, msg); }
    public MarkDownWriter printH2(String msg) { return printHeader(2, msg); }
    public MarkDownWriter printH3(String msg) { return printHeader(3, msg); }
    public MarkDownWriter printH4(String msg) { return printHeader(4, msg); }
    public MarkDownWriter printH5(String msg) { return printHeader(5, msg); }

    public MarkDownWriter printParagraph(String txt)
    {
        println();
        println(txt);
        return this;
    }

    /***************************************************************************
     * Public Methods
     **************************************************************************/

    public MarkDownWriter print(Object... args)
    {
        for ( Object o : args ) { print(o); }
        return this;
    }

    public MarkDownWriter println(Object... args)
    {
        for ( Object o : args ) { print(o); }
        println();
        return this;
    }


    /***************************************************************************
     * Public Printing Methods
     **************************************************************************/

    public MarkDownWriter printTableHeader(String... strs)
    {
        println();

        print('|');
        for ( String s : strs ) { print(" ", s, " |"); }
        println();


        return this;
    }

    public MarkDownWriter printTableCols(char... cols)
    {
        print('|');
        for ( char col : cols )
        {
            switch (col) {
                case 'l': print(" :--- "); break;
                case 'r': print(" ---: "); break;
                case 'c': print(" :--: "); break;
            }
            print('|');
        }
        println();
        return this;
    }

    public MarkDownWriter printTableRow(Object... cells)
    {
        print('|');
        for ( Object o : cells ) { print(' ', o, " |"); }
        println();

        return this;
    }

    public MarkDownWriter printBold(String txt)
    {
        print("**", txt, "**"); return this;
    }

    public MarkDownWriter printItalic(String txt)
    {
        print('_', txt, '_'); return this;
    }

    public MarkDownWriter printBoldItalic(String txt)
    {
        print("**_", txt, "_**"); return this;
    }

    public MarkDownWriter printStrike(String txt)
    {
        print("~~", txt, "~~"); return this;
    }

    public MarkDownWriter printQuoted(String txt)
    {
        print("> ", txt); println(); return this;
    }

    public MarkDownWriter printCode(String code)
    {
        if ( !code.contains("\n") ) { print("`", code, "`"); return this; }

        println();
        println("```"); println(code.trim()); println("```");
        return this;
    }

    public MarkDownWriter printCode(String code, String lang)
    {
        println();
        println("```", lang);
        println(code.trim());
        println("```");
        return this;
    }

    public MarkDownWriter printLink(String label, String url)
    {
        print('[', label, ']', '(', url, ')'); return this;
    }

    public void printLink(String label, String url, String id, boolean target)
    {
        String strID  = (id == null ? "" : "id=\"" + id + "\" ");
        String strTrg = (target ? "target=\"_blank\" " : "");
        print("<a ", strID, strTrg, "href=\"", url, "\">", label, "</a>");
    }

    public MarkDownWriter printLinkItem(int indent, String txt)
    {
        for ( int i = 0; i < indent; i++ ) { print("  "); }
        println("- ", txt); return this;
    }

    public MarkDownWriter printLinkItem(int indent, int order, String txt)
    {
        for ( int i = 0; i < indent; i++ ) { print("  "); }
        println(order, ". ", txt);
        return this;
    }

    public MarkDownWriter printTaskItem(boolean checked, String txt)
    {
        println("- [", (checked ? 'x' : ' '), "] ", txt); return this;
    }

    public MarkDownWriter printUser(String user)
    {
        print('@', user, ' '); return this;
    }

    public MarkDownWriter printEMOJI(String emoji)
    {
        print(':', emoji, ':'); return this;
    }


    /***************************************************************************
     * Public Generation Methods
     **************************************************************************/

    public String newBold(String txt)
    {
        return append("**", txt, "**").flushBuffer();
    }

    public String newItalic(String txt)
    {
        return append('_', txt, '_').flushBuffer();
    }

    public String newBoldItalic(String txt)
    {
        return append("**_", txt, "_**").flushBuffer();
    }

    public String newStrike(String txt)
    {
        return append("~~", txt, "~~").flushBuffer();
    }

    public String newQuoted(String txt)
    {
        return appendln("> ", txt).flushBuffer();
    }

    public String newLink(String label, String url)
    {
        return append('[', label, ']', '(', url, ')').flushBuffer();
    }

    public String newLink(String label, String url, String id, boolean target)
    {
        String strID  = (id == null ? "" : "id=\"" + id + "\" ");
        String strTrg = (target ? "target=\"_blank\" " : "");
        return append("<a ", strID, strTrg, "href=\"", url, "\">"
                    , label, "</a>").flushBuffer();
    }

    public String newLinkItem(int indent, String txt)
    {
        for ( int i = 0; i < indent; i++ ) { append("  "); }
        return appendln("- ", txt).flushBuffer();
    }

    public String newLinkItem(int indent, int order, String txt)
    {
        for ( int i = 0; i < indent; i++ ) { append("  "); }
        return appendln(order, ". ", txt).flushBuffer();
    }

    public String newTaskItem(boolean checked, String txt)
    {
        return append("- [", (checked ? 'x' : ' '), "] ", txt).flushBuffer();
    }

    public String newUser(String user)
    {
        return append('@', user, ' ').flushBuffer();
    }

    public String newEMOJI(String emoji)
    {
        return append(':', emoji, ':').flushBuffer();
    }

    public String escape(String msg)
    {
        return msg.replaceAll("[*_\\-:@]", "\\%0");
    }


    /***************************************************************************
     * Private Methods
     **************************************************************************/

    private MarkDownWriter append(Object... objs)
    {
        for ( Object o : objs ) { _sb.append(o); }
        return this;
    }

    private MarkDownWriter appendln(Object... objs)
    {
        append(objs); _sb.append('\n');
        return this;
    }

    private String flushBuffer()
    {
        try { return _sb.toString(); } finally { _sb.setLength(0); }
    }
}
