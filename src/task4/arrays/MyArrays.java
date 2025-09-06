package task4.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MyArrays {
    public static void main(String[] args) {
        checkNumberInArray();
        deleteNumberFromArray();
        arrayStatistics();
        compareAverages();
    }

    /*
    0) Создайте массив целых чисел. Напишите программу, которая выводит
       сообщение о том, входит ли заданное число в массив или нет.
       Пусть число для поиска задается с консоли (класс Scanner).
     */
    public static void checkNumberInArray() {
        Scanner input = new Scanner(System.in);

        int[] numbers = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        System.out.print("Enter a number to search: ");
        int searchValue = input.nextInt();

        boolean found = false;
        for (int number : numbers) {
            if (number == searchValue) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("The number " + searchValue + " IS in the array.");
        } else {
            System.out.println("The number " + searchValue + " is NOT in the array.");
        }
        System.out.println("-".repeat(40));
    }

    /*
    1) Создайте массив целых чисел. Удалите все вхождения заданного
       числа из массива.
       Пусть число задается с консоли (класс Scanner). Если такого числа нет -
       выведите сообщения об этом.
       В результате должен быть новый массив без указанного числа.
     */
    public static void deleteNumberFromArray() {
        Scanner input = new Scanner(System.in);

        int[] numbers = {1, 2, 3, 2, 4, 5, 2, 6};

        System.out.println("Original array: " + Arrays.toString(numbers));
        System.out.print("Enter a number to delete: ");
        int toDelete = input.nextInt();

        // Count occurrences
        int count = 0;
        for (int n : numbers) {
            if (n == toDelete) count++;
        }

        if (count == 0) {
            System.out.println("The number " + toDelete + " is NOT in the array.");
        } else {
            int[] newArray = new int[numbers.length - count];
            int index = 0;
            for (int n : numbers) {
                if (n != toDelete) {
                    newArray[index++] = n;
                }
            }
            System.out.println("Array without " + toDelete + ": " + Arrays.toString(newArray));
        }
        System.out.println("-".repeat(40));
    }

    /*
    2) Создайте и заполните массив случайными числами и выведите
       максимальное, минимальное и среднее значение.
       Для генерации случайного числа используйте метод Math.random().
       Пусть будет возможность создавать массив произвольного размера.
       Пусть размер массива вводится с консоли.
     */
    public static void arrayStatistics() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = input.nextInt();

        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100); // числа от 0 до 99
        }

        System.out.println("Generated array: " + Arrays.toString(numbers));

        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int n : numbers) {
            if (n < min) min = n;
            if (n > max) max = n;
            sum += n;
        }

        double avg = (double) sum / numbers.length;

        System.out.println("Min value = " + min);
        System.out.println("Max value = " + max);
        System.out.println("Average value = " + avg);
        System.out.println("-".repeat(40));
    }

    /*
    3) Создайте 2 массива из 5 чисел.
       Выведите массивы на консоль в двух отдельных строках.
       Посчитайте среднее арифметическое элементов каждого массива и
       сообщите, для какого из массивов это значение оказалось больше
       (либо сообщите, что их средние арифметические равны).
     */
    public static void compareAverages() {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {10, 20, 30, 40, 50};

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));

        double avg1 = 0;
        for (int n : array1) avg1 += n;
        avg1 /= array1.length;

        double avg2 = 0;
        for (int n : array2) avg2 += n;
        avg2 /= array2.length;

        if (avg1 > avg2) {
            System.out.println("Average of Array 1 is greater (" + avg1 + " > " + avg2 + ")");
        } else if (avg2 > avg1) {
            System.out.println("Average of Array 2 is greater (" + avg2 + " > " + avg1 + ")");
        } else {
            System.out.println("Averages are equal (" + avg1 + " = " + avg2 + ")");
        }
        System.out.println("-".repeat(40));
    }
}
