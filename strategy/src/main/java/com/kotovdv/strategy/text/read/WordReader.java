package com.kotovdv.strategy.text.read;

import java.nio.file.Path;
import java.util.List;

/**
 * @author Dmitriy Kotov
 */
public interface WordReader {

    /**
     * Reads words from resource, located at given path
     *
     * @param path path to a resource
     * @return words, located at given path
     */
    List<String> readWords(Path path);
}