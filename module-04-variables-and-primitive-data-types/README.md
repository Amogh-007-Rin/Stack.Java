# Module 4: Variables and Primitive Data Types

## Overview

Java is a **statically-typed** language. Unlike Python or JavaScript, every variable in Java must have a declared type that is known at compile time. This module covers the eight primitive data types and how to declare, initialize, and use variables.

## Learning Objectives

- Understand why Java requires explicit type declarations
- Declare and initialize variables of all eight primitive types
- Know the ranges, default values, and literal formats for each primitive
- Distinguish between primitives and reference types

## Prerequisites

Familiarity with basic programming concepts (variables, types) from another language. This module builds on Module 3: Java Development Environment.

## Theory

### The Eight Primitives

| Type    | Size    | Range                                      | Default  |
|---------|---------|--------------------------------------------|----------|
| byte    | 8-bit   | -128 to 127                                | 0        |
| short   | 16-bit  | -32,768 to 32,767                          | 0        |
| int     | 32-bit  | -2^31 to 2^31-1                            | 0        |
| long    | 64-bit  | -2^63 to 2^63-1                            | 0L       |
| float   | 32-bit  | ±3.4e-38 to ±3.4e+38                       | 0.0f     |
| double  | 64-bit  | ±1.7e-308 to ±1.7e+308                     | 0.0d     |
| char    | 16-bit  | 0 to 65,535 (Unicode)                      | '\u0000' |
| boolean | ~1-bit  | true or false                              | false    |

### Declaration and Initialization

```java
int x;          // declaration
x = 10;         // initialization
int y = 20;     // declaration + initialization
```

### Literals

Integer literals default to `int`. Use `L` suffix for `long`, `f`/`F` for `float`, `d`/`D` for `double`.

```java
long big = 100L;
float f = 3.14f;
double d = 3.14;
```

Binary (`0b`), octal (`0`), hex (`0x`), and underscores in numbers are supported:

```java
int bin = 0b1010;        // 10
int hex = 0xFF;          // 255
int withUnderscore = 1_000_000;
```

### Default Values

Local variables **must be initialized** before use. Fields (class-level) get default values automatically.

## Code Examples

- `PrimitiveTypes.java` — Declares and prints all eight primitive types
- `VariableDeclaration.java` — Shows declaration, initialization, and local variable rules
- `DefaultValues.java` — Demonstrates default values for class fields vs local variables

## Common Pitfalls

- **Forgetting the `L` suffix** for `long` literals: `long x = 123456789123;` won't compile without `L`.
- **`float` without `f` suffix**: `float x = 3.14;` is a `double` literal; use `3.14f`.
- **Using uninitialized local variables**: the compiler rejects them.
- **Confusing `==` with `.equals()`** on wrapper types like `Integer`.

## Exercises

See `exercises/README.md`.

## Quiz

1. How many primitive types does Java have?
   a) 6  b) 7  c) 8  d) 10

2. What is the default value of a `boolean` field in a class?
   a) true  b) false  c) null  d) 0

3. Which suffix is required for a `float` literal?
   a) F  b) L  c) D  d) none

4. What happens if you use an uninitialized local variable?
   a) It defaults to 0  b) It defaults to null  c) Compile-time error  d) Runtime exception

5. `int x = 1_000_000;` — is this valid?
   a) Yes  b) No  c) Only with Java 11+  d) Only with a suffix

---

Answers: 1-c, 2-b, 3-a, 4-c, 5-a

## Key Takeaways

- Java is statically typed: every variable must have a declared type.
- Eight primitives: byte, short, int, long, float, double, char, boolean.
- Local variables must be initialized; fields get defaults.
- Literal suffixes are required for `long` (`L`) and `float` (`F`).

## Next Module

Module 5: Type Casting and Conversion
