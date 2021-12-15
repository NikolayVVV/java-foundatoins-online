package ru.itsjava.oop;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Birds {
    private final String family;
    private boolean isFly;

//    public Birds(String family, boolean isFly) {
//        this.family = family;
//        this.isFly = isFly;
//    }

    public String birdFamily() {
        return "family: " + family + " isFly: " + isFly;
    }
}
