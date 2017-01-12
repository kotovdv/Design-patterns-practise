package com.kotovdv.decorator.serializer;

import java.nio.file.Path;

import static java.util.Base64.getDecoder;
import static java.util.Base64.getEncoder;

/**
 * @author Dmitriy Kotov
 */
public class EncodingSerializer implements Serializer {

    private final Serializer serializer;

    public EncodingSerializer(Serializer serializer) {
        this.serializer = serializer;
    }

    @Override
    public Path write(String data) {
        String encodedData = getEncoder().encodeToString(data.getBytes());

        return serializer.write(encodedData);
    }

    @Override
    public String read(Path path) {
        String encodedData = serializer.read(path);

        return new String(getDecoder().decode(encodedData.getBytes()));
    }
}