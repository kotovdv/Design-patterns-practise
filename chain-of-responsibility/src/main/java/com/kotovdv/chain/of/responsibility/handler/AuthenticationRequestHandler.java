package com.kotovdv.chain.of.responsibility.handler;

import com.kotovdv.chain.of.responsibility.exception.UnauthorizedRequestExecutionException;
import com.kotovdv.chain.of.responsibility.request.Credentials;
import com.kotovdv.chain.of.responsibility.request.Request;

import static com.kotovdv.chain.of.responsibility.request.AuthorizedCredentials.isNotAuthorized;

/**
 * @author Dmitriy Kotov
 */
public class AuthenticationRequestHandler implements RequestHandler {

    @Override
    public boolean shouldHandle(Request request) {
        return request.getRequestType().isAuthenticationRequired();
    }

    @Override
    public void handle(Request request) {
        Credentials credentials = request.getCredentials();

        if (isNotAuthorized(credentials)) {
            throw new UnauthorizedRequestExecutionException(request.getRequestType(), request.getCredentials());
        }
    }
}