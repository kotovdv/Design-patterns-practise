package com.kotovdv.template.method;

import com.kotovdv.template.method.word.Report;
import com.kotovdv.template.method.word.analysis.NaiveTextAnalyzer;
import com.kotovdv.template.method.word.analysis.SmartTextAnalyzer;
import com.kotovdv.template.method.word.analysis.TextAnalyzer;

public class App {

    private static final String TEST_INPUT = "Hello, this is Jimmy! How are you doing? :)";

    public static void main(String[] args) {
        TextAnalyzer naiveTextAnalyzer = new NaiveTextAnalyzer();
        Report naiveReport = naiveTextAnalyzer.analyzeText(TEST_INPUT);
        System.out.printf("Using NAIVE analyzer: [%s]%n", naiveReport);


        TextAnalyzer smartTextAnalyzer = new SmartTextAnalyzer();
        Report smartReport = smartTextAnalyzer.analyzeText(TEST_INPUT);
        System.out.printf("Using SMART analyzer: [%s]%n", smartReport);
    }
}