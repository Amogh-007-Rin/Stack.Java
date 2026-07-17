package com.stackjava.greeter;

public class Greeter {
    public static String greet(String name) {
        return "Hello, " + name + "! Welcome to JPMS.";
    }

    public static String greetFormal(String name) {
        return "Dear " + name + ", greetings from the module system.";
    }
}
