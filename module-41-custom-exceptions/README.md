# Module 41: Custom Exceptions

## Overview
Java allows you to create your own exception classes by extending `Exception` (checked) or `RuntimeException` (unchecked). Custom exceptions make your code more expressive and allow for domain-specific error handling.

## Learning Objectives
- Create custom exception classes extending `Exception` or `RuntimeException`
- Implement constructors: default, with message, with cause
- Choose between checked and unchecked custom exceptions
- Apply best practices for custom exceptions

## Prerequisites
- Module 39: Exception Handling Basics
- Module 40: Checked vs Unchecked Exceptions

## Theory

### Extending Exception or RuntimeException
```java
// Checked custom exception
class InsufficientFundsException extends Exception { }

// Unchecked custom exception
class InvalidInputException extends RuntimeException { }
```

### Constructors
Custom exceptions should provide several constructors:

```java
public class MyException extends Exception {
    // Default constructor
    public MyException() { }

    // With message
    public MyException(String message) {
        super(message);
    }

    // With cause
    public MyException(Throwable cause) {
        super(cause);
    }

    // With message and cause
    public MyException(String message, Throwable cause) {
        super(message, cause);
    }
}
```

### Best Practices
- Name ends with "Exception" (e.g., `ValidationException`)
- Include constructors that match the base class
- Use unchecked exceptions for programming errors
- Use checked exceptions for recoverable conditions
- Document exceptions in Javadoc with `@throws`
- Keep the class focused on one error type

## Code Examples
- `SimpleCustomException.java` — basic custom exception
- `CustomExceptionWithCause.java` — chaining exceptions with cause
- `ValidationExample.java` — practical validation using custom exceptions

## Common Pitfalls
- Making every exception checked when it should be unchecked
- Not providing message or cause constructors
- Creating too many fine-grained exception types
- Catching and rethrowing without adding context
- Extending `Throwable` directly instead of `Exception` or `RuntimeException`

## Exercises
Four exercises in `exercises/README.md`.

## Quiz
1. Which class should you extend for a checked custom exception?
   a) Throwable  b) Exception  c) RuntimeException  d) Error

2. How do you pass a cause to a custom exception?
   a) setCause()  b) Using super(cause)  c) addSuppressed()  d) initCause() is automatic

3. A custom exception extending RuntimeException is:
   a) Checked  b) Unchecked  c) Compiled differently  d) Cannot have a cause

4. What is a best practice for naming custom exceptions?
   a) Prefix with "My"  b) End with "Exception"  c) Use all caps  d) No naming convention

5. When should you use a checked custom exception?
   a) For programming errors  b) For recoverable external failures  c) Never  d) Always

---
Answers: 1-b, 2-b, 3-b, 4-b, 5-b

## Key Takeaways
- Extend `Exception` for checked, `RuntimeException` for unchecked
- Provide default, message, and cause constructors
- Name ends with "Exception"
- Use checked for recoverable, unchecked for programming errors

## Next Module
Module 42: Try-With-Resources — automatic resource management.
