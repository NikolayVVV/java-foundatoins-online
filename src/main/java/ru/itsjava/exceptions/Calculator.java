package ru.itsjava.exceptions;

public class Calculator {

    public int Division(int num, int divider) throws ArithmeticException {
        try {
            return num / divider;
        } catch (ArithmeticException arithmeticException) {
            throw new CalculatorException("Деление на ноль");
        }
    }
}
