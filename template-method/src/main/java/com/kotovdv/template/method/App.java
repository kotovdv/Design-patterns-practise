package com.kotovdv.template.method;

import com.kotovdv.template.method.text.Report;
import com.kotovdv.template.method.text.analysis.AlphabeticalTextAnalyzer;
import com.kotovdv.template.method.text.analysis.TextAnalyzer;

public class App {

    private static final String TEST_INPUT = "Hello, this is Jimmy1989! How are you doing? :)";

    public static void main(String[] args) {
        TextAnalyzer textAnalyzer = new AlphabeticalTextAnalyzer();
        Report report = textAnalyzer.analyzeText(TEST_INPUT);
        System.out.println(report);
    }
}