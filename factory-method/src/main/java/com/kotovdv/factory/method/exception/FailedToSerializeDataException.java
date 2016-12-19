package com.kotovdv.factory.method.exception;

/**
 * @author Dmitriy Kotov
 */
public class FailedToSerializeDataException extends RuntimeException {

    public FailedToSerializeDataException(Throwable cause) {
        super(cause);
    }
}