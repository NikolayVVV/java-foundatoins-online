package ru.itsjava.interfaces.comparable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person implements Comparable<Person> {
    private final String name;
    private final String surname;
    private double age;

    @Override
    public int compareTo(Person person) {
        if (name == person.name) {
            return 0;
        } else if (surname == person.surname) {
            return 1;
        } else return (int) (age - person.age);

    }


}

