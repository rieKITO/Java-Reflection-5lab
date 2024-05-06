package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Injector {
    private Properties properties;

    public Injector(String filePath) {
        this.properties = new Properties();
        try (FileInputStream fis = new FileInputStream(filePath)) {
            properties.load(fis);
        } catch (IOException e) {
            System.err.println("Error loading properties file: " + e.getMessage());
        }
    }
}
