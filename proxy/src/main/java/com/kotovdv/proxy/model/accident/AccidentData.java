package com.kotovdv.proxy.model.accident;

import com.kotovdv.proxy.model.person.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static java.util.Collections.unmodifiableList;

/**
 * @author Dmitriy Kotov
 */
public class AccidentData implements Accident {

    private final String summary;
    private final LocalDate accidentDate;
    private final List<Person> victims = new ArrayList<>();
    private final List<Person> survivors = new ArrayList<>();

    public AccidentData(String summary, LocalDate accidentDate, Collection<Person> victims, Collection<Person> survivors) {
        this.summary = summary;
        this.accidentDate = accidentDate;
        this.victims.addAll(victims);
        this.survivors.addAll(survivors);
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
        return unmodifiableList(victims);
    }

    @Override
    public Iterable<Person> getSurvivors() {
        return unmodifiableList(survivors);
    }
}