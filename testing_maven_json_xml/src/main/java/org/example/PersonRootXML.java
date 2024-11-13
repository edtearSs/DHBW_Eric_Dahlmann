package org.example;

import javax.xml.bind.annotation.*;

@XmlRootElement
public class PersonRootXML {
    private PersonXML person;

    @XmlElement
    public PersonXML getPerson() {
        return person;
    }

    public void setPerson(PersonXML person) {
        this.person = person;
    }


}
