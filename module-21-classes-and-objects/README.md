# Module 21: Classes and Objects

## Overview
This module introduces the fundamental syntax of Java classes. You will learn how to declare a class with fields and methods, create objects using the `new` keyword, and access members with dot notation. We also review the distinction between primitive types and reference types.

## Learning Objectives
- Declare a class with fields and methods
- Instantiate objects using the `new` keyword
- Access fields and call methods using dot notation
- Understand the difference between primitive and reference variables
- Write a simple `Student` class as a working example

## Prerequisites
- Module 4 — Variables and Primitive Data Types
- Module 16 — Methods
- Module 20 — OOP Concepts (recommended)

## Theory

### Class Declaration
A class is declared using the `class` keyword followed by the class name (PascalCase by convention):

```java
class ClassName {
    // fields (state)
    // methods (behavior)
}
```

### Fields and Methods
- **Fields** are variables declared inside a class. They hold the state of an object.
- **Methods** define the behavior. They look the same as in procedural Java but belong to the class.

### Creating Objects
Use `new` to create an instance:

```java
ClassName variableName = new ClassName();
```

`new` allocates memory for the object on the heap and returns a **reference** (memory address) stored in the variable.

### Dot Notation
Access fields and call methods using the `.` operator:

```java
variableName.fieldName = value;
variableName.methodName();
```

### Primitive vs Reference
- **Primitive types** (`int`, `double`, `boolean`, `char`, etc.) store values directly.
- **Reference types** (arrays, classes, `String`) store a reference (pointer) to the object on the heap.
- Two reference variables can point to the same object.

## Code Examples
See `examples/` for `Student.java` and `StudentDemo.java`.

## Common Pitfalls
- **Forgetting `new`** — Declaring `Student s;` only creates a reference (null), not an object. You must call `new Student()`.
- **NullPointerException** — Calling a method on a null reference crashes at runtime.
- **Mixing up `=` for reference types** — Assigning one reference variable to another does **not** copy the object; both point to the same object.

## Exercises
Complete the exercises in `exercises/README.md`.

## Quiz

**Q1:** What keyword is used to create a new object?
**Q2:** True or False: A class is a blueprint, and an object is an instance of a class.
**Q3:** What is the output of `System.out.println(str)` if `String str;` is declared as a field of a class (not initialized)?
**Q4:** If `Book b1 = new Book(); Book b2 = b1;`, how many `Book` objects exist on the heap?
**Q5:** Which operator is used to access fields and methods of an object?

---

**A1:** `new`
**A2:** True
**A3:** `null` (fields default to null for reference types)
**A4:** One. Both `b1` and `b2` reference the same object.
**A5:** Dot (`.`)

## Key Takeaways
- A class defines fields (state) and methods (behavior).
- Objects are created with `new` and accessed with dot notation.
- Reference variables store a pointer to the object, not the object itself.
- Distinguish between primitives (value stored directly) and references (pointer to object).

## Next Module
Module 22 — Constructors: initializing objects with constructors, overloading, and constructor chaining.
