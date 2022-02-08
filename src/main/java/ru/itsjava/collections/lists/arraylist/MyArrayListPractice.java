package ru.itsjava.collections.lists.arraylist;

public class MyArrayListPractice {

    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        MyArrayList list2 = new MyArrayList();
        System.out.println(list.size());
        list.add("Привет");
        list.add("Пока");
        System.out.println("После добавления двух элементов размер равен: " + list.size());
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        System.out.println("list.size() = " + list.size());
        System.out.println(list);
        System.out.println("list.isEmpty() = " + list.isEmpty());
        System.out.println("list2.isEmpty() = " + list2.isEmpty());
        list2.add("hello");
        System.out.println("list2.isEmpty() = " + list2.isEmpty());
        System.out.println("list2.contains(\"hello\") = " + list2.contains("hello"));
        System.out.println("list2.contains(\"helo\") = " + list2.contains("helo"));
        System.out.println("list2 = " + list2);
        list2.clear();
        System.out.println("list2 = " + list2);
        System.out.println("list = " + list);
        list.clear();
        System.out.println("list = " + list);


    }
}
