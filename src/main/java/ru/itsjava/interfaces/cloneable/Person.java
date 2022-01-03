package ru.itsjava.interfaces.cloneable;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Person implements Cloneable{
    private final String name;
    private final String surname;
    private double age;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Person{" + name + ", surname=" + surname + ", age=" + age + "}";
    }
}
