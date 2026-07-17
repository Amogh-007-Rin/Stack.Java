# Module 35: The Final Keyword

## Overview

The `final` keyword in Java has three distinct uses: **final variables** (constants that cannot be reassigned), **final methods** (methods that cannot be overridden), and **final classes** (classes that cannot be extended). Understanding `final` is essential for writing safe, immutable, and performant code.

## Learning Objectives

- Declare constants using `final` variables
- Understand blank final fields and constructor initialization
- Prevent method overriding with `final` methods
- Prevent inheritance with `final` classes
- Distinguish compile-time constants (`static final`) from runtime constants

## Prerequisites

- Module 24: Access Modifiers
- Module 26: The static Keyword
- Module 28: Method Overriding
- Module 27: Inheritance Basics

## Theory

### Final Variables

A `final` variable can be assigned only once. It is a constant.

```java
final int MAX_SIZE = 100;
MAX_SIZE = 200; // compile error
```

### Blank Final Fields

A `final` field that is not initialized at declaration must be initialized in every constructor.

```java
class Person {
    final int id;
    Person(int id) {
        this.id = id; // must be assigned
    }
}
```

### Compile-Time Constants

A `static final` field with a compile-time constant expression is a compile-time constant. The compiler inlines its value.

```java
public static final double PI = 3.14159;
```

### Final Methods

A `final` method cannot be overridden by subclasses.

```java
class Parent {
    final void display() { ... }
}
class Child extends Parent {
    void display() { ... } // compile error
}
```

### Final Classes

A `final` class cannot be extended.

```java
final class MathUtils { ... }
class ExtendedMath extends MathUtils { } // compile error
```

## Code Examples

- `FinalVariableDemo.java` — Final variables, blank finals, compile-time constants
- `FinalMethodDemo.java` — Final methods preventing override
- `FinalClassDemo.java` — Final class preventing extension
- `BlankFinalDemo.java` — Blank final fields initialized in constructors

## Common Pitfalls

- Trying to reassign a `final` variable (compile error)
- Trying to override a `final` method (compile error)
- Trying to extend a `final` class (compile error)
- Assuming `final` makes objects immutable (only the reference is fixed, not the object's state)
- Forgetting to initialize a blank final field in all constructors

## Exercises

See `exercises/README.md`.

## Quiz

1. A `final` variable can be assigned:
   a) Multiple times  b) Once  c) Never  d) Only in static blocks

2. A `final` method:
   a) Can be overridden  b) Cannot be overridden  c) Is always static  d) Is always private

3. A `final` class:
   a) Can be extended  b) Cannot be extended  c) Is always abstract  d) Cannot be instantiated

4. A blank final field must be initialized:
   a) At declaration  b) In every constructor  c) In a static block  d) Never

5. `static final` variables are also called:
   a) Instance variables  b) Local constants  c) Compile-time constants  d) Mutable constants

---

Answers: 1-b, 2-b, 3-b, 4-b, 5-c

## Key Takeaways

- `final` variables can only be assigned once
- `final` methods cannot be overridden
- `final` classes cannot be extended
- Blank final fields must be initialized in every constructor
- `static final` fields are compile-time constants

## Next Module

Module 36: Enums — type-safe enumerations in Java.
