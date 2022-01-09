package ru.itsjava.interfaces;

public class Plant implements Eatable,Talkable{
    @Override
    public void eat() {
        System.out.println("Растение можно есть");
    }

    @Override
    public void talk() {
        System.out.println("Растение не говорит");
    }
}
