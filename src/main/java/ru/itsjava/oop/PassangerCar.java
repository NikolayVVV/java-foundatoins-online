package ru.itsjava.oop;

public class PassangerCar extends Cars{

    public PassangerCar(){
        super("Жигули", "2115", false);
    }

    @Override
    public int breakDownInTheYear() {
        return 15;
    }
}
