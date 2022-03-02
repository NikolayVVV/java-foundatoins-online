package ru.itsjava.collections.maps;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {
        Map<Man, String> men = new HashMap<>();
        Man ivanov = new Man("Иванов");
        Man sidorov = new Man("Сидоров");
        Man javov = new Man("Джавов");

        men.put(ivanov, "футболка");
        men.put(sidorov, "свитшот");
        men.put(javov, "свитер");
//
//        for (Map.Entry<Man, String> pair : men.entrySet()) {
//            System.out.println(pair.getKey() + ": " + pair.getValue());
//        }
//
//        System.out.println("---------------------");
//        for (Man keyMan : men.keySet()) {
//            System.out.println(keyMan + ": " + men.get(keyMan));
//        }
//
//        System.out.println("men.remove(ivanov) = " + men.remove(ivanov));
//        System.out.println("After delete ivanov");
//        for (Man keyMan : men.keySet()) {
//            System.out.println(keyMan + ": " + men.get(keyMan));
//        }
//
//        System.out.println("men.size() = " + men.size());
//        System.out.println("men.isEmpty() = " + men.isEmpty());
//        System.out.println("men.replace(javov,\"свитер\",\"перчатки\") = " + men.replace(javov, "свитер", "перчатки"));
//        System.out.println("men.get(javov) = " + men.get(javov));
//        men.clear();
//        System.out.println("men.size() = " + men.size());

        //Фрукты
        Map<Man, String> customers = new HashMap<>();//0. Создать экземпляр HashMap (Ключ Имя покупателя Значение Фрукт)
        Man nikolay = new Man("Николай");
        Man vlad = new Man("Влад");
        Man irina = new Man("Ирина");
        Man stanislav = new Man("Стас");
        Man roman = new Man("Роман");
        Fruit banana = new Fruit("banana", 200);
        Fruit lime = new Fruit("lime", 100);
        Fruit melon = new Fruit("melon", 400);
        Fruit pineapple = new Fruit("pineapple", 1150);
        Fruit peach = new Fruit("peach", 1500);
        customers.put(nikolay, banana.getName() + " " + banana.getWeight());//1.Вставка элементов: а). Добавить 5 фруктов
        customers.put(vlad, lime.getName() + " " + lime.getWeight());
        customers.put(irina, melon.getName() + " " + melon.getWeight());
        customers.put(stanislav, pineapple.getName() + " " + pineapple.getWeight());
        customers.put(roman, peach.getName() + " " + peach.getWeight());
        System.out.println("customers = " + customers);
        customers.putAll(men);//б). В новый экземпляр HashMap добавим старую карту
        System.out.println("customers = " + customers);
        System.out.println("customers.get(irina) = " + customers.get(irina));//2. Получение элемента по ключу
        // (Получить любой фрукт по покупателю)
        System.out.println("customers.remove(\"stanislav\") = "
                + customers.remove(stanislav));//3. Удаление элемента
        //а). Удалить любой фрукт
        System.out.println("customers.containsKey(stanislav) = " //4. Проверка на наличие ключ и значение
                + customers.containsKey(stanislav));//(Есть ли покупатель с таким фруктом)

        //5. Вывод Map на экран:
        //a) Вывести все ключи (всех покупателей)
        for (Map.Entry<Man, String> pair : customers.entrySet()) {
            System.out.println("Key: " + pair.getKey());
        }

        //б) Вывести все значения (все фрукты)
        System.out.println("---------------------");
        for (Man keyCustomers : customers.keySet()) {
            System.out.println("Value: " + customers.get(keyCustomers));
        }

        //в) Вывести все ключи и значения с помощью entrySet (всех покупателей и фрукты)
        for (Map.Entry<Man, String> pair : customers.entrySet()) {
            System.out.println("Key: " + pair.getKey() + " value: " + pair.getValue());
        }


    }
}
