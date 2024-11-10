package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TestJson {

    //Methode zur Erstellung einer Person
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
    public void testJsonWithAssertThat() throws IOException{

        //Path für den json File --> speichere diesen in Variable jsonFile
        File jsonFile = new File("src/test/resources/person.json");

        //Initialisiere gson library
        Gson gson = new Gson();

        /*Instanziieren den Filereader und übergeben diesem den Pathway
        FileReader() benötigt den path des json files um ihn zu lesen
         */
        FileReader testFile = new FileReader(jsonFile);
        /*gson.fromJson benötigt file + class, liest die Daten aus dem jsonFile und speichert diese als Klasse-Person
        gson instanziiert die Klasse Person und mit den im jsonFile gespeicherten Daten
        */
        Person person = gson.fromJson(testFile, Person.class);

        //print person
        System.out.println(person);

        //Vergleiche die zu erwartete Person mit dem jsonFile
        assertThat(createPerson()).isNotNull().usingRecursiveComparison().isEqualTo(person);
    }

    @Test
    public void testPersonToJson() throws IOException{
        //Construct Person
        Person person = createPerson();

        //Initiiere Gson
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        //Path für den neu erstellten json File
        File outputJsonFile = new File("src/test/resources/out.json");

        //schreibt die eingegebene person in den json file
        try (FileWriter writer = new FileWriter(outputJsonFile)){
            gson.toJson(person, writer);
        }

        // print
        System.out.println("json file created: " + outputJsonFile.getAbsolutePath());
    }

    @Test
    public void testJsonToPerson() throws IOException{

        //Path für den json File --> speichere diesen in Variable jsonFile
        File jsonFile = new File("src/test/resources/person.json");

        //Initialisiere gson library
        Gson gson = new Gson();

        /*Instanziieren den Filereader und übergeben diesem den Pathway
        FileReader() benötigt den path des json files um ihn zu lesen
        gson.fromJson benötigt file + class, liest die Daten aus dem jsonFile und speichert diese als Klasse-Person
        gson instanziiert die Klasse Person und mit den im jsonFile gespeicherten Daten
        */
        Person person = gson.fromJson(new FileReader(jsonFile), Person.class);

        //print
        System.out.println(person);
    }
}
