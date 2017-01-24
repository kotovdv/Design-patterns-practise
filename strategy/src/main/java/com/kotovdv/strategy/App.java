package com.kotovdv.strategy;

import com.kotovdv.strategy.text.WordCounter;
import com.kotovdv.strategy.text.token.FileTokenizer;
import com.kotovdv.strategy.text.token.StreamTokenizer;

import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

import static java.lang.ClassLoader.getSystemResource;

/**
 * @author Dmitriy Kotov
 */
public class App {

    private final static String fileName = "words.txt";

    public static void main(String[] args) throws URISyntaxException {
        Path pathToResource = getPathToResource(fileName);

        WordCounter fileWordCounter = new WordCounter(new FileTokenizer());
        Map<String, Long> wordsCount = fileWordCounter.countWords(pathToResource);
        System.out.printf("Using FileTokenizer : [%s]%n", wordsCount);

        WordCounter streamWordCounter = new WordCounter(new StreamTokenizer());
        wordsCount = streamWordCounter.countWords(pathToResource);
        System.out.printf("Using StreamTokenizer : [%s]%n", wordsCount);
    }

    private static Path getPathToResource(String resourceName) throws URISyntaxException {
        return Paths.get(getSystemResource(resourceName).toURI());
    }
}