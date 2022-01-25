package ru.itsjava.exceptions;

public class Person {
    public String name;
    public int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }


    public void AgeNotValid(int age) {
        if (age < 0 || age > 150){
            try {
                throw new AgeNotValidException();
            } catch (AgeNotValidException e) {
                System.out.println("возраст меньше нуля или больше 150");
            }
        }
        else System.out.println("возраст корректен");
    }
}
