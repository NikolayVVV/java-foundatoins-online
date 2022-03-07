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
        Map<Man, Fruit> customers = new HashMap<>();//0. Создать экземпляр HashMap (Ключ Имя покупателя Значение Фрукт)
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
        Fruit watermelon = new Fruit("watermelon", 2000);

        customers.put(nikolay, banana);
        customers.put(vlad, lime);
        customers.put(irina, melon);
        customers.put(stanislav, pineapple);
        customers.put(roman, peach);
        customers.put(roman, watermelon);
        System.out.println("customers = " + customers);
        Map<Man, Fruit> menWithFruits = new HashMap<>();
        menWithFruits.put(ivanov, banana);
        menWithFruits.put(sidorov, lime);
        menWithFruits.put(javov, watermelon);
        customers.putAll(menWithFruits);//б). В новый экземпляр HashMap добавим старую карту
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
        for (Map.Entry<Man, Fruit> pair : customers.entrySet()) {
            System.out.println("Key: " + pair.getKey());
        }

        //б) Вывести все значения (все фрукты)
        System.out.println("---------------------");
        for (Man keyCustomers : customers.keySet()) {
            System.out.println("Value: " + customers.get(keyCustomers));
        }

        //в) Вывести все ключи и значения с помощью entrySet (всех покупателей и фрукты)
        for (Map.Entry<Man, Fruit> pair : customers.entrySet()) {
            System.out.println("Key: " + pair.getKey() + " value: " + pair.getValue());
        }

        System.out.println("6. Отфильтровать Map вернуть записи по некоторому условию:");
        {
            int count = 0;
            for (Map.Entry<Man, Fruit> pair : customers.entrySet()) {
                if (pair.getKey().getName().length() > 5)
                    count++;
            }
            System.out.println("Количество ключей длина которых больше 5: " + count);
        }
        System.out.println("----------------------------------------------------");
        System.out.println("б) Условие на значение: ");
        {
            int count = 0;
            for (Map.Entry<Man, Fruit> pair : customers.entrySet()) {
                if (pair.getValue().getName().equals("melon"))
                    count++;
            }
            System.out.println("количество фруктов, которые равны дыне: " + count);
        }
        System.out.println("----------------------------------------------------");
        System.out.println("7. Пропустить несколько элементов ");
        System.out.println("а)Пропустить 2 элемента, значения которых Арбуз, все остальные вывести: ");
        for (Map.Entry<Man, Fruit> pair : customers.entrySet()) {
            if (pair.getValue().getName().equals("watermelon")) {
                continue;
            }
            System.out.println(pair.getValue().getName());
        }
        System.out.println("б) Вывести все кроме 2 элементов, ключи которых начинаются на И: ");
        for (Map.Entry<Man, Fruit> pair : customers.entrySet()) {
            if (pair.getKey().getName().contains("И")) {
                continue;
            }
            System.out.println(pair.getKey().getName());
        }
        System.out.println("8.а) Возвращаем элемент значение которого арбуз или Арбуз или АРбУз.");
        for (Map.Entry<Man, Fruit> pair : customers.entrySet()) {
            if (pair.getValue().getName().equalsIgnoreCase("watermelon")) {
                System.out.println(pair.getValue().getName() + pair.getKey());
            }
        }
        Map<Man, Fruit> mensWithFruits2 = new HashMap<>();
        System.out.println("9.а) Возвращаем все элементы в другую карту, которые являются дыней или арбузом");
        for (Map.Entry<Man, Fruit> pair : customers.entrySet()) {
            if (pair.getValue().getName().equalsIgnoreCase("watermelon") ||
                    pair.getValue().getName().equalsIgnoreCase("melon")) {
                mensWithFruits2.put(pair.getKey(), pair.getValue());
            }
        }
        System.out.println("mensWithFruits2 = " + mensWithFruits2);
        System.out.println("mensWithFruits2.size() = " + mensWithFruits2.size());
        int count = 0;
        int sum = 0;
        for (Map.Entry<Man, Fruit> pair2 : mensWithFruits2.entrySet()) {
            count++;
            sum = sum + pair2.getValue().getWeight();
        }
        System.out.println("10. Найти средний вес всех фруктов: " + sum / count);


    }
}
