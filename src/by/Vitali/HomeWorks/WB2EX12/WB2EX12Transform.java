package by.Vitali.HomeWorks.WB2EX12;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Transform xml to html
 */
public class WB2EX12Transform {
    public static void main(final String... args) {
        final StreamSource streamSource = new StreamSource(new File("/home/viivpo2010/IT ACADEMY/ITAcademyHW/src/by/Vitali/HomeWorks/WB2EX12/filetransform.xsl"));

        try (FileInputStream input = new FileInputStream(new File("/home/viivpo2010/IT ACADEMY/ITAcademyHW/src/by/Vitali/HomeWorks/WB2EX12/file.xml"));
             FileOutputStream output = new FileOutputStream(new File("/home/viivpo2010/IT ACADEMY/ITAcademyHW/src/by/Vitali/HomeWorks/WB2EX12/fileOutput.html"))) {
            final Transformer transformer = TransformerFactory.newInstance().newTransformer(streamSource);

            try {
                transformer.transform(new StreamSource(input), new StreamResult(output));
            } catch (TransformerException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        }
    }
}
