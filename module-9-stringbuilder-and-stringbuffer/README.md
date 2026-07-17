# Module 9: StringBuilder and StringBuffer

## Overview

String concatenation with `+` in a loop creates many intermediate String objects, hurting performance. `StringBuilder` (non-thread-safe, faster) and `StringBuffer` (thread-safe, slower) are mutable alternatives. Prefer `StringBuilder` unless thread safety is required.

## Learning Objectives

- Understand why `StringBuilder` exists (performance)
- Use `append()`, `insert()`, `delete()`, `reverse()`, `toString()`
- Distinguish `StringBuilder` from `StringBuffer`
- Recognize when to use `StringBuilder` instead of `+`

## Prerequisites

This module builds on Module 8: Strings and String Methods.

## Theory

### The Problem with String Concatenation in Loops

```java
String s = "";
for (int i = 0; i < 1000; i++) {
    s += i;  // creates a new String object each iteration
}
```

Each `+=` creates a new String, copies the old content, and appends. This is O(n²). `StringBuilder` is O(n).

### StringBuilder

```java
StringBuilder sb = new StringBuilder();
sb.append("Hello");
sb.append(" ");
sb.append("World");
String result = sb.toString();  // "Hello World"
```

### Key Methods

| Method | Description |
|--------|-------------|
| `append(x)` | Appends the string representation of x |
| `insert(offset, x)` | Inserts at position offset |
| `delete(start, end)` | Removes characters from start to end-1 |
| `reverse()` | Reverses the sequence |
| `toString()` | Returns the built String |

### StringBuffer vs StringBuilder

- **StringBuilder** (Java 5+): not thread-safe, faster.
- **StringBuffer** (Java 1.0+): thread-safe (synchronized methods), slower.

In single-threaded code, always use `StringBuilder`.

## Code Examples

- `StringBuilderDemo.java` — Common StringBuilder operations
- `PerformanceComparison.java` — Benchmarks `+` vs StringBuilder in a loop

## Common Pitfalls

- **Not calling `toString()`** — forgetting to convert back to String.
- **Using `StringBuffer` in single-threaded code** — unnecessary synchronization overhead.
- **Concatenating in a loop with `+`** — the compiler optimizes simple cases (e.g., `"a" + "b"`) but NOT loops.
- **Chaining methods** — `append()` returns `this`, so chain when possible: `sb.append("a").append("b")`.

## Exercises

See `exercises/README.md`.

## Quiz

1. Which class is NOT thread-safe?
   a) StringBuffer  b) StringBuilder  c) String  d) Both a and c

2. `StringBuilder` was introduced in which Java version?
   a) 1.0  b) 1.2  c) 1.5  d) 8

3. Which method converts StringBuilder to String?
   a) `toStr()`  b) `string()`  c) `toString()`  d) `build()`

4. What does `new StringBuilder("abc").reverse().toString()` return?
   a) "abc"  b) "cba"  c) ""  d) "abccba"

5. String concatenation with `+` in a loop is:
   a) O(n)  b) O(n²)  c) O(log n)  d) O(1)

---

Answers: 1-b, 2-c, 3-c, 4-b, 5-b

## Key Takeaways

- `StringBuilder` is the mutable alternative to `String`.
- Use `StringBuilder` for repeated concatenation, especially in loops.
- `StringBuffer` is the thread-safe version; prefer `StringBuilder` by default.
- Chain method calls for cleaner code.

## Next Module

Module 10: Conditional Statements
