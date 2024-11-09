import org.junit.jupiter.api.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TestXml {

    private Person createPerson(){
        //Konstruktor für Company
        Company company = new Company("NTT DATA Deutschland SE", "München");
        //Konstruktor für Address
        Address address = new Address("Kriegsstraße", 130, 76133, "Karlsruhe");
        //Erstelle Liste an Hobbies.
        List<String> hobbies = new ArrayList<>(Arrays.asList("Gitarre", "Bouldern", "Videospiele"));
        //Return Konstruktor für die Person mit den vorher erstellten Werten
        return new Person("Eric", "Dahlmann", address, hobbies, company, true);
    }

    //Erstelle Testmethode
    @Test
    public void testXmlWithAssertThat() throws JAXBException {

        //Path für den xml File --> speichere diesen in Variable xmlFile
        File xmlFile = new File("src/test/resources/person.xml");


        //Initialisierung von den JAXBContext als Person-Klasse und Unmarshaller Objekten
        JAXBContext context = JAXBContext.newInstance(Person.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();

        //unmarshaller liest den xmlFile aus und speichert diesen als Person
        Person person = (Person) unmarshaller.unmarshal(xmlFile);

        //print person
        System.out.println(person);

        //Vergleiche die zu erwartete Person mit dem xmlFile
        assertThat(createPerson()).isNotNull().usingRecursiveComparison().isEqualTo(person);
    }

    @Test
    public void testXmlToPerson() throws JAXBException{

        //Path für den xml File --> speichere diesen in Variable xmlFile
        File xmlFile = new File("src/test/resources/person.xml");

        //Initialisierung von den JAXBContext als Person-Klasse und Unmarshaller Objekten
        JAXBContext context = JAXBContext.newInstance(Person.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();

        //unmarshaller liest den xmlFile aus und speichert diesen als Person
        Person person = (Person) unmarshaller.unmarshal(xmlFile);

        System.out.println(person);
    }

    @Test
    public void testPersonToXML() throws JAXBException{

        //Erstelle person mit der createPerson() Methode
        Person person = createPerson();

        //Initialisiere JAXB Context als Person-objekt und Initialisiere Marshaller
        JAXBContext context = JAXBContext.newInstance(Person.class);
        Marshaller marshaller = context.createMarshaller();

        //formatierung für den zu speicherenden xml file
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        //erstelle neuen file für den path
        File out = new File("src/test/resources/out.xml");

        //nutzt marshaller.marshal(zu_speicherende_objekt, pathname)
        marshaller.marshal(person, out);

        System.out.println("XML File created" + out.getAbsolutePath());
    }
}
