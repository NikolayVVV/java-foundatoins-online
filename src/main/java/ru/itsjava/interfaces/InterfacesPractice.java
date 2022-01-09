package ru.itsjava.interfaces;

public class InterfacesPractice {

    public static void main(String[] args) {
//        Creatable khotabich = new Gin();
//        khotabich.createWish();
//
//        Creatable badGin = new BadGin();
//        badGin.createWish();
//        System.out.println();
//        khotabich.canYouCreateWish();
//        badGin.canYouCreateWish();

        //ДОМАШКА
        Runnable runningPerson = new Man();
        Swimable swimmingPerson = new Man();
        Walkable walkingPerson = new Man();
        Flyable flyingPerson = new Man();
        Walkable bobik = new Dog();
        Runnable cat = new Cat();
        Flyable woody = new Bird();
        Swimable nemo = new Fish();
        runningPerson.run();
        System.out.println("Человек максимально может пробежать " + runningPerson.maxRunDistance() + " км");
        swimmingPerson.swim();
        System.out.println("Человек максимально может проплыть " + swimmingPerson.maxSwimSpeed());
        walkingPerson.walk();
        flyingPerson.fly();
        System.out.println(flyingPerson.flyMaxDistance());
        bobik.walk();
        cat.run();
        System.out.println("Кошка максимально пробежит " + cat.maxRunDistance() + " метров");
        woody.fly();
        System.out.println(woody.flyMaxDistance());
        nemo.swim();
        System.out.println("Рыба максимально проплывет " + nemo.maxSwimSpeed() + " метров");

        Eatable eatingPerson = new Man();
        Talkable talkingPerson = new Man();
        Eatable eatingCow = new Cow();
        Talkable talkingCow = new Cow();
        Eatable eatingPlant = new Plant();
        Talkable talkingPlant = new Plant();
        eatingPerson.eat();
        talkingPerson.talk();
        eatingCow.eat();
        talkingCow.talk();
        eatingPlant.eat();
        talkingPlant.talk();


    }
}
