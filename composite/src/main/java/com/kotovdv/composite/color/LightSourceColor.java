package com.kotovdv.composite.color;

/**
 * @author Dmitriy Kotov
 */
public enum LightSourceColor implements RgbColor {

    RED(255, 0, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
    WHITE(255, 255, 255);

    private final int red;
    private final int green;
    private final int blue;

    LightSourceColor(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    @Override
    public int getRed() {
        return this.red;
    }

    @Override
    public int getGreen() {
        return this.green;
    }

    @Override
    public int getBlue() {
        return this.blue;
    }
}