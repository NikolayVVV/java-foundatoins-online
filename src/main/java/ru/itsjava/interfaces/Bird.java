package ru.itsjava.interfaces;

public class Bird implements Flyable{
    @Override
    public void fly() {
        System.out.println("Могу летать на юг");
    }

    @Override
    public String flyMaxDistance() {
        return "Максимально могу пролететь 10 км";
    }
}
