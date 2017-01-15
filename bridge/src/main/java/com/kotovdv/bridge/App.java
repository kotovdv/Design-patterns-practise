package com.kotovdv.bridge;

import com.kotovdv.bridge.automobile.Bus;
import com.kotovdv.bridge.automobile.Truck;
import com.kotovdv.bridge.engine.DieselEngine;
import com.kotovdv.bridge.engine.ElectricEngine;

import static com.kotovdv.bridge.coordinates.CommonCoordinates.LONDON;
import static com.kotovdv.bridge.coordinates.CommonCoordinates.MOSCOW;

/**
 * @author Dmitriy Kotov
 */
public class App {

    public static void main(String[] args) {
        Bus electricEngineBus = new Bus(new ElectricEngine());

        electricEngineBus.start();
        electricEngineBus.travelTo(MOSCOW.getCoordinates());
        electricEngineBus.stop();

        System.out.println("***************");

        Truck dieselEngineTruck = new Truck(new DieselEngine());

        dieselEngineTruck.start();
        dieselEngineTruck.travelTo(LONDON.getCoordinates());
        dieselEngineTruck.stop();
    }
}