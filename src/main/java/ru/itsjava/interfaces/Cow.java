package ru.itsjava.interfaces;

public class Cow implements Talkable, Eatable{
    @Override
    public void Eat() {
        System.out.println("Корова ест");
    }

    @Override
    public void Talk() {
        System.out.println("Корова мычит");
    }
}
