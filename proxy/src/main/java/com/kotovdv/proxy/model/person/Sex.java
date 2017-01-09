package com.kotovdv.proxy.model.person;

/**
 * @author Dmitriy Kotov
 */
public enum Sex {
    MALE,
    FEMALE;

    public static Sex parse(String value) {
        return valueOf(value.toUpperCase().trim());
    }
}