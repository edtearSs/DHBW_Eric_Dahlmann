package org.example;

import javax.xml.bind.annotation.*;
import java.util.Arrays;

@XmlRootElement(name = "person")
@XmlAccessorType(XmlAccessType.FIELD)
public class PersonXML {
    private String firstname;
    private String lastname;
    private AddressXML address;
    private String[] hobbies;
    private CompanyXML company;
    private boolean isFromKarlsruhe;

    // Getter und Setter
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public AddressXML getAddress() {
        return address;
    }

    public void setAddress(AddressXML address) {
        this.address = address;
    }

    @XmlElementWrapper(name = "hobbies") // Verpackt das Array in das <hobbies>-Tag
    @XmlElement(name = "hobby") // Jedes Array-Element als <hobby>-Tag
    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public CompanyXML getCompany() {
        return company;
    }

    public void setCompany(CompanyXML company) {
        this.company = company;
    }

    public boolean isFromKarlsruhe() {
        return isFromKarlsruhe;
    }

    public void setFromKarlsruhe(boolean fromKarlsruhe) {
        isFromKarlsruhe = fromKarlsruhe;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", address=" + address +
                ", hobbies=" + Arrays.toString(hobbies) +
                ", company=" + company +
                ", isFromKarlsruhe=" + isFromKarlsruhe +
                '}';
    }
}