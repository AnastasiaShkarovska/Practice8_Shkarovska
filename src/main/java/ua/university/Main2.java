package ua.university;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main2 {

    public static <T> T firstOrNull(List<T> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static double sum(List<? extends Number> numbers) {
        double result = 0;
        for (Number number : numbers) {
            result += number.doubleValue();
        }
        return result;
    }

    public static void addDefaultIds(List<? super Integer> list) {
        list.add(10);
        list.add(20);
        list.add(30);
    }

    //  Перевірка роботи методів
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Katya", "Marta", "Max");
        System.out.println("Перший елемент: " + firstOrNull(names));

        List<String> emptyList = new ArrayList<>();
        System.out.println("Порожній список: " + firstOrNull(emptyList));

        List<Integer> intNumbers = Arrays.asList(60, 27, 35);
        List<Double> doubleNumbers = Arrays.asList(1.5, 2.5, 3.0);

        System.out.println("Сума intNumbers: " + sum(intNumbers));
        System.out.println("Сума doubleNumbers: " + sum(doubleNumbers));

        List<Number> ids1 = new ArrayList<>();
        addDefaultIds(ids1);
        System.out.println("ids1: " + ids1);

    }
}