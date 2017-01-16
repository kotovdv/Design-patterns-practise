package com.kotovdv.composite.light;

import com.kotovdv.composite.color.RgbColor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dmitriy Kotov
 */
public class IlluminationPlate implements LightSource {

    private final String id;
    private List<LightSource> lightSources = new ArrayList<>();

    public IlluminationPlate(String id) {
        this.id = id;
    }

    @Override
    public void switchState() {
        System.out.printf("Switching illumination plate [%s] state%n", id);

        lightSources.forEach(LightSource::switchState);
    }

    @Override
    public void setColor(RgbColor newColor) {
        System.out.printf("Changing illumination plate [%s] color%n", id);

        this.lightSources.forEach(lightSource -> lightSource.setColor(newColor));
    }

    public IlluminationPlate addLightSource(LightSource lightSource) {
        this.lightSources.add(lightSource);

        return this;
    }
}