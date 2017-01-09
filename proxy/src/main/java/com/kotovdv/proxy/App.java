package com.kotovdv.proxy;

import com.kotovdv.proxy.logic.AccidentFactory;
import com.kotovdv.proxy.model.accident.Accident;

/**
 * @author Dmitriy Kotov
 */
public class App {

    public static void main(String[] args) {
        AccidentFactory accidentFactory = new AccidentFactory();
        Accident titanicCrash = accidentFactory.buildAccident("titanic_crash");

        System.out.println("Summary: " + titanicCrash.getSummary()); //Reading preloaded summary
        System.out.println("Accident date: " + titanicCrash.getAccidentDate()); //Reading preloaded accident date
        System.out.println("Victims: " + titanicCrash.getVictims()); //Lazy loading of survivors/victims data occurs
        System.out.println("Survivors: " + titanicCrash.getSurvivors()); //Reading already loaded survivors/victims data
    }
}