package com.kotovdv.bridge.engine;

/**
 * @author Dmitriy Kotov
 */
public class DieselEngine extends Engine {

    @Override
    public void start() {
        System.out.println("Starting diesel engine");
    }

    @Override
    public void stop() {
        System.out.println("Stopping diesel engine");
    }
}