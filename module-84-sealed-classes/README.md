# Module 84: Sealed Classes

## Overview
Sealed classes, introduced in **Java 17** (JEP 409), allow you to control which classes or interfaces may extend or implement a given class or interface. This enables exhaustive pattern matching and creates a more expressive type hierarchy.

## Learning Objectives
- Define sealed classes using the `sealed` keyword and `permits` clause
- Understand the three permitted subclass modifiers: `final`, `sealed`, `non-sealed`
- Create sealed interfaces
- Recognize how sealed classes enable exhaustive switch analysis

## Prerequisites
- Inheritance and abstract classes in Java
- Module 83 (Records) — sealed classes often pair with records

## Theory

### Sealed Class Syntax
```java
public sealed class Shape permits Circle, Rectangle, Triangle {
}

final class Circle extends Shape { /* no further subclasses */ }
sealed class Rectangle extends Shape permits Square { /* subclasses restricted */ }
non-sealed class Triangle extends Shape { /* open to any subclass */ }
final class Square extends Rectangle {}
```

### Subclass Modifiers
Each permitted subclass must use exactly one of these modifiers:
- **`final`** — no further subclasses allowed
- **`sealed`** — further restricts its own subclasses with another `permits` clause
- **`non-sealed`** — reopens the hierarchy; any class can extend it

### Sealed Interfaces
```java
public sealed interface Expression permits Constant, Addition {
}

record Constant(int value) implements Expression {}
record Addition(Expression left, Expression right) implements Expression {}
```

### Why Sealed Classes?
1. **Controlled inheritance** — the API author decides exactly which classes extend the base type
2. **Exhaustive pattern matching** — when combined with switch pattern matching (Java 21), the compiler can verify that all cases are covered
3. **Security** — prevents unauthorized subclasses
4. **Documentation** — makes the class hierarchy explicit and discoverable

### Key Requirements
- The sealed class and all permitted subclasses must belong to the **same module** (or be in the same package if no modules)
- Permitted subclasses must directly extend the sealed class
- The sealed class must declare all permitted subclasses in the `permits` clause

## Code Examples

See the `examples/` directory:
- `ShapeExample.java` — sealed class with `Shape`, `Circle`, `Rectangle`, `Triangle`, and `Square`
- `SealedInterfaceDemo.java` — sealed `Expression` interface with `Constant` and `Addition`

## Common Pitfalls
- **Permitted subclasses not in the same module/package** — the compiler requires same module (or same package if unnamed module)
- **Missing permits clause** — a `sealed` class without `permits` won't compile
- **Subclass without proper modifier** — permitted subclasses must be `final`, `sealed`, or `non-sealed`
- **Sealed class must be abstract or have constructors accessible** — you can't directly instantiate a sealed class

## Exercises

See `exercises/README.md` for practice problems.

## Quiz

1. Which keyword is used to declare a sealed class?
   a) `restricted`
   b) `sealed`
   c) `closed`
   d) `final`

2. What modifier must each permitted subclass of a sealed class have?
   a) `public`
   b) `abstract`
   c) `final`, `sealed`, or `non-sealed`
   d) `static`

3. In which Java version were sealed classes standardized?
   a) Java 11
   b) Java 14
   c) Java 17
   d) Java 21

4. What does `non-sealed` mean on a subclass?
   a) The class cannot be instantiated
   b) The class reopens the hierarchy for unknown subclasses
   c) The class is final
   d) The class is abstract

5. What is a key benefit of sealed classes?
   a) They improve runtime performance
   b) They enable exhaustive pattern matching analysis by the compiler
   c) They allow multiple inheritance
   d) They automatically generate equals and hashCode

---

**Answers:** 1-b, 2-c, 3-c, 4-b, 5-b

## Key Takeaways
- Sealed classes give you fine-grained control over inheritance hierarchies
- Every permitted subclass must be `final`, `sealed`, or `non-sealed`
- Sealed interfaces work the same way as sealed classes
- The compiler can verify exhaustive pattern matching over sealed types
- All permitted subclasses must reside in the same module (or package for unnamed modules)

## Next Module
[Module 85: Pattern Matching](../module-85-pattern-matching/README.md)
