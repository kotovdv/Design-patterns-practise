package com.kotovdv.template.method;

import com.kotovdv.template.method.text.Report;
import com.kotovdv.template.method.text.analysis.NaiveTextAnalyzer;
import com.kotovdv.template.method.text.analysis.SmartTextAnalyzer;
import com.kotovdv.template.method.text.analysis.TextAnalyzer;

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