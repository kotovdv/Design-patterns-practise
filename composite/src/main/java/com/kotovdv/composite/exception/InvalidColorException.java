package com.kotovdv.composite.exception;

/**
 * @author Dmitriy Kotov
 */
public class InvalidColorException extends RuntimeException {

    public InvalidColorException(String message) {
        super(message);
    }
}