/**
 * 
 */
package eu.europeana.edm.shapes.doc;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.apache.commons.io.output.WriterOutputStream;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.util.FileUtils;

import eu.europeana.edm.shapes.EDMShapesConfig;
import eu.europeana.edm.shapes.report.HTMLReportGenerator;
import eu.europeana.edm.shapes.report.ReportGenerator.ReferenceGenerator;
import eu.europeana.edm.shapes.validation.DatasetValidator;
import eu.europeana.edm.shapes.validation.TopBraidValidator;
import eu.europeana.edm.shapes.validation.ValidationUtils;
import eu.europeana.github.MarkDownTemplate;

/**
 * @author Hugo Manguinhas <hugo.manguinhas@europeana.eu>
 * @since 8 Mar 2016
 */
public class ShapesDatasetValidationGenerator extends DocGenerator
                                              implements ReferenceGenerator
{

    public ShapesDatasetValidationGenerator(GeneratorConfig cfg) { super(cfg); }


    /***************************************************************************
     * Public Methods
     **************************************************************************/
    @Override
    public void generate()
    {
        File dir = _config.getFile("shapes.datasets.src");
        if ( !dir.exists() ) { return; }

        for ( File file : dir.listFiles() )
        {
            if ( file.isDirectory() ) { continue; }

            if ( file.getName().endsWith(".md")) { processDataset(file); }
        }
    }


    /***************************************************************************
     * Public Methods - Reference Generator
     **************************************************************************/
    @Override
    public String generate(Resource r)
    {
        return _config.getShapeConstraintRef(r);
    }


    /***************************************************************************
     * Private Methods - Generation
     **************************************************************************/

    private void processDataset(File src)
    {
        System.out.println("Processing dataset: " + src);

        String id = getFilenameWithoutExt(src);
        File data = getDataFile(id);
        if ( !data.exists() ) { return; }

        File result = genResults(id, data);
        File doc    = genReport(id, src, result);
    }

    private File genResults(String id, File data)
    {
        File result = getResultFile(id);
        if ( data.lastModified() < result.lastModified() ) { return result; }

        System.out.println("Validating dataset: " + data);

        Model shapes = EDMShapesConfig.getEDMShapes();
        DatasetValidator validator = new DatasetValidator(
            new TopBraidValidator(shapes));
        try {
            Model results = validator.validate(data);
            ValidationUtils.storeModel(results, result);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    private File genReport(String id, File src, File result) 
    {
        File doc = getDocFile(id);
        if ( result.lastModified() < doc.lastModified() 
          && src.lastModified() < doc.lastModified()) { return doc; }

        System.out.println("Generating report: " + doc);

        try {
            Map<String,String> replacements = new HashMap();
            replacements.put("report", getReport(result));
            MarkDownTemplate template = new MarkDownTemplate();
            template.parse(src);
            template.print(doc, replacements);
        }
        catch (IOException e) { e.printStackTrace(); }

        return doc;
    }

    private String getReport(File result) throws IOException
    {
        Model  model = ValidationUtils.loadModel(result);
        String query = getReportQuery();
        StringWriter sw = new StringWriter();
        PrintStream  ps = new PrintStream(new WriterOutputStream(sw));
        try {
            Model shapes = EDMShapesConfig.getEDMShapes();
            new HTMLReportGenerator(query, shapes, this).generate(model, ps);
            ps.flush();
            return sw.getBuffer().toString();
        }
        finally { IOUtils.closeQuietly(ps); }
    }


    /***************************************************************************
     * Private Methods - Auxiliar
     **************************************************************************/

    private String getReportQuery() throws IOException
    {
        return FileUtils.readWholeFileAsUTF8(
            ClassLoader.getSystemResourceAsStream("etc/reports/report.sparql"));
    }

    /***************************************************************************
     * Private Methods - Resources Resolution
     **************************************************************************/

    private File getDataFile(String name)
    {
        return new File(_config.getFile("shapes.datasets.data"), name + ".xml");
    }

    private File getResultFile(String name)
    {
        return new File(_config.getFile("shapes.datasets.results"), name + ".xml");
    }

    private File getDocFile(String name)
    {
        return new File(_config.getFile("shapes.datasets.doc"), name + ".md");
    }

    private String getFilenameWithoutExt(File file)
    {
        String name = file.getName();
        int i = name.indexOf('.');
        return (i < 0 ? name : name.substring(0, i));
    }
}