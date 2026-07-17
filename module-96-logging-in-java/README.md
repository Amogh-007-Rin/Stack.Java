# Module 96: Logging in Java

## Overview
Logging is the practice of recording application events to diagnose issues, monitor behavior, and audit activity. Java provides `java.util.logging` (JUL) as a built-in framework, but the ecosystem has largely moved to SLF4J as a facade with Logback or Log4j2 as the implementation. This module covers both the standard API and the modern logging landscape.

## Learning Objectives
- Use `java.util.logging` (`Logger`, `Level`, `Handler`, `Formatter`)
- Configure logging with a `logging.properties` file
- Understand SLF4J as a facade pattern
- Use Logback as a concrete implementation
- Apply logging best practices (levels, parameterized messages)
- Compare Java logging to Python's `logging` module and JS `console`

## Prerequisites
- Module 39: Exception Handling Basics
- Module 42: try-with-resources
- Familiarity with configuration files and classpath

## Theory

### java.util.logging (JUL)
```java
import java.util.logging.Logger;
import java.util.logging.Level;

Logger logger = Logger.getLogger("com.example.MyClass");
logger.info("Application started");
logger.warning("Disk space low");
logger.fine("Processing record 42");  // below INFO threshold by default
```

**Levels** (increasing severity): `FINEST`, `FINER`, `FINE`, `CONFIG`, `INFO`, `WARNING`, `SEVERE`. Only messages at the configured level and above are output.

**Handlers** send log records to destinations: `ConsoleHandler` (stdout/stderr), `FileHandler` (file rotation).

**Formatters** control output format: `SimpleFormatter` (text), `XMLFormatter` (XML).

### SLF4J — Facade Pattern
SLF4J (Simple Logging Facade for Java) is an abstraction. Your code depends on SLF4J APIs; at runtime you plug in Logback, Log4j2, or java.util.logging via a binding jar.

**Why SLF4J?**
- Decouple your code from any specific logging implementation
- Switch implementations without recompiling
- The de facto standard in Spring, Hibernate, and most modern frameworks

### Logback
Logback is the successor to Log4j 1.x and the default implementation for Spring Boot. It offers:
- Faster performance than Log4j 1.x
- Automatic reloading of configuration files
- Advanced filtering and appenders

Configuration is in `logback.xml` on the classpath.

### Best Practices
1. **Use appropriate levels**: `FINE` for debug details, `INFO` for normal events, `WARNING` for recoverable issues, `SEVERE` for failures.
2. **Avoid string concatenation**: Use parameterized logging so the cost of building the message is only paid when the level is active.
   ```java
   // Bad — builds string even at INFO level
   logger.fine("User " + userId + " logged in at " + timestamp);

   // Good — only formats if FINE is enabled
   logger.log(Level.FINE, "User {0} logged in at {1}", new Object[]{userId, timestamp});
   ```
3. **Don't log sensitive data** (passwords, PII).
4. **Use a logger per class**: `Logger.getLogger(getClass().getName())`.

## Code Examples
- `LoggerDemo.java` — basic JUL logger setup
- `LogLevelsDemo.java` — demonstrating each logging level
- `SimpleFormatterDemo.java` — custom formatter configuration
- `SLF4JConceptDemo.java` — conceptual SLF4J usage (compile-only without binding)
- `BestPracticesDemo.java` — parameterized vs concatenated logging

## Common Pitfalls
- Forgetting that the default JUL level is `INFO` — `FINE` and below are not printed
- Adding SLF4J to the classpath without a binding jar (runtime error)
- Logging exceptions without passing the Throwable argument — loses the stack trace
- Using `Logger` from a static context without a proper name (`Logger.getGlobal()` is a common misuse)

## Exercises
See `exercises/README.md`.

## Quiz

1. Which `java.util.logging` level is below `INFO` and not shown by default?
   A) WARNING  B) SEVERE  C) FINE  D) CONFIG

2. SLF4J is best described as:
   A) A logging implementation  B) A logging facade  C) A configuration format  D) A JDK tool

3. What is the recommended way to log a value in JUL to avoid unnecessary string building?
   A) String concatenation in the argument  B) Parameterized message with `{0}` placeholders  C) `System.out.println`  D) `Logger.getGlobal().info`

4. Which file extension does Logback use for its configuration file?
   A) `.properties`  B) `.json`  C) `.xml`  D) `.yaml`

5. When logging an exception, what should you pass as the last argument?
   A) The exception message  B) `null`  C) The Throwable object  D) The stack trace string

---
Answers: 1-C, 2-B, 3-B, 4-C, 5-C

## Key Takeaways
- JUL is built-in but limited; SLF4J + Logback is the modern standard
- Always use parameterized logging to avoid paying the formatting cost at disabled levels
- Configure log levels per package to control verbosity in production
- Logging frameworks use the chain-of-responsibility pattern: Logger → Handler → Formatter

## Next Module
Module 97: Best Practices and Clean Code in Java
