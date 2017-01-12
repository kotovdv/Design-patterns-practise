package com.kotovdv.decorator;

import com.kotovdv.decorator.serializer.EncodingSerializer;
import com.kotovdv.decorator.serializer.LoggingSerializer;
import com.kotovdv.decorator.serializer.PlainSerializer;
import com.kotovdv.decorator.serializer.Serializer;

import java.io.IOException;
import java.nio.file.Path;

import static java.nio.file.Files.deleteIfExists;

/**
 * @author Dmitriy Kotov
 */
public class App {

    public static void main(String[] args) throws IOException {
        Serializer serializer = createSerializer();

        String dataStored = "Hello world!";
        Path path = serializer.write(dataStored);
        String dataRead = serializer.read(path);

        System.out.printf("\nStored: %s%n", dataStored);
        System.out.printf("Read: %s%n", dataRead);

        deleteIfExists(path);
    }

    private static Serializer createSerializer() {
        return new LoggingSerializer(
                new EncodingSerializer(
                        new PlainSerializer()));
    }
}