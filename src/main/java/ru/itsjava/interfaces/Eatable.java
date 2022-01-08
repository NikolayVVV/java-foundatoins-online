package ru.itsjava.interfaces;

public interface Eatable {
    default void Eat(){
        System.out.println("Кушать");
    }
}
