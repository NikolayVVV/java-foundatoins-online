package ru.itsjava.collections.sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetPractice {

    public static void main(String[] args) {
        Man andrey = new Man("Andrey");
        Man maxim = new Man("Maxim");
        Man vitya = new Man("Vitya");

        Set<Man> menSet = new HashSet<>(Arrays.asList(andrey, maxim, vitya));
        System.out.println("menSet = " + menSet);
        System.out.println("menSet.add(andrey) = " + menSet.add(andrey));
        System.out.println("menSet = " + menSet);
        Man andrey2 = new Man("Andrey");
        System.out.println("menSet.add(andrey2) = " + menSet.add(andrey2));
        System.out.println("menSet.contains(andrey) = " + menSet.contains(andrey));
        System.out.println("menSet.isEmpty() = " + menSet.isEmpty());
        System.out.println("menSet = " + menSet);
        System.out.println("menSet.remove(andrey2) = " + menSet.remove(andrey2));
        System.out.println("menSet.remove(andrey) = " + menSet.remove(andrey));

        System.out.println("menSet.remove(andrey2) = " + menSet.remove(andrey2));
        System.out.println("menSet = " + menSet);

        System.out.println("menSet.remove(andrey2) = " + menSet.remove(andrey2));
        System.out.println("menSet = " + menSet);
        System.out.println("menSet.size() = " + menSet.size());

        //Фрукты
        Fruit banana = new Fruit("Banana", 500);
        Fruit apple = new Fruit("Apple", 1000);
        Fruit strawberry = new Fruit("Strawberry", 300);
        Set<Fruit> fruitSet = new HashSet<>(Arrays.asList(banana, apple, strawberry));
        Fruit banana2 = new Fruit("Banana", 500);
        System.out.println("fruitSet = " + fruitSet);
        System.out.println("fruitSet.add(banana2) = " + fruitSet.add(banana2));
        System.out.println("fruitSet = " + fruitSet);
        System.out.println("fruitSet.remove(banana) = " + fruitSet.remove(banana));
        System.out.println("fruitSet = " + fruitSet);
        System.out.println("fruitSet.contains(banana) = " + fruitSet.contains(banana));
        System.out.println("fruitSet.contains(strawberry) = " + fruitSet.contains(strawberry));


    }
}
