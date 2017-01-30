package com.kotovdv.chain.of.responsibility.request;

/**
 * @author Dmitriy Kotov
 */
public enum RequestType {
    DATA_READ(false),
    DATA_MODIFICATION(true);

    private final boolean isAuthenticationRequired;

    RequestType(boolean isAuthenticationRequired) {
        this.isAuthenticationRequired = isAuthenticationRequired;
    }

    public boolean isAuthenticationRequired() {
        return isAuthenticationRequired;
    }
}