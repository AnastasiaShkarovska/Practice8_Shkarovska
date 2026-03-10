package ua.university;
import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List rawList = new ArrayList();
        rawList.add("Hi");
        rawList.add(123);

        String first = (String) rawList.get(0);
        System.out.println(first);

        try {
            String second = (String) rawList.get(1); // буде помилка
            System.out.println(second);
        } catch (ClassCastException e) {
            System.out.println("Помилка: не можна число перетворити на String");
        }

        //List<String>
        List<String> stringList = new ArrayList<>();
        stringList.add("Hi");
        String value = stringList.get(0);
        System.out.println(value);

        // Raw types небезпечні, бо дозволяють додавати елементи різних типів.
        // Generics забезпечують перевірку типів на етапі компіляції і забирають потребу в кастах.
    }
}