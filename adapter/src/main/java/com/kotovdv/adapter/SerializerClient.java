package com.kotovdv.adapter;

import com.kotovdv.adapter.serializer.Serializer;

import java.nio.file.Path;

/**
 * @author Dmitriy Kotov
 */
public class SerializerClient {

    private final Serializer serializer;

    public SerializerClient(Serializer serializer) {
        this.serializer = serializer;
    }

    public void readAndAppendClientData(Path pathToData) {
        Data dataRead = serializer.read(pathToData);
        dataRead.addValue("client_key", "client_value");

        serializer.write(dataRead);
    }
}