package com.kotovdv.adapter;

import com.kotovdv.adapter.serializer.Serializer;
import com.kotovdv.adapter.serializer.gson.JsonSerializer;

import java.nio.file.Path;

import static java.util.Collections.singletonMap;

/**
 * @author Dmitriy Kotov
 */
public class App {

    public static void main(String[] args) {
        Data initialData = new Data(
                "important_data",
                singletonMap("defaultKey", "defaultValue"));


        Serializer serializer = new JsonSerializer();
        Path pathToFile = serializer.write(initialData);

        SerializerClient serializerClient = new SerializerClient(serializer);
        serializerClient.readAndAppendClientData(pathToFile);
    }
}