package com.kotovdv.decorator.serializer;

import java.nio.file.Path;

/**
 * @author Dmitriy Kotov
 */
public class LoggingSerializer implements Serializer {

    private final Serializer serializer;

    public LoggingSerializer(Serializer serializer) {
        this.serializer = serializer;
    }

    @Override
    public Path write(String data) {
        System.out.printf("Serializing data :[%s]%n", data);
        Path path = serializer.write(data);
        System.out.printf("Saved data at : [%s]%n", path);

        return path;
    }

    @Override
    public String read(Path path) {
        System.out.printf("Deserializing data from path: [%s]%n", path);
        String data = serializer.read(path);
        System.out.printf("Read data: [%s]%n", data);

        return data;
    }
}