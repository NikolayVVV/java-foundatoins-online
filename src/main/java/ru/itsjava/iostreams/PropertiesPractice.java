package ru.itsjava.iostreams;

import java.io.*;
import java.util.Properties;

public class PropertiesPractice {

    public static void main(String[] args) throws IOException {
//        File file = new File("src/main/resources/application.properties");
//        Properties props = new Properties();
//        props.load(new FileInputStream(file));
//        System.out.println("props.getProperty(\"key1\") = " + props.getProperty("key1"));
//        System.out.println("props.setProperty(\"key2\",\"value2\") = " + props.setProperty("key2", "value2"));
//        System.out.println("props.getProperty(\"key2\") = " + props.getProperty("key2"));

//        ClassLoader classLoader = PropertiesPractice.class.getClassLoader();
//        InputStream inputStream = classLoader.getResourceAsStream("application.properties");
//
//        Properties propsFromStream = new Properties();
//        propsFromStream.load(inputStream);
//        System.out.println("propsFromStream.getProperty(\"key1\") = " + propsFromStream.getProperty("key1"));

        //Считать и вывести настройки на экран с помощью getResourceAsStream

//        File file2 = new File("src/main/resources/app.properties");
        ClassLoader classLoader1 = PropertiesPractice.class.getClassLoader();
        InputStream inputStream1 = classLoader1.getResourceAsStream("app.properties");

        Properties propsFromStream2 = new Properties();
        propsFromStream2.load(inputStream1);
        System.out.println("propsFromStream2.getProperty(\"name\") = " + propsFromStream2.getProperty("name"));
        System.out.println("propsFromStream2.getProperty(\"nickname\") = " + propsFromStream2.getProperty("nickname"));

    }
}
