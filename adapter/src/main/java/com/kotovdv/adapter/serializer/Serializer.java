package com.kotovdv.adapter.serializer;

import com.kotovdv.adapter.Data;

import java.nio.file.Path;

/**
 * @author Dmitriy Kotov
 */
public interface Serializer {

    /**
     * Reads data from given path
     *
     * @param path path to file with serialized data
     * @return data that is stored at given location
     */
    Data read(Path path);

    /**
     * Stores data from given object
     *
     * @param data data, that will be stored
     * @return path to a file with serialized data
     */
    Path write(Data data);
}