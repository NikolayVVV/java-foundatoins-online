package ru.itsjava.collections.lists.arraylist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Класс MyArrayListTest должен ")
public class MyArrayListTest {
    //    private static final int DEFAULT_CAPACITY = 10;
//    private static final int DEFAULT_REALSIZE = 0;
    private final MyArrayList DEFAULT_LIST = new MyArrayList();


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
        assertEquals(false, DEFAULT_LIST.contains("element1"));
    }

    @DisplayName(" корректно добавлять элемент в массив")
    @Test
    public void shouldHaveCorrectAddElementToArray() {
        DEFAULT_LIST.add("element3");
        assertEquals(true, DEFAULT_LIST.contains("element3"));
        assertEquals(1, DEFAULT_LIST.size());
    }

    @DisplayName(" корректно удалять элемент из массива")
    @Test
    public void shouldHaveCorrectDeleteElementFromArray() {
        DEFAULT_LIST.add("element1");
        DEFAULT_LIST.remove("element1");
        assertEquals(false, DEFAULT_LIST.contains("element1"));
        assertEquals(0, DEFAULT_LIST.size());
    }

    @DisplayName(" корректно удалять все элементы в массиве")
    @Test
    public void shouldHaveCorrectDeleteAllElementsInArray() {
        DEFAULT_LIST.add("element1");
        DEFAULT_LIST.add("element2");
        DEFAULT_LIST.add("element3");
        DEFAULT_LIST.clear();
        assertEquals(false, DEFAULT_LIST.contains("element1"));
        assertEquals(false, DEFAULT_LIST.contains("element2"));
        assertEquals(false, DEFAULT_LIST.contains("element3"));
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
        DEFAULT_LIST.add("element1");
        DEFAULT_LIST.add("element2");
        DEFAULT_LIST.add("element3");
        DEFAULT_LIST.add(1, "ELEMENT");
        assertEquals("ELEMENT", DEFAULT_LIST.get(1));
        assertEquals(4, DEFAULT_LIST.size());
    }

    @DisplayName(" корректно удалять элемент из массива по индексу")
    @Test
    public void shouldHaveCorrectDeleteElementFromArrayOnIndex() {
        DEFAULT_LIST.add("element1");
        DEFAULT_LIST.remove(0);
        assertEquals(false, DEFAULT_LIST.contains("element1"));
        assertEquals(0, DEFAULT_LIST.size());
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
