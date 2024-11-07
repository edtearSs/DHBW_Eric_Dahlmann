package org.example;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class CompanyXML {
    private String name;
    @XmlElement(name = "headquarter_city")
    private String headquarterCity;

    public CompanyXML(String name, String headquarterCity) {
        this.name = name;
        this.headquarterCity = headquarterCity;
    }

    // Getter und Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeadquarterCity() {
        return headquarterCity;
    }

    public void setHeadquarterCity(String headquarterCity) {
        this.headquarterCity = headquarterCity;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", headquarterCity='" + headquarterCity + '\'' +
                '}';
    }
}

