package com.company.Bell;

class Task1 {

    private void fun3() {
        int a = 3;
        int b;
        int c;
        b = a++;
        c = ++a;
        System.out.println(a + "_" + b + "_" + c);
    }

    public void main() {
        fun3();
    }
}
