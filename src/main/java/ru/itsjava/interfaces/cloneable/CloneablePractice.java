package ru.itsjava.interfaces.cloneable;

public class CloneablePractice {
    public static void main(String[] args) throws CloneNotSupportedException {
        Girl dasha = new Girl("Dasha", 160);
        Girl dasha2 = (Girl) dasha.clone();
        System.out.println("dasha = " + dasha);
        System.out.println("dasha2 = " + dasha2);
        System.out.println();

        Person kolya = new Person("Kolya", "Tentuk", 26);
        Person kolya2 = (Person) kolya.clone();
        System.out.println("kolya = " + kolya);
        System.out.println("kolya = " + kolya);
    }
}
