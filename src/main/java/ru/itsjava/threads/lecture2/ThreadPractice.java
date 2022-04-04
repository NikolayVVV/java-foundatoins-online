package ru.itsjava.threads.lecture2;

public class ThreadPractice {

    public static void main(String[] args) {
//        Runnable anonymousRunnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Привет из анонимного класса");
//            }
//        };
//
//        anonymousRunnable.run();//здесь мы просто вызываем метод у экземпляра класса
//
//        Thread thread = new Thread(anonymousRunnable);//здесь через класс Thread и туда
//        // помещаем экземпляр анонимного класса
//        thread.start();
//
//        Runnable functionalRunnable = () -> System.out.println("Привет из функционального программирования");
//        new Thread(functionalRunnable).start();

//        new Thread(() -> {
//            for (int i = 0; i < 5; i++) {
//                try {
//                    Thread.sleep(3000L);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println("Привет из быстрого потока");
//            }
//        }).start();

//        Runnable runnable = () -> {
//            for (int i = 0; i < 5; i++) {
//                try {
//                    Thread.sleep(3000L);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println("Привет после сна");
//            }
//        };
//        Thread thread1 = new Thread(runnable);
//        thread1.setDaemon(false);
//        thread1.start();
//
//        System.out.println("End main thread");

        //1. Создать поток реализовав интерфейс Runnable (с помощью лямбда выражения) И вывести "Привет я Runnable"
        Runnable runnable = () -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Привет, я Runnable");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();

        //2. Создать поток реализовав интерфейс Runnable (с помощью лямбда выражения)
        // который печатает раз в 4 секунда "Привет я проснулся после 4 секунд" И сделать его демоном.
        Runnable runnable1 = () -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Привет, я проснулся после 4 секунд");
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread1 = new Thread(runnable1);
        thread1.setDaemon(true);
        thread1.start();

    }
}
