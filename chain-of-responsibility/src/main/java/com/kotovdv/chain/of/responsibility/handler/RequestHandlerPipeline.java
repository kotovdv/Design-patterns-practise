package com.kotovdv.chain.of.responsibility.handler;

import com.kotovdv.chain.of.responsibility.request.Request;

import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Dmitriy Kotov
 */
public class RequestHandlerPipeline {

    private Deque<RequestHandler> handlersPipeline = new LinkedList<>();

    private RequestHandlerPipeline(Collection<RequestHandler> handlers) {
        this.handlersPipeline.addAll(handlers);
    }

    public static Builder builder() {
        return new Builder();
    }

    public void handle(Request request) {
        for (RequestHandler handler : handlersPipeline) {
            if (handler.shouldHandle(request)) {
                handler.handle(request);
            }
        }
    }

    public static class Builder {
        private Deque<RequestHandler> handlers = new LinkedList<>();

        private Builder() {
        }

        public Builder add(RequestHandler requestHandler) {
            return this.addLast(requestHandler);
        }

        public Builder addFirst(RequestHandler requestHandler) {
            this.handlers.addFirst(requestHandler);

            return this;
        }

        public Builder addLast(RequestHandler requestHandler) {
            this.handlers.addLast(requestHandler);

            return this;
        }

        public RequestHandlerPipeline build() {
            return new RequestHandlerPipeline(this.handlers);
        }
    }
}