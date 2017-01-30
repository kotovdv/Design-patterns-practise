package com.kotovdv.chain.of.responsibility.exception;

import com.kotovdv.chain.of.responsibility.request.Credentials;
import com.kotovdv.chain.of.responsibility.request.RequestType;

/**
 * @author Dmitriy Kotov
 */
public class UnauthorizedRequestExecutionException extends RequestHandlerException {

    public UnauthorizedRequestExecutionException(RequestType requestType, Credentials credentials) {
        super(String.format("User [%s] is not authorized to execute [%s]", credentials.getLogin(), requestType));
    }
}