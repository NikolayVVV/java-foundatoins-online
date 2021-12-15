package ru.itsjava.oop;

public class Truck extends Cars {

    public Truck() {
        super("Камаз", "5490", false);
    }

    @Override
    public int breakDownInTheYear() {
        return 5;
    }
}
