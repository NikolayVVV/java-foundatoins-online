package ru.itsjava.collections.lists;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Person {
    private String name;
    private int age;

    public void birthday(int age) {
        System.out.println(age);
        age++;
    }

    public boolean takeBeer(int age) {
        if (age > 18) return true;
        else return false;
    }
}
