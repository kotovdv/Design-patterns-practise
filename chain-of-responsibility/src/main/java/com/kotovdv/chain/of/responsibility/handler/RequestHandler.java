package com.kotovdv.chain.of.responsibility.handler;

import com.kotovdv.chain.of.responsibility.request.Request;

/**
 * @author Dmitriy Kotov
 */
public interface RequestHandler {

    /**
     * Determines if the request should be handled by this RequestHandler
     *
     * @param request request to analyze
     * @return {@code true} if this request should be handled;
     * {@code false} otherwise.
     */
    boolean shouldHandle(Request request);

    /**
     * Handles request
     *
     * @param request request to handle
     */
    void handle(Request request);
}