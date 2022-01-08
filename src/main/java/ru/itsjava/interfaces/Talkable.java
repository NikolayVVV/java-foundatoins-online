package ru.itsjava.interfaces;

public interface Talkable {
    default void Talk(){
        System.out.println("Говорить");
    }
}
