package com.kotovdv.factory.method.serializer;

import com.kotovdv.factory.method.document.Document;
import com.kotovdv.factory.method.exception.FailedToSerializeDataException;
import com.kotovdv.factory.method.exception.UnableToCreateFileException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

import static java.nio.file.StandardOpenOption.APPEND;

/**
 * @author Dmitriy Kotov
 */
public abstract class Serializer {

    public void serializeData(String pathToFile, Map<String, String> values) {
        Path path = createFile(pathToFile);

        Document document = prepareData(values);

        save(path, document);
    }

    /**
     * So-called factory method
     */
    protected abstract Document prepareData(Map<String, String> data);

    private Path createFile(String pathToFile) {
        try {
            return Files.createFile(Paths.get(pathToFile));
        } catch (IOException e) {
            throw new UnableToCreateFileException(e);
        }
    }

    private void save(Path path, Document document) {
        try {
            Files.write(path, document.getContent().getBytes(), APPEND);
        } catch (IOException e) {
            throw new FailedToSerializeDataException(e);
        }
    }

}