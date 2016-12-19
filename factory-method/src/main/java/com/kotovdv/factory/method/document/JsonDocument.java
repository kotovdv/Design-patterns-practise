package com.kotovdv.factory.method.document;

import com.google.gson.Gson;

import java.util.Map;

/**
 * @author Dmitriy Kotov
 */
public class JsonDocument extends Document {

    public JsonDocument(Map<String, String> initialData) {
        super(initialData);
    }

    @Override
    protected String parse(Map<String, String> initialData) {
        return new Gson().toJson(initialData);
    }
}