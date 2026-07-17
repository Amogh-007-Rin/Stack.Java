# Module 10: Conditional Statements

## Overview

Java supports `if`/`else if`/`else`, `switch` statements (traditional), `switch` expressions (Java 14+), and the ternary operator `? :`. Unlike Python (which has no `switch`), Java's `switch` can be a statement or an expression that returns a value.

## Learning Objectives

- Write `if`/`else if`/`else` chains with proper boolean expressions
- Use traditional `switch` statements with `break`
- Use modern `switch` expressions (Java 14+) with `->` and `yield`
- Apply the ternary operator `? :` for concise conditional assignment

## Prerequisites

This module builds on Module 9: StringBuilder and StringBuffer.

## Theory

### if / else if / else

```java
if (score >= 90) {
    grade = "A";
} else if (score >= 80) {
    grade = "B";
} else {
    grade = "F";
}
```

### Traditional switch (statement)

```java
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    default:
        System.out.println("Unknown");
}
```

Fall-through occurs if `break` is omitted — sometimes intentional, often a bug.

### Modern switch (expression, Java 14+)

```java
String result = switch (day) {
    case 1 -> "Monday";
    case 2 -> "Tuesday";
    default -> "Unknown";
};
```

For multi-line blocks, use `yield`:

```java
String result = switch (day) {
    case 1 -> { yield "Monday"; }
    default -> "Unknown";
};
```

Switch expressions are exhaustive (must cover all cases or include `default`).

### Ternary Operator

```java
int max = (a > b) ? a : b;
```

Avoid nesting ternaries — they hurt readability.

## Code Examples

- `IfElse.java` — if/else if/else with grade calculation and nested if
- `SwitchStatement.java` — traditional switch with fall-through and modern switch expression
- `TernaryOperator.java` — Ternary with clear use cases

## Common Pitfalls

- **Missing `break` in switch** — unintended fall-through.
- **Comparing strings with `==` in switch** — switch on Strings uses `.equals()` internally.
- **Overly complex ternary nesting** — `a ? b ? c : d : e` is hard to read.
- **Using `=` instead of `==`** — unlike C, Java catches this at compile time for booleans.

## Exercises

See `exercises/README.md`.

## Quiz

1. What does `switch` without `break` cause?
   a) Compile error  b) Fall-through  c) Infinite loop  d) Default case

2. Switch expressions were standardized in:
   a) Java 8  b) Java 11  c) Java 14  d) Java 17

3. `int x = (5 > 3) ? 10 : 20;` — what is `x`?
   a) 5  b) 3  c) 10  d) 20

4. In a switch expression, values are separated by:
   a) `:`  b) `->`  c) `=>`  d) `:=`

5. `default` in a switch:
   a) Is required  b) Is optional  c) Must be first  d) Must be last

---

Answers: 1-b, 2-c, 3-c, 4-b, 5-b

## Key Takeaways

- Use `if`/`else` for range checks and complex conditions.
- Use `switch` for multi-way branching on a single value.
- Prefer modern switch expressions (`->`) over traditional switch statements.
- Use `? :` for simple binary choices.

## Next Module

Module 11: Loops
