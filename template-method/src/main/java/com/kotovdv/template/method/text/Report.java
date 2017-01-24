package com.kotovdv.template.method.text;

import java.util.Map;

import static java.util.Collections.unmodifiableMap;

/**
 * @author Dmitriy Kotov
 */
public class Report {

    private final String initialText;
    private final Map<String, Long> wordFrequency;
    private final long wordsAnalyzed;

    public Report(String initialText, Map<String, Long> wordFrequency) {
        this.initialText = initialText;
        this.wordFrequency = wordFrequency;
        this.wordsAnalyzed = wordFrequency.values().stream().mapToLong(value -> value).sum();
    }

    public String getInitialText() {
        return initialText;
    }

    public long getWordsAnalyzed() {
        return wordsAnalyzed;
    }

    public Map<String, Long> getWordFrequency() {
        return unmodifiableMap(wordFrequency);
    }

    @Override
    public String toString() {
        return "Report{" +
                "initialText='" + initialText + '\'' +
                ", wordFrequency=" + wordFrequency +
                ", wordsAnalyzed=" + wordsAnalyzed +
                '}';
    }
}