package com.kotovdv.proxy.model.accident;

import com.kotovdv.proxy.model.person.Person;

import java.time.LocalDate;

/**
 * @author Dmitriy Kotov
 */
public interface Accident {

    /**
     * @return summary info about an accident
     */
    String getSummary();

    /**
     * @return LocalDate when an accident happened
     */
    LocalDate getAccidentDate();

    /**
     * @return victims of an accident
     */
    Iterable<Person> getVictims();

    /**
     * @return survivors of an accident
     */
    Iterable<Person> getSurvivors();

}