package org.example;
import org.junit.jupiter.api.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.io.InputStreamReader;
import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

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

    @Test
    public void testXmlFileToPersonObject() throws JAXBException, IOException {
        // XML aus der Datei im Klassenpfad lesen
        InputStreamReader reader = new InputStreamReader(getClass().getClassLoader().getResourceAsStream("person.xml"));

        // JAXB-Kontext und Unmarshaller erstellen
        JAXBContext context = JAXBContext.newInstance(PersonRoot.class, PersonXML.class, AddressXML.class, CompanyXML.class);

        Unmarshaller unmarshaller = context.createUnmarshaller();

        // XML in PersonXML-Objekt deserialisieren
        PersonXML person = (PersonXML) unmarshaller.unmarshal(reader);

        // Schließen des Readers
        reader.close();

        // Verifikationen mit AssertJ
        assertThat(person.getFirstname()).isEqualTo("Eric");
        assertThat(person.getLastname()).isEqualTo("Dahlmann");
        assertThat(person.getAddress().getStreet()).isEqualTo("Kriegsstraße");
        assertThat(person.getAddress().getNo()).isEqualTo(130);
        assertThat(person.getAddress().getZip()).isEqualTo(76133);
        assertThat(person.getAddress().getCity()).isEqualTo("Karlsruhe");
        assertThat(person.isFromKarlsruhe()).isTrue();
        assertThat(person.getCompany().getName()).isEqualTo("NTT DATA Deutschland SE");
        assertThat(person.getCompany().getHeadquarterCity()).isEqualTo("München");
        assertThat(person.getHobbies()).containsExactly("Gitarre", "Bouldern", "Videospiele");
    }
}