package ru.itsjava.enums;

public enum DayOfWeek {
    SUNDAY("Воскреенье"), MONDAY("Понедельник"), TUESDAY("Вторник"),
    WEDNESDAY("Среда"), THURSDAY("Четверг"), FRIDAY("Пятница"),
    SATURDAY("Суббота");

    private final String translation;

    DayOfWeek(String translation) {
        this.translation = translation;
    }

    @Override
    public String toString() {
        return "DayOfWeek { " + this.name() + " ; " +
                "translation='" + translation + "}";
    }
}
