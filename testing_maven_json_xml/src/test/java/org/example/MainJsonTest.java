package org.example;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainJsonTest {

    @Test
    public void testJsonToPersonObject() {
        // JSON-Daten
        String json = "{ \"person\": { " +
                "\"firstname\": \"Eric\"," +
                "\"lastname\": \"Dahlmann\"," +
                "\"address\": { \"street\": \"Kriegsstraße\", \"no\": 130, \"zip\": 76133, \"city\": \"Karlsruhe\" }," +
                "\"hobbies\": [ \"Gitarre\", \"Bouldern\", \"Videospiele\" ]," +
                "\"company\": { \"name\": \"NTT DATA Deutschland SE\", \"headquarter_city\": \"München\" }," +
                "\"isFromKarlsruhe\": true" +
                "} }";

        // Gson-Instanz erstellen
        Gson gson = new Gson();

        // Extrahiere das innere Objekt `person` aus dem JSON
        JsonObject jsonObject = gson.fromJson(json, JsonObject.class);
        JsonObject personJson = jsonObject.getAsJsonObject("person");

        // JSON in ein Person-Objekt konvertieren
        Person person = gson.fromJson(personJson, Person.class);

        // Ausgabe des Person-Objekts
        System.out.println(person);

        // Verifikation der Umwandlung
        assertEquals("Eric", person.getFirstname());
        assertEquals("Dahlmann", person.getLastname());
        assertEquals("Kriegsstraße", person.getAddress().getStreet());
        assertEquals(130, person.getAddress().getNo());
        assertEquals(76133, person.getAddress().getZip());
        assertEquals("Karlsruhe", person.getAddress().getCity());
        assertTrue(person.isFromKarlsruhe());
        assertEquals("NTT DATA Deutschland SE", person.getCompany().getName());

        // Hobbies-Array prüfen
        assertArrayEquals(new String[]{"Gitarre", "Bouldern", "Videospiele"}, person.getHobbies());
    }
}