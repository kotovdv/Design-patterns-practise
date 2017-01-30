package com.kotovdv.chain.of.responsibility.exception;

/**
 * @author Dmitriy Kotov
 */
public class RequestHandlerException extends RuntimeException {

    public RequestHandlerException(String message) {
        super("Failed to execute request. Reason: [" + message + "]");
    }
}