package ru.itsjava.object;

public class Women extends Person {
    public Women(String name, int age) {
        super(name, age);
//        super.setName(name);
//        super.setAge(age);
    }

    public void printAge() {
        System.out.println("Всегда 18");
    }
}
