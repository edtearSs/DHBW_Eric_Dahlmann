package org.example;

public class Person {
    private String firstname;
    private String lastname;
    private Address address;
    private String[] hobbies;
    private Company company;
    private boolean isFromKarlsruhe;

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
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", address=" + address +
                ", hobbies=" + String.join(", ", hobbies) +  // Array-Ausgabe
                ", company=" + company +
                ", isFromKarlsruhe=" + isFromKarlsruhe +
                '}';
    }
}
