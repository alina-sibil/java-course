package lesson_12_stream;

import java.util.*;
import java.util.stream.Collectors;

public class StreamHomework {
    public static void main(String[] args) {
        Random random = new Random();

        // Создаем список из 20 случайных чисел 0–30
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            numbers.add(random.nextInt(31));
        }

        System.out.println("Исходный список: " + numbers);

        // Удалить дубликаты
        List<Integer> noDuplicates = numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Без дубликатов: " + noDuplicates);

        // Четные элементы в диапазоне 7–17 включительно
        List<Integer> evens7to17 = noDuplicates.stream()
                .filter(n -> n % 2 == 0 && n >= 7 && n <= 17)
                .collect(Collectors.toList());
        System.out.println("Четные [7–17]: " + evens7to17);

        // Каждый элемент умножить на 2
        List<Integer> multiplied = noDuplicates.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println("Умноженные на 2: " + multiplied);

        // Отсортировать и вывести первые 4 элемента
        List<Integer> first4 = noDuplicates.stream()
                .sorted()
                .limit(4)
                .collect(Collectors.toList());
        System.out.println("Первые 4 отсортированные: " + first4);

        // Количество элементов в стриме
        long count = noDuplicates.stream().count();
        System.out.println("Количество элементов: " + count);

        // Среднее арифметическое всех чисел
        OptionalDouble average = noDuplicates.stream()
                .mapToInt(Integer::intValue)
                .average();
        System.out.println("Среднее арифметическое: " + (average.isPresent() ? average.getAsDouble() : "нет элементов"));
    }
}
