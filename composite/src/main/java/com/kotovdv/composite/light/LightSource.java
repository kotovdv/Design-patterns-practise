package com.kotovdv.composite.light;

import com.kotovdv.composite.color.RgbColor;

/**
 * @author Dmitriy Kotov
 */
public interface LightSource {

    /**
     * Turns on the light if it was disabled previously
     * Turns off the light if it was enabled previously
     */
    void switchState();

    /**
     * Changes color of the light source
     *
     * @param color new color for the light source
     */
    void setColor(RgbColor color);
}