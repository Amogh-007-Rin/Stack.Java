# Module 97: Best Practices and Clean Code in Java

## Overview
Writing code that works is the minimum. Writing code that is readable, maintainable, and robust separates professionals from beginners. This module covers naming conventions, core principles (DRY, KISS, YAGNI), key items from *Effective Java*, and a practical code review checklist.

## Learning Objectives
- Apply Java naming conventions consistently
- Explain and apply DRY, KISS, and YAGNI
- Understand and apply *Effective Java* items: composition over inheritance, minimize mutability, try-with-resources
- Write readable code with meaningful names, small methods, and no magic numbers
- Perform a code review using a structured checklist

## Prerequisites
- All modules through 96 (some comfort with OOP, exceptions, and I/O)

## Theory

### Naming Conventions
| Element | Convention | Example |
|---------|-----------|---------|
| Class | PascalCase | `CustomerRepository` |
| Method | camelCase | `findById()` |
| Variable | camelCase | `totalCount` |
| Constant | UPPER_SNAKE | `MAX_RETRY_COUNT` |
| Package | lowercase.dot | `com.example.util` |

### Principles

**DRY — Don't Repeat Yourself**
Extract duplicated logic into a method or class. Duplication is the root of many maintenance bugs.

**KISS — Keep It Simple, Stupid**
Prefer the simplest solution that works. Avoid over-engineering.

**YAGNI — You Ain't Gonna Need It**
Don't add functionality "just in case." Build what is required now.

### Effective Java Highlights

**Prefer composition over inheritance**
```java
// Fragile — inherits all Stack behavior even if you only need a subset
class MyStack extends Stack<String> { ... }

// Flexible — compose with a delegate
class MyStack {
    private final Stack<String> delegate = new Stack<>();
    public void push(String s) { delegate.push(s); }
}
```

**Minimize mutability**
Make fields `final`, don't provide setters unless required. Immutable objects are thread-safe, simpler to reason about, and cacheable.

**Favor try-with-resources**
```java
// Java 7+ — resources are auto-closed
try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
    return br.readLine();
}
```

### Code Review Checklist
1. Does the code follow naming conventions?
2. Are there magic numbers? Extract constants.
3. Are methods small and focused (single responsibility)?
4. Are there null checks or defensive copies where needed?
5. Are resources closed (try-with-resources)?
6. Is there duplicated code?
7. Are exceptions handled appropriately (not swallowed)?
8. Are there unit tests covering edge cases?

## Code Examples
- `NamingDemo.java` — examples of good vs bad naming
- `CompositionDemo.java` — composition over inheritance
- `TryWithResourcesDemo.java` — resource management
- `MagicNumbersDemo.java` — eliminating magic numbers

## Common Pitfalls
- Overusing inheritance for code reuse (fragile base class problem)
- Leaving magic numbers in business logic
- Making everything `public` with mutable fields
- Catching `Exception` broadly and swallowing it
- Writing methods longer than a screen

## Exercises
See `exercises/README.md`.

## Quiz

1. Which principle advises against building features you don't currently need?
   A) DRY  B) KISS  C) YAGNI  D) SOLID

2. According to *Effective Java*, which should you prefer over inheritance?
   A) Interfaces  B) Composition  C) Annotations  D) Abstract classes

3. What is the recommended Java construct for auto-closing resources?
   A) `finally` block  B) `try-with-resources`  C) `AutoCloseable.close()`  D) `finalize()`

4. Which naming convention is correct for a Java constant?
   A) `maxRetryCount`  B) `MAX_RETRY_COUNT`  C) `MaxRetryCount`  D) `max_retry_count`

5. What is a magic number?
   A) A number that causes an exception  B) A literal number without a named constant  C) A prime number  D) A number divisible by zero

---
Answers: 1-C, 2-B, 3-B, 4-B, 5-B

## Key Takeaways
- Clean code is intentional: follow conventions, apply principles, think about the next developer
- Favor composition, immutability, and try-with-resources as defaults
- Code review should be systematic, not personal
- Small methods with meaningful names are the single biggest readability win

## Next Module
Module 98: Debugging Techniques and Tools
