package com.kotovdv.builder;

import com.kotovdv.builder.person.Person;

import static com.kotovdv.builder.person.Education.MASTERS;
import static com.kotovdv.builder.person.MaritalStatus.MARRIED;
import static com.kotovdv.builder.person.Person.builder;

/**
 * @author Dmitriy Kotov
 */
public class App {
    public static void main(String[] args) {
        Person person = builder("John", "Doe")
                .withAge(47)
                .withEducation(MASTERS)
                .withMaritalStatus(MARRIED)
                .build();

        System.out.println(person);
    }
}
