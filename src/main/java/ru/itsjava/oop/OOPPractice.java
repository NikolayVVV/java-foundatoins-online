package ru.itsjava.oop;

public class OOPPractice {
    public static void main(String[] args) {
        Telephone phone = new IPhone();
        System.out.println("phone.toString() = " + phone.toString());

        Telephone phone2 = new IPhone();
        System.out.println("phone2.toString() = " + phone2.toString());

        //Птицы
        Birds vorona = new Crow();
        Birds popugai = new Parrot();
        System.out.println(vorona.birdFamily());
        System.out.println(popugai.birdFamily());

        //Машины
        Cars ziguli = new PassangerCar();
        Cars kamaz = new Truck();
        System.out.println(ziguli.modelOfCars());
        System.out.println(kamaz.modelOfCars());
        System.out.println("Жигули ломается около " + ziguli.breakDownInTheYear() + " раз в году");
        System.out.println("Камаз ломается примерно " + kamaz.breakDownInTheYear() + " раз в году");

    }
}
