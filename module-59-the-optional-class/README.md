# Module 59: The Optional Class

## Overview

`Optional<T>` is a container object that may or may not contain a value. It provides a type-safe alternative to `null` for representing absent values, forcing callers to explicitly handle the "empty" case. Introduced in Java 8, it is a key tool for reducing `NullPointerException`s.

## Learning Objectives

- Understand the problem `Optional` solves compared to raw `null`
- Create `Optional` instances with `empty()`, `of()`, `ofNullable()`
- Check for values with `isPresent()` and `isEmpty()` (Java 11)
- Use safe methods: `ifPresent()`, `orElse()`, `orElseGet()`, `orElseThrow()`
- Transform values with `map()`, `flatMap()`, `filter()`
- Recognize when NOT to use `Optional`

## Prerequisites

- Module 54: Lambda Expressions
- Module 55: Functional Interfaces

## Theory

### Creating Optional

```java
Optional<String> empty = Optional.empty();
Optional<String> value = Optional.of("hello");    // throws NPE if null
Optional<String> nullable = Optional.ofNullable(maybeNull);  // empty if null
```

### Checking and Using

```java
Optional<String> opt = Optional.of("hello");

// Check
if (opt.isPresent()) { /* ... */ }
if (opt.isEmpty()) { /* ... */ }          // Java 11+

// Consume
opt.ifPresent(s -> System.out.println(s)); // no-op if empty

// Retrieve with fallback
String val = opt.orElse("default");
String val2 = opt.orElseGet(() -> computeDefault());  // lazy
String val3 = opt.orElseThrow();                     // Java 10+, throws NoSuchElementException
String val4 = opt.orElseThrow(IllegalStateException::new);
```

### Transforming

```java
Optional<Integer> length = opt.map(String::length);

Optional<String> upper = opt.flatMap(s -> Optional.of(s.toUpperCase()));

Optional<String> filtered = opt.filter(s -> s.length() > 3);
```

### When NOT to Use Optional

❌ **Fields** — `Optional` is not serializable and adds overhead.
```java
public class Person {
    private Optional<String> middleName;  // DON'T
}
```

❌ **Method parameters** — callers can always pass `null`.
```java
public void setName(Optional<String> name) { ... }  // DON'T
```

❌ **Serialization** — `Optional` does not implement `Serializable`.

✅ **Return values** — methods that may not have a result.
```java
public Optional<Customer> findById(long id) { ... }  // OK
```

## Code Examples

- `CreatingOptional.java` — empty, of, ofNullable, isPresent, isEmpty
- `UsingOptional.java` — ifPresent, orElse, orElseGet, orElseThrow
- `OptionalMapFilter.java` — map, flatMap, filter chaining
- `OptionalAntiPatterns.java` — common misuses to avoid

## Common Pitfalls

- **Calling `get()` without checking**: `opt.get()` on an empty Optional throws `NoSuchElementException`.
- **Using `Optional` for fields or parameters**: adds overhead and doesn't prevent null.
- **Returning `null` instead of `Optional.empty()`**: defeats the purpose.
- **Nesting `Optional`s**: `Optional<Optional<String>>` is a code smell; use `flatMap`.
- **Using `Optional` with collections**: `Optional<List<T>>` is rarely needed; use empty lists instead.

## Exercises

See `exercises/README.md`.

## Quiz

1. Which method creates an `Optional` that tolerates a `null` argument?
   a) `Optional.of()`
   b) `Optional.ofNullable()`
   c) `Optional.empty()`
   d) `Optional.fromNullable()`

2. What does `Optional.empty().orElse("default")` return?
   a) `null`
   b) `"default"`
   c) An empty `Optional`
   d) `NoSuchElementException`

3. What is the Java 11+ method that checks for absence?
   a) `isMissing()`
   b) `isAbsent()`
   c) `isEmpty()`
   d) `isNotPresent()`

4. Which method should you use to transform an `Optional<String>` to an `Optional<Integer>` safely?
   a) `map`
   b) `flatMap`
   c) `filter`
   d) `transform`

5. Which is a valid use of `Optional`?
   a) As a field in a serializable class
   b) As a method parameter
   c) As a method return type
   d) All of the above

---

Answers: 1-b, 2-b, 3-c, 4-a, 5-c

## Key Takeaways

- `Optional` forces explicit handling of absent values, reducing NPEs.
- Use `ofNullable()` when the source might be `null`.
- Prefer `orElseGet()` for expensive defaults (lazy evaluation).
- `Optional` is designed for return types, not fields or parameters.

## Next Module

Module 60: The Date and Time API — `java.time` for modern date/time handling
