package task5.multidimensionalarrays;

import java.util.Scanner;

public class MyMultiArrays3D {

    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {
        increase3DArray();
    }

    /*
    0) Создать трехмерный массив из целых чисел.
       С помощью циклов "пройти" по всему массиву и увеличить каждый элемент на заданное число.
       Пусть число, на которое будет увеличиваться каждый элемент, задается из консоли.
     */
    public static void increase3DArray() {
        int size = 3;
        int[][][] cube = new int[size][size][size];

        int val = 1;
        for (int z = 0; z < size; z++) {
            for (int y = 0; y < size; y++) {
                for (int x = 0; x < size; x++) {
                    cube[z][y][x] = val++;
                }
            }
        }

        System.out.println("Initial 3D array:");
        printCube(cube);

        System.out.print("Enter a number to add to each element: ");
        while (!INPUT.hasNextInt()) { INPUT.next(); System.out.print("Please enter an integer: "); }
        int add = INPUT.nextInt();

        // Классический тройной цикл — увеличиваем каждый элемент
        for (int z = 0; z < cube.length; z++) {
            for (int y = 0; y < cube[z].length; y++) {
                for (int x = 0; x < cube[z][y].length; x++) {
                    cube[z][y][x] += add;
                }
            }
        }

        System.out.println("3D array after adding " + add + ":");
        printCube(cube);
        System.out.println("-".repeat(60));
    }

    private static void printCube(int[][][] cube) {
        for (int level = 0; level < cube.length; level++) {
            System.out.println("Level " + level + ":");
            for (int[] row : cube[level]) {
                for (int v : row) {
                    System.out.print(v + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}