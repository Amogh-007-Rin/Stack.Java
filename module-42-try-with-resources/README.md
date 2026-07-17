# Module 42: Try-With-Resources

## Overview
Try-with-resources (introduced in Java 7) is a automatic resource management feature that ensures resources implementing `AutoCloseable` are closed automatically at the end of the statement, even if an exception occurs.

## Learning Objectives
- Understand the `AutoCloseable` interface
- Use try-with-resources syntax for resource management
- Declare and manage multiple resources in one try block
- Handle suppressed exceptions when closing resources
- Compare with Python's `with` statement

## Prerequisites
- Module 39: Exception Handling Basics
- Module 40: Checked vs Unchecked Exceptions

## Theory

### AutoCloseable Interface
`AutoCloseable` is a functional interface with a single `close()` method. Resources like streams, readers, and database connections implement it.

```java
public interface AutoCloseable {
    void close() throws Exception;
}
```

### Try-With-Resources Syntax
Resources are declared in the `try` header and are automatically closed.

```java
try (BufferedReader reader = new BufferedReader(new FileReader("file.txt"))) {
    String line = reader.readLine();
    System.out.println(line);
} catch (IOException e) {
    System.out.println("Error: " + e.getMessage());
}
// reader is automatically closed here
```

### Multiple Resources
Multiple resources are separated by semicolons. They are closed in reverse order of declaration.

```java
try (FileInputStream fin = new FileInputStream("in.txt");
     FileOutputStream fout = new FileOutputStream("out.txt")) {
    // use both streams
}
```

### Suppressed Exceptions
If both the try block and `close()` throw exceptions, the close exception is suppressed. Use `getSuppressed()` to access them.

```java
try (MyResource r = new MyResource()) {
    throw new Exception("Main exception");
} catch (Exception e) {
    Throwable[] suppressed = e.getSuppressed();
    // close() exceptions are here
}
```

### Python Comparison
- **Python**: `with` statement using context managers (`__enter__` / `__exit__`)
- **Java**: try-with-resources using `AutoCloseable` / `Closeable`
- Both ensure automatic cleanup; Java's `close()` is analogous to Python's `__exit__`

## Code Examples
- `AutoCloseableDemo.java` — custom AutoCloseable resource
- `TryWithResourcesDemo.java` — basic try-with-resources
- `MultipleResourcesDemo.java` — multiple resources
- `SuppressedExceptionsDemo.java` — suppressed exceptions

## Common Pitfalls
- Resources declared outside the try header (not auto-closed)
- Order matters: resources released in reverse declaration order
- `close()` throws `Exception` — handle or declare
- Forgetting that catch and finally are optional in try-with-resources
- Not checking for suppressed exceptions when debugging

## Exercises
Four exercises in `exercises/README.md`.

## Quiz
1. What interface must a resource implement for try-with-resources?
   a) Serializable  b) AutoCloseable  c) Cloneable  d) Runnable

2. What is the closing order of multiple resources?
   a) Declaration order  b) Reverse declaration order  c) Alphabetical  d) Random

3. If both try and close() throw exceptions, what happens to the close() exception?
   a) It replaces the main exception  b) It is suppressed  c) It is ignored  d) Both propagate

4. Which Java version introduced try-with-resources?
   a) Java 5  b) Java 7  c) Java 8  d) Java 11

5. In Python, what is the equivalent of AutoCloseable?
   a) Iterable  b) Context manager  c) Generator  d) Decorator

---
Answers: 1-b, 2-b, 3-b, 4-b, 5-b

## Key Takeaways
- Try-with-resources closes resources automatically
- Resources implement `AutoCloseable`
- Multiple resources close in reverse order
- Use `getSuppressed()` to examine suppressed exceptions
- Cleaner and safer than traditional try-catch-finally for resources

## Next Module
Module 43: Generics Basics — type-safe programming with parameterized types.
