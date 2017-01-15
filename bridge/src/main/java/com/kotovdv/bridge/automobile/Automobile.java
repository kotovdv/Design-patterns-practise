package com.kotovdv.bridge.automobile;

import com.kotovdv.bridge.coordinates.Coordinates;
import com.kotovdv.bridge.engine.Engine;

/**
 * @author Dmitriy Kotov
 */
public abstract class Automobile {

    protected final Engine engine;

    protected Automobile(Engine engine) {
        this.engine = engine;
    }

    /**
     * Drives automobile to given coordinates
     *
     * @param coordinates coordinates of the destination point
     */
    public void travelTo(Coordinates coordinates) {
        System.out.printf("Travelling to [%s]%n", coordinates);
    }

    /**
     * Starts automobile
     */
    public final void start() {
        doStart();
        engine.start();
    }

    /**
     * Stops automobile
     */
    public final void stop() {
        doStop();
        engine.stop();
    }

    protected abstract void doStart();

    protected abstract void doStop();

}