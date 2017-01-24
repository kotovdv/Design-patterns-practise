package com.kotovdv.strategy.text.token;

import java.nio.file.Path;
import java.util.List;

/**
 * @author Dmitriy Kotov
 */
public interface Tokenizer {

    /**
     * Reads tokens (words)  from resource, located at given path
     *
     * @param path path to a resource
     * @return tokens, located at given path
     */
    List<String> readTokens(Path path);
}