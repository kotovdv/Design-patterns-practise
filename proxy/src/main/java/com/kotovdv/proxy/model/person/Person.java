package com.kotovdv.proxy.model.person;

/**
 * @author Dmitriy Kotov
 */
public class Person {

    private final String fullName;
    private final Sex sex;
    private final int age;

    public Person(String fullName, Sex sex, int age) {
        this.fullName = fullName;
        this.sex = sex;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public Sex getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return (fullName != null ? fullName.equals(person.fullName) : person.fullName == null) && sex == person.sex;
    }

    @Override
    public int hashCode() {
        int result = fullName != null ? fullName.hashCode() : 0;
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }
}