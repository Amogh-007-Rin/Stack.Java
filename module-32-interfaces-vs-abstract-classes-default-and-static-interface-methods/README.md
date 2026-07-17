# Module 32: Interfaces vs Abstract Classes, Default and Static Interface Methods

## Overview

This module compares **abstract classes** and **interfaces** in depth, and introduces modern interface features added in Java 8 and 9: **default methods**, **static methods**, and **private methods**. These additions blur the traditional line between interfaces and abstract classes.

## Learning Objectives

- Decide when to use an abstract class vs an interface
- Add default methods to interfaces with the `default` keyword
- Add static methods to interfaces
- Use private helper methods in interfaces (Java 9+)

## Prerequisites

- Module 30: Abstract Classes
- Module 31: Interfaces

## Theory

### When to Use Abstract Class vs Interface

| Use Case | Abstract Class | Interface |
|----------|---------------|-----------|
| Shared state (fields) | Yes | No (only constants) |
| Common constructor logic | Yes | No |
| "Is-a" relationship | Yes | Yes |
| "Can-do" capability | No | Yes |
| Multiple inheritance | No | Yes |
| Evolving API (add methods) | Add concrete method | Use default methods |

### Default Methods (Java 8)

A `default` method has a body in the interface. Implementing classes inherit it and can override it.

```java
interface Drawable {
    void draw();
    default void display() {
        System.out.println("Displaying...");
    }
}
```

### Static Methods in Interfaces (Java 8)

Static methods in interfaces are utility methods that belong to the interface, not to instances.

```java
interface MathUtils {
    static int add(int a, int b) {
        return a + b;
    }
}
```

### Private Methods in Interfaces (Java 9)

Private methods help share code between default methods without exposing it to implementing classes.

```java
interface Logger {
    default void info(String msg) { log("INFO", msg); }
    default void error(String msg) { log("ERROR", msg); }
    private void log(String level, String msg) {
        System.out.println(level + ": " + msg);
    }
}
```

## Code Examples

- `Vehicle.java` — Abstract class with shared state
- `Drivable.java` — Interface with default method
- `UtilityInterface.java` — Interface with static and private methods
- `InterfaceMethodsDemo.java` — Main class demonstrating all features

## Common Pitfalls

- Using an abstract class when an interface would suffice (prefer interfaces for capabilities)
- Forgetting that default methods can cause diamond problem conflicts
- Assuming static interface methods are inherited by implementing classes (they are not)
- Using `private` methods in interfaces before Java 9 (compile error)

## Exercises

See `exercises/README.md`.

## Quiz

1. Which of the following can have instance fields?
   a) Interface  b) Abstract class  c) Both  d) Neither

2. A `default` method in an interface:
   a) Must be overridden  b) Has a body  c) Is implicitly static  d) Cannot be overridden

3. Static methods in interfaces are called:
   a) On instances  b) On the interface name  c) On implementing classes  d) Only privately

4. Private methods in interfaces (Java 9+) are used to:
   a) Expose utility to clients  b) Share code between default methods  c) Replace abstract methods  d) Create constants

5. If two interfaces define the same default method, the implementing class must:
   a) Choose one  b) Override the method  c) Use super  d) Compile error

---

Answers: 1-a, 2-b, 3-b, 4-b, 5-b

## Key Takeaways

- Use abstract classes for shared state and constructors; use interfaces for capabilities
- Default methods add behavior to interfaces without breaking existing implementations
- Static methods in interfaces are utility methods called on the interface name
- Private methods in interfaces help share code between default methods

## Next Module

Module 33: Object Class Methods — understanding toString(), equals(), and hashCode().
