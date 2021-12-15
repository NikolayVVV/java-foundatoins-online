package ru.itsjava.object;

public class Women extends Person {
    public Women(String name, int age) {
        super.name = name;
        super.age = age;
    }

    public void printAge() {
        System.out.println("Всегда 18");
    }
}
