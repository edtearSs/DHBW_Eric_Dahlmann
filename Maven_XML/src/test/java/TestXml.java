import org.junit.jupiter.api.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
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
}
