package com.kotovdv.decorator.exception;

/**
 * @author Dmitriy Kotov
 */
public class FailedToDeserializeDataException extends RuntimeException {

    public FailedToDeserializeDataException(Throwable cause) {
        super(cause);
    }
}