package com.company.Bell.Task5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class MatrixClass implements MatrixInterface {

    int n;
    int[][] array;
    private String nameMatrix;

    public int[][] getArray() {
        return array;
    }

    private String getNameMatrix() {
        return nameMatrix;
    }

    public void setNameMatrix(String nameMatrix) {
        this.nameMatrix = nameMatrix;
    }

    public MatrixClass() {
        System.out.println("Введите размер матрицы");
        try {
            n = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        } catch (Exception e) {
            e.getMessage();
        }
        array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = new Random().nextInt(150) - 100;
            }
        }
    }

    public String findMinimalElement(int[][] array) {
        int min = array[0][n - 1];
        for (int i = 0; i < array.length; i++) {
            if (array[i][array.length - 1 - i] <= min) {
                min = array[i][array.length - 1 - i];
            }
        }
        return "Минимальный элемент побочной диагонали: " + min;
    }

    public void printNameMatrix() {
        System.out.println("Название матрицы: " + getNameMatrix());
    }

    public void printMatrix() {
        for (int[] arr : array) {
            for (int index : arr) {
                System.out.print(index + "\t");
            }
            System.out.println();
        }
    }
}
