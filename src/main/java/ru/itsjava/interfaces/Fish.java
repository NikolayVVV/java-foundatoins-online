package ru.itsjava.interfaces;

public class Fish implements Swimable{
    @Override
    public void swim() {
        System.out.println("Плаваю на дне океана");
    }

    @Override
    public double maxSwimSpeed() {
        return 15_00.0;
    }
}
