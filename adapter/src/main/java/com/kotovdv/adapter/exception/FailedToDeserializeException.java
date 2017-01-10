package com.kotovdv.adapter.exception;

/**
 * @author Dmitriy Kotov
 */
public class FailedToDeserializeException extends RuntimeException {

    public FailedToDeserializeException(Throwable cause) {
        super(cause);
    }
}