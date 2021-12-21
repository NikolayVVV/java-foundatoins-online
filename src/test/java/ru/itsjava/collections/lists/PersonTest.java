package ru.itsjava.collections.lists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
@DisplayName("Класс Person должен: ")
public class PersonTest {
    public static final String DEFAULT_NAME = "Николай";
    public static final int DEFAULT_AGE = 26;
    public static final String NEW_NAME = "Анатолий";


    @DisplayName(" Корректно создаваться конструктором")
    @Test
    public void shouldHaveCorrectMethods(){
        Person actualPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);
        Assertions.assertEquals(DEFAULT_NAME,actualPerson.getName());
        Assertions.assertEquals(DEFAULT_AGE,actualPerson.getAge());
    }

    @DisplayName(" корректно изменять имя")
    @Test
    public void shouldHaveCorrectUpdatePerson(){
        Person actualPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);
        actualPerson.setName("Анатолий");
        Assertions.assertEquals(NEW_NAME, actualPerson.getName());
    }
}
