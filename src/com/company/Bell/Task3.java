package com.company.Bell;

import java.util.Random;

class Task3 {
    private static final int n = 5;
    private static int[][] array;

    Task3(){
        initMatrix();
        printMatrix(array);
        System.out.println("Минимальный элемент = " + findMinimal(array));
    }

    private static void initMatrix() {
        array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = new Random().nextInt(150) - 100;
            }
        }
    }

    private static void printMatrix(int[][] array) {
        for (int[] arr : array) {
            for (int index : arr) {
                System.out.print(index + "\t");
            }
            System.out.println();
        }
    }

    private static int findMinimal(int[][] array) {
        int min = array[0][n - 1];
        for (int i = 0; i < array.length; i++) {
            if (array[i][array.length - 1 - i] <= min) {
                min = array[i][array.length - 1 - i];
            }
        }
        return min;
    }
}