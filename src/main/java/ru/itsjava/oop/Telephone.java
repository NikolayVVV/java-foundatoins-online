package ru.itsjava.oop;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Telephone {
    private final String brand;
    private boolean isHommey;

//    public Telephone(String brand) {
//        this.brand = brand;
//    }
//
//    public Telephone(String brand, boolean isHommey) {
//        this.brand = brand;
//        this.isHommey = isHommey;
//    }
//
//    public String toString() {
//        return "{ brand: " + brand + " isHommey: " + isHommey + "}";
//    }
}
