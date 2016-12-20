package com.kotovdv.prototype.exception;

/**
 * @author Dmitriy Kotov
 */
public class CloneFailedException extends RuntimeException {

    public CloneFailedException(Throwable cause) {
        super(cause);
    }
}