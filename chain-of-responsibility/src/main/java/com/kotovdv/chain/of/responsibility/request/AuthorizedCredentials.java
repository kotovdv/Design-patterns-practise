package com.kotovdv.chain.of.responsibility.request;

/**
 * @author Dmitriy Kotov
 */
public enum AuthorizedCredentials {

    JOHN_DOE(new Credentials("John Doe", "cGFzc3dvcmQ="));

    private final Credentials credentials;

    AuthorizedCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    public static boolean isNotAuthorized(Credentials credentials) {
        return !isAuthorized(credentials);
    }

    public static boolean isAuthorized(Credentials credentials) {
        for (AuthorizedCredentials authorizedCredentials : values()) {
            if (authorizedCredentials.credentials.equals(credentials)) {
                return true;
            }
        }

        return false;
    }

    public Credentials getCredentials() {
        return credentials;
    }
}