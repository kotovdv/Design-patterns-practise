package com.kotovdv.strategy.text.read;

import com.kotovdv.strategy.exception.FailedToReadDataException;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

import static java.lang.System.lineSeparator;
import static java.nio.file.Files.readAllLines;
import static java.util.Arrays.asList;
import static java.util.stream.Collectors.joining;

/**
 * @author Dmitriy Kotov
 */
public class FileTokenizer implements Tokenizer {

    @Override
    public List<String> readTokens(Path path) {
        try {
            return asList(readWholeFile(path).split("\\s+"));
        } catch (IOException e) {
            throw new FailedToReadDataException(e);
        }
    }

    private String readWholeFile(Path path) throws IOException {
        return readAllLines(path).stream().collect(joining(lineSeparator()));
    }
}