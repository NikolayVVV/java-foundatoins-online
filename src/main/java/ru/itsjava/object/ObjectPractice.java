package ru.itsjava.object;

public class ObjectPractice {

    public static void main(String[] args) {

        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println(obj1 == obj2);
        System.out.println("obj1.equals(obj2) = " + obj1.equals(obj2));
        obj2 = obj1;
        System.out.println("obj1.equals(obj2) = " + obj1.equals(obj2));

        Dog gurka = new Dog("Журка", 4);
        Dog gurka2 = new Dog("Журка", 4);

        Dog murka = new Dog("Мурка", 4);

        System.out.println("gurka.equals(gurka2) = " + gurka.equals(gurka2));
        System.out.println("gurka.equals(murka) = " + gurka.equals(murka));
        System.out.println("gurka.equals(obj1) = " + gurka.equals(obj1));
        System.out.println("gurka.toString() = " + gurka.toString());
        System.out.println(gurka);
        System.out.println("gurka.getNickname() = " + gurka.getNickname());

        //Mouse
        Mouse jerry = new Mouse("серый", 2);
        Mouse mikkiMouse = new Mouse("коричневый", 1);
        Mouse ratatui = new Mouse("серый", 2);
        System.out.println("jerry.equals(mikkiMouse) = " + jerry.equals(mikkiMouse));
        System.out.println("jerry.equals(ratatui) = " + jerry.equals(ratatui));
        System.out.println(jerry.toString());
        System.out.println(mikkiMouse.toString());

        //Men and Woman
        Men husband = new Men("hsdbfhds", 45);
        Women wife = new Women("dfs", 56);
        husband.printAgeMen();
        husband.setName("Антонио Бандерас");
        System.out.println("husband.getName() = " + husband.getName());
        husband.setAge(45);
        System.out.println("husband.getAge() = " + husband.getAge());
        wife.setAge(55);
        wife.setName("Дженнифер Лопес");
        System.out.println("wife.getName() = " + wife.getName());
        System.out.println("wife.getAge() = " + wife.getAge());
        husband.printAgeMen();
        wife.printAge();
    }
}
