# Module 27: Inheritance Basics

## Overview
Inheritance is a core OOP mechanism that allows a class to acquire the fields and methods of another class. In Java, this is done using the `extends` keyword. Inheritance models an **IS-A** relationship (e.g., a Dog IS-A Animal). This module covers the basics of single inheritance and method overriding.

## Learning Objectives
- Use the `extends` keyword to create a subclass
- Understand the IS-A relationship
- Inherit fields and methods from a superclass
- Override methods in a subclass
- Recognize that Java supports only single inheritance

## Prerequisites
- Module 21 — Classes and Objects
- Module 24 — Access Modifiers

## Theory

### The `extends` Keyword
To create a subclass:

```java
class Animal {
    String name;
    void eat() { ... }
}

class Dog extends Animal {
    void bark() { ... }
}
```

`Dog` inherits `name` and `eat()` from `Animal`.

### IS-A Relationship
If `Dog extends Animal`, then a Dog **is an** Animal. This means:
- `Dog` can be used wherever `Animal` is expected.
- `Dog` objects have all `Animal` members (subject to access modifiers).

### Inheriting Fields and Methods
- `public` and `protected` members of the superclass are inherited.
- `private` members are NOT inherited (but still exist in the object).
- Default (package-private) members are inherited only if the subclass is in the same package.

### Overriding Methods (Basic)
A subclass can provide a new implementation of a method inherited from the superclass:

```java
class Animal {
    void sound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark");
    }
}
```

### Single Inheritance Only
Java does **not** support multiple inheritance of classes (a class cannot extend two classes). This avoids the "diamond problem." Java uses interfaces (Modules 31-32) as an alternative.

## Code Examples
See `examples/` for `Animal.java`, `Dog.java`, `Cat.java`, and `InheritanceDemo.java`.

## Common Pitfalls
- **Forgetting that `private` members are not inherited** — Private fields/methods exist in the object but are not directly accessible.
- **Overriding without `@Override`** — Omitting `@Override` may accidentally overload instead of override.
- **Confusing IS-A with HAS-A** — Inheritance is for IS-A relationships. Use composition (HAS-A) otherwise.

## Exercises
Complete the exercises in `exercises/README.md`.

## Quiz

**Q1:** What keyword is used to inherit from a class in Java?
**Q2:** True or False: In Java, a class can extend multiple classes.
**Q3:** If `Vehicle` is the superclass and `Car` extends `Vehicle`, what relationship does this model?
**Q4:** Which access modifier's members are NOT inherited by a subclass?
**Q5:** What annotation is recommended when overriding a method?

---

**A1:** `extends`
**A2:** False. Java supports only single inheritance for classes.
**A3:** IS-A (a Car IS-A Vehicle).
**A4:** `private`
**A5:** `@Override`

## Key Takeaways
- `extends` creates a subclass that inherits from a superclass.
- Inheritance models IS-A relationships.
- Methods can be overridden to provide specialized behavior.
- Java's single inheritance avoids the diamond problem.
- Use `@Override` to catch mistakes at compile time.

## Next Module
Module 28 — The `super` Keyword and Method Overriding: accessing superclass members from a subclass.
