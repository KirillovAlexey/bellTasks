package com.company.Bell;

import com.company.Bell.Task5.MatrixClass;
import com.company.Bell.Task5.Task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main {

    public static void main(String[] args) throws IOException {
        String taskNum = "";
        int count = 1;
        String menu = "Введите номер задания:\t" +
                "|Задание №1|\t" + "|Задание №3|\t" + "|Задание №4|\t" + "|Задание №5|\t" + "|Выход - exit|";
        System.out.println(menu);
        while (!taskNum.equals("exit")) {

            taskNum = new BufferedReader(new InputStreamReader(System.in)).readLine();
            switch (taskNum) {
                case ("1"): {
                    Task1 task1 = new Task1();
                    task1.main();
                    break;
                }
                case ("3"): {
                    new Task3();
                    break;
                }
                case ("4"): {
                    new Task4();
                    break;
                }
                case ("5"): {
                    System.out.println("Введите \"neg\" если хотите создать матрицу с отрицаительными и положительными числами" +
                            "\nВведите \"pos\" если хотите создать матрицу только из положительных чисел");
                    String result = new Scanner(System.in).nextLine();
                    if(result.equals("pos")) {
                        Task5 task5 = new Task5();
                        task5.setNameMatrix("Матрица №" + count++);
                        task5.printNameMatrix();
                        task5.printMatrix();
                        System.out.println(task5.findMinimalElement(task5.getArray()));
                        break;
                    }
                    if(result.equals("neg")) {
                        MatrixClass matrixClass = new MatrixClass();
                        matrixClass.setNameMatrix("Матрица №" + count++);
                        matrixClass.printNameMatrix();
                        matrixClass.printMatrix();
                        System.out.println(matrixClass.findMinimalElement(matrixClass.getArray()));
                        break;
                    }
                    else {
                        System.out.println("Некорректный ввод");
                    }
                }
                default: {
                    if(taskNum.equals("exit"))
                        break;
                    else {
                        System.out.println("Что-то пошло не так, введите номер задания повторно");
                        System.out.println(menu);
                    }
                }
            }
        }
    }
}
