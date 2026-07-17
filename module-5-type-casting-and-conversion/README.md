# Module 5: Type Casting and Conversion

## Overview

Java distinguishes between **implicit (widening)** and **explicit (narrowing)** conversions. Unlike C, where casting is often unchecked, Java enforces type safety at compile time and throws runtime exceptions for certain narrowing conversions.

## Learning Objectives

- Understand widening vs narrowing conversions
- Write explicit casts for narrowing conversions
- Recognize overflow and truncation behavior
- Distinguish between primitive casting and reference casting

## Prerequisites

This module builds on Module 4: Variables and Primitive Data Types.

## Theory

### Widening (Implicit) Conversion

When converting a smaller type to a larger type, no data loss is possible, so the conversion is automatic.

```
byte → short → int → long → float → double
              ↑
             char
```

```java
int i = 100;
long l = i;      // implicit widening
double d = i;    // implicit widening
```

### Narrowing (Explicit) Conversion

Converting a larger type to a smaller type requires a cast and may lose data.

```java
double d = 3.14;
int i = (int) d;               // i = 3 (truncation)
long big = 1_000_000_000_000L;
int small = (int) big;          // overflow: data loss
```

### Overflow and Truncation

- **Truncation**: Casting `double` to `int` discards the fractional part (no rounding).
- **Overflow**: Casting a value too large for the target type wraps around (two's complement arithmetic).

```java
int big = 300;
byte b = (byte) big;  // 300 - 256 = 44 (overflow)
```

### Comparison with C

In C, casting is generally unchecked and can silently produce garbage. Java's narrowing casts are still explicit but follow well-defined two's complement overflow rules. Java also throws `ClassCastException` for reference casts at runtime.

## Code Examples

- `WideningCasting.java` — Automatic widening from byte to double
- `NarrowingCasting.java` — Explicit casts with truncation and overflow
- `OverflowTruncation.java` — Demonstrates both phenomena in detail

## Common Pitfalls

- **Lossy conversion without a cast**: `byte b = 200;` won't compile; use `(byte)200`.
- **Assuming rounding on truncation**: `(int) 3.999` is 3, not 4.
- **Overflow in arithmetic**: `int x = 2_000_000_000 + 2_000_000_000;` silently wraps.

## Exercises

See `exercises/README.md`.

## Quiz

1. `long x = 10;` — what kind of conversion is this?
   a) Widening  b) Narrowing  c) Explicit  d) Not allowed

2. What is `(int) 3.99`?
   a) 4  b) 3  c) 3.99  d) Compile error

3. `byte b = (byte) 200;` — what is `b`?
   a) 200  b) -56  c) 44  d) Compile error

4. Which conversion requires an explicit cast?
   a) byte to int  b) int to long  c) int to byte  d) float to double

5. Casting `long` to `int` when the value exceeds `Integer.MAX_VALUE` causes:
   a) Compile error  b) Exception at runtime  c) Two's complement overflow  d) Saturation

---

Answers: 1-a, 2-b, 3-b, 4-c, 5-c

## Key Takeaways

- Widening conversions are automatic and safe.
- Narrowing conversions require a cast and may truncate or overflow.
- Java's casting rules are well-defined and deterministic.
- Unlike C, Java prevents implicit narrowing at compile time.

## Next Module

Module 6: Operators
