package com.kotovdv.decorator.exception;

/**
 * @author Dmitriy Kotov
 */
public class FailedToCreatePlainSerializer extends RuntimeException {

    public FailedToCreatePlainSerializer(String message) {
        super(message);
    }
}