# Module 24: Access Modifiers

## Overview
Access modifiers control where classes, fields, methods, and constructors can be accessed from. Java provides four levels: `public`, `protected`, default (package-private), and `private`. This module explains each level and when to use them.

## Learning Objectives
- Understand the four access levels in Java
- Apply `public`, `private`, `protected`, and default visibility
- Read and interpret a visibility table
- Follow best practices: prefer `private` by default

## Prerequisites
- Module 21 — Classes and Objects
- Module 23 — The `this` Keyword

## Theory

### The Four Access Levels

| Modifier | Same Class | Same Package | Subclass (different pkg) | Anywhere |
|----------|-----------|-------------|--------------------------|----------|
| `private` | Yes | No | No | No |
| default (none) | Yes | Yes | No | No |
| `protected` | Yes | Yes | Yes | No |
| `public` | Yes | Yes | Yes | Yes |

### `private`
- Members are accessible only within the same class.
- Use for internal implementation details (fields, helper methods).

### Default (Package-Private)
- No modifier written. Accessible from any class in the same package.
- Used when you need visibility within a package but not outside.

### `protected`
- Accessible from the same package **and** subclasses in other packages.
- Useful for base class members that subclasses need but external code should not see.

### `public`
- Accessible from anywhere.
- Use for the class's API — methods that external code is meant to call.

### Best Practice: Prefer `private`
Start with the most restrictive access level (`private`) and increase visibility only when needed. This principle is called **information hiding** and supports encapsulation (Module 25).

## Code Examples
See `examples/` for access modifier demonstrations using a library-themed package.

## Common Pitfalls
- **Over-exposing fields** — Making everything `public` breaks encapsulation and creates tight coupling.
- **Confusing `protected` with default** — `protected` adds visibility to subclasses in other packages; default does not.
- **Thinking access modifiers apply to local variables** — Local variables inside methods cannot have access modifiers.

## Exercises
Complete the exercises in `exercises/README.md`.

## Quiz

**Q1:** Which access modifier allows access from anywhere?
**Q2:** If no access modifier is written, what is the visibility level?
**Q3:** True or False: A `private` field can be accessed from a subclass in the same package.
**Q4:** Which modifier allows access from subclasses in different packages?
**Q5:** What is the best practice when choosing access levels?

---

**A1:** `public`
**A2:** Default (package-private)
**A3:** False. `private` members are only accessible within the declaring class.
**A4:** `protected`
**A5:** Prefer the most restrictive level (`private`) and increase only when necessary.

## Key Takeaways
- Four access levels: `private`, default, `protected`, `public`.
- Use `private` for internal state, `public` for API methods.
- `protected` bridges package-private and public for inheritance.
- Information hiding reduces coupling and improves maintainability.

## Next Module
Module 25 — Encapsulation: combining private fields with public getters and setters.
