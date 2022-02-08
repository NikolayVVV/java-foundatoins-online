package ru.itsjava.collections.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice {

    public static void main(String[] args) {

        List<Watch> watchesList = new ArrayList<>();
        Watch seiko = new Watch("Seiko", "Vitaliy", 18000.0);
        Watch gShock = new Watch("GSHOCK", "Best dancer", 10000.0);
        watchesList.add(seiko);
        watchesList.add(gShock);
        for (Watch elemWatch : watchesList) {
            System.out.println(elemWatch);
        }

//        watchesList.remove(0);
        watchesList.remove(seiko);

        System.out.print("List: ");
        for (Watch elemWatch : watchesList) {
            System.out.print(elemWatch + " ");
        }
        System.out.println();

        System.out.println("watchesList.contains(gShock) = " + watchesList.contains(gShock));
        System.out.println("watchesList.contains(seiko) = " + watchesList.contains(seiko));
        System.out.println("watchesList = " + watchesList);

        System.out.println("watchesList.get(0).getFirm() = " + watchesList.get(0).getFirm());
        watchesList.set(0, seiko);
        System.out.println("watchesList = " + watchesList);
        System.out.println("watchesList.size() = " + watchesList.size());

        List<Watch> watchesOmegaList = new ArrayList<>();
        Watch andrewOmega = new Watch("Omega", "Andrew", 100_000.0);
        Watch romanOmega = new Watch("Omega", "Roman", 100_000.0);
        watchesOmegaList.add(andrewOmega);
        watchesOmegaList.add(romanOmega);
        System.out.println("watchesOmegaList = " + watchesOmegaList);
        watchesList.addAll(watchesOmegaList);
        System.out.println("watchesList = " + watchesList);
        Watch vitaliyWatch = new Watch("Seiko", "Vitaliy", 20_000.0);
        watchesList.add(1, vitaliyWatch);
        System.out.println("watchesList = " + watchesList);

        //BOOK
        //List <Book> booksList = new ArrayList<>(); а). Создать пустой список книг
        List<Book> booksList = new ArrayList<>(20);//б). Создать список размером 20
        Book book1 = new Book("Lord of the Rings", "Tolkien", 1500);
        Book book2 = new Book("Harry Potter", "Rouling", 900);
        Book book3 = new Book("The Sea Wolf", "London", 100);
        Book book4 = new Book("Philosophy of Java", "Ackel", 400);
        Book book5 = new Book("Red tablet", "Kurpatov", 200);
        booksList.add(book1);//1. а) Добавить подряд 5 элементов.
        booksList.add(book2);
        booksList.add(book3);
        booksList.add(book4);
        booksList.add(book5);
        Book book6 = new Book("Graph Monte Cristo", "Duma", 1100);
        Book book7 = new Book("Romeo and Juliet", "Shakespeare", 450);
        booksList.add(3, book6);//1. б) Добавить шестой элемент в третию позицию
        booksList.add(1, book7);// Добавить седьмой элемент в первую позицию.
        ArrayList<Book> booksList2 = new ArrayList<>();
        System.out.println("booksList2.size() = " + booksList2.size());
        booksList2.addAll(booksList);//в) Записать в новый список все элементы предыдущего списка.
        System.out.println("booksList2 = " + booksList2);
        System.out.println("booksList2.get(0) = " + booksList2.get(0));//2.а). Получить первый элемент (первую книгу в списке)
        System.out.println("2.б)Получить последний элемент (последнюю книгу в списке)");
        System.out.println("booksList2.get(booksList2.size()-1) = " + booksList2.get(booksList2.size() - 1));
        System.out.println("booksList2.get(6) = " + booksList2.get(6));
        System.out.println("booksList2.size() = " + booksList2.size());
        booksList2.remove(book5);//3.а) Удалить элемент по значению (книге)
        booksList2.remove(0);//б) Удалить элемент по индексу
        System.out.println("booksList2 = " + booksList2);
        System.out.println("booksList2.contains(book1) = " + booksList2.contains(book1));//4. Проверить наличие элемента
        Book book8 = new Book("7 навыков высокоэффективных людей", "Кови", 387);
        Book book9 = new Book("Java. Эффективное программирование", "Блох Дж.", 219);
        List<Book> List = new ArrayList<>();
        List.add(book8);
        List.add(book9);
        System.out.println("List = " + List);//5.а) Вывести список на экран в формате:.......
        System.out.println("List.get(List.size()) = " + List.get(List.size() - 1));
        System.out.println("List = " + List);
        Book book10 = new Book("Java", "Ackel", 500);
        Book book11 = new Book("Java", "Shield", 600);
        Book book12 = new Book("Java", "Sierra", 700);
        Book book13 = new Book("Java", "Bird", 800);
        List.add(0, book10);//Теперь надо хаотично
        List.add(3, book11);//в список добавить
        List.add(2, book12);//4 книги с названием
        List.add(4, book13);//"Java"
        System.out.println("List = " + List);

        System.out.println("6.а) Условие на индекс: Индекс делится на 3");
        for (int i = 0; i < List.size(); i++) {
            if (i % 3 == 0) {
                System.out.println(List.get(i));
            }
        }

        System.out.println("6.б) Условие на значение: Вернуть количество книг, которые равны Java");
        for (int i = 0; i < List.size(); i++) {
            if (List.get(i).getName().equals("Java")) {
                System.out.println(List.get(i));
            }
        }

        System.out.println("7.а) Пропустить первые 3 книги в списке.");
        int count = 0;
        for (int i = 0; i < List.size(); i++) {
            if (count < 3) {
                count++;
            } else {
                System.out.println(List.get(i));
            }
        }

        System.out.println("7.а) Пропустить первые 2 книги, которые равные Java");
        int countList = 0;
        for (int i = 0; i < List.size(); i++) {
            if (List.get(i).getName().equals("Java") && countList < 2) {
                countList++;
            } else {
                System.out.println(List.get(i));
            }
        }

        System.out.println("8.а) Возвращаем первую книгу, длина автора которого делится на 3");
        int countBook = 0;
        for (Book elemList : List) {
            if (elemList.getAuthor().length() % 3 == 0) {
                countBook++;
                System.out.println(elemList);
                break;
            }

        }

        System.out.println("9.а)Возвращаем все книги, длина автора которых делится на 3.");
        for (Book elemList : List) {
            if (elemList.getAuthor().length() % 3 == 0) {
                System.out.println(elemList);
            }
        }


        Person2 nikolay = new Person2("Nikolay", 26, true);
        Person2 stanislav = new Person2("Stanislav", 45, true);
        Person2 vlad = new Person2("Vlad", 20, true);
        Person2 gennadi = new Person2("Gennadi", 18, true);
        Person2 irina = new Person2("Irina", 25, false);
        Person2 natalia = new Person2("Natalia", 55, false);
        Person2 vera = new Person2("Vera", 50, false);
        List<Person2> personList = new ArrayList<>(Arrays.asList(nikolay, stanislav, vlad, gennadi, irina, natalia, vera));
        System.out.println("10. Вернуть всех военнообязанных мужчин (пол), которым меньше 27 и больше 18 " +
                "и имя которых начинается на 'Н'");
        for (Person2 elemPerson : personList) {
            if (elemPerson.getAge() > 18 && elemPerson.getAge() < 27 && elemPerson.isMale() == true && elemPerson.getName().contains("N")) {
                System.out.println(elemPerson);
            }
        }


        System.out.println("11. Найти средний возраст всех женщин.");
        int sumAge = 0;
        int countWomen = 0;
        for (int i = 0; i < personList.size(); i++) {
            if (!personList.get(i).isMale()) {
                countWomen++;
                sumAge = sumAge + personList.get(i).getAge();
            }
        }
        System.out.println(sumAge / countWomen);


    }
}
