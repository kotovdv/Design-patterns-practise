package com.kotovdv.chain.of.responsibility.handler;

import com.kotovdv.chain.of.responsibility.request.Request;

import java.time.LocalDateTime;

/**
 * @author Dmitriy Kotov
 */
public class LoggingRequestHandler implements RequestHandler {

    @Override
    public boolean shouldHandle(Request request) {
        return true;
    }

    @Override
    public void handle(Request request) {
        System.out.println("[LoggingRequestHandler]" + " Executing request from [" + request.getCredentials().getLogin() + "]");
        System.out.println("[LoggingRequestHandler]" + " Request type is [" + request.getRequestType() + "]");
        System.out.println("[LoggingRequestHandler]" + " Request content is [" + request.getBody().getContent() + "]");
        System.out.println("[LoggingRequestHandler]" + " Request time is [" + LocalDateTime.now() + "]");
    }
}