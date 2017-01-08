package com.kotovdv.prototype.exception;

/**
 * @author Dmitriy Kotov
 */
public class CopyFailedException extends RuntimeException {

    public CopyFailedException(Throwable cause) {
        super(cause);
    }
}