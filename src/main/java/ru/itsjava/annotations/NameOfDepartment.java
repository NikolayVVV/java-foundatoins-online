package ru.itsjava.annotations;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
//5. Создать свою аннотацию в. которую будем передавать имя кафедры
public @interface NameOfDepartment {
    String name();

}
