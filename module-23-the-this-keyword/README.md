# Module 23: The `this` Keyword

## Overview
The `this` keyword is a reference to the current object — the object whose method or constructor is being called. This module covers using `this` to access fields, call methods, invoke constructors, and return the current object for method chaining.

## Learning Objectives
- Use `this.field` to distinguish between parameters and fields
- Use `this.method()` to call another method on the same object
- Use `this()` for constructor chaining (reviewed from Module 22)
- Return `this` from a method to enable fluent/chained calls

## Prerequisites
- Module 22 — Constructors

## Theory

### What is `this`?
Inside any instance method or constructor, `this` refers to the object that the method was called on. It is an implicit reference automatically available.

### `this.field` — Distinguishing Parameter from Field
When a parameter has the same name as a field, the parameter **shadows** the field. Use `this.field` to refer to the field:

```java
class Book {
    String title;

    void setTitle(String title) {
        this.title = title;  // field = parameter
    }
}
```

### `this.method()` — Calling Another Method
You can call one instance method from another on the same object using `this`:

```java
void display() { ... }
void showDetails() {
    this.display();  // calls display() on this object
}
```

Using `this` for method calls is optional — Java adds it implicitly if omitted.

### `this()` — Constructor Chaining
As covered in Module 22, `this(...)` calls another constructor. It must be the first statement.

### Returning `this` for Method Chaining
A method can return `this` to allow chaining multiple calls in one statement:

```java
Book setTitle(String t) { this.title = t; return this; }
Book setAuthor(String a) { this.author = a; return this; }

// Usage:
new Book().setTitle("Moby Dick").setAuthor("Melville");
```

## Code Examples
See `examples/` for `BookWithThis.java` and `BookBuilderDemo.java`.

## Common Pitfalls
- **Omitting `this` when needed** — If a parameter shadows a field, the field is inaccessible without `this`.
- **Using `this` in a static context** — `this` cannot be used in static methods (Module 26).
- **Infinite chaining loops** — Be careful when chaining method calls that might recurse.

## Exercises
Complete the exercises in `exercises/README.md`.

## Quiz

**Q1:** What does `this` refer to inside an instance method?
**Q2:** Why would you write `this.name = name;` instead of `name = name;`?
**Q3:** True or False: `this()` can be used inside a regular method (not a constructor).
**Q4:** What does a method need to do to enable chaining like `obj.method1().method2()`?
**Q5:** Can `this` be used in a static method?

---

**A1:** The current object (the object on which the method was called).
**A2:** To distinguish the field `name` from the parameter `name` (parameter shadowing).
**A3:** False — `this()` can only be used in constructors, as the first statement.
**A4:** Return `this` from each method.
**A5:** No — `this` is not available in static contexts.

## Key Takeaways
- `this` is a reference to the current object.
- Use `this.field` when parameters shadow fields.
- `this()` chains constructors (must be first statement).
- Returning `this` enables fluent method chaining.

## Next Module
Module 24 — Access Modifiers: controlling visibility with `public`, `private`, `protected`, and default.
