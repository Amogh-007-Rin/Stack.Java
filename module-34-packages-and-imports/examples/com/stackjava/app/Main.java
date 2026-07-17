package com.stackjava.app;

import com.stackjava.math.Calculator;
import com.stackjava.math.AdvancedMath;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Using imports:");
        System.out.println("15 + 7 = " + calc.add(15, 7));
        System.out.println("15 - 7 = " + calc.subtract(15, 7));
        System.out.println("15 * 7 = " + calc.multiply(15, 7));
        System.out.println("15 / 7 = " + calc.divide(15, 7));

        System.out.println("2^10 = " + AdvancedMath.power(2, 10));
        System.out.println("6! = " + AdvancedMath.factorial(6));
    }
}
