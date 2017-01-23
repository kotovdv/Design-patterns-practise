package com.kotovdv.template.method.text.analysis;

import java.util.Collection;
import java.util.Map;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

/**
 * @author Dmitriy Kotov
 */
public class SmartTextAnalyzer extends TextAnalyzer {

    private static final String NON_WORD_SYMBOLS = "[^\\p{L}\\p{Nd}]+";

    @Override
    protected Map<String, Long> countWordsFrequency(Collection<String> words) {
        return words.stream()
                .map(s -> s.replaceAll(NON_WORD_SYMBOLS, ""))
                .filter(s -> !s.isEmpty())
                .collect(groupingBy(identity(), counting()));
    }
}