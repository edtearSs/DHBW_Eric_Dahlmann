package org.example;
import org.junit.jupiter.api.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

import static org.junit.jupiter.api.Assertions.*;

public class MainXMLTest {

    @Test
    public void testXmlToPersonObject() throws JAXBException {
        // XML-String
        String xml = "<person>" +
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

        // JAXB-Kontext und Unmarshaller erstellen
        JAXBContext context = JAXBContext.newInstance(PersonXML.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();

        // XML in Person-Objekt konvertieren
        StringReader reader = new StringReader(xml);
        PersonXML person = (PersonXML) unmarshaller.unmarshal(reader);

        // Ausgabe des Person-Objekts
        System.out.println(person);

        // Verifikation der Umwandlung
        assertEquals("Eric", person.getFirstname());
        assertEquals("Dahlmann", person.getLastname());
        assertEquals("Kriegsstraße", person.getAddress().getStreet());
        assertEquals(130, person.getAddress().getNo());
        assertEquals(76133, person.getAddress().getZip());
        assertEquals("Karlsruhe", person.getAddress().getCity());
        assertTrue(person.isFromKarlsruhe());
        assertEquals("NTT DATA Deutschland SE", person.getCompany().getName());
        assertArrayEquals(new String[]{"Gitarre", "Bouldern", "Videospiele"}, person.getHobbies());
    }
}