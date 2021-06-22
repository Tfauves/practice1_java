package com.careerDevs;

public class Practice {

    public static int getNum() {
        return 13;
    }

    public static int fib(int num) {

        int a = 0;
        int b = 1;
        int c = a + b;

        if (num == 1) {
            return 1;
        }
        for (int i = 1; i < num; i++) {
            c = a + b;
            a = b;
            b = c;

        }
        return b;
    }
}

