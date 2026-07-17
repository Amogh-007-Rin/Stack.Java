# Module 85: Pattern Matching

## Overview
Pattern matching allows you to test a value against a pattern and extract data in a single step. Java has evolved its pattern matching capabilities across several versions: `instanceof` patterns (Java 16), switch patterns (Java 17 preview, **Java 21 standard**), record patterns (Java 21), and guarded patterns (Java 21).

## Learning Objectives
- Use pattern matching for `instanceof` to eliminate casts
- Write switch expressions/statements with patterns
- Destructure records using record patterns
- Write guarded patterns with `&&` clauses
- Understand exhaustiveness in sealed class hierarchies

## Prerequisites
- Switch expressions and statements
- Module 83 (Records)
- Module 84 (Sealed Classes) — for exhaustiveness

## Theory

### Pattern Matching for `instanceof` (Java 16+)
The old way:
```java
if (obj instanceof String) {
    String s = (String) obj;
    System.out.println(s.length());
}
```

The new way:
```java
if (obj instanceof String s) {
    System.out.println(s.length());  // no cast needed
}
```

The variable `s` is in scope only inside the `if` block (and its `else` if used as a negative pattern — though limited).

### Pattern Matching in Switch (Java 21 standard)
```java
static String describe(Object obj) {
    return switch (obj) {
        case Integer i -> "Integer: " + i;
        case String s  -> "String: " + s;
        case null      -> "null value";
        default        -> "Unknown type: " + obj.getClass().getSimpleName();
    };
}
```

Switch patterns are **exhaustive** — with sealed classes the compiler can verify all cases are covered:

```java
return switch (shape) {
    case Circle c    -> Math.PI * c.radius() * c.radius();
    case Rectangle r -> r.width() * r.height();
    case Triangle t  -> 0.5 * t.base() * t.height();
};
// No default needed if all permitted types are covered!
```

### Record Patterns (Java 21)
Destructure records directly:
```java
if (obj instanceof Point(int x, int y)) {
    System.out.println("Point at (" + x + ", " + y + ")");
}
```

Nested record patterns:
```java
if (obj instanceof Line(Point(int x1, int y1), Point(int x2, int y2))) {
    System.out.println("Line from (" + x1 + "," + y1 + ") to (" + x2 + "," + y2 + ")");
}
```

### Guarded Patterns
Add additional conditions after the pattern:
```java
return switch (obj) {
    case String s && s.length() > 5 -> "Long string: " + s;
    case String s                   -> "Short string: " + s;
    case Integer i && i < 0         -> "Negative: " + i;
    case Integer i                  -> "Non-negative: " + i;
    default                         -> "Other";
};
```

### Comparison to Other Languages
- **Kotlin's `when`** — similar to switch patterns; `when (x) { is String -> ... }` with smart casts
- **Rust's `match`** — more powerful with exhaustive checking and destructuring; Rust does not have guard `&&` in the same way but uses `if` guards: `x if x > 0 => ...`
- **Python 3.10's `match`** — structural pattern matching inspired by Scala and Haskell; uses `case str():` and guards with `if`

## Code Examples

See the `examples/` directory:
- `InstanceOfPatternMatching.java` — simplifies type checking with instanceof patterns
- `SwitchPatternMatching.java` — switch expressions with pattern matching
- `RecordPatternsDemo.java` — destructuring records in patterns
- `GuardedPatternsDemo.java` — adding conditions to patterns

## Common Pitfalls
- **Pattern variables scope** — in `if (x instanceof String s)`, `s` is in scope within the `if` block only; it is NOT in scope in the `else` block
- **Dominance** — more specific cases must come before more general ones; e.g., `case String s && s.length() > 5` before `case String s`
- **Exhaustive switch** — switch with patterns must cover all possible types; use `default` when the set is not sealed
- **`null` handling** — pattern matching switch does NOT match `null` by default; use `case null ->` explicitly
- **Record patterns require all components** — `case Point(int x, int y)` matches all `Point` instances

## Exercises

See `exercises/README.md` for practice problems.

## Quiz

1. In which Java version was pattern matching for `instanceof` standardized?
   a) Java 11
   b) Java 14
   c) Java 16
   d) Java 17

2. Given `if (obj instanceof String s) { ... }`, what is the scope of variable `s`?
   a) The entire method
   b) The enclosing `if` block (and the `else` block)
   c) Only the `if` block
   d) The class

3. How do you write a guarded pattern in a switch?
   a) `case String s if s.length() > 5`
   b) `case String s && s.length() > 5`
   c) `case String s where s.length() > 5`
   d) `case String s, when s.length() > 5`

4. What is the primary benefit of record patterns?
   a) They make records mutable
   b) They eliminate boilerplate getter calls when matching on records
   c) They allow records to extend classes
   d) They improve serialization performance

5. When can you omit the `default` branch in a pattern-matching switch?
   a) Never
   b) When the switch expression covers a sealed type exhaustively
   c) When the switch is a statement (not an expression)
   d) When all cases return `void`

---

**Answers:** 1-c, 2-c, 3-b, 4-b, 5-b

## Key Takeaways
- Pattern matching eliminates boilerplate type checks and casts
- Switch with patterns supports `case null`, guards (`&&`), and exhaustive checking
- Record patterns destructure records inline — e.g., `case Point(int x, int y)`
- Guarded patterns combine a pattern with an additional predicate
- With sealed classes, the compiler can verify switch exhaustiveness at compile time

## Next Module
[Module 86: The Java Platform Module System](../module-86-the-java-platform-module-system/README.md)
