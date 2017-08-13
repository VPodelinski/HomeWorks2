package by.Vitali.HomeWorks.WB2EX10EX11;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Stax
 */
public class Stax {

    public static void main(final String... args) {
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        File myFile = new File("/home/viivpo2010/IT ACADEMY/ITAcademyHW/src/by/Vitali/HomeWorks/WB2EX10EX11/resource/filexml.xml");

        try{
            XMLEventReader eventReader = xmlInputFactory.createXMLEventReader(new FileInputStream(myFile));
            String unit = null;
            String x = null;
            String y = null;
            while (eventReader.hasNext()) {
                XMLEvent event = eventReader.nextEvent();
                if (event.isStartElement()) {
                    StartElement startElement = event.asStartElement();
                    if (startElement.getName().getLocalPart() == "point") {
                        unit = startElement.getAttributeByName(QName.valueOf("unit")).getValue();
                    } else if (startElement.getName().getLocalPart() == "x") {
                        event = eventReader.nextEvent();
                        x = event.asCharacters().getData();
                    } else if (startElement.getName().getLocalPart() == "y") {
                        event = eventReader.nextEvent();
                        y = event.asCharacters().getData();
                    }
                }
                if (event.isEndElement() && event.asEndElement().getName().getLocalPart() == "point") {
                    System.out.println(x + unit + ", " + y + unit);
                }
            }
        } catch (XMLStreamException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
