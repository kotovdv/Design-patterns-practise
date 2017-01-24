package com.kotovdv.strategy.text.read;

import com.kotovdv.strategy.exception.FailedToReadDataException;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Dmitriy Kotov
 */
public class StreamTokenizer implements Tokenizer {

    @Override
    public List<String> readTokens(Path path) {
        try (InputStream inputStream = new FileInputStream(path.toFile());
             Scanner scanner = new Scanner(inputStream).useDelimiter("\\s+")) {

            List<String> words = new ArrayList<>();
            while (scanner.hasNext()) {
                words.add(scanner.next());
            }

            return words;
        } catch (IOException e) {
            throw new FailedToReadDataException(e);
        }
    }
}