package com.kotovdv.template.method.text.analysis;

import com.kotovdv.template.method.text.Report;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import static java.util.Collections.addAll;

/**
 * @author Dmitriy Kotov
 */
public abstract class TextAnalyzer {

    public Report analyzeText(String text) {
        Collection<String> words = collectWords(text);
        Map<String, Long> wordsFrequency = countWordsFrequency(words);

        return new Report(text, wordsFrequency);
    }

    protected abstract Map<String, Long> countWordsFrequency(Collection<String> words);

    private Collection<String> collectWords(String text) {
        List<String> words = new ArrayList<>();
        addAll(words, text.split("\\s"));

        return words;
    }
}