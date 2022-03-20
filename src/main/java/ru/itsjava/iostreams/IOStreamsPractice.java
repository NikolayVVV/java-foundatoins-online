package ru.itsjava.iostreams;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IOStreamsPractice {

    public static void main(String[] args) {
//        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
//        try {
//            String input = console.readLine();
//            System.out.println("Ваш input равен " + input);
//        } catch (IOException exception) {
//            exception.printStackTrace();
//        }finally {
//            try {
//                console.close();
//            } catch (IOException exception) {
//                exception.printStackTrace();
//            }
//        }

//        //try with resources
//        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {
//            String input = console.readLine();
//            System.out.println("Ваш input равен " + input);
//        } catch (IOException exception) {
//            exception.printStackTrace();
//        }

//        File file = new File("src/main/resources/file.txt");
//
//        try (PrintWriter printWriter = new PrintWriter(file)) {
//            printWriter.println("Строка1");
//            printWriter.println("Строка2");
//            printWriter.println("Строка3");
//        } catch (FileNotFoundException fileNotFoundException) {
//            fileNotFoundException.printStackTrace();
//        }
//
//        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
//            String input = null;
//            while ((input = reader.readLine()) != null) {
//                System.out.println("reader.readLine() = " + input);
//            }
//        } catch (IOException exception) {
//            exception.printStackTrace();
//        }

        //ЗАДАНИЕ: Даны 2 файла.......
        //Создали файл 2
        File file2 = new File("src/main/resources/file2.txt");
        try (PrintWriter printWriter = new PrintWriter(file2)) {
            printWriter.println("Текст и информация файла 2");
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        //Создали файл 3
        File file3 = new File("src/main/resources/file3.txt");
        try (PrintWriter printWriter = new PrintWriter(file3)) {
            printWriter.println("Текст и информация файла 3");
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        //Считываем из файлов содержимое
        //файл 2
        Set<String> files = new HashSet();
        try (BufferedReader reader = new BufferedReader(new FileReader(file3))) {
            String file2New = null;
            while ((file2New = reader.readLine()) != null) {
                System.out.println("Содержимое файла 2 " + file2New);
                files.add(file2New);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        //файл 3
        Set<String> files2 = new HashSet();
        try (BufferedReader reader = new BufferedReader(new FileReader(file2))) {
            String file3New = null;
            while ((file3New = reader.readLine()) != null) {
                System.out.println("Содержимое файла 3 " + file3New);
                files2.add(file3New);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        //перезаписываем файл 2
        //PrintWriter - записывает, а BufferedReader - считывает

        try (PrintWriter printWriter = new PrintWriter(file2)) {
            printWriter.println(files);
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        //перезаписываем файл 3

        try (PrintWriter printWriter = new PrintWriter(file3)) {
            printWriter.println(files2);
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }


    }
}
