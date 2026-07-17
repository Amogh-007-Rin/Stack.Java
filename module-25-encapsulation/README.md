# Module 25: Encapsulation

## Overview
Encapsulation is the practice of bundling data (fields) and methods that operate on that data into a single unit while restricting direct access to the internal state. This is achieved by making fields `private` and providing `public` getter and setter methods. Encapsulation is one of the four pillars of OOP.

## Learning Objectives
- Understand encapsulation as data hiding + controlled access
- Write private fields with public getters and setters
- Add validation logic inside setters
- Explain why encapsulation improves maintainability and safety

## Prerequisites
- Module 24 — Access Modifiers

## Theory

### What is Encapsulation?
Encapsulation means:
1. **Bundle** data and behavior into a single unit (class).
2. **Hide** internal state by marking fields `private`.
3. **Control** access through `public` methods (getters/setters).

### Private Fields, Public Getters/Setters
The standard pattern:

```java
class Book {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
```

### Validation in Setters
Setters can enforce rules:

```java
public void setAge(int age) {
    if (age < 0 || age > 150) {
        throw new IllegalArgumentException("Invalid age: " + age);
    }
    this.age = age;
}
```

### Why Encapsulation Matters
- **Protects invariants** — Objects always stay in a valid state.
- **Flexibility** — You can change internal implementation without affecting external code.
- **Debugging** — Add logging or breakpoints in setters to track changes.
- **Security** — Sensitive data can be protected.

### Immutable Objects
Sometimes you provide only getters (no setters) to create read-only or immutable objects.

## Code Examples
See `examples/` for `LibraryMember.java` and `MemberDemo.java`.

## Common Pitfalls
- **Writing redundant getters/setters** — Only add them if external code needs access.
- **Returning mutable references** — Returning a `List` or array directly exposes internal data. Return a copy instead.
- **Setters without validation** — If a setter just assigns without checks, consider making the field `public final` instead.

## Exercises
Complete the exercises in `exercises/README.md`.

## Quiz

**Q1:** What access modifier should fields have to achieve encapsulation?
**Q2:** What is the standard naming convention for a getter for the field `age`?
**Q3:** Why might you throw an exception inside a setter?
**Q4:** True or False: Encapsulation makes it harder to change internal implementation later.
**Q5:** What should a getter for a `List<String>` return to protect internal data?

---

**A1:** `private`
**A2:** `getAge()`
**A3:** To validate the input and reject invalid values that would break class invariants.
**A4:** False — encapsulation makes it easier because internal changes don't affect external code.
**A5:** A copy (e.g., `new ArrayList<>(internalList)`) or an unmodifiable view.

## Key Takeaways
- Encapsulation = private fields + public access methods.
- Validating in setters protects object integrity.
- Encapsulation reduces coupling and improves maintainability.
- Prefer immutability when an object should not change after creation.

## Next Module
Module 26 — The `static` Keyword: class-level fields, methods, and initializers.
