package com.kotovdv.strategy.text;

import com.kotovdv.strategy.text.read.WordReader;

import java.nio.file.Path;
import java.util.List;
import java.util.Map;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

/**
 * @author Dmitriy Kotov
 */
public class WordCounter {

    private final WordReader wordReader;

    public WordCounter(WordReader wordReader) {
        this.wordReader = wordReader;
    }

    public Map<String, Long> countWords(Path path) {
        List<String> words = wordReader.readWords(path);

        return words.stream().collect(groupingBy(identity(), counting()));
    }
}