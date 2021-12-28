package ru.itsjava.interfaces;

public class Cat implements Runnable{
    @Override
    public void run() {
        System.out.println("Могу бегать от собак");
    }

    @Override
    public int maxRunDistance() {
        return 500;
    }
}
