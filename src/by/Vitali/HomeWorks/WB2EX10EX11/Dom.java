package by.Vitali.HomeWorks.WB2EX10EX11;

import org.w3c.dom.*;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * DOM
 */
public class Dom {
    public static void main(final String... args) {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = null;
        Document document = null;
        try {
            builder = documentBuilderFactory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        File myFile = new File("/home/viivpo2010/IT ACADEMY/ITAcademyHW/src/by/Vitali/HomeWorks/WB2EX10EX11/resource/filexml.xml");
        try {
            document = builder.parse(myFile);
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Element root = document.getDocumentElement();

        NodeList nodeList = root.getChildNodes();

        for (int i = 0; i < nodeList.getLength(); i++) {
            if(nodeList.item(i) instanceof Element) {
                Element element = (Element) nodeList.item(i);
                String attribute = element.getAttribute("unit");
                String x = element.getElementsByTagName("x").item(0).getTextContent();
                String y = element.getElementsByTagName("y").item(0).getTextContent();
                System.out.println(x + attribute + ", " + y + attribute);
            }
        }
    }
}
