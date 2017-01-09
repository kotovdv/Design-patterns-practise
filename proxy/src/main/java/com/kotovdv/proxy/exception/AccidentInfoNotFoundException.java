package com.kotovdv.proxy.exception;

/**
 * @author Dmitriy Kotov
 */
public class AccidentInfoNotFoundException extends RuntimeException {

    public AccidentInfoNotFoundException(String name) {
        super(String.format("Unable to find accident info file with name [%s]", name));
    }
}