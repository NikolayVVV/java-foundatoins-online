package ru.itsjava.exceptions;

public class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void AgeNotValid(int age) throws AgeNotValidException {
        if (age < 0 || age > 150) {
            throw new AgeNotValidException("возраст меньше нуля или больше 150");
        } else {
            System.out.println("возраст корректен");
        }
    }
}
