package ru.itsjava.collections.lists.linkedlist;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Класс MyLinkedListTest должен ")
public class MyLinkedListTest {
    private final MyLinkedList DEFAULT_LIST = new MyLinkedList();


    @DisplayName(" корректно возвращать количество объектов в массиве")
    @Test
    public void shouldHaveCorrectReturnNumberOfObjectsInArray() {
        DEFAULT_LIST.add("element1");
        DEFAULT_LIST.add("element2");
        assertEquals(2, DEFAULT_LIST.size());
    }

    @DisplayName(" корректно проверять массив на наличие объектов")
    @Test
    public void shouldHaveCheckTheArrayForThePresenceOfObjects() {
        assertEquals(true, DEFAULT_LIST.isEmpty());
    }

    @DisplayName(" корректно проверять массив на наличие определенного объекта")
    @Test
    public void shouldHaveCheckTheArrayForThePresenceOfSpecificObject() {
        DEFAULT_LIST.add("element1");
        assertEquals("element1", DEFAULT_LIST.get(0));
    }

    @DisplayName(" корректно добавлять элемент в массив")
    @Test
    public void shouldHaveCorrectAddElementToArray() {
        DEFAULT_LIST.add("element3");
        assertEquals("element3", DEFAULT_LIST.get(0));
        assertEquals(1, DEFAULT_LIST.size());
    }

    @DisplayName(" корректно удалять элемент из массива")
    @Test
    public void shouldHaveCorrectDeleteElementFromArray() {
        DEFAULT_LIST.add("element1");
        DEFAULT_LIST.remove("element1");
        assertEquals(true, DEFAULT_LIST.isEmpty());
        assertEquals(0, DEFAULT_LIST.size());
    }

    @DisplayName(" корректно удалять все элементы в массиве")
    @Test
    public void shouldHaveCorrectDeleteAllElementsInArray() {
        DEFAULT_LIST.add("element1");
        DEFAULT_LIST.add("element2");
        DEFAULT_LIST.add("element3");
        DEFAULT_LIST.clear();
        assertEquals(0, DEFAULT_LIST.size());
    }

    @DisplayName(" корректно получить элемент из массива по индексу")
    @Test
    public void shouldHaveCorrectGetElementFromArrayOnIndex() {
        DEFAULT_LIST.add("element1");
        assertEquals("element1", DEFAULT_LIST.get(0));
    }

    @DisplayName(" корректно изменить элемент из массива по индексу")
    @Test
    public void shouldHaveCorrectSetElementFromArrayOnIndex() {
        DEFAULT_LIST.add("element1");
        DEFAULT_LIST.set(0, "ELEMENT2");
        assertEquals("ELEMENT2", DEFAULT_LIST.get(0));
    }

    @DisplayName(" корректно добавлять элемент в массив по индексу")
    @Test
    public void shouldHaveCorrectAddElementToArrayOnIndex() {
        //не реализован
    }

    @DisplayName(" корректно удалять элемент из массива по индексу")
    @Test
    public void shouldHaveCorrectDeleteElementFromArrayOnIndex() {
        DEFAULT_LIST.add("element1");
        DEFAULT_LIST.add("element2");
        DEFAULT_LIST.remove(0);
        assertEquals("element2", DEFAULT_LIST.get(0));
    }

    @DisplayName(" корректно получать индекс указанного элемента из массива")
    @Test
    public void shouldHaveCorrectGetIndexOfElementFromArray() {
        DEFAULT_LIST.add("element1");
        assertEquals(0, DEFAULT_LIST.indexOf("element1"));
    }

    @DisplayName(" корректно получать индекс указанного элемента начиная с конца массива")
    @Test
    public void shouldHaveCorrectGetIndexOfElementFromEndOfArray() {
        DEFAULT_LIST.add("element1");
        DEFAULT_LIST.add("element1");
        assertEquals(1, DEFAULT_LIST.lastIndexOf("element1"));
    }


}
