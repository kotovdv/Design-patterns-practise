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

    private final String summary;
    private final LocalDate accidentDate;
    private final String accidentName;
    private AccidentData originalData;

    public LazyAccidentData(String summary, LocalDate accidentDate, String accidentName) {
        this.summary = summary;
        this.accidentDate = accidentDate;
        this.accidentName = accidentName;
    }

    @Override
    public String getSummary() {
        return summary;
    }

    @Override
    public LocalDate getAccidentDate() {
        return accidentDate;
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
        }
    }

    private boolean isNotInitialized() {
        return originalData == null;
    }

    private AccidentData initialize(String accidentName) {
        Multimap<Outcome, Person> casualties = parseCasualties(accidentName);

        return new AccidentData(
                summary,
                accidentDate,
                casualties.get(DIED),
                casualties.get(SURVIVED));
    }
}