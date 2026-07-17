# Module 30: Abstract Classes

## Overview

An **abstract class** is a class declared with the `abstract` keyword that cannot be instantiated on its own. It may contain abstract methods (methods without a body) that subclasses must implement. Abstract classes provide a way to define a common base with shared state and behavior while forcing subclasses to fill in the details.

## Learning Objectives

- Declare abstract classes and abstract methods using the `abstract` keyword
- Understand why abstract classes cannot be instantiated
- Implement abstract methods in concrete subclasses
- Recognize when to use an abstract class over a regular class

## Prerequisites

- Module 27: Inheritance Basics
- Module 28: The super Keyword and Method Overriding
- Module 29: Polymorphism

## Theory

### The abstract Keyword

A class declared with `abstract` cannot be instantiated directly. It may contain both concrete (implemented) methods and abstract (unimplemented) methods.

```java
abstract class Shape {
    abstract double area(); // no body
    void display() {        // concrete method
        System.out.println("Displaying shape");
    }
}
```

### Abstract Methods

An abstract method has no body — just a signature ending with a semicolon. Any concrete (non-abstract) subclass must provide an implementation.

```java
abstract class Animal {
    abstract void makeSound();
}
```

### Concrete Subclasses

A subclass that extends an abstract class must implement all inherited abstract methods, or it must also be declared abstract.

```java
class Dog extends Animal {
    void makeSound() {
        System.out.println("Woof!");
    }
}
```

### Why Use Abstract Classes?

- To define a common base with shared fields and methods
- To force subclasses to implement specific behavior
- To prevent instantiation of incomplete classes

## Code Examples

- `Shape.java` — Abstract base class with abstract `area()` method
- `Circle.java` — Concrete subclass implementing `area()`
- `Rectangle.java` — Another concrete subclass
- `AbstractClassDemo.java` — Main class demonstrating polymorphism with abstract types

## Common Pitfalls

- Trying to instantiate an abstract class (compile error)
- Forgetting to implement an abstract method in a concrete subclass (compile error)
- Declaring a method abstract in a non-abstract class (compile error)
- Using `abstract` with `static`, `private`, or `final` (not allowed)

## Exercises

See `exercises/README.md`.

## Quiz

1. Can you create an instance of an abstract class?
   a) Yes, with `new`  b) No, never  c) Yes, if it has no abstract methods  d) Yes, using reflection

2. What must a concrete subclass do with inherited abstract methods?
   a) Ignore them  b) Override them  c) Declare them again  d) Nothing

3. Which modifier is NOT allowed on an abstract method?
   a) `public`  b) `protected`  c) `private`  d) `default` (package-private)

4. An abstract class can have:
   a) Only abstract methods  b) Only concrete methods  c) Both abstract and concrete methods  d) Neither

5. What happens if a subclass does not implement all abstract methods?
   a) Compile error  b) Runtime error  c) The method does nothing  d) The subclass must also be abstract

---

Answers: 1-b, 2-b, 3-c, 4-c, 5-d

## Key Takeaways

- Abstract classes cannot be instantiated
- Abstract methods have no body and must be overridden in concrete subclasses
- Abstract classes can have constructors, fields, and concrete methods
- Use abstract classes to define a common base with shared implementation

## Next Module

Module 31: Interfaces — defining contracts for classes.
