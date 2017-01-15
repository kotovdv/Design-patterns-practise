package com.kotovdv.bridge.engine;

/**
 * @author Dmitriy Kotov
 */
public class ElectricEngine extends Engine {

    @Override
    public void start() {
        System.out.println("Starting electric engine");
    }

    @Override
    public void stop() {
        System.out.println("Stopping electric engine");
    }
}