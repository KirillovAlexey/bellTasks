package com.company.Bell.Task5;

import java.util.Random;

public class Task5 extends MatrixClass{

    public Task5() {
        array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = new Random().nextInt(150);
            }
        }
    }
}
