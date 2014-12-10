import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Created by Sherlock on 10/12/2014.
 */



public class Main {

    public static void main(String[] args){

        Document document = new Document();

        try{

            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("/Users/Sherlock/Desktop/HelloWorld.pdf"));
            document.open();
            document.add(new Paragraph("A hello world PDF document."));
            document.close();

        }catch(DocumentException e){
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

}
