package com.kotovdv.abstractfactory;

import com.kotovdv.abstractfactory.factory.IntegerRandomValueFactory;
import com.kotovdv.abstractfactory.factory.LocalDateRandomValueFactory;

import java.time.LocalDate;

import static java.time.LocalDate.now;

/**
 * @author Dmitriy Kotov
 */
public class App {

    public static void main(String[] args) {
        randomIntegerShowcase();
        randomLocalDateShowcase(LocalDate.of(1970, 1, 1), now());
    }

    private static void randomIntegerShowcase() {
        IntegerRandomValueFactory integerFactory = new IntegerRandomValueFactory();
        RandomValueGenerator<Integer> integerGenerator = new RandomValueGenerator<>(integerFactory);
        Integer randomInteger = integerGenerator.pickRandomValue(10, 100);

        System.out.println(randomInteger);
    }

    private static void randomLocalDateShowcase(LocalDate from, LocalDate to) {
        LocalDateRandomValueFactory localDateFactory = new LocalDateRandomValueFactory();
        RandomValueGenerator<LocalDate> localDateGenerator = new RandomValueGenerator<>(localDateFactory);
        LocalDate randomLocalDate = localDateGenerator.pickRandomValue(from, to);

        System.out.println(randomLocalDate);
    }
}
