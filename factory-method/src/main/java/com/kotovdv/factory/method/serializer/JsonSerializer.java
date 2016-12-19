package com.kotovdv.factory.method.serializer;

import com.kotovdv.factory.method.document.Document;
import com.kotovdv.factory.method.document.JsonDocument;

import java.util.Map;

/**
 * @author Dmitriy Kotov
 */
public class JsonSerializer extends Serializer {

    @Override
    protected Document prepareData(Map<String, String> data) {
        return new JsonDocument(data);
    }
}