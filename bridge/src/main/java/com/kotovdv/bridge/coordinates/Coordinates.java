package com.kotovdv.bridge.coordinates;

import java.math.BigDecimal;

/**
 * @author Dmitriy Kotov
 */
public class Coordinates {

    private final BigDecimal height;
    private final BigDecimal width;


    public Coordinates(BigDecimal height, BigDecimal width) {
        this.height = height;
        this.width = width;
    }

    public BigDecimal getHeight() {
        return height;
    }

    public BigDecimal getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}