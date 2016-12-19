package com.kotovdv.factory.method.document;

import org.yaml.snakeyaml.Yaml;

import java.util.Map;

/**
 * @author Dmitriy Kotov
 */
public class YamlDocument extends Document {

    public YamlDocument(Map<String, String> initialData) {
        super(initialData);
    }

    @Override
    protected String parse(Map<String, String> initialData) {
        return new Yaml().dump(initialData);
    }
}