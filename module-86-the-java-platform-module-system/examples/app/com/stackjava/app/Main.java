package com.stackjava.app;

import com.stackjava.greeter.Greeter;

public class Main {
    public static void main(String[] args) {
        System.out.println(Greeter.greet("Alice"));
        System.out.println(Greeter.greetFormal("Bob"));
    }
}
