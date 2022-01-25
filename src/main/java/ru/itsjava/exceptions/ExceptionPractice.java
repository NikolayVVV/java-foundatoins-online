package ru.itsjava.exceptions;

import java.util.Scanner;

public class ExceptionPractice {

    public static void main(String[] args) throws Exception {
        //throw new RuntimeException("My runtime exception");
//        try {
//            throw new Exception();
//        } catch (Exception e) {
//            System.out.println("!!!! Exception. Be careful.!!!!");
//            e.printStackTrace();
//        }

//        try {
//            System.out.println("Begin");
////            throw new Exception();
//        } catch (Exception e) {
//            System.out.println("CATCH");
//        } finally {
//            System.out.println("FINALLY");
//        }
//
//        System.out.println("END");

//        try {
//            throw new RuntimeException();
//        } catch (RuntimeException runtimeException) {
//            System.out.println("Runtime exception");
//        } catch (Throwable throwable) {
//            System.out.println("Throwable");
//        }

//        Calculator calculator = new Calculator();
//
//        System.out.println("calculator.Division(5,3) = " + calculator.Division(5,3));
//
//        try {
//            System.out.println("calculator.Division(5,0) = " + calculator.Division(5, 0));
//        }catch(CalculatorException ce){
//            System.out.println("Вы ввели что-то не то");
//            ce.printStackTrace();
//        }
        Person nikolay = new Person("Nikolay", 26);
        nikolay.AgeNotValid(155);


    }
}
