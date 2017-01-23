package com.kotovdv.template.method.word.analysis;

import com.kotovdv.template.method.word.Report;

import java.util.*;

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
        StringTokenizer tokenizer = new StringTokenizer(text);

        List<String> words = new ArrayList<>();
        while (tokenizer.hasMoreTokens()) {
            words.add(tokenizer.nextToken());
        }

        return words;
    }
}