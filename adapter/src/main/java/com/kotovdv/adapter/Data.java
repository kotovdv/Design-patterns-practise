package com.kotovdv.adapter;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Dmitriy Kotov
 */
public class Data {

    private final String dataName;
    private final Map<String, String> data = new LinkedHashMap<>();

    public Data(String dataName, Map<String, String> data) {
        this.dataName = dataName;
        this.data.putAll(data);
    }

    public void addValue(String key, String value) {
        this.data.put(key, value);
    }

    public String getValue(String key) {
        return data.get(key);
    }

    public String getDataName() {
        return dataName;
    }

    @Override
    public String toString() {
        return "Data{" +
                "data=" + data +
                '}';
    }
}