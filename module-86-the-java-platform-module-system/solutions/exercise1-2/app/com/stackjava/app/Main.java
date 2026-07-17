package com.stackjava.app;

import com.stackjava.calculator.Calculator;

public class Main {
    public static void main(String[] args) {
        System.out.println("10 + 5 = " + Calculator.add(10, 5));
        System.out.println("10 - 5 = " + Calculator.subtract(10, 5));
        System.out.println("10 * 5 = " + Calculator.multiply(10, 5));
        System.out.println("10 / 5 = " + Calculator.divide(10, 5));
    }
}
