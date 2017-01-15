package com.kotovdv.bridge.automobile;

import com.kotovdv.bridge.engine.Engine;

/**
 * @author Dmitriy Kotov
 */
public class Bus extends Automobile {

    public Bus(Engine engine) {
        super(engine);
    }

    @Override
    protected void doStart() {
        System.out.println("Starting bus");
    }

    @Override
    protected void doStop() {
        System.out.println("Stopping bus");
    }
}