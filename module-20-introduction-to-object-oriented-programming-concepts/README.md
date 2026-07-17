# Module 20: Introduction to Object-Oriented Programming Concepts

## Overview
Object-Oriented Programming (OOP) is a programming paradigm that organizes software design around **objects** rather than functions and logic. An object is a self-contained unit that contains both **data** (fields/attributes) and **behavior** (methods). This module introduces the core ideas behind OOP and contrasts it with procedural programming.

## Learning Objectives
- Understand what OOP is and why it was created
- Define objects, classes, state, and behavior
- List the benefits of OOP: modularity, reuse, maintainability
- Compare OOP with procedural programming (e.g., C)
- Recognize real-world domains that map naturally to objects

## Prerequisites
- Completion of Java basics (variables, loops, methods, arrays)
- Familiarity with procedural-style programming

## Theory

### What is OOP?
OOP is a programming paradigm built around four main principles:
1. **Encapsulation** — bundling data and methods together, hiding internal state
2. **Inheritance** — creating new classes based on existing ones
3. **Polymorphism** — treating objects of different types through a common interface
4. **Abstraction** — hiding complex implementation details

### Objects, Classes, State, and Behavior
- A **class** is a blueprint or template. It defines what fields (state) and methods (behavior) an object will have.
- An **object** is a concrete instance of a class. It has its own copy of the class's fields.
- **State** refers to the values of an object's fields at a given time.
- **Behavior** refers to what an object can do — the methods it can execute.

Example: A `Book` class might have fields `title`, `author`, `isbn` (state) and methods `checkOut()`, `returnBook()` (behavior).

### Benefits of OOP
- **Modularity** — Each object is a self-contained unit, making it easier to develop and debug in isolation.
- **Reuse** — Classes can be reused across projects. Inheritance allows building on existing code without rewriting.
- **Maintainability** — Code is organized around real-world entities, making it easier to understand and modify.

### Procedural vs OOP Comparison

| Aspect | Procedural (C) | OOP (Java) |
|--------|---------------|------------|
| Organization | Functions operate on separate data | Objects combine data + methods |
| Data Security | Data is global or passed around | Data can be hidden (private) |
| Reuse | Copy-paste or function libraries | Inheritance, composition |
| Modeling | Close to machine model | Close to real-world model |
| Scalability | Becomes messy at scale | Designed for large systems |

## Code Examples
See the `examples/` directory for runnable Java files.

## Common Pitfalls
- **Treating OOP as just "putting functions inside a class"** — OOP is a mindset, not a syntax trick.
- **Making everything public** — Encapsulation is a key benefit; hiding data matters.
- **Over-engineering** — Not every program needs deep class hierarchies. Start simple.

## Exercises
Complete the exercises in `exercises/README.md`.

## Quiz

**Q1:** What four principles form the foundation of OOP?
**Q2:** What is the difference between a class and an object?
**Q3:** True or False: In procedural programming, data and behavior are kept together in one unit.
**Q4:** Which OOP benefit allows you to create new classes based on existing ones?
**Q5:** Give one real-world example of an object and list two pieces of state and two behaviors it might have.

---

**A1:** Encapsulation, Inheritance, Polymorphism, Abstraction.
**A2:** A class is a blueprint/template; an object is a concrete instance of a class.
**A3:** False. In procedural programming, data and functions are separate.
**A4:** Inheritance.
**A5:** Example: a Car. State: speed, fuelLevel. Behavior: accelerate(), brake().

## Key Takeaways
- OOP organizes code around objects that combine state and behavior.
- The four pillars are encapsulation, inheritance, polymorphism, and abstraction.
- OOP improves modularity, code reuse, and maintainability for large projects.
- Java is an OOP language — everything (except primitives) is an object.

## Next Module
Module 21 — Classes and Objects: writing your first class, creating instances, and using dot notation.
