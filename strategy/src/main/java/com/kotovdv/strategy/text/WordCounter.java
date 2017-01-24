package com.kotovdv.strategy.text;

import com.kotovdv.strategy.text.token.Tokenizer;

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

    private final Tokenizer tokenizer;

    public WordCounter(Tokenizer tokenizer) {
        this.tokenizer = tokenizer;
    }

    public Map<String, Long> countWords(Path path) {
        List<String> tokens = tokenizer.readTokens(path);

        return tokens.stream().collect(groupingBy(identity(), counting()));
    }
}