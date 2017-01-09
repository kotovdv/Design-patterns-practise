package com.kotovdv.proxy.model.accident;

import com.google.common.collect.Multimap;
import com.kotovdv.proxy.model.person.Person;

import java.time.LocalDate;

import static com.kotovdv.proxy.logic.CasualtiesParser.parseCasualties;
import static com.kotovdv.proxy.model.accident.Outcome.DIED;
import static com.kotovdv.proxy.model.accident.Outcome.SURVIVED;

/**
 * @author Dmitriy Kotov
 */
public class LazyAccidentData implements Accident {

    private final String accidentName;
    private AccidentData originalData;
    private boolean isInitialized;

    public LazyAccidentData(AccidentData basicAccidentData, String accidentName) {
        this.originalData = basicAccidentData;
        this.accidentName = accidentName;
    }

    @Override
    public String getSummary() {
        return originalData.getSummary();
    }

    @Override
    public LocalDate getAccidentDate() {
        return originalData.getAccidentDate();
    }

    @Override
    public Iterable<Person> getVictims() {
        checkLazyLoading();

        return this.originalData.getVictims();
    }

    @Override
    public Iterable<Person> getSurvivors() {
        checkLazyLoading();

        return this.originalData.getSurvivors();
    }

    private void checkLazyLoading() {
        if (isNotInitialized()) {
            this.originalData = initialize(accidentName);
            this.isInitialized = true;
        }
    }

    private boolean isNotInitialized() {
        return !isInitialized;
    }

    private AccidentData initialize(String accidentName) {
        Multimap<Outcome, Person> casualties = parseCasualties(accidentName);

        return new AccidentData(
                originalData.getSummary(),
                originalData.getAccidentDate(),
                casualties.get(DIED),
                casualties.get(SURVIVED));
    }
}