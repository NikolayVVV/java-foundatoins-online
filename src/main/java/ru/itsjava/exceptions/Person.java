package ru.itsjava.exceptions;

public class Person {
    public String name;
    public int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void AgeNotValidException(int age) throws Exception {
        if (age < 0 || age > 150){
            throw new Exception("возраст меньше нуля или возраст больше 150");
        }
    }


}
