package com.kotovdv.factory.method.document;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Dmitriy Kotov
 */
public abstract class Document {

    private final Map<String, String> initialData = new LinkedHashMap<>();
    private String processedData;

    public Document(Map<String, String> initialData) {
        this.initialData.putAll(initialData);
    }

    public String getContent() {
        if (processedData == null) {
            processedData = parse(initialData);
        }

        return processedData;
    }

    protected abstract String parse(Map<String, String> initialData);

}