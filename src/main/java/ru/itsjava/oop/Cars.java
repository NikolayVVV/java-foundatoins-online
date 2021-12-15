package ru.itsjava.oop;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Cars {
    private final String brand;
    private final String model;
    private boolean isBusinessClass;

//    public Cars(String brand, String model, boolean isBusinessClass) {
//        this.brand = brand;
//        this.model = model;
//        this.isBusinessClass = isBusinessClass;
//    }

    public String modelOfCars() {
        return "марка: " + brand + ", модель: " + model + ", бизнес класс: " + isBusinessClass;
    }

    public int breakDownInTheYear() {
        return 0;
    }

}
