package com.kotovdv.decorator.serializer;

import com.kotovdv.decorator.exception.FailedToCreatePlainSerializer;
import com.kotovdv.decorator.exception.FailedToDeserializeDataException;
import com.kotovdv.decorator.exception.FailedToSerializeDataException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.format.DateTimeFormatter;

import static java.lang.System.lineSeparator;
import static java.nio.file.Files.readAllLines;
import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.TRUNCATE_EXISTING;
import static java.time.LocalDate.now;
import static java.util.stream.Collectors.joining;

/**
 * @author Dmitriy Kotov
 */
public class PlainSerializer implements Serializer {

    private final OpenOption[] options;

    public PlainSerializer() {
        this(CREATE, TRUNCATE_EXISTING);
    }

    public PlainSerializer(OpenOption... options) {
        if (options == null || options.length == 0) {
            throw new FailedToCreatePlainSerializer("Open options must have at least one value");
        }

        this.options = options;
    }

    @Override
    public Path write(String data) {
        String fileName = now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) + ".txt";

        try {
            return Files.write(Paths.get(fileName), data.getBytes(), options);
        } catch (IOException e) {
            throw new FailedToSerializeDataException(e);
        }
    }

    @Override
    public String read(Path path) {
        try {
            return readAllLines(path)
                    .stream()
                    .collect(joining(lineSeparator()));
        } catch (IOException e) {
            throw new FailedToDeserializeDataException(e);
        }
    }
}