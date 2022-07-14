package ru.itsjava.annotations;

import lombok.AllArgsConstructor;
import lombok.ToString;

@MyAnnotation(message = "I'm person number 1", flag = true)
@AllArgsConstructor
@ToString
public class Person {
    private final String name;
    private boolean isGood;

}
