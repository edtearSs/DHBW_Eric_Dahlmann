package org.example;

public class Person {
    private String firstname;
    private String lastname;
    private Address address;
    private String[] hobbies;
    private Company company;
    private boolean isFromKarlsruhe;

    public Person(String firstname, String lastname, Address address, String[] hobbies, Company company, boolean isFromKarlsruhe){
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.hobbies = hobbies;
        this.company = company;
        this.isFromKarlsruhe = isFromKarlsruhe;
    }

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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
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
        String delimiter = Config.getDelimiter();  // Lade das Trennzeichen
        return firstname + delimiter +
                lastname + delimiter +
                (address != null ? address.toString() : "") + delimiter +
                String.join(delimiter, hobbies) + delimiter +
                (company != null ? company.toString() : "") + delimiter +
                isFromKarlsruhe;
    }
}
