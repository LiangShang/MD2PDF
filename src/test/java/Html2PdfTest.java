import com.itextpdf.text.DocumentException;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.fail;

/**
 * Created by Sherlock on 11/12/2014.
 */
public class Html2PdfTest {


    private String htmlPath(String htmlName){
        String htmlDirPath = "src/test/html/";
        return htmlDirPath + htmlName;
    }

    private void convertHTML(String htmlFilePath, String pdfFilePath) throws IOException, DocumentException {

        InputStream inputStream = new FileInputStream(new File(htmlFilePath));
        OutputStream outputStream = new FileOutputStream(new File(pdfFilePath));

        Html2Pdf.convert(inputStream, outputStream);

        inputStream.close();
        outputStream.close();

    }



    @Test
    public void testConvertSimpleHTML(){

        String k = "<html><body> This is my PDF. </body></html>";
        InputStream inputStream = new ByteArrayInputStream(k.getBytes());

        try {
            OutputStream outputStream = new FileOutputStream(new File("src/test/html/SimpleHTML.pdf"));

            Html2Pdf.convert(inputStream, outputStream);

            inputStream.close();
            outputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            fail();

        } catch (IOException e) {
            e.printStackTrace();
            fail();

        } catch (DocumentException e) {
            e.printStackTrace();
            fail();

        }finally {

        }

    }

    @Test
    public void testConvertHTMLWithTitle() throws IOException, DocumentException {

        convertHTML(htmlPath("TitleHTML.html"), htmlPath("TitleHTML.pdf"));
    }

    @Test
    public void testConvertHTMLWithBulletPoints() throws IOException, DocumentException {

        convertHTML(htmlPath("BulletPointsHTML.html"), htmlPath("BulletPointsHTML.pdf"));
    }
}
