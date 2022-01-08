package ru.itsjava.collections.lists;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Класс Person должен: ")
public class PersonTest {
    public static final String DEFAULT_NAME = "Николай";
    public static final int DEFAULT_AGE = 26;
    public static final String NEW_NAME = "Анатолий";
    private static final int NEW_AGE = 35;


    @DisplayName(" корректно создаваться конструктором")
    @Test
    public void shouldHaveCorrectMethods() {
        Person actualPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);
//        assertEquals(DEFAULT_NAME, actualPerson.getName());
//        assertEquals(DEFAULT_AGE, actualPerson.getAge());

        assertAll("actualPerson", () -> assertEquals(DEFAULT_NAME, actualPerson.getName()),
                () -> assertEquals(DEFAULT_AGE, actualPerson.getAge()));
    }

    @DisplayName(" корректно изменять имя и возраст")
    @Test
    public void shouldHaveCorrectUpdatePerson() {
        Person actualPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);
        actualPerson.setName(NEW_NAME);
        actualPerson.setAge(NEW_AGE);
        assertEquals(NEW_NAME, actualPerson.getName());
        assertEquals(NEW_AGE, actualPerson.getAge());
    }

    @DisplayName("корректно обновлять возраст")
    @Test
    public void shouldHaveCorrectMethodBirthday() {
        Person actualPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);
        actualPerson.birthday();
        assertEquals(DEFAULT_AGE + 1, actualPerson.getAge());
    }

    @DisplayName("корректно проверять возраст")
    @Test
    public void shouldHaveCorrectMethodTakeBeer() {
        Person actualPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);
//        actualPerson.takeBeer(15);
        assertFalse(actualPerson.takeBeer(15));
    }
}
