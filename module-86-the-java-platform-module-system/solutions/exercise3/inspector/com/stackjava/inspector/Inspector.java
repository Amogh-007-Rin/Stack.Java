package com.stackjava.inspector;

import com.stackjava.person.Person;
import java.lang.reflect.Field;

public class Inspector {
    public static void main(String[] args) throws Exception {
        Person p = new Person("Alice", 30);
        Class<?> clazz = p.getClass();

        System.out.println("Inspecting " + clazz.getName() + " via reflection:");
        for (Field f : clazz.getDeclaredFields()) {
            f.setAccessible(true);
            System.out.println("  " + f.getType().getSimpleName() + " " + f.getName() + " = " + f.get(p));
        }
    }
}
