package org.example;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class AddressXML {
    private String street;
    private int no;
    private int zip;
    private String city;

    public AddressXML(String street, int no, int zip, String city) {
        this.street = street;
        this.no = no;
        this.zip = zip;
        this.city = city;
    }
    // Getter und Setter
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", no=" + no +
                ", zip=" + zip +
                ", city='" + city + '\'' +
                '}';
    }
}

