# Module 26: The `static` Keyword

## Overview
The `static` keyword in Java is used for members that belong to the **class** rather than to any specific instance. Static fields are shared across all objects, static methods can be called without an instance, and static initializer blocks run once when the class is loaded.

## Learning Objectives
- Declare and use static fields (class variables)
- Declare and use static methods
- Write static initializer blocks
- Understand when to use static vs instance context
- Use Java's `Math` utility class as an example

## Prerequisites
- Module 21 — Classes and Objects

## Theory

### Static Fields
A static field is shared by **all instances** of a class. There is only one copy in memory, regardless of how many objects exist.

```java
class Book {
    static int totalBooksCreated;
    String title;
}
```

### Static Methods
Static methods can be called without creating an instance:

```java
int count = Book.getTotalBooks();
```

Key rules:
- Static methods **cannot** access instance fields or methods directly.
- Static methods **can** access other static members.
- Use `ClassName.methodName()` to call them (though instance reference also works).

### Static Initializer Blocks
A `static { }` block runs once when the class is first loaded. Useful for complex static initialization:

```java
class Config {
    static String appName;
    static int maxUsers;

    static {
        appName = "LibrarySystem";
        maxUsers = 1000;
    }
}
```

### Static vs Instance Context

| Aspect | Instance | Static |
|--------|----------|--------|
| Belongs to | Each object | The class |
| Memory | Per object | One copy shared |
| Access to `this` | Yes | No |
| Called with | `obj.method()` | `Class.method()` |
| Access to instance fields | Yes | No |

### Math Utility Class
`java.lang.Math` is a classic example: all methods are static.

```java
Math.max(10, 20);
Math.sqrt(25.0);
Math.random();
```

## Code Examples
See `examples/` for `LibraryConfig.java`, `BookWithCounter.java`, and demos.

## Common Pitfalls
- **Calling static methods on an instance** — Works but is confusing. Always use the class name.
- **Trying to access `this` in a static method** — Compile error.
- **Using static for everything** — Statics are global state; overuse makes testing and concurrency harder.

## Exercises
Complete the exercises in `exercises/README.md`.

## Quiz

**Q1:** How many copies of a static field exist if you create 100 objects?
**Q2:** True or False: A static method can access instance fields directly.
**Q3:** What runs before any object of a class is created and only runs once?
**Q4:** Which class is a well-known example of a utility class with only static methods?
**Q5:** How should you correctly call a static method `resetCount()` in class `Counter`?

---

**A1:** One (shared across all instances).
**A2:** False. Static methods cannot access instance fields directly.
**A3:** A static initializer block (`static { }`).
**A4:** `java.lang.Math` (or `Math`).
**A5:** `Counter.resetCount()`

## Key Takeaways
- `static` members belong to the class, not instances.
- Static initializer blocks run once at class load time.
- Static methods cannot access instance members.
- Use static for utility methods and shared constants.

## Next Module
Module 27 — Inheritance Basics: extending classes, IS-A relationships, and method overriding.
