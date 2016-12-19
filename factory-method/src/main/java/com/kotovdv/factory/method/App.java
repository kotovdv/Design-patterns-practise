package com.kotovdv.factory.method;

import com.kotovdv.factory.method.serializer.JsonSerializer;
import com.kotovdv.factory.method.serializer.Serializer;
import com.kotovdv.factory.method.serializer.YamlSerializer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Dmitriy Kotov
 */
public class App {

    public static void main(String[] args) {
        Map<String, String> data = new HashMap<>();
        data.put("First Name", "John");
        data.put("Last Name", "Doe");

        storeData(new YamlSerializer(), "person.data.yaml", data);
        storeData(new JsonSerializer(), "person.data.json", data);
    }

    private static void storeData(Serializer serializer, String path, Map<String, String> data) {
        serializer.serializeData(path, data);
    }

}
