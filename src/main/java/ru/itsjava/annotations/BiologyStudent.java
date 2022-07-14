package ru.itsjava.annotations;


import lombok.AllArgsConstructor;
import lombok.ToString;


@NameOfDepartment(name = "Department of biology")//6. Проанотировать классы этой аннотацией.
@AllArgsConstructor
@ToString
//4. Создать свой собственный класс BiologyStudent с полями Имя, фамилия и курс
public class BiologyStudent {
    private final String name;
    private final String surname;
    private final int course;
}
