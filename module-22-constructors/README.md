# Module 22: Constructors

## Overview
Constructors are special methods that initialize objects when they are created. This module covers the default (no-arg) constructor, parameterized constructors, constructor overloading, and basic constructor chaining with `this()`.

## Learning Objectives
- Understand the role of a constructor in object initialization
- Write a default (no-arg) constructor
- Write parameterized constructors
- Overload constructors with different parameter lists
- Use `this()` to call one constructor from another
- Recognize that defining any constructor removes the default no-arg constructor

## Prerequisites
- Module 21 — Classes and Objects

## Theory

### What is a Constructor?
A constructor is a block of code that runs when an object is created with `new`. It has the same name as the class and no return type (not even `void`).

### Default Constructor
If you do not define any constructor, Java provides a **default no-arg constructor** that does nothing (fields get their default values: `0`, `0.0`, `false`, `null`).

```java
class Book {
    // Java provides: Book() { }
}
```

### Parameterized Constructors
A constructor that takes arguments allows setting initial field values:

```java
class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}
```

### Constructor Overloading
Like methods, constructors can be overloaded — multiple constructors with different parameter lists:

```java
Book() { }
Book(String title) { ... }
Book(String title, String author) { ... }
Book(String title, String author, int pages) { ... }
```

### Constructor Chaining with `this()`
One constructor can call another using `this(...)`. This call must be the **first statement** in the constructor.

```java
Book() {
    this("Unknown Title", "Unknown Author");  // calls the 2-param constructor
}
Book(String title, String author) {
    this.title = title;
    this.author = author;
}
```

### Important Rule
If you define **any** constructor, the default no-arg constructor disappears. You must explicitly write one if you still need it.

## Code Examples
See `examples/` for `Book.java` and `BookDemo.java`.

## Common Pitfalls
- **Forgetting to add a no-arg constructor** when you define a parameterized one — code that calls `new Book()` will not compile.
- **Calling `this()` after other statements** — `this()` must be the first line in a constructor.
- **Using the class name as a regular method** — Constructors have no return type; writing `void Book()` creates a method, not a constructor.

## Exercises
Complete the exercises in `exercises/README.md`.

## Quiz

**Q1:** What is the return type of a constructor?
**Q2:** How many constructors does a class have if you do not write any?
**Q3:** What happens if you define a constructor with parameters but do not define a no-arg constructor?
**Q4:** What keyword is used to call one constructor from another within the same class?
**Q5:** True or False: `this()` can be called anywhere inside a constructor body.

---

**A1:** No return type (not even void).
**A2:** One — the compiler provides a default no-arg constructor.
**A3:** The default no-arg constructor disappears, and `new ClassName()` will cause a compile error.
**Q4:** `this(...)`
**A5:** False — `this()` must be the first statement in the constructor.

## Key Takeaways
- Constructors initialize objects and have no return type.
- Overloading provides flexibility in how objects are created.
- `this()` chains constructors to avoid code duplication.
- Always provide a no-arg constructor explicitly if you define other constructors and still need one.

## Next Module
Module 23 — The `this` Keyword: using `this` for fields, methods, and constructor calls.
