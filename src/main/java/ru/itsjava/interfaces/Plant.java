package ru.itsjava.interfaces;

public class Plant implements Eatable,Talkable{
    @Override
    public void Eat() {
        System.out.println("Растение можно есть");
    }

    @Override
    public void Talk() {
        System.out.println("Растение не говорит");
    }
}
