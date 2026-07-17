# Module 29: Polymorphism

## Overview
Polymorphism ("many forms") is the ability of an object to take on multiple forms. Java supports two types: **compile-time polymorphism** (method overloading) and **runtime polymorphism** (method overriding). This module focuses on runtime polymorphism through parent references to child objects and dynamic method dispatch.

## Learning Objectives
- Distinguish compile-time (overloading) from runtime (overriding) polymorphism
- Use a parent reference to refer to a child object
- Understand dynamic method dispatch — the JVM calls the actual object's method at runtime
- Use the `instanceof` operator to check an object's type

## Prerequisites
- Module 27 — Inheritance Basics
- Module 28 — The `super` Keyword and Method Overriding
- Module 17 — Method Overloading

## Theory

### Compile-Time Polymorphism (Overloading)
Multiple methods with the **same name** but **different parameters** in the same class. The correct method is chosen at compile time based on the argument types.

```java
class Printer {
    void print(String s) { ... }
    void print(int i) { ... }
    void print(String s, int copies) { ... }
}
```

### Runtime Polymorphism (Overriding)
A subclass provides a specific implementation of a method already defined in its superclass. The JVM determines which method to call **at runtime** based on the actual object type.

### Parent Reference to Child Object
```java
Animal a = new Dog();  // Parent reference, child object
a.sound();             // Calls Dog's sound() at runtime
```

The reference type (`Animal`) determines **which members are accessible** (compile-time). The object type (`Dog`) determines **which method implementation runs** (runtime).

### Dynamic Method Dispatch
When an overridden method is called through a parent reference, Java looks at the actual object type at runtime and calls that version. This is dynamic method dispatch.

### `instanceof` Operator
Checks whether an object is an instance of a specific type:

```java
if (animal instanceof Dog) {
    Dog d = (Dog) animal;
    d.fetch();
}
```

## Code Examples
See `examples/` for `Animal.java`, `Dog.java`, `Cat.java`, and `PolymorphismDemo.java`.

## Common Pitfalls
- **Accessing subclass-specific members without casting** — The reference type determines what you can call. Cast down if needed.
- **ClassCastException** — Casting without checking with `instanceof` first.
- **Confusing overloading with overriding** — Overloading is compile-time, same class; overriding is runtime, between classes.

## Exercises
Complete the exercises in `exercises/README.md`.

## Quiz

**Q1:** What is the difference between compile-time and runtime polymorphism?
**Q2:** If `Animal a = new Dog(); a.sound();` which class's `sound()` method runs?
**Q3:** What operator checks if an object is of a certain type?
**Q4:** True or False: Method overloading is an example of runtime polymorphism.
**Q5:** What determines which members you can call on a parent reference?

---

**A1:** Compile-time (overloading) resolves at compile time; runtime (overriding) resolves at runtime based on the actual object.
**A2:** `Dog`'s `sound()` method (dynamic method dispatch).
**A3:** `instanceof`
**A4:** False — overloading is compile-time polymorphism.
**A5:** The reference type (compile-time type).

## Key Takeaways
- Overloading = compile-time polymorphism (same class, different params).
- Overriding = runtime polymorphism (subclass provides specific implementation).
- Parent references can hold child objects; method calls dispatch dynamically.
- Use `instanceof` before casting to avoid `ClassCastException`.

## Next Module
Module 30 — Abstract Classes: creating abstract methods and classes that cannot be instantiated.
