# Module 40: Checked vs Unchecked Exceptions

## Overview
Java distinguishes between checked exceptions (must be handled or declared) and unchecked exceptions (runtime exceptions that don't require explicit handling). This is a unique Java feature not found in Python or JavaScript.

## Learning Objectives
- Distinguish between checked and unchecked exceptions
- Handle checked exceptions with try-catch or declare with `throws`
- Recognize RuntimeException subclasses as unchecked
- Decide when to use each type
- Understand how Python/JS differ (all exceptions are unchecked)

## Prerequisites
- Module 39: Exception Handling Basics

## Theory

### Checked Exceptions
Checked exceptions are checked at compile time. The compiler forces you to either handle them (try-catch) or declare them in the method signature with `throws`.

```java
// Checked: must handle or declare
try {
    FileReader reader = new FileReader("file.txt");
} catch (FileNotFoundException e) {
    // required by compiler
}
```

### Unchecked Exceptions (RuntimeException)
Unchecked exceptions extend `RuntimeException`. The compiler does not enforce handling. They represent programming errors like null pointers, invalid arguments, or division by zero.

```java
// Unchecked: compiler does not require handling
int x = 10 / 0; // ArithmeticException at runtime
```

### The `throws` Keyword
When a method doesn't want to handle a checked exception itself, it can declare it with `throws`:

```java
void readFile(String path) throws IOException {
    FileReader reader = new FileReader(path);
}
```

### When to Use Each
| Situation | Exception Type |
|-----------|---------------|
| External failures (file I/O, network, DB) | Checked |
| Programming bugs (null, index, args) | Unchecked |
| Invalid arguments | Unchecked (IllegalArgumentException) |
| Recoverable external errors | Checked |
| Precondition violations | Unchecked |

### Python/JS Comparison
- In **Python**, all exceptions are unchecked; no compiler enforcement
- In **JavaScript**, there is no checked/unchecked distinction
- Java's design forces developers to handle recoverable errors, reducing silent failures

## Code Examples
- `CheckedExceptionDemo.java` — handling checked exceptions
- `UncheckedExceptionDemo.java` — runtime exceptions
- `ThrowsKeywordDemo.java` — using `throws` in method signatures

## Common Pitfalls
- Catching checked exceptions when you should let them propagate
- Declaring `throws Exception` too broadly
- Ignoring checked exceptions with empty catch blocks
- Using checked exceptions for programming errors (use unchecked instead)
- Overusing checked exceptions in large call chains

## Exercises
Four exercises in `exercises/README.md`.

## Quiz
1. Which of the following is a checked exception?
   a) NullPointerException  b) IOException  c) ArithmeticException  d) ArrayIndexOutOfBoundsException

2. What does the `throws` keyword do?
   a) Throws a new exception  b) Declares that a method may throw an exception  c) Catches an exception  d) Creates an exception

3. Which exception type does NOT require handling or declaration?
   a) Checked exception  b) RuntimeException  c) Error  d) Both b and c

4. Why does Java have checked exceptions?
   a) To make code slower  b) To force programmers to handle recoverable failures  c) To replace return values  d) To simplify syntax

5. In Python, all exceptions are:
   a) Checked  b) Unchecked  c) Neither  d) Both

---
Answers: 1-b, 2-b, 3-d, 4-b, 5-b

## Key Takeaways
- Checked exceptions = compile-time enforcement; unchecked = runtime
- Use `throws` to propagate checked exceptions
- RuntimeException subclasses are unchecked
- Use checked for recoverable external failures, unchecked for programming bugs

## Next Module
Module 41: Custom Exceptions — creating your own exception types.
