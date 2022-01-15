package ru.itsjava.strings;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class StringPractice {

    public static void main(String[] args) {
//        String name = "Vitaliy";
//        String copyName = "Vitaliy";
//        System.out.println("(name==copyName) = " + (name == copyName));
//        String constructorName = new String("Vitaliy");
//        System.out.println("(constructorName==name) = " + (constructorName == name));
//        String internConstructorName = constructorName.intern();
//        System.out.println("(internConstructorName==name) = " + (internConstructorName == name));

        String str = "Я строка";
        String str2 = "Я точка";
        String str3 = "Я точКа";
        System.out.println("str.length() = " + str.length());
        System.out.println("str.isEmpty() = " + str.isEmpty());
        System.out.println("str.equals(\"Я строкА\") = " + str.equals("Я строкА"));
        System.out.println("str.equalsIgnoreCase(\"Я строкА\") = " + str.equalsIgnoreCase("Я строкА"));
        String[] strs = str.split(" ");
        System.out.println("strs[0] = " + strs[0]);
        System.out.println("strs[1] = " + strs[1]);

//        for (int i = 0; i < 1_000_000; i++) {
//            str = str + "!";
//        }

//        StringBuilder builderStr = new StringBuilder(str);
//        for (int i = 0; i < 1_000_000; i++) {
//            builderStr.append("!");
//        }
//        System.out.println("builderStr.toString() = " + builderStr.toString());
        System.out.println("str.equals(str2) = " + str.equals(str2)); //сравнение посимвольно
        System.out.println("str2.equalsIgnoreCase(str3) = " + str2.equalsIgnoreCase(str3)); //сравнение посимвольно без учета регистра

        System.out.println("str.compareTo(str2) = " + str.compareTo(str2));//упорядочивет по алфавиту, лексиграфически и с учетом регистра
        System.out.println("str.getBytes(StandardCharsets.UTF_8) = " + str.getBytes(StandardCharsets.UTF_8));//кодирует строку в последовательность байтов
        System.out.println("str.toLowerCase(Locale.ROOT) = " + str.toLowerCase(Locale.ROOT));//приводит к нижнему регистру
        System.out.println("str.toUpperCase() = " + str.toUpperCase());//приводит к верхнему регистру
        System.out.println("str.charAt() = " + str.charAt(0));
        System.out.println("str.charAt() = " + str.charAt(5));//возвращает символ в строке по указанному индексу
        System.out.println("str.chars() = " + str.chars());
        System.out.println("str.codePointAt(0) = " + str.codePointAt(0));//возвращает «номер Unicode» символа с этим индексом
        System.out.println("str.codePointCount(0,5) = " + str.codePointCount(0, 5));
        System.out.println("str.contains() = " + str.contains("Я"));
        System.out.println("str.contains() = " + str.contains("строка"));//показывает содержит ли указанную подстроку или нет
        System.out.println("str.length() = " + str.length());// длина строки
        System.out.println("(str.indexOf(\"Я\")) = " + (str.indexOf("Я")));
        System.out.println("(str.indexOf(\"з\")) = " + (str.indexOf("з")));
        System.out.println("(str.substring(0, 4)) = " + (str.substring(0, 4)));
        System.out.println("(str.startsWith(\"Я\")) = " + (str.startsWith("Я")));
        System.out.println("(str.startsWith(\"Я стр\")) = " + (str.startsWith("Я стр")));
        System.out.println("(str.replaceAll(\"Я\", \"Это\")) = " + (str.replaceAll("Я", "Это")));
        System.out.println("(str) = " + (str));
        String str4 = "          Я Java      ";
        System.out.println("str4.trim() = " + str4.trim());//убирает пробелы в конце и в начале строки (если есть)
        System.out.println("str4 = " + str4);
        System.out.println("str.toCharArray() = " + str.toCharArray());
        String str5 = "Я великая и могучая Java, которая изменит весь мир";
        String[] strs2 = str5.split(" ");//разбивает строку по заданному символу
        System.out.println("strs2[0] = " + strs2[0]);
        System.out.println("strs2[1] = " + strs2[1]);
        System.out.println("strs2[3] = " + strs2[3]);


    }
}
