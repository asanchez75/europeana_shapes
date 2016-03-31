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

        print('|');
        for ( int i = 0; i < strs.length; i++ ) { print(" --- |"); }
        println();

        return this;
    }

    public MarkDownWriter printTableRow(String... cells)
    {
        println();

        print('|');
        for ( String s : cells ) { print(' ', s, " |"); }
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

    public String escape(String msg)
    {
        return msg.replaceAll("[*_\\-:@]", "\\%0");
    }
}
