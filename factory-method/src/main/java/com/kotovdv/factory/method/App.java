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
        Map<String, String> data = createData();

        serializeData(new YamlSerializer(), "person.data.yaml", data);
        serializeData(new JsonSerializer(), "person.data.json", data);
    }

    private static Map<String, String> createData() {
        Map<String, String> data = new HashMap<>();
        data.put("First Name", "John");
        data.put("Last Name", "Doe");

        return data;
    }

    private static void serializeData(Serializer serializer, String path, Map<String, String> data) {
        serializer.serializeData(path, data);
    }

}
