package ru.itsjava.annotations;

import lombok.AllArgsConstructor;
import lombok.ToString;

@NameOfDepartment(name = "Department of mathematics")//6. Проанотировать классы этой аннотацией.
@AllArgsConstructor
@ToString
//1. Создать свой собственный класс MathStudent с полями Имя, фамилия и курс
public class MathStudent {
    private final String name;
    private final String surname;
    private final int course;
}
