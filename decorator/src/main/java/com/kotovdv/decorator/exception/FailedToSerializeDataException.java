package com.kotovdv.decorator.exception;

/**
 * @author Dmitriy Kotov
 */
public class FailedToSerializeDataException extends RuntimeException {

    public FailedToSerializeDataException(Throwable cause) {
        super(cause);
    }
}