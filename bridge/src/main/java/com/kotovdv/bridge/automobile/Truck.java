package com.kotovdv.bridge.automobile;

import com.kotovdv.bridge.engine.Engine;

/**
 * @author Dmitriy Kotov
 */
public class Truck extends Automobile {

    public Truck(Engine engine) {
        super(engine);
    }

    @Override
    protected void doStart() {
        System.out.println("Starting truck");
    }

    @Override
    protected void doStop() {
        System.out.println("Stopping truck");
    }
}