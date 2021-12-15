package ru.itsjava.object;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Mouse {
    public final String colour;
    public int earCount;

//    public Mouse(String colour, int earCount) {
//        this.colour = colour;
//        this.earCount = earCount;
//    }

//    @Override
//    public boolean equals(Object o) {  // выдается некий object на вход условно
//        if (this == o) return true;    // далее мы смотрим ссылаемся ли мы на один и тот же объект,
//        // если "да", то возвращаем true
//        if (o == null || getClass() != o.getClass()) return false; //если ссылка равна null(пустая) или класс
//        // текущего объекта не равен классу, с которым сравниваем, то возвращаем false
//
//        Mouse mouse = (Mouse) o;//здесь мы приводим к тому, что компилятор уже понимает, что мы точно уже будем
//        // работать с экземпляром класса Mouse
//
//        if (mouse.earCount == earCount) {
//            return colour.equals(mouse.colour);
//        }
//        return false;// здесь мы уже сравниваем цвет нашего Mouse
//    }
//
//    @Override
//    public int hashCode() {
//        return colour.hashCode();
//    }// ну и здесь мы возвращаем наш цвет т.е. colour.hashCode

//    public String toString(){
//        return "Mouse{colour: " + colour + ", ears: " + earCount + "}";
//    }
}
