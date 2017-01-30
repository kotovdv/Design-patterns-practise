package com.kotovdv.chain.of.responsibility.request;

/**
 * @author Dmitriy Kotov
 */
public class Request {

    private final RequestType requestType;
    private final Credentials credentials;
    private final RequestBody body;

    public Request(RequestType requestType, Credentials credentials, RequestBody body) {
        this.requestType = requestType;
        this.credentials = credentials;
        this.body = body;
    }

    public Credentials getCredentials() {
        return credentials;
    }

    public RequestBody getBody() {
        return body;
    }

    public RequestType getRequestType() {
        return requestType;
    }
}