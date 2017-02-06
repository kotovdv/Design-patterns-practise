package com.kotovdv.builder.person;

import java.util.Optional;

import static java.util.Optional.ofNullable;

/**
 * @author Dmitriy Kotov
 */
public class Person {

    private final String firstName;
    private final String lastName;

    private final Integer age;
    private final Education education;
    private final MaritalStatus maritalStatus;

    private Person(PersonBuilder personBuilder) {
        this.firstName = personBuilder.firstName;
        this.lastName = personBuilder.lastName;
        this.age = personBuilder.age;
        this.education = personBuilder.education;
        this.maritalStatus = personBuilder.maritalStatus;
    }

    public static PersonBuilder builder(String firstName, String lastName) {
        return new PersonBuilder(firstName, lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Optional<Integer> getAge() {
        return ofNullable(age);
    }

    public Optional<Education> getEducation() {
        return ofNullable(education);
    }

    public Optional<MaritalStatus> getMaritalStatus() {
        return ofNullable(maritalStatus);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", education=" + education +
                ", maritalStatus=" + maritalStatus +
                '}';
    }

    public static class PersonBuilder {

        private final String firstName;
        private final String lastName;

        private Integer age;
        private Education education;
        private MaritalStatus maritalStatus;


        private PersonBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public PersonBuilder withAge(int age) {
            this.age = age;

            return this;
        }

        public PersonBuilder withMaritalStatus(MaritalStatus maritalStatus) {
            this.maritalStatus = maritalStatus;

            return this;
        }

        public PersonBuilder withEducation(Education education) {
            this.education = education;

            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}