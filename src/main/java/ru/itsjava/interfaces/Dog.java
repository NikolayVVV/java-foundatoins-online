package ru.itsjava.interfaces;

public class Dog implements Walkable{
    @Override
    public void walk() {
        System.out.println("Хожу по двору дома");
    }
}
