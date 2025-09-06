package task3.operators;

import java.util.Scanner;

public class MyOperators {
    public static void main(String[] args) {
        useLambdaSwitch();
        useIfElse();
        checkEvenNumber();
        checkTemperature();
        rainbowColor();
    }

    /*
    1) Написать программу для вывода названия поры года по номеру месяца.
    При решении используйте оператор switch-case
     */
    public static void useLambdaSwitch() {
        int month = 11;

        switch (month) {
            case 12, 1, 2 -> System.out.println("WINTER");
            case 3, 4, 5 -> System.out.println("SPRING");
            case 6, 7, 8 -> System.out.println("SUMMER");
            case 9, 10, 11 -> System.out.println("AUTUMN");
            default -> System.out.println("The number can be only 1-12.");
        }
        System.out.println("-".repeat(20));
    }

    /*
    2) Написать программу для вывода названия поры года по номеру месяца.
      При решении используйте оператор if-else-if.
     */
    public static void useIfElse() {
        int month = 6;

        if (month == 12 || month == 1 || month == 2) {
            System.out.println("WINTER");
        } else if (month == 3 || month == 4 || month == 5) {
            System.out.println("SPRING");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("SUMMER");
        } else if (month == 9 || month == 10 || month == 11) {
            System.out.println("AUTUMN");
        } else {
            System.out.println("The number can be only 1-12.");
        }
        System.out.println("-".repeat(20));
    }

    /*
    3) Напишите программу, которая будет принимать на вход число и на
    выход будет выводить сообщение четное число или нет.
    Для определения четности числа используйте операцию получения
    остатка от деления - операция выглядит так: '% 2').
     */
    public static void checkEvenNumber() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int value = input.nextInt();

        if (value % 2 == 0) {
            System.out.println("Number " + value + " is EVEN.");
        } else {
            System.out.println("Number " + value + " is ODD.");
        }
        System.out.println("-".repeat(20));
    }

    /*
    4) Для введенного числа t (температура на улице) вывести
    Если t>–5, то вывести «Тепло».
    Если –5>= t > –20, то вывести «Нормально».
    Если –20>= t, то вывести «Холодно».
     */
    public static void checkTemperature() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter outdoor temperature (integer): ");
        int t = input.nextInt();

        if (t > -5) {
            System.out.println("Warm");
        } else if (t <= -5 && t > -20) {
            System.out.println("Normal");
        } else {
            System.out.println("Cold");
        }
        System.out.println("-".repeat(20));
    }

    /*
    5) По введенному номеру определить цвет радуги (1 –
    красный, 4 – зеленый и т. д.).
     */
    public static void rainbowColor() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter rainbow color number (1-7): ");
        int colorNumber = input.nextInt();

        switch (colorNumber) {
            case 1 -> System.out.println("Red");
            case 2 -> System.out.println("Orange");
            case 3 -> System.out.println("Yellow");
            case 4 -> System.out.println("Green");
            case 5 -> System.out.println("Light Blue");
            case 6 -> System.out.println("Blue");
            case 7 -> System.out.println("Violet");
            default -> System.out.println("Error: number must be from 1 to 7.");
        }
        System.out.println("-".repeat(20));
    }
}