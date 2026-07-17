# Module 39: Exception Handling Basics

## Overview
Exceptions are events that disrupt the normal flow of a program. Java provides a robust mechanism to handle runtime errors gracefully using `try`, `catch`, and `finally` blocks, preventing abrupt termination.

## Learning Objectives
- Understand what exceptions are and why they occur
- Use `try-catch` blocks to handle exceptions
- Use `finally` block for cleanup code
- Write multiple `catch` blocks in the correct order
- Understand the Java exception hierarchy (`Throwable` -> `Error` / `Exception` -> `RuntimeException`)

## Prerequisites
- Basic Java syntax (if/else, loops, methods)
- Method calls and stack traces

## Theory

### The try-catch Block
Code that might throw an exception is placed inside a `try` block. If an exception occurs, execution jumps to the matching `catch` block.

```java
try {
    int result = 10 / 0; // ArithmeticException
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero: " + e.getMessage());
}
```

### The finally Block
The `finally` block always executes regardless of whether an exception was thrown or caught. It is used for cleanup (closing files, releasing resources).

```java
try {
    // risky code
} catch (Exception e) {
    // handle
} finally {
    // always runs
}
```

### Multiple Catch Blocks
You can have multiple `catch` blocks for different exception types. Order matters: catch the most specific exception first, then more general ones.

```java
try {
    String s = null;
    s.length();
} catch (NullPointerException e) {
    // specific
} catch (RuntimeException e) {
    // more general
} catch (Exception e) {
    // most general
}
```

### Exception Hierarchy
```
Throwable
├── Error (unrecoverable, e.g. OutOfMemoryError)
└── Exception (recoverable)
    ├── RuntimeException (unchecked)
    └── IOException, SQLException, etc. (checked)
```

### Python/JS Comparison
- **Python**: `try-except-else-finally`; any exception can be caught without declaration
- **JavaScript**: `try-catch-finally` with `Error` objects; similar hierarchy
- **Java**: Compiler enforces checked exceptions; more verbose but safer

## Code Examples
- `TryCatchFinallyDemo.java` — basic try-catch-finally
- `MultipleCatchDemo.java` — multiple catch blocks in order
- `ExceptionHierarchyDemo.java` — demonstrates Throwable hierarchy

## Common Pitfalls
- Catching `Exception` too broadly (swallowing errors)
- Wrong order of catch blocks (unreachable code)
- Forgetting that `finally` runs even if `catch` re-throws
- Using `return` in `finally` overrides previous return
- Catching `Error` subtypes (shouldn't be caught)

## Exercises
Four exercises in `exercises/README.md`.

## Quiz
1. What must every try block have?
   a) A catch block  b) A finally block  c) At least one catch or finally  d) Both catch and finally

2. What happens if an exception is not caught?
   a) Program continues  b) Stack trace is printed and program terminates  c) Exception is ignored  d) finally block runs after termination

3. Which is the base class of all exceptions and errors?
   a) Exception  b) Error  c) Throwable  d) Object

4. In multiple catch blocks, the order should be:
   a) General to specific  b) Specific to general  c) Alphabetical  d) Any order

5. When does finally NOT execute?
   a) When an exception is caught  b) When no exception occurs  c) When System.exit() is called  d) Always executes

---
Answers: 1-c, 2-b, 3-c, 4-b, 5-c

## Key Takeaways
- `try` wraps risky code, `catch` handles exceptions, `finally` cleans up
- Catch specific exceptions before general ones
- `Throwable` is the root; `Error` is for JVM failures
- Never swallow exceptions without handling them

## Next Module
Module 40: Checked vs Unchecked Exceptions — understanding the distinction the compiler enforces.
