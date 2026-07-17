# Module 31: Interfaces

## Overview

An **interface** in Java is a reference type that defines a contract of abstract methods that implementing classes must fulfill. Before Java 8, interfaces could only contain abstract methods and constants. Interfaces enable **multiple inheritance of type** — a class can implement multiple interfaces while extending only one class.

## Learning Objectives

- Declare interfaces using the `interface` keyword
- Implement interfaces using the `implements` keyword
- Understand multiple inheritance of type
- Distinguish interfaces from classes

## Prerequisites

- Module 27: Inheritance Basics
- Module 30: Abstract Classes

## Theory

### Defining an Interface

An interface is declared with the `interface` keyword. Before Java 8, all methods in an interface were implicitly `public abstract`.

```java
interface Drawable {
    void draw();
}
```

### Implementing an Interface

A class uses the `implements` keyword to fulfill an interface contract. It must provide implementations for all abstract methods.

```java
class Circle implements Drawable {
    public void draw() {
        System.out.println("Drawing a circle");
    }
}
```

### Multiple Inheritance of Type

A class can implement multiple interfaces, which is Java's way of supporting a form of multiple inheritance.

```java
interface Drawable { void draw(); }
interface Printable { void print(); }

class Document implements Drawable, Printable {
    public void draw() { System.out.println("Drawing document"); }
    public void print() { System.out.println("Printing document"); }
}
```

### Interface vs Abstract Class

| Feature | Interface | Abstract Class |
|---------|-----------|----------------|
| Instantiation | No | No |
| Multiple inheritance | Yes (implements many) | No (extends one) |
| Fields | `public static final` only | Any fields |
| Constructors | No | Yes |
| Methods (pre-Java 8) | Abstract only | Abstract + concrete |

## Code Examples

- `Drawable.java` — Interface with one abstract method
- `Printable.java` — Another interface
- `InterfaceDemo.java` — Class implementing multiple interfaces

## Common Pitfalls

- Forgetting that interface methods are implicitly `public abstract` (don't add `protected` or `private`)
- Trying to create an instance of an interface (not allowed)
- Confusing `extends` (for classes) with `implements` (for interfaces)
- Forgetting to implement all interface methods in the implementing class

## Exercises

See `exercises/README.md`.

## Quiz

1. Which keyword does a class use to adopt an interface?
   a) `extends`  b) `implements`  c) `inherits`  d) `adopts`

2. How many interfaces can a class implement?
   a) 0  b) 1  c) Unlimited  d) At most 2

3. Before Java 8, interface methods are implicitly:
   a) `public abstract`  b) `private`  c) `protected`  d) `static`

4. Can an interface have instance variables?
   a) Yes  b) No, only constants  c) Yes, but only private  d) Yes, if declared `final`

5. A class can extend one class and implement:
   a) At most one interface  b) At most two interfaces  c) Any number of interfaces  d) No interfaces

---

Answers: 1-b, 2-c, 3-a, 4-b, 5-c

## Key Takeaways

- Interfaces define a contract of abstract methods
- A class can implement multiple interfaces (multiple inheritance of type)
- Interface methods are implicitly `public abstract`
- Interfaces cannot have constructors or instance fields

## Next Module

Module 32: Interfaces vs Abstract Classes, Default and Static Interface Methods — deeper comparison and modern interface features.
