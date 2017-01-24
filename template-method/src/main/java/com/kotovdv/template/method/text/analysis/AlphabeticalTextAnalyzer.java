package com.kotovdv.template.method.text.analysis;

import java.util.Collection;
import java.util.Map;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.*;

/**
 * @author Dmitriy Kotov
 */
public class AlphabeticalTextAnalyzer extends TextAnalyzer {

    private static final String NON_ALPHABETICAL_SYMBOLS = "[^a-zA-Z]";

    @Override
    protected Collection<String> filterWords(Collection<String> words) {
        return words.stream()
                .map(s -> s.replaceAll(NON_ALPHABETICAL_SYMBOLS, "").toLowerCase())
                .filter(s -> !s.isEmpty())
                .collect(toList());
    }

    @Override
    protected Map<String, Long> countWordsFrequency(Collection<String> words) {
        return words.stream().collect(groupingBy(identity(), counting()));
    }
}