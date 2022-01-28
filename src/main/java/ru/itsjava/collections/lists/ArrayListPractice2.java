package ru.itsjava.collections.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice2 {

    public static void main(String[] args) {
        Watch vitaliySeiko = new Watch("Seiko", "Vitaliy", 18_000.0);
        Watch viktorSeiko = new Watch("Seiko", "Viktor", 18_000.0);
        Watch dmitriySeiko = new Watch("Seiko", "Dmitriy", 30_000.0);
        Watch valentinOmega = new Watch("Omega", "Valentin", 100_000.0);

        List<Watch> watches = new ArrayList<>(Arrays.asList(vitaliySeiko, viktorSeiko,
                dmitriySeiko, valentinOmega));
        System.out.println("Наши часы: " + watches);
        //вывести все часы у которых фирма Seiko
        System.out.println("вывести все часы у которых фирма Seiko");
        for (Watch elemWatch : watches) {
            if (elemWatch.getFirm().equals("Seiko")) {
                System.out.print(elemWatch + " ");
            }
        }
        System.out.println();
        System.out.println("вывести все часы у которых цена больше 25000 руб");
        for (Watch elemWatch : watches) {
            if (elemWatch.getPrice() > 25000) {
                System.out.print(elemWatch + " ");
            }
        }
        System.out.println();

        System.out.println("вывести одни часы у которых цена больше 25000 руб");
        for (Watch elemWatch : watches) {
            if (elemWatch.getPrice() > 25000) {
                System.out.print(elemWatch + " ");
                break;
            }
        }
        System.out.println();

        //пропустить первые 2 элемента
        System.out.println("пропустить первые 2 элемента");
        int seikoCount = 0;
        for (int i = 0; i < watches.size(); i++) {
            if (watches.get(i).getFirm().equals("Seiko") && seikoCount < 2) {
                seikoCount++;
            } else {
                System.out.println(watches.get(i));
            }
        }


    }
}
