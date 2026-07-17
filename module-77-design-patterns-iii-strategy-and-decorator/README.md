# Module 77: Design Patterns III - Strategy and Decorator

## Overview
This module covers two behavioral/structural patterns: Strategy (interchangeable algorithms) and Decorator (dynamically adding behavior). Strategy enables selecting algorithms at runtime, while Decorator wraps objects to extend functionality without subclassing. Both are used extensively in Java — `Comparator` is a Strategy, `java.io` streams are Decorators.

## Learning Objectives
- Implement Strategy pattern using interfaces for interchangeable algorithms
- Apply the principle of composition over inheritance
- Implement Decorator pattern to dynamically add behavior
- Understand how `java.io` streams use the Decorator pattern
- Compare Java Decorators with Python decorators

## Prerequisites
- Interfaces and polymorphism
- Composition
- Inheritance basics

## Theory

### Strategy Pattern
The Strategy pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. The strategy varies independently from the clients that use it.

**Key idea**: Favor composition over inheritance. Instead of subclassing to vary behavior, delegate to a strategy object.

**Real-world**: `java.util.Comparator` (sorting strategies), `javax.servlet.http.HttpServlet` (service method), Spring's `ResourceLoader`.

### Decorator Pattern
The Decorator pattern attaches additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.

**Key idea**: Wrap an object with one or more decorator objects that mirror the original interface.

**Real-world**: `java.io.InputStream` hierarchy — `BufferedInputStream` wraps `FileInputStream`, `GZIPInputStream` wraps another `InputStream`. Java's `Collections.synchronizedList()` wraps a `List`.

**Note**: Python decorators (syntactic sugar `@decorator`) are a different mechanism but serve a similar purpose — adding behavior without modifying the original code.

## Code Examples

### StrategyPattern.java
Payment processing with multiple payment strategies.

### DecoratorPattern.java
Coffee shop ordering system with base coffees and condiment decorators.

### JavaIODecoratorDemo.java
Demonstrates how `BufferedReader` wraps `FileReader`.

## Common Pitfalls
- **Strategy**: Creating too many strategy classes for minor variations. Consider lambdas for simple strategies.
- **Decorator**: Complicated instantiation (multiple layers of wrapping). Use a Builder or factory.
- **Decorator**: Type identity issues — `equals()` and `instanceof` may not work as expected on wrapped objects.

## Exercises

See [exercises/README.md](exercises/README.md).

## Quiz

**Q1:** What principle does the Strategy pattern primarily promote?
**Q2:** How are strategies typically selected at runtime?
**Q3:** Which `java.io` class hierarchy is the classic example of the Decorator pattern?
**Q4:** What is the main advantage of Decorator over subclassing?
**Q5:** How can you simplify Strategy pattern usage in Java 8+?

---

<details>
<summary>Answers</summary>

**A1:** Composition over inheritance
**A2:** By passing a strategy object (or lambda) to the context class
**A3:** `InputStream` / `OutputStream` / `Reader` / `Writer` hierarchies
**A4:** Decorator adds behavior dynamically without creating many subclasses for each combination
**A5:** Use lambda expressions or method references instead of creating separate strategy classes
</details>

## Key Takeaways
- Strategy encapsulates algorithms behind a common interface, enabling runtime switching
- Decorator wraps objects recursively to add behavior without inheritance
- Both patterns follow the Open/Closed principle (open for extension, closed for modification)
- Java 8+ lambdas make Strategy pattern trivial for single-method interfaces
- `java.io` streams are the most famous Decorator example in the Java standard library

## Next Module
[Module 78: SOLID Principles](../module-78-solid-principles/README.md)
