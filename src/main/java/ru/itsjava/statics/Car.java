package ru.itsjava.statics;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Car {
    public final String brand;
    public final String colour;
    public static double priceCar = 100_000.0;

//    public void setbrand(String s) {
//        this.brand = s;
//    }
}
