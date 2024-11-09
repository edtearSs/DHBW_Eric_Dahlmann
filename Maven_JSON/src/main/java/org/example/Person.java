package org.example;

import java.util.List;

public class Person {
    private String firstname;
    private String lastname;
    private Address address;
    private List<String> hobbies;
    private Company company;
    private boolean isFromKarlsruhe;

    public Person(String firstname, String lastname, Address address, List<String> hobbies, Company company, boolean isFromKarlsruhe){
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.hobbies = hobbies;
        this.company = company;
        this.isFromKarlsruhe = isFromKarlsruhe;
    }

    public Person(){}

    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<String> getHobbies() {
        return this.hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public Company getCompany() {
        return this.company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public boolean isFromKarlsruhe() {
        return this.isFromKarlsruhe;
    }

    public void setFromKarlsruhe(boolean fromKarlsruhe) {
        this.isFromKarlsruhe = fromKarlsruhe;
    }

    @Override
    public String toString() {
        String delimiter = " " + Config.getSeparator();  // Lade das Trennzeichen
        return "Person{" +
                "firstname:'" + firstname + delimiter +
                "lastname:'" + lastname + delimiter +
                (address != null ? address.toString() : "") + delimiter +
                "hobbies:'" + hobbies + delimiter +
                (company != null ? company.toString() : "") + delimiter +
                isFromKarlsruhe + "}";
    }
}
