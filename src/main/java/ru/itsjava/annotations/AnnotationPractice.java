package ru.itsjava.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class AnnotationPractice {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException,
            InvocationTargetException, InstantiationException,
            IllegalAccessException, NoSuchFieldException {
//        Person ivan = new Person("Vanya", true);
//        System.out.println(ivan);
//
//        Class<? extends Person> aClass = ivan.getClass();

//        System.out.println(aClass.getName());
//        System.out.println(aClass.getSimpleName());

        Class<?> personClass = Class.forName("ru.itsjava.annotations.Person");
        System.out.println(personClass.getName());
        Person vanya = (Person) personClass.getConstructor(String.class, Boolean.TYPE).
                newInstance("Vanya", true);
        System.out.println(vanya);
//
//        System.out.println(personClass.getAnnotations()[0]);
//        System.out.println(personClass.getAnnotations()[0]);
//
//        Field isGood = personClass.getDeclaredField("isGood");
//        isGood.setAccessible(true);
//        isGood.set(vanya, false);
//
//        System.out.println(vanya);


        //MathStudent

//        MathStudent student = new MathStudent("Nikolay", "Tentuk", 2);

        Class<?> mathStudentClass = Class.forName("ru.itsjava.annotations.MathStudent");
        System.out.println(mathStudentClass.getName());

        System.out.println("2. Создать объект класса MathStudent");
        MathStudent nikolay = (MathStudent) mathStudentClass.getConstructor(String.class, String.class, int.class).
                newInstance("Nikolay", "Tentuk", 2);
        System.out.println(nikolay);

        System.out.println("3. Через Reflection вытащить private поле и поменять ему значение на новое");

        Field surname = mathStudentClass.getDeclaredField("surname");
        surname.setAccessible(true);
        surname.set(nikolay, "Ivanov");
        System.out.println(nikolay);

        Field course = mathStudentClass.getDeclaredField("course");
        course.setAccessible(true);
        course.set(nikolay, 4);
        System.out.println("student = " + nikolay);


        Class<?> BiologyStudentClass = Class.forName("ru.itsjava.annotations.BiologyStudent");
        System.out.println("7. Получить аннотацию через рефлекшн ");
        System.out.println("BiologyStudentClass.getAnnotations()[0] = " + BiologyStudentClass.getAnnotations()[0]);
        Annotation nameOfDepartment = mathStudentClass.getAnnotations()[0];

        System.out.println("7. вывести на экран студента и название кафедры из аннотации.");
        System.out.println(nikolay + " " + nameOfDepartment);


    }
}
