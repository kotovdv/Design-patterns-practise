package com.kotovdv.observer.person;

/**
 * @author Dmitriy Kotov
 */
public enum Person {
    JOHN_DOE("John", "Doe"),
    FRANK_SINATRA("Frank", "Sinatra"),
    FREDDIE_MERCURY("Freddie", "Mercury");

    private final String firstName;
    private final String lastName;

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}