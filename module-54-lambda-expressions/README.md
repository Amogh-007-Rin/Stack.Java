# Module 54: Lambda Expressions

## Overview

Lambda expressions introduce functional-style programming to Java. A lambda is a concise way to implement a **single abstract method** (SAM) — essentially a block of code that can be passed around like data. Lambdas enable cleaner, more expressive code, especially when working with collections and streams.

## Learning Objectives

- Write lambdas using the syntax `(params) -> expression` and `(params) -> { statements }`
- Understand the relationship between lambdas and functional interfaces
- Leverage type inference to omit parameter types
- Explain variable capture and the "effectively final" requirement
- Compare Java lambdas with Python lambdas and JavaScript arrow functions

## Prerequisites

- Module 38: Anonymous Classes (lambdas are a more concise alternative)
- Module 43: Generics Basics

## Theory

### Lambda Syntax

A lambda expression has three parts: a parameter list, an arrow token (`->`), and a body.

```java
// Single expression — implicit return
(int a, int b) -> a + b

// Single parameter — parentheses optional
x -> x * x

// Multiple statements — braces required
(String s) -> {
    String upper = s.toUpperCase();
    return upper.length();
}

// No parameters
() -> System.out.println("Hello")
```

### Functional Interface

A functional interface is any interface with exactly **one abstract method**. Lambdas are used to instantiate such interfaces anonymously.

```java
@FunctionalInterface
interface BinaryOperation {
    int apply(int a, int b);
}

BinaryOperation add = (a, b) -> a + b;
```

### Type Inference

The compiler deduces parameter types from the target functional interface method signature, so you can often omit them.

```java
BinaryOperation multiply = (x, y) -> x * y;  // types inferred as int
```

### Variable Capture

Lambdas can access local variables from the enclosing scope, but those variables must be **effectively final** — not reassigned after initialization.

```java
int factor = 10;
BinaryOperation multiplyByFactor = (x, y) -> (x + y) * factor;  // OK
// factor = 5;  // would cause compile error
```

### Comparison with Other Languages

| Feature              | Java Lambda                    | Python Lambda       | JS Arrow Function         |
|----------------------|--------------------------------|---------------------|---------------------------|
| Syntax               | `(x) -> x + 1`                | `lambda x: x + 1`   | `x => x + 1`              |
| Multiple statements  | Yes, with `{}`                 | No (single expr)    | Yes, with `{}`            |
| `this` binding       | Same as enclosing scope        | N/A                 | Lexical (not own `this`)  |
| Variable capture     | Effectively final              | Any variable        | Any (closure)             |
| Type annotations     | Optional (inferred)            | No                  | Optional (TypeScript)     |

## Code Examples

- `LambdaSyntax.java` — All lambda forms: no params, single param, multi-statement, type inference
- `VariableCapture.java` — Demonstrates effectively final capture and why reassignment fails
- `LambdaComparison.java` — Java lambda vs anonymous class vs Python/JS style comments

## Common Pitfalls

- **Forgetting braces** for multi-statement bodies: `(x, y) -> { return x + y; }` needs `{}` and `return`.
- **Reassigning a captured variable**: triggers "local variables referenced from a lambda must be effectively final."
- **Using `var` ambiguously**: `(var x, var y) -> x + y` requires all-or-nothing; mixed styles fail.
- **Confusing lambdas with inner classes**: `this` inside a lambda refers to the enclosing class, not the lambda's "own" instance.

## Exercises

See `exercises/README.md`.

## Quiz

1. Which of the following is valid lambda syntax?
   a) `(int x, int y) -> x + y;`
   b) `(int x, y) -> x + y;`
   c) `int x -> x * x;`
   d) `() => System.out.println("Hi");`

2. A variable captured by a lambda must be:
   a) `final` explicitly declared
   b) Effectively final
   c) Mutable
   d) Static

3. What does `(x, y) -> x * y;` rely on for type inference?
   a) The variable name
   b) The target functional interface method signature
   c) The return statement
   d) Explicit type casting

4. How many abstract methods can a functional interface have?
   a) 0
   b) 1
   c) 2
   d) Unlimited

5. Inside a lambda, `this` refers to:
   a) The lambda itself
   b) The enclosing class instance
   c) The functional interface instance
   d) `null`

---

Answers: 1-a, 2-b, 3-b, 4-b, 5-b

## Key Takeaways

- Lambdas provide a concise syntax for single-method interfaces.
- The compiler infers parameter types from the target functional interface.
- Captured variables must be effectively final.
- Lambdas are more concise than anonymous classes but less expressive than full method definitions.

## Next Module

Module 55: Functional Interfaces — the `java.util.function` package
