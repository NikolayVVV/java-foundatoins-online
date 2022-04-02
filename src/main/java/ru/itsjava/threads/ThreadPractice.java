package ru.itsjava.threads;

import java.util.Scanner;

public class ThreadPractice {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());

//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 2_000_000_000; j++) {
//            }
//            System.out.println("A");
//        }

//        for (int i = 0; i < 10; i++) {
//            Thread.sleep(2000L);
//            System.out.println("A");
//        }
//
//        for (int i = 0; i < 10; i++) {
//            Thread.sleep(2000L);
//            System.out.println("B");
//        }

        //1  2  3  4  5  6  7  8  9  10  11  12  13  14  15
        //   A     A     A     A     A
        //      B        B        B          B           B


//        PrinterThread printerThreadA = new PrinterThread("A", 2000L);
//        PrinterThread printerThreadB = new PrinterThread("B", 3000L);
//        PrinterRunnable printerRunnable = new PrinterRunnable("B", 3000L);
//        Thread threadB = new Thread(printerRunnable);
//        System.out.println("start");
//        printerThreadA.start();
//        threadB.start();
//        threadB.join();
//        System.out.println("end");


        //1   2   3   4 5  6   7 8  9     10   11   12   13   14   15  16  17  18 19  20  21 22 23 24 25
        //       yes      yes      yes              yes           yes
        //             no                 no                       no                 no              no

        //через класс Thread
//        PrinterThread printerThread1 = new PrinterThread("Yes", 3000l);
//        printerThread1.start();
//        //через интерфейс Runnable
//        PrinterRunnable printerRunnable1 = new PrinterRunnable("No", 5000L);
//        Thread thread2 = new Thread(printerRunnable1);
//        thread2.start();

        //программа с выводом сообщения 1 раз в 5 секунд

        Scanner scanner = new Scanner(System.in);
        String message = scanner.next();
        PrinterThread printerThreadProgram = new PrinterThread(message, 5000L);
        printerThreadProgram.start();


    }
}
