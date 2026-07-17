# Module 6: Operators

## Overview

Java provides a rich set of operators: arithmetic, relational, logical (including short-circuit), bitwise, and assignment. Understanding precedence and the difference between short-circuit (`&&`, `||`) and non-short-circuit (`&`, `|`) variants is critical for writing correct code.

## Learning Objectives

- Use all categories of operators correctly
- Understand operator precedence
- Distinguish short-circuit from non-short-circuit logical operators
- Apply bitwise operators for low-level manipulation

## Prerequisites

This module builds on Module 5: Type Casting and Conversion.

## Theory

### Arithmetic Operators

`+`, `-`, `*`, `/`, `%` (modulus), `++` (increment), `--` (decrement)

Division of two integers yields an integer (truncation). At least one operand must be floating-point for a fractional result.

```java
int a = 5 / 2;      // 2
double b = 5.0 / 2; // 2.5
```

### Relational Operators

`==`, `!=`, `<`, `>`, `<=`, `>=` — return `boolean`.

### Logical Operators

| Operator | Name               | Short-circuit? |
|----------|--------------------|----------------|
| `&&`     | conditional-AND    | Yes            |
| `||`     | conditional-OR     | Yes            |
| `&`      | logical-AND        | No             |
| `|`      | logical-OR         | No             |
| `^`      | logical-XOR        | No             |
| `!`      | logical-NOT        | N/A            |

Short-circuit means the right operand is evaluated only if needed.

```java
if (obj != null && obj.getValue() > 0)  // safe: getValue() skipped if null
if (obj != null & obj.getValue() > 0)   // BAD: evaluates both, NPE if null
```

### Bitwise Operators

`&`, `|`, `^`, `~`, `<<`, `>>`, `>>>` (unsigned right shift)

### Assignment Operators

`=`, `+=`, `-=`, `*=`, `/=`, `%=`, `<<=`, `>>=`, `>>>=`, `&=`, `^=`, `|=`

### Operator Precedence (highest to lowest)

1. Postfix: `expr++`, `expr--`
2. Unary: `++expr`, `--expr`, `+`, `-`, `~`, `!`
3. Multiplicative: `*`, `/`, `%`
4. Additive: `+`, `-`
5. Shift: `<<`, `>>`, `>>>`
6. Relational: `<`, `>`, `<=`, `>=`, `instanceof`
7. Equality: `==`, `!=`
8. Bitwise AND: `&`
9. Bitwise XOR: `^`
10. Bitwise OR: `|`
11. Logical AND: `&&`
12. Logical OR: `||`
13. Ternary: `? :`
14. Assignment: `=`, `+=`, etc.

## Code Examples

- `ArithmeticRelationalLogical.java` — Arithmetic, relational, and short-circuit demos
- `BitwiseOperators.java` — Bitwise AND, OR, XOR, shift
- `Precedence.java` — Demonstrates how precedence affects evaluation

## Common Pitfalls

- **`==` with doubles**: `0.1 + 0.2 == 0.3` is `false`; compare with epsilon.
- **Assignment in condition**: `if (x = 5)` compiles in C but not in Java (`x = 5` is `int`, not `boolean`).
- **Integer division**: `3 / 2` is `1`, not `1.5`.
- **Short-circuit misuse**: right operand with side effects may not execute.

## Exercises

See `exercises/README.md`.

## Quiz

1. `5 / 2` in Java evaluates to:
   a) 2.5  b) 2  c) 2.0  d) Compile error

2. Which operator short-circuits?
   a) `&`  b) `|`  c) `&&`  d) `^`

3. What is `2 << 3`?
   a) 8  b) 16  c) 6  d) 32

4. `!true && false` evaluates to:
   a) true  b) false

5. `int x = 5; x += 3;` — what is `x`?
   a) 5  b) 3  c) 8  d) 53

---

Answers: 1-b, 2-c, 3-b, 4-b, 5-c

## Key Takeaways

- Use `&&`/`||` for logical operations with short-circuit behavior.
- Integer division truncates; use at least one `double` operand for fractions.
- Bitwise operators work on individual bits of integer types.
- When in doubt about precedence, use parentheses.

## Next Module

Module 7: Reading Input from the Console
