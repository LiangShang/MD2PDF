import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by Sherlock on 11/12/2014.
 */
public class Html2Pdf {

    public static void convert(InputStream inputStream, OutputStream outputStream) throws DocumentException, IOException {

        Document document = new Document();
        PdfWriter writer = PdfWriter.getInstance(document, outputStream);
        document.open();
        XMLWorkerHelper.getInstance().parseXHtml(writer, document, inputStream);
        document.close();

    }
}
