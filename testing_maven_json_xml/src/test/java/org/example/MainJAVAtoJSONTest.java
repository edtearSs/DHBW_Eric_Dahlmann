package org.example;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainJAVAtoJSONTest {

    @Test
    public void testPersonObjectToJson() {
        // Erstelle ein Beispiel-Person-Objekt
        Address address = new Address("Kriegsstraße", 130, 76133, "Karlsruhe");
        Company company = new Company("NTT DATA Deutschland SE", "München");
        String[] hobbies = {"Gitarre", "Bouldern", "Videospiele"};
        Person person = new Person("Eric", "Dahlmann", address, hobbies, company, true);

        // Gson-Instanz erstellen
        Gson gson = new Gson();

        // Konvertiere das Person-Objekt zu JSON
        JsonObject personJsonObject = new JsonObject();
        personJsonObject.add("person", gson.toJsonTree(person));

        // Konvertiere das JSON-Objekt zu einem String
        String json = gson.toJson(personJsonObject);

        // Ausgabe des JSON-Strings
        System.out.println(json);

        // Erwarteter JSON-String
        String expectedJson = "{"
                + "\"person\":{"
                + "\"firstname\":\"Eric\","
                + "\"lastname\":\"Dahlmann\","
                + "\"address\":{"
                + "\"street\":\"Kriegsstraße\","
                + "\"no\":130,"
                + "\"zip\":76133,"
                + "\"city\":\"Karlsruhe\"},"
                + "\"hobbies\":[\"Gitarre\",\"Bouldern\",\"Videospiele\"],"
                + "\"company\":{"
                + "\"name\":\"NTT DATA Deutschland SE\","
                + "\"headquarter_city\":\"München\"},"
                + "\"isFromKarlsruhe\":true"
                + "}}";

        // Vergleiche den JSON-String
        assertEquals(expectedJson, json);
    }
}

