package ru.itsjava.collections.lists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Класс Watch должен: ")
public class WatchTest {
    public static final String DEFAULT_FIRM = "SEIKO";
    public static final String DEFAULT_AUTHOR = "Vova";
    public static final double DEFAULT_PRICE = 10000.0;
    public static final String NEW_AUTHOR = "Masha";


    @DisplayName(" корректно создаваться конструктором")
    @Test
    public void shouldHaveCorrectConstructor() {
        Watch actualWatch = new Watch(DEFAULT_FIRM, DEFAULT_AUTHOR, DEFAULT_PRICE);
        Assertions.assertEquals(DEFAULT_FIRM, actualWatch.getFirm());
        Assertions.assertEquals(DEFAULT_AUTHOR, actualWatch.getAuthor());
        Assertions.assertEquals(DEFAULT_PRICE, actualWatch.getPrice());
    }
    @DisplayName(" корректно изменять автора")
    @Test
    public void shouldHaveCorrectUpdateWatch(){
        Watch actualWatch = new Watch(DEFAULT_FIRM, DEFAULT_AUTHOR, DEFAULT_PRICE);
        actualWatch.setAuthor(NEW_AUTHOR);
        Assertions.assertEquals(NEW_AUTHOR,actualWatch.getAuthor());
    }

}
