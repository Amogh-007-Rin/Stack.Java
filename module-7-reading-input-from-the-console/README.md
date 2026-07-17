# Module 7: Reading Input from the Console

## Overview

Java reads console input via the `Scanner` class (from `java.util`). Unlike Python's `input()` or C's `scanf()`, `Scanner` requires explicit import and provides typed methods (`nextInt()`, `nextLine()`, etc.). The `nextInt()`-then-`nextLine()` pitfall is a classic Java gotcha.

## Learning Objectives

- Import and use `java.util.Scanner`
- Read different data types with `nextInt()`, `nextDouble()`, `nextLine()`
- Understand and avoid the `nextInt()` + `nextLine()` problem
- Use `hasNextXxx()` methods for safe input handling

## Prerequisites

This module builds on Module 6: Operators.

## Theory

### Basic Scanner Usage

```java
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);
int age = scanner.nextInt();
String name = scanner.nextLine();
scanner.close();
```

### The `nextInt()` / `nextLine()` Problem

`nextInt()` reads the integer token but **leaves the newline** in the buffer. A subsequent `nextLine()` immediately consumes that leftover newline and returns an empty string.

**Fix**: Add an extra `scanner.nextLine()` after `nextInt()` to consume the newline, or always use `nextLine()` and parse manually.

```java
// Problematic:
int age = scanner.nextInt();
String name = scanner.nextLine();  // reads leftover newline → empty string

// Fixed:
int age = scanner.nextInt();
scanner.nextLine();                // consume newline
String name = scanner.nextLine();
```

### hasNextXxx() Methods

Check whether the next token is of a given type without blocking on invalid input.

```java
if (scanner.hasNextInt()) {
    int value = scanner.nextInt();
}
```

## Code Examples

- `BasicScanner.java` — Reads an int, a double, and a string
- `NextIntNextLine.java` — Demonstrates the pitfall and the fix
- `HasNextExample.java` — Safe input with hasNextInt() and loops

## Common Pitfalls

- **Forgetting to import `java.util.Scanner`**.
- **Not closing the `Scanner`** (resource leak; IDE warns).
- **`nextInt()` + `nextLine()` skip** — always consume the leftover newline.
- **`next()` vs `nextLine()`**: `next()` reads a single token (no spaces); `nextLine()` reads the entire line.

## Exercises

See `exercises/README.md`.

## Quiz

1. Which package contains `Scanner`?
   a) java.lang  b) java.util  c) java.io  d) java.input

2. What does `scanner.nextInt()` do if the input is "abc"?
   a) Returns 0  b) Returns null  c) Throws InputMismatchException  d) Skips it

3. After `scanner.nextInt()`, what remains in the buffer?
   a) Nothing  b) A space  c) A newline  d) The entire next line

4. How do you read an entire line including spaces?
   a) `next()`  b) `nextToken()`  c) `nextLine()`  d) `readLine()`

5. `scanner.close()` also closes:
   a) System.out  b) System.in  c) Both  d) Nothing

---

Answers: 1-b, 2-c, 3-c, 4-c, 5-b

## Key Takeaways

- Always `import java.util.Scanner;`.
- Use `nextLine()` to consume the leftover newline after `nextInt()` / `nextDouble()` / `next()`.
- Prefer `hasNextXxx()` for robust input validation.
- Close the `Scanner` when done (especially in long-running apps).

## Next Module

Module 8: Strings and String Methods
