import com.itextpdf.text.DocumentException;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.fail;

/**
 * Created by Sherlock on 11/12/2014.
 */
public class Html2PdfTest {





    @Test
    public void testConvertSimpleHTML(){

        String k = "<html><body> This is my PDF. </body></html>";
        InputStream inputStream = new ByteArrayInputStream(k.getBytes());

        try {
            OutputStream outputStream = new FileOutputStream(new File("target/Test.pdf"));

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
}
