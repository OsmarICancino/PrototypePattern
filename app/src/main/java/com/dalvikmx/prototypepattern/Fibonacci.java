package com.dalvikmx.prototypepattern;

public class Fibonacci extends Sequence {

    public Fibonacci() {
        result = nthFibonacci(1000);
    }

    private static long nthFibonacci(int n) {
        long f0 = 0;
        long f1 = 1;

        for (int i = 2;  i <= n; i++) {
            f0 = f0 + f1;
            f1 = f0 + f1;
        }

        return f0;
    }
}
