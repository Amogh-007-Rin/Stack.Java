# Module 38: Anonymous Classes

## Overview

An **anonymous class** is a class without a name that is declared and instantiated simultaneously. It is used to provide a quick implementation of an interface or an extension of a class, typically for one-time use. Anonymous classes are a bridge to **lambda expressions** (covered in Module 54), which provide a more concise syntax for functional interfaces.

## Learning Objectives

- Create anonymous classes that implement an interface
- Create anonymous classes that extend a class
- Understand how anonymous classes capture local variables (effectively final)
- Recognize anonymous classes as a bridge to lambda expressions

## Prerequisites

- Module 31: Interfaces
- Module 37: Nested and Inner Classes

## Theory

### Anonymous Class Implementing an Interface

An anonymous class can implement an interface on the spot without a named class.

```java
Runnable task = new Runnable() {
    @Override
    public void run() {
        System.out.println("Running...");
    }
};
```

### Anonymous Class Extending a Class

An anonymous class can extend an existing class, overriding methods.

```java
Animal dog = new Animal() {
    @Override
    void speak() {
        System.out.println("Woof!");
    }
};
```

### Capturing Local Variables

Anonymous classes can access local variables from the enclosing scope, but they must be **effectively final** (not reassigned after initialization).

```java
String greeting = "Hello";
Runnable r = new Runnable() {
    @Override
    public void run() {
        System.out.println(greeting);
    }
};
```

### Bridge to Lambda Expressions

Anonymous classes with a single method are verbose. Lambda expressions (Module 54) provide a more concise syntax:

```java
// Anonymous class
Runnable r = new Runnable() {
    @Override
    public void run() {
        System.out.println("Hello");
    }
};

// Lambda (Java 8+)
Runnable r = () -> System.out.println("Hello");
```

## Code Examples

- `AnonymousInterfaceDemo.java` — Anonymous class implementing an interface
- `AnonymousExtendsDemo.java` — Anonymous class extending a class
- `AnonymousLocalVariableDemo.java` — Capturing effectively final local variables

## Common Pitfalls

- Forgetting the semicolon at the end of the anonymous class declaration
- Trying to define constructors in anonymous classes (not allowed)
- Assuming anonymous classes can access non-final local variables (must be effectively final)
- Overusing anonymous classes when a named class or lambda would be clearer

## Exercises

See `exercises/README.md`.

## Quiz

1. An anonymous class is defined using:
   a) `class` keyword  b) `new` keyword  c) `anonymous` keyword  d) `inner` keyword

2. Can an anonymous class have a constructor?
   a) Yes  b) No  c) Only default  d) Only if it extends a class

3. Anonymous classes can access local variables that are:
   a) Any local variable  b) Effectively final  c) Static  d) Public

4. Anonymous classes are commonly used to:
   a) Define reusable classes  b) Implement interfaces quickly  c) Create packages  d) Define enums

5. Lambda expressions are a more concise alternative to anonymous classes for:
   a) Any class  b) Functional interfaces  c) Abstract classes  d) Enums

---

Answers: 1-b, 2-b, 3-b, 4-b, 5-b

## Key Takeaways

- Anonymous classes are declared and instantiated in one expression
- They can implement interfaces or extend classes
- They can only access effectively final local variables
- Anonymous classes are a bridge to lambda expressions

## Next Module

Module 39: Exception Handling Basics — handling runtime errors gracefully.
