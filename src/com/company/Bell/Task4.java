package com.company.Bell;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

class Task4 {
    private static ArrayList arrayList;

    Task4() {
        initArray();
        System.out.println("Массив до переворачивания:");
        printArray();
        Collections.reverse(arrayList);
        System.out.println("Массив после переворачивания:");
        printArray();
    }

    private static void initArray() {
        arrayList = new ArrayList();
        for (int i = 0; i < 10; i++) {
            arrayList.add(new Random().nextInt(100 * (2 % 15)));
        }
    }

    private static void printArray() {
        for (Object o : arrayList) {
            int i = (int) o;
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
