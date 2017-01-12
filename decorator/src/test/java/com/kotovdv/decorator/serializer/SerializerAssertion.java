package com.kotovdv.decorator.serializer;

import java.io.IOException;
import java.nio.file.Path;

import static java.nio.file.Files.deleteIfExists;
import static org.junit.Assert.assertEquals;

/**
 * @author Dmitriy Kotov
 */
public class SerializerAssertion {

    public static void assertWriteAndReadDataEquality(Serializer serializer, String dataToWrite) throws IOException {
        Path path = serializer.write(dataToWrite);
        String dataRead = serializer.read(path);

        deleteIfExists(path);
        assertEquals(dataRead, dataToWrite);
    }
}