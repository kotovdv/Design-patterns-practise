package com.kotovdv.proxy.logic;

import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Multimap;
import com.kotovdv.proxy.exception.FailedToLoadAccidentCasualtiesException;
import com.kotovdv.proxy.model.accident.Outcome;
import com.kotovdv.proxy.model.person.Person;
import com.kotovdv.proxy.model.person.Sex;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.function.Consumer;

import static com.kotovdv.proxy.model.accident.Outcome.DIED;
import static com.kotovdv.proxy.model.accident.Outcome.SURVIVED;
import static java.lang.ClassLoader.getSystemResourceAsStream;
import static org.apache.commons.csv.CSVFormat.DEFAULT;

/**
 * @author Dmitriy Kotov
 */
public class CasualtiesParser {

    public static Multimap<Outcome, Person> parseCasualties(String accidentName) {
        try (InputStream stream = getSystemResourceAsStream(accidentName + ".csv");
             InputStreamReader reader = new InputStreamReader(stream)) {
            CSVParser csvRecords = new CSVParser(reader, DEFAULT.withFirstRecordAsHeader());

            Multimap<Outcome, Person> casualtiesData = LinkedHashMultimap.create();

            csvRecords.forEach(addToMultimap(casualtiesData));

            return casualtiesData;
        } catch (IOException e) {
            throw new FailedToLoadAccidentCasualtiesException(e);
        }
    }

    private static Consumer<CSVRecord> addToMultimap(Multimap<Outcome, Person> casualtiesData) {
        return currentCasualty -> {
            Person person = new Person(
                    currentCasualty.get("Name"),
                    Sex.parse(currentCasualty.get("Sex")),
                    Integer.valueOf(currentCasualty.get("Age")));

            Outcome outcome = Boolean.valueOf(currentCasualty.get("Outcome"))
                    ? SURVIVED
                    : DIED;

            casualtiesData.put(outcome, person);
        };
    }
}