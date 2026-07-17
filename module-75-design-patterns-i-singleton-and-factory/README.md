# Module 75: Design Patterns I - Singleton and Factory

## Overview
Design patterns are reusable solutions to common software design problems. This module covers two foundational creational patterns: Singleton (ensuring a class has only one instance) and Simple Factory (encapsulating object creation). Understanding these patterns is essential for writing maintainable, scalable Java applications.

## Learning Objectives
- Implement Singleton pattern with eager, lazy, and thread-safe initialization
- Understand the Bill Pugh singleton pattern using a static inner helper class
- Implement Simple Factory pattern using a static method
- Recognize when to use Singleton vs Factory
- Compare Java implementations with Python/JS equivalents

## Prerequisites
- Basic Java syntax and OOP (classes, interfaces, inheritance)
- Java concurrency basics (synchronized, volatile)
- Static methods and fields

## Theory

### Singleton Pattern
The Singleton pattern restricts a class to a single instance and provides a global point of access. It is used for logging, configuration, connection pools, and caching.

**Eager Initialization**: The instance is created at class loading time. Simple but wastes resources if the singleton is never used.

**Lazy Initialization**: The instance is created only when first requested. Must handle thread safety in multithreaded environments.

**Thread-Safe Singleton**: Uses `volatile` keyword and `synchronized` on the getInstance method or a double-checked locking block.

**Bill Pugh Singleton**: Uses a static inner helper class to lazily load the instance in a thread-safe manner without synchronization overhead.

### Simple Factory Pattern
The Simple Factory pattern uses a static method to return different subclasses based on input parameters. It encapsulates object creation logic in one place, making the code easier to maintain and extend.

## Code Examples

### EagerSingleton.java
Eagerly initialized singleton.

### LazySingleton.java
Lazily initialized singleton (not thread-safe).

### ThreadSafeSingleton.java
Double-checked locking with volatile.

### SimpleFactory.java
Factory returning different shape objects.

## Common Pitfalls
- **Serialization**: Default serialization can create a new instance. Implement `readResolve()` to return the existing instance.
- **Reflection**: Reflection can break Singleton by invoking the private constructor. Throw an exception in the constructor if the instance already exists.
- **Cloning**: Override `clone()` to prevent cloning.
- **Factory becoming God class**: Avoid putting too much logic in the factory.

## Exercises

See [exercises/README.md](exercises/README.md) for the full list of exercises.

## Quiz

**Q1:** What keyword is essential in a double-checked locking Singleton to prevent instruction reordering?
**Q2:** Which Singleton pattern is both thread-safe and lazy without synchronization overhead?
**Q3:** What is the main advantage of the Simple Factory pattern?
**Q4:** What method should be overridden to prevent a Singleton from being cloned?
**Q5:** When using Eager initialization, when is the Singleton instance created?

---

<details>
<summary>Answers</summary>

**A1:** `volatile`
**A2:** Bill Pugh Singleton (static inner helper class)
**A3:** It centralizes object creation logic, making the code easier to maintain
**A4:** `clone()`
**A5:** At class loading time (when the class is first loaded by the JVM)
</details>

## Key Takeaways
- Singleton ensures one instance but must handle serialization, reflection, and threading
- Bill Pugh pattern is the most robust Singleton approach in Java
- Simple Factory encapsulates object creation, reducing code duplication
- Design patterns are templates, not rigid rules — adapt them to your context
- Pattern choice depends on language features (Java enums make Singleton trivial)

## Next Module
[Module 76: Design Patterns II - Builder and Observer](../module-76-design-patterns-ii-builder-and-observer/README.md)
