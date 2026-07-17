package com.stackjava.math;

public class AdvancedMath {
    public static double power(double base, double exp) {
        return Math.pow(base, exp);
    }

    public static long factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
}
