package com.kotovdv.adapter.serializer.gson;

import com.google.gson.Gson;
import com.kotovdv.adapter.Data;
import com.kotovdv.adapter.exception.FailedToDeserializeException;
import com.kotovdv.adapter.exception.FailedToSerializeException;
import com.kotovdv.adapter.serializer.Serializer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.lang.System.lineSeparator;
import static java.nio.file.Files.readAllLines;
import static java.nio.file.Paths.get;
import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.TRUNCATE_EXISTING;
import static java.util.stream.Collectors.joining;

/**
 * Adapter for com.google.gson library.
 * Adapting it to Serializer interface.
 *
 * @author Dmitriy Kotov
 */
public class JsonSerializer implements Serializer {

    private final Gson gson = new Gson();

    @Override
    public Data read(Path path) {
        try {
            String rawData = getRawData(path);

            return gson.fromJson(rawData, Data.class);
        } catch (IOException e) {
            throw new FailedToDeserializeException(e);
        }
    }

    @Override
    public Path write(Data data) {
        String rawData = gson.toJson(data);

        return persist(rawData, get(data.getDataName() + ".json"));
    }

    private String getRawData(Path path) throws IOException {
        return readAllLines(path)
                .stream()
                .collect(joining(lineSeparator()));
    }


    private Path persist(String gsonData, Path path) {
        try {
            return Files.write(path, gsonData.getBytes(), CREATE, TRUNCATE_EXISTING);
        } catch (IOException e) {
            throw new FailedToSerializeException(e);
        }
    }
}