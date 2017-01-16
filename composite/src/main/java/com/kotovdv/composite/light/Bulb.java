package com.kotovdv.composite.light;

import com.kotovdv.composite.color.RgbColor;
import com.kotovdv.composite.exception.InvalidColorException;

import static com.kotovdv.composite.color.LightSourceColor.WHITE;

/**
 * @author Dmitriy Kotov
 */
public class Bulb implements LightSource {

    private final int id;
    private boolean isTurnedOn;
    private RgbColor currentColor;

    public Bulb(int id) {
        this(id, WHITE);
    }

    public Bulb(int id, RgbColor color) {
        if (color == null) {
            throw new InvalidColorException("Can't use null as a bulb color");
        }

        this.id = id;
        this.currentColor = color;
    }

    @Override
    public void switchState() {
        isTurnedOn = !isTurnedOn;
        System.out.printf("Changing bulb state to [%s]%n", isTurnedOn ? "ENABLED" : "DISABLED");
    }

    @Override
    public void setColour(RgbColor newColor) {
        if (newColor == null) {
            throw new InvalidColorException(String.format("Cant use [%s] as a  color", "null"));
        }

        System.out.printf("Changing bulb [%d] from  [%s] to [%s]%n", id, currentColor, newColor);
        this.currentColor = newColor;
    }
}
