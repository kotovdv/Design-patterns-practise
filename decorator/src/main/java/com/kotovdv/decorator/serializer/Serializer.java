package com.kotovdv.decorator.serializer;

import java.nio.file.Path;

/**
 * @author Dmitriy Kotov
 */
public interface Serializer {

    /**
     * Writes data and returns path to a file where it is stored
     *
     * @param data content that is about to be saved
     * @return path to a file, that contains stored data
     */
    Path write(String data);

    /**
     * Reads data from given path, returns String representation data read
     *
     * @param path path to a file with data
     * @return string representation of data
     */
    String read(Path path);
}