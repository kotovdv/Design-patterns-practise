package com.kotovdv.decorator.serializer;

import org.junit.Test;

import java.io.IOException;

import static com.kotovdv.decorator.serializer.SerializerAssertion.assertWriteAndReadDataEquality;

/**
 * @author Dmitriy Kotov
 */
public class PlainSerializerTest {

    @Test
    public void plainSerializerTest() throws IOException {
        PlainSerializer serializer = new PlainSerializer();

        assertWriteAndReadDataEquality(serializer, "Hello World!");
    }
}