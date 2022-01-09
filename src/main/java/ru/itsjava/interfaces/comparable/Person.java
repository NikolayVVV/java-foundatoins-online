package ru.itsjava.interfaces.comparable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person implements Comparable<Person> {
    private final String surname;
    private final String name;
    private double age;

    @Override
    public int compareTo(Person person) {
        int result = surname.compareTo(person.surname);
        if (result == 0) {
            result = name.compareTo(person.name);
        }
        if (result == 0) {
            result = (int) (age - person.age);
        }
        return result;
    }
}




