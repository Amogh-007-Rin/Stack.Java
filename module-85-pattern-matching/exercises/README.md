# Module 85 Exercises: Pattern Matching

Compile with `javac *.java` and run with `java <ExerciseN>`.

## Exercise 1: Simplify with instanceof Patterns
Given the following class hierarchy, rewrite the `area()` method using pattern matching for `instanceof` to eliminate casts:

```java
sealed interface Shape permits Circle, Rectangle, Triangle {}
record Circle(double radius) implements Shape {}
record Rectangle(double width, double height) implements Shape {}
record Triangle(double base, double height) implements Shape {}
```

## Exercise 2: Switch Pattern Matching
Write a `describe` method using switch pattern matching that:
- For `Integer`: returns "even" or "odd"
- For `String`: returns "empty", "short" (< 5 chars), or "long" (≥ 5 chars)
- For `null`: returns "null"
- For anything else: returns "unknown"

## Exercise 3: Nested Record Patterns
Create records `Address(String city, String zip)` and `Person(String name, Address address)`. Write a method that uses record patterns to print "`name` lives in `city`" when the address zip starts with a certain prefix (use a guarded pattern).

## Exercise 4: Exhaustive Switch with Sealed Types
Define a sealed interface `Result<T>` with `Success<T>` and `Error` variants. Write a method that processes a `Result` using an exhaustive switch (no `default`). Include a `map` operation.
