package ru.itsjava.interfaces.comparable;

import ru.itsjava.interfaces.Car;

import java.util.Arrays;

public class ComparablePractice {

    public static void main(String[] args) {
        Boy vitalik = new Boy("Vitalik", 15, 165);
        Boy vasya = new Boy("Vasya", 14, 160);
        Boy vanya = new Boy("Vanya", 18, 180);
        System.out.println("vitalik.compareTo(vasya) = " + vitalik.compareTo(vasya));
        System.out.println("vasya.compareTo(vanya) = " + vasya.compareTo(vanya));
        Boy[] boys = {vitalik, vasya, vanya};
        System.out.println("Arrays.toString(boys) = " + Arrays.toString(boys));
        Arrays.sort(boys);
        System.out.println("Arrays.toString(boys) = " + Arrays.toString(boys));
        System.out.println();

        //Person
        Person nikolay = new Person("Nikolay", "Tentuk", 26);
        Person vlad = new Person("Vlad", "Andrienko", 20);
        Person misha = new Person("Vlad", "Andrienko", 15);
        Person stas = new Person("Stas", "Alekseev", 45);
        System.out.println(nikolay.compareTo(vlad));
        System.out.println(vlad.compareTo(stas));
        Person[] person = {nikolay, vlad, stas};
        System.out.println(Arrays.toString(person));
        Arrays.sort(person);
        System.out.println(Arrays.toString(person));
        String a = "carry";
        String z = "BAd__1450";
        System.out.println(a.compareTo(z));
        System.out.println(nikolay.getSurname().compareTo(vlad.getSurname()));
        System.out.println(nikolay.getName().compareTo(vlad.getName()));
    }
}
