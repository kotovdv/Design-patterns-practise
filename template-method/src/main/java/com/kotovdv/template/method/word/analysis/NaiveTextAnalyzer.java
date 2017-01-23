package com.kotovdv.template.method.word.analysis;

import java.util.Collection;
import java.util.Map;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

/**
 * @author Dmitriy Kotov
 */
public class NaiveTextAnalyzer extends TextAnalyzer {

    @Override
    protected Map<String, Long> countWordsFrequency(Collection<String> words) {
        return words.stream().collect(groupingBy(identity(), counting()));
    }
}