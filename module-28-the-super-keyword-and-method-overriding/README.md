# Module 28: The `super` Keyword and Method Overriding

## Overview
The `super` keyword references the immediate parent class. It is used to access superclass fields, call superclass methods, and invoke superclass constructors. This module also formalizes the rules for method overriding and introduces the `@Override` annotation.

## Learning Objectives
- Use `super.field` to access a hidden superclass field
- Use `super.method()` to call an overridden superclass method
- Use `super()` to invoke a superclass constructor
- Apply the `@Override` annotation correctly
- Understand overriding rules: same signature, covariant return, can't reduce visibility

## Prerequisites
- Module 27 — Inheritance Basics
- Module 23 — The `this` Keyword

## Theory

### `super.field` — Accessing Superclass Fields
If a subclass declares a field with the same name as a superclass field, the superclass field is hidden. Use `super.field` to access it.

### `super.method()` — Calling Overridden Methods
A subclass can call the superclass version of an overridden method:

```java
@Override
void display() {
    super.display();  // call parent's version
    System.out.println("Additional subclass info");
}
```

### `super()` — Constructor Call
Every constructor must call a superclass constructor (directly or indirectly). If not written, the compiler inserts `super()` (no-arg). Use `super(args)` to call a parameterized superclass constructor.

```java
class Dog extends Animal {
    Dog(String name) {
        super(name);  // calls Animal(String) constructor
    }
}
```

### `@Override` Annotation
- Tells the compiler: "I intend to override a method."
- Causes a **compile error** if no matching superclass method exists.
- Catches typos and signature mismatches early.

### Rules for Overriding
1. **Same signature** — Method name and parameter list must match exactly.
2. **Covariant return type** — The return type can be a subtype of the original (Java 5+).
3. **Cannot reduce visibility** — The overriding method cannot be more restrictive (e.g., `public` → `private`).
4. **Cannot throw broader checked exceptions** (covered in exceptions module).

## Code Examples
See `examples/` for `Item.java`, `Book.java`, `DVD.java`, and `OverrideDemo.java`.

## Common Pitfalls
- **Forgetting `super()` in constructors** — The compiler inserts it, but if the parent lacks a no-arg constructor, compilation fails.
- **Accidental overloading instead of overriding** — Different parameter list means overloading, not overriding.
- **Reducing visibility** — Changing `public` to `protected` in an override causes a compile error.

## Exercises
Complete the exercises in `exercises/README.md`.

## Quiz

**Q1:** What does `super()` do in a constructor?
**Q2:** True or False: When overriding a method, you can change the return type to any type.
**Q3:** Can an overriding method have a more restrictive access modifier (e.g., `public` → `private`)?
**Q4:** What happens if you use `@Override` on a method that doesn't override anything?
**Q5:** If `super.display()` is called inside an overridden `display()`, which version runs?

---

**A1:** It calls the superclass constructor (must be first statement).
**A2:** False — only covariant return types are allowed (a subtype of the original).
**A3:** No — you cannot reduce visibility in an override.
**A4:** Compile error.
**A5:** The superclass version runs first, then the rest of the subclass method.

## Key Takeaways
- `super` accesses parent class members.
- `super()` must be the first statement in a constructor.
- `@Override` prevents accidental overloading.
- Overriding rules: same signature, covariant return, no reduced visibility.

## Next Module
Module 29 — Polymorphism: compile-time vs runtime, dynamic method dispatch, and `instanceof`.
