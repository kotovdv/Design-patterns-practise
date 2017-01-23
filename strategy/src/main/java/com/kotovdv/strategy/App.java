package com.kotovdv.strategy;

import com.kotovdv.strategy.text.WordCounter;
import com.kotovdv.strategy.text.read.StreamingWordReader;
import com.kotovdv.strategy.text.read.WholeFileWordReader;

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

        WordCounter wholeFileWordCounter = new WordCounter(new WholeFileWordReader());
        Map<String, Long> wordsCount = wholeFileWordCounter.countWords(pathToResource);
        System.out.printf("Using WholeFileWordReader : [%s]%n", wordsCount);

        WordCounter streamingWordCounter = new WordCounter(new StreamingWordReader());
        wordsCount = streamingWordCounter.countWords(pathToResource);
        System.out.printf("Using StreamingWordReader : [%s]%n", wordsCount);
    }

    private static Path getPathToResource(String resourceName) throws URISyntaxException {
        return Paths.get(getSystemResource(resourceName).toURI());
    }
}