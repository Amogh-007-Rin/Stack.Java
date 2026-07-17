# Module 37: Nested and Inner Classes

## Overview

Java allows defining a class within another class. These are called **nested classes**. They are divided into two categories: **static nested classes** and **inner classes** (non-static). Inner classes include **local classes** (defined inside a method) and **anonymous classes** (covered in Module 38). Nested classes are used for logical grouping, encapsulation, and improved readability.

## Learning Objectives

- Define static nested classes and understand their relationship to the enclosing class
- Define inner (non-static) classes that have access to the enclosing instance
- Define local classes inside methods
- Understand when and why to use nested classes

## Prerequisites

- Module 24: Access Modifiers
- Module 26: The static Keyword
- Module 21: Classes and Objects

## Theory

### Static Nested Classes

A static nested class is associated with the outer class, not with an instance. It cannot access instance members of the outer class directly.

```java
class Outer {
    static class Nested {
        void display() { System.out.println("Static nested"); }
    }
}
// Usage: Outer.Nested obj = new Outer.Nested();
```

### Inner (Non-Static) Classes

An inner class is associated with an instance of the outer class. It has access to all members of the outer class, including private ones.

```java
class Outer {
    private int x = 10;
    class Inner {
        void show() { System.out.println(x); }
    }
}
// Usage: Outer.Inner obj = outer.new Inner();
```

### Local Classes

A local class is defined inside a method. It is scoped to that method.

```java
void method() {
    class Local {
        void doSomething() { ... }
    }
    Local l = new Local();
    l.doSomething();
}
```

## Code Examples

- `StaticNestedClassDemo.java` — Static nested class example
- `InnerClassDemo.java` — Non-static inner class example
- `LocalClassDemo.java` — Local class inside a method

## Common Pitfalls

- Forgetting that inner classes hold a reference to the enclosing instance (memory leak risk)
- Trying to access instance members of the outer class from a static nested class (not allowed)
- Using local classes when anonymous classes or lambdas would be simpler
- Overcomplicating design with unnecessary nested classes

## Exercises

See `exercises/README.md`.

## Quiz

1. A static nested class can access:
   a) All members of the outer class  b) Only static members of the outer class  c) Only private members  d) Nothing

2. An inner (non-static) class has access to:
   a) Only static members of the outer class  b) All members of the outer class  c) Nothing  d) Only public members

3. A local class is defined:
   a) In a separate file  b) Inside a method  c) Inside an interface  d) In a package

4. To create an instance of an inner class, you need:
   a) No special syntax  b) An instance of the outer class  c) A static method  d) A factory

5. Static nested classes are similar to:
   a) Inner classes  b) Top-level classes  c) Local classes  d) Anonymous classes

---

Answers: 1-b, 2-b, 3-b, 4-b, 5-b

## Key Takeaways

- Static nested classes behave like top-level classes but are logically grouped
- Inner classes have access to all members of the enclosing instance
- Local classes are defined inside methods and scoped to that method
- Nested classes improve encapsulation and logical grouping

## Next Module

Module 38: Anonymous Classes — classes without a name for quick implementations.
