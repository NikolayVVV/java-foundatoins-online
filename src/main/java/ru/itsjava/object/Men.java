package ru.itsjava.object;

public class Men extends Person {
    //поля
    public Men(String name, int age) {
//        super.name = name;
//        super.age = age;
        super(name, age);
    }

    public void printAgeMen() {
        System.out.println("1");
    }
}
