package org.example;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {
    private static final String CONFIG_FILE = "config.properties";

    public static String getDelimiter() {
        Properties properties = new Properties();
        try (InputStream input = Config.class.getClassLoader().getResourceAsStream(CONFIG_FILE)) {
            if (input == null) {
                throw new RuntimeException("Properties file not found: " + CONFIG_FILE);
            }
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
            return ",";  // Fallback delimiter if loading fails
        }
        return properties.getProperty("delimiter", ",");  // Default to comma if not specified
    }
}
