package com.kotovdv.proxy.exception;

/**
 * @author Dmitriy Kotov
 */
public class TransportAccidentInfoNotFoundException extends RuntimeException {

    public TransportAccidentInfoNotFoundException(String name) {
        super(String.format("Unable to find transport accident info file with name [%s]", name));
    }
}