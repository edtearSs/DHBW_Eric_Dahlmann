package org.example;

import org.junit.jupiter.api.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

public class MainJAVAtoXMLTest {
    @Test
    public void testPersonObjectToXml() throws JAXBException {
        // Erstelle ein Beispiel-Person-Objekt
        AddressXML address = new AddressXML("Kriegsstraße", 130, 76133, "Karlsruhe");
        CompanyXML company = new CompanyXML("NTT DATA Deutschland SE", "München");
        String[] hobbies = {"Gitarre", "Bouldern", "Videospiele"};
        PersonXML person = new PersonXML("Eric", "Dahlmann", address, hobbies, company, true);

        // JAXB-Kontext und Marshaller erstellen
        JAXBContext context = JAXBContext.newInstance(PersonXML.class);
        Marshaller marshaller = context.createMarshaller();

        // Das Java-Objekt in XML umwandeln
        StringWriter writer = new StringWriter();
        marshaller.marshal(person, writer);

        // Ausgabe des XML-Strings
        String xmlOutput = writer.toString();
        System.out.println(xmlOutput);

        // Optional: Verifikation, dass der XML-String die erwarteten Werte enthält
        String expectedXml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                "<person>" +
                "<firstname>Eric</firstname>" +
                "<lastname>Dahlmann</lastname>" +
                "<address>" +
                "<street>Kriegsstraße</street>" +
                "<no>130</no>" +
                "<zip>76133</zip>" +
                "<city>Karlsruhe</city>" +
                "</address>" +
                "<hobbies>" +
                "<hobby>Gitarre</hobby>" +
                "<hobby>Bouldern</hobby>" +
                "<hobby>Videospiele</hobby>" +
                "</hobbies>" +
                "<company>" +
                "<name>NTT DATA Deutschland SE</name>" +
                "<headquarter_city>München</headquarter_city>" +
                "</company>" +
                "<isFromKarlsruhe>true</isFromKarlsruhe>" +
                "</person>";

        /*
        Überprüfen, ob der XML-Output mit dem erwarteten XML übereinstimmt (Optional)
        assertTrue(xmlOutput.contains("<firstname>Eric</firstname>"));
        assertTrue(xmlOutput.contains("<lastname>Dahlmann</lastname>"));
        assertTrue(xmlOutput.contains("<street>Kriegsstraße</street>"));
        assertTrue(xmlOutput.contains("<hobby>Gitarre</hobby>"));

         */
    }
}