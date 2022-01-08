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
        if (surname.equals(person.surname) && (name.equals(person.name))) {
            return (int) (age - person.age);
        } else if (!surname.equals(person.surname)) {
            return -1;
        } else if (!name.equals(person.name)) {
        }
            return 0;
    }
}




