package com.company.Bell;

public class Task1 {

    public void fun3() {
        int a = 3;
        int b;
        int c;
        b = a++;
        c = ++a;
        System.out.println(a + "_" + b + "_" + c);
    }

    public void main(String[] args) {
        fun3();
    }
}
