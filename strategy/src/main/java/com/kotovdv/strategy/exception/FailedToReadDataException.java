package com.kotovdv.strategy.exception;

/**
 * @author Dmitriy Kotov
 */
public class FailedToReadDataException extends RuntimeException {

    public FailedToReadDataException(Throwable cause) {
        super(cause);
    }
}