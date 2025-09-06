package task3.operators;

import java.util.Scanner;

public class MyCycles {
    public static void main(String[] args) {
        printOddNumbers();
        printFrom5To1();
        printSumNumbers();
        printSevens();
        printNumbers();
        printSquares();
    }

    /*
    1) При помощи цикла for вывести на экран нечетные числа от 1 до 99.
       При решении используйте операцию инкремента (++).
     */
    public static void printOddNumbers() {
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("-".repeat(20));
    }

    /*
    2) Необходимо вывести на экран числа от 5 до 1.
       При решении используйте операцию декремента (--).
     */
    public static void printFrom5To1() {
        for (int i = 5; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("-".repeat(20));
    }

    /*
    3) Напишите программу, где пользователь вводит любое целое
       положительное число. А программа суммирует все числа от 1 до
       введенного пользователем числа.
       Для ввода числа воспользуйтесь классом Scanner.
     */
    public static void printSumNumbers() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("The sum from 1 to " + n + " is " + sum);
        System.out.println("-".repeat(20));
    }

    /*
    4) Необходимо, чтоб программа выводила на экран вот такую
       последовательность:
       7 14 21 28 35 42 49 56 63 70 77 84 91 98
       В решении используйте цикл while.
     */
    public static void printSevens() {
        int number = 7;

        while (number <= 98) {
            System.out.print(number + " ");
            number += 7;
        }
        System.out.println();
        System.out.println("-".repeat(20));
    }

    /*
    5) Вывести 10 первых чисел последовательности 0, -5, -10, -15 ...
     */
    public static void printNumbers() {
        int number = 0;
        int counter = 0;

        while (counter < 10) {
            System.out.print(number + " ");
            number -= 5;
            counter++;
        }
        System.out.println();
        System.out.println("-".repeat(20));
    }

    /*
    6) Составьте программу, выводящую на экран квадраты чисел
       от 10 до 20 включительно.
     */
    public static void printSquares() {
        for (int i = 10; i <= 20; i++) {
            int square = i * i;
            System.out.println("Square of " + i + " = " + square);
        }
        System.out.println("-".repeat(20));
    }
}