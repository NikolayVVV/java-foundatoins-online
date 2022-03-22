package ru.itsjava.iostreams;

import ru.itsjava.collections.maps.Man;

import java.io.*;

public class SerializationPractice {

    public static void main(String[] args) {
//        Man man = new Man("Vitalik");
//
//        try (ObjectOutputStream outputStream =
//                     new ObjectOutputStream(new FileOutputStream("src/main/resources/man.out"))) {
//            outputStream.writeObject(man);
//        } catch (IOException exception) {
//            exception.printStackTrace();
//        }


//        try (ObjectInputStream inputStream =
//                     new ObjectInputStream(new FileInputStream("src/main/resources/man.out"))) {
//            Object obj = inputStream.readObject();
//            Man man = (Man) obj;
//            System.out.println("man = " + man);
//        } catch (IOException | ClassNotFoundException exception) {
//            exception.printStackTrace();
//        }

//        User user = new User("nikolay95", "12345");//создали объект
//        try (ObjectOutputStream outputStream = //сериализуем его с помощью ObjectOutputStream
//                     new ObjectOutputStream(new FileOutputStream("src/main/resources/user.out"))) {
//            outputStream.writeObject(user);
//        } catch (IOException exception) {
//            exception.printStackTrace();
//        }

        //далее идет десериализация и поле password ссылается на null, потому как
        // у этого поля было ключевое слово transient
        try (ObjectInputStream inputStream =
                     new ObjectInputStream(new FileInputStream("src/main/resources/user.out"))) {
            Object obj = inputStream.readObject();
            User user = (User) obj;
            System.out.println("user = " + user);
            System.out.println("user.getLogin() = " + user.getLogin());
            System.out.println("user.getPassword() = " + user.getPassword());
        } catch (IOException | ClassNotFoundException exception) {
            exception.printStackTrace();
        }


    }
}
