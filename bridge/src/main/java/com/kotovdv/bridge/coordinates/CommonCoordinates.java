package com.kotovdv.bridge.coordinates;

import java.math.BigDecimal;

/**
 * @author Dmitriy Kotov
 */
public enum CommonCoordinates {
    MOSCOW(new Coordinates(new BigDecimal("37.61556000"), new BigDecimal("55.7522200"))),
    LONDON(new Coordinates(new BigDecimal("-0.1257400"), new BigDecimal("51.5085300")));

    private final Coordinates coordinates;

    CommonCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }
}