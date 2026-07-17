# Module 55: Functional Interfaces

## Overview

Java 8 introduced the `java.util.function` package with a set of general-purpose functional interfaces. These interfaces serve as "target types" for lambda expressions and method references. Understanding them is essential for working with the Streams API and writing functional-style Java.

## Learning Objectives

- Use `Predicate<T>`, `Function<T,R>`, `Consumer<T>`, and `Supplier<T>` effectively
- Recognize `UnaryOperator<T>`, `BinaryOperator<T>`, and their relationships
- Annotate custom interfaces with `@FunctionalInterface`
- Apply primitive specializations like `IntPredicate`, `DoubleConsumer`
- Compose functions using `andThen`, `compose`, `and`, `or`, `negate`

## Prerequisites

- Module 54: Lambda Expressions
- Module 43: Generics Basics

## Theory

### Core Functional Interfaces

| Interface        | Method              | Signature              | Purpose                         |
|------------------|---------------------|------------------------|---------------------------------|
| `Predicate<T>`   | `test(T)`           | `T -> boolean`         | Test a condition                |
| `Function<T,R>`  | `apply(T)`          | `T -> R`               | Transform input to output       |
| `Consumer<T>`    | `accept(T)`         | `T -> void`            | Consume a value, no return      |
| `Supplier<T>`    | `get()`             | `() -> T`              | Supply a value, no input        |
| `UnaryOperator<T>` | `apply(T)`        | `T -> T`               | Specialization of `Function` where input/output same type |
| `BinaryOperator<T>` | `apply(T,T)`     | `(T,T) -> T`           | Two inputs, one output, same type |

### @FunctionalInterface Annotation

This annotation tells the compiler to enforce that the interface has exactly one abstract method.

```java
@FunctionalInterface
interface MyPredicate<T> {
    boolean test(T t);
    // boolean other();  // compile error
}
```

### Primitive Specializations

Autoboxing is expensive in tight loops. Primitive specializations avoid it:

- `IntPredicate`, `LongPredicate`, `DoublePredicate`
- `IntFunction<R>`, `DoubleToIntFunction`, etc.
- `IntConsumer`, `LongConsumer`, `DoubleConsumer`
- `IntSupplier`, `BooleanSupplier`

### Composing Functional Interfaces

```java
// Function composition
Function<String, String> trim = String::strip;
Function<String, String> upper = String::toUpperCase;
Function<String, String> transform = trim.andThen(upper);

// Predicate composition
Predicate<String> nonNull = Objects::nonNull;
Predicate<String> nonEmpty = s -> !s.isEmpty();
Predicate<String> valid = nonNull.and(nonEmpty).negate();
```

## Code Examples

- `BuiltInInterfaces.java` — Demonstrates Predicate, Function, Consumer, Supplier
- `PrimitiveSpecializations.java` — IntPredicate, DoubleConsumer, BooleanSupplier
- `ComposingFunctions.java` — andThen, compose, and, or, negate

## Common Pitfalls

- **Using `Function` when `UnaryOperator` fits**: prefer `UnaryOperator<T>` for same-type transforms.
- **Forgetting `@FunctionalInterface`**: the annotation is optional but provides compile-time safety.
- **Autoboxing overhead**: use primitive specializations in performance-sensitive code.
- **Confusing `compose` with `andThen`**: `f.andThen(g)` runs `f` then `g`; `f.compose(g)` runs `g` then `f`.
- **Side effects in `Predicate`**: predicates should be stateless and side-effect-free.

## Exercises

See `exercises/README.md`.

## Quiz

1. Which interface should you use for a function that takes a `String` and returns an `Integer`?
   a) `Predicate<String>`
   b) `Function<String, Integer>`
   c) `Consumer<String>`
   d) `Supplier<Integer>`

2. What is the abstract method of `Consumer<T>`?
   a) `test`
   b) `apply`
   c) `accept`
   d) `get`

3. `UnaryOperator<T>` is a special case of which interface?
   a) `Predicate<T>`
   b) `Function<T, T>`
   c) `Consumer<T>`
   d) `Supplier<T>`

4. `f.andThen(g)` means:
   a) Apply `g` first, then `f`
   b) Apply `f` first, then `g`
   c) Apply both simultaneously
   d) Apply `f` only if `g` fails

5. Which primitive specialization avoids boxing in a `for` loop summing integers?
   a) `IntPredicate`
   b) `IntConsumer`
   c) `IntSupplier`
   d) `IntFunction`

---

Answers: 1-b, 2-c, 3-b, 4-b, 5-b (though IntSupplier also works; IntConsumer is the typical accumulation case)

## Key Takeaways

- The `java.util.function` package provides reusable functional interfaces for common patterns.
- `@FunctionalInterface` enforces single-abstract-method contracts.
- Primitive specializations avoid autoboxing overhead.
- Interface composition enables building complex logic from simple pieces.

## Next Module

Module 56: Method References — an even more concise way to write lambdas
