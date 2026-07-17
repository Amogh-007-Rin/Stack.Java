# Module 11: Loops

## Overview

Java provides three loop constructs: `for`, `while`, and `do-while`. Unlike Python's `for...in` (which iterates over collections), Java's `for` loop is closer to C's: explicit initialization, condition, and update. The `do-while` guarantees at least one iteration.

## Learning Objectives

- Write `for`, `while`, and `do-while` loops
- Understand loop components: initialization, condition, update
- Avoid infinite loops and off-by-one errors
- Choose the right loop construct for a given task

## Prerequisites

This module builds on Module 10: Conditional Statements.

## Theory

### for Loop

```java
for (initialization; condition; update) {
    // body
}
```

Typical use: known iteration count.

```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

### while Loop

```java
while (condition) {
    // body
}
```

Typical use: unknown iteration count, condition-based.

```java
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}
```

### do-while Loop

```java
do {
    // body
} while (condition);
```

Guarantees the body executes **at least once**. Note the semicolon after `while`.

### Loop Components

1. **Initialization**: sets the starting state (runs once).
2. **Condition**: checked before each iteration; if `false`, loop exits.
3. **Update**: modifies loop variable after each iteration.

### break and continue

- `break`: exits the loop immediately.
- `continue`: skips the rest of the current iteration, goes to the next.

## Code Examples

- `ForLoop.java` — for loop with array iteration and nested loops
- `WhileLoop.java` — while loop with sentinel value and break
- `DoWhileLoop.java` — do-while guaranteeing at least one iteration

## Common Pitfalls

- **Off-by-one errors**: `for (int i = 0; i <= arr.length; i++)` — should be `<`.
- **Infinite loops**: `while (true)` without `break`, or `for (;;)`.
- **Semicolon after `for`/`while`**: `for (int i=0; i<5; i++); { ... }` — the `;` ends the loop.
- **Forgetting semicolon after `do-while`**: the only loop with a semicolon after its condition.

## Exercises

See `exercises/README.md`.

## Quiz

1. `for (int i = 0; i < 3; i++)` — how many iterations?
   a) 2  b) 3  c) 4  d) Infinite

2. Which loop always executes at least once?
   a) for  b) while  c) do-while  d) All of them

3. What happens if the condition in a `while` loop is initially `false`?
   a) Compile error  b) Runs once  c) Never executes  d) Infinite loop

4. `for (;;)` creates:
   a) A syntax error  b) An infinite loop  c) A single iteration  d) A compile warning

5. `break` inside a loop:
   a) Skips one iteration  b) Exits the loop  c) Restarts the loop  d) Continues to next iteration

---

Answers: 1-b, 2-c, 3-c, 4-b, 5-b

## Key Takeaways

- Use `for` when the number of iterations is known.
- Use `while` when looping until a condition changes.
- Use `do-while` when the body must execute at least once.
- Watch for off-by-one errors and unintended infinite loops.

## Next Module

Module 12: Arrays and Enhanced For Loop (Phase 2, Part 2)
