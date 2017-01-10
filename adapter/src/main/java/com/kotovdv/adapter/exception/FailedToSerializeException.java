package com.kotovdv.adapter.exception;

/**
 * @author Dmitriy Kotov
 */
public class FailedToSerializeException extends RuntimeException {

    public FailedToSerializeException(Throwable cause) {
        super(cause);
    }
}