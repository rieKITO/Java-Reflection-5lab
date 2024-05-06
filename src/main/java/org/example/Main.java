package org.example;

public class Main {
    public static void main(String[] args) throws Exception {
        String filePath = "propertiesFile.properties";
        Injector injector = new Injector(filePath);

        SomeBean sb = injector.inject(new SomeBean());
        sb.foo();
    }
}