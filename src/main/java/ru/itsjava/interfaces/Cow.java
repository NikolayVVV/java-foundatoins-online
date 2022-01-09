package ru.itsjava.interfaces;

public class Cow implements Talkable, Eatable{
    @Override
    public void eat() {
        System.out.println("Корова ест");
    }

    @Override
    public void talk() {
        System.out.println("Корова мычит");
    }
}
