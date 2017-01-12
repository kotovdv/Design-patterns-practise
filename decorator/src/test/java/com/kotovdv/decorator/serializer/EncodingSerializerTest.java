package com.kotovdv.decorator.serializer;

import org.junit.Test;

import java.io.IOException;

import static com.kotovdv.decorator.serializer.SerializerAssertion.assertWriteAndReadDataEquality;

/**
 * @author Dmitriy Kotov
 */
public class EncodingSerializerTest {

    @Test
    public void testEncodingSerializer() throws IOException {
        EncodingSerializer serializer = new EncodingSerializer(new PlainSerializer());

        assertWriteAndReadDataEquality(serializer, "Hello world!");
    }
}