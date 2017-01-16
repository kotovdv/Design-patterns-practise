package com.kotovdv.composite;

import com.kotovdv.composite.color.RgbColor;
import com.kotovdv.composite.light.Bulb;
import com.kotovdv.composite.light.IlluminationPlate;

import static com.kotovdv.composite.color.LightSourceColor.*;

/**
 * @author Dmitriy Kotov
 */
public class App {

    public static void main(String[] args) {
        IlluminationPlate motherPlate = producePlate("Mother plate", WHITE, 0);

        motherPlate.addLightSource(producePlate("Red plate", RED, 4));
        motherPlate.addLightSource(producePlate("Green plate", GREEN, 4));
        motherPlate.addLightSource(producePlate("Blue plate", BLUE, 4));

        motherPlate.switchState();
    }

    private static IlluminationPlate producePlate(String plateName, RgbColor color, int numberOfBulbs) {
        IlluminationPlate plate = new IlluminationPlate(plateName);

        for (int i = 0; i < numberOfBulbs; i++) {
            plate.addLightSource(new Bulb(i, color));
        }

        return plate;
    }
}