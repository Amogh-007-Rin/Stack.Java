# Module 76: Design Patterns II - Builder and Observer

## Overview
This module covers the Builder pattern (constructing complex objects step by step) and the Observer pattern (one-to-many dependency where state changes notify dependents). Both are widely used in Java — Builder appears in `StringBuilder`, `Stream.Builder`, and Lombok's `@Builder`; Observer appears in GUI event handling and reactive streams.

## Learning Objectives
- Recognize the telescoping constructor anti-pattern and fix it with Builder
- Implement a fluent Builder API with method chaining
- Implement Observer pattern using a custom listener interface
- Understand the legacy `java.util.Observable`/`Observer` (deprecated)
- Compare Java Observer with Python's observer patterns

## Prerequisites
- Interfaces and abstract classes
- Composition and aggregation
- Event-driven programming concepts

## Theory

### Builder Pattern
The Builder pattern separates the construction of a complex object from its representation, allowing the same construction process to create different representations.

**Problem**: Telescoping constructors — an ever-growing list of constructor parameters as features are added.

**Solution**: A Builder class with setter methods that return `this` (fluent API), culminating in a `build()` method.

**Real-world**: `StringBuilder`, `Stream.Builder`, `java.lang.StringBuilder`, `java.lang.StringBuffer`.

### Observer Pattern
The Observer pattern defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

**Java legacy**: `java.util.Observable` (class) and `java.util.Observer` (interface) — deprecated since Java 9 because `Observable` is a class (not interface), limiting reuse.

**Modern approach**: Define your own listener interface.

**Real-world**: Swing/AWT event listeners, Spring's `ApplicationListener`, reactive streams.

## Code Examples

### BuilderPattern.java
Demonstrates the telescoping constructor problem and fixes it with a Builder.

### FluentBuilder.java
A Builder with fluent method chaining for constructing a complex `Computer` object.

### ObserverPattern.java
Custom listener interface with a `WeatherStation` notifying multiple displays.

### LegacyObserverExample.java
Shows the deprecated `java.util.Observable`/`Observer` approach.

## Common Pitfalls
- **Builder**: Forgetting to call `build()`, or making the Builder immutable when it should accumulate state.
- **Observer**: Memory leaks from failing to unregister observers, or observers holding strong references to subjects.
- **Legacy Observable**: Being a class prevents your class from extending anything else. Use custom interfaces instead.

## Exercises

See [exercises/README.md](exercises/README.md).

## Quiz

**Q1:** What creational problem does the Builder pattern solve?
**Q2:** What does a fluent API typically return from setter methods?
**Q3:** Which Java standard library class is a real-world example of the Builder pattern?
**Q4:** Why was `java.util.Observable` deprecated?
**Q5:** What is a common memory leak issue with the Observer pattern?

---

<details>
<summary>Answers</summary>

**A1:** Telescoping constructors (too many constructor parameters)
**A2:** `this` (the Builder itself) to enable method chaining
**A3:** `StringBuilder` (also `Stream.Builder`, `StringBuffer`)
**A4:** Because `Observable` is a class, forcing subclasses to extend it — violating the ability to extend other classes
**A5:** Forgetting to unregister observers, preventing garbage collection
</details>

## Key Takeaways
- Builder pattern solves the telescoping constructor problem with a fluent, readable API
- Builder is especially useful for objects with many optional parameters
- Observer pattern enables loose coupling between subjects and observers
- Prefer custom listener interfaces over the deprecated `java.util.Observable`
- Always unregister observers to prevent memory leaks

## Next Module
[Module 77: Design Patterns III - Strategy and Decorator](../module-77-design-patterns-iii-strategy-and-decorator/README.md)
