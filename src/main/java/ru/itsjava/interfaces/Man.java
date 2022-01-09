package ru.itsjava.interfaces;

public class Man implements Runnable, Swimable, Walkable, Flyable, Talkable,Eatable{
    @Override
    public void run() {
        System.out.println("Человек может бегать");
    }

    @Override
    public int maxRunDistance() {
        return 10;
    }

    @Override
    public void swim() {
        System.out.println("Человек может плавать");
    }

    @Override
    public double maxSwimSpeed() {
        return 1.5;
    }

    @Override
    public void walk() {
        System.out.println("Человек может ходить");
    }

    @Override
    public void fly() {
        System.out.println("Человек может летать на самолете");
    }

    @Override
    public String flyMaxDistance() {
        return "Длина полета на самолете зависит от его характеристик";
    }

    @Override
    public void talk() {
        System.out.println("Человек говорит");
    }

    @Override
    public void eat() {
        System.out.println("Человек ест");
    }
}
