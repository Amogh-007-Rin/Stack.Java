# Module 12: Enhanced For-Loop, Break, Continue, and Labeled Loops

## Overview
Java's enhanced for-loop (for-each) simplifies iteration over arrays and collections. This module also covers loop control with `break` and `continue`, including labeled versions for nested loops.

## Learning Objectives
- Use the enhanced for-loop to iterate arrays/collections
- Control loop flow with `break` and `continue`
- Apply labeled `break` and `continue` in nested loops
- Compare Java's for-each to Python's `for x in iterable`

## Prerequisites
- Basic loops (`for`, `while`) from Module 11
- Understanding of arrays (Module 13 can be taken concurrently)

## Theory

### Enhanced For-Loop (For-Each)
```java
int[] numbers = {10, 20, 30};
for (int n : numbers) {
    System.out.println(n);
}
```
Works with arrays and any class implementing `Iterable`. You get each element directly — no index variable needed.

### break vs continue
- `break` — exits the loop entirely
- `continue` — skips the rest of the current iteration and moves to the next

### Labeled break / continue
Nested loops can be controlled with labels:
```java
outer:
for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
        if (i == 1 && j == 1) break outer;
    }
}
```

### Comparison to Python
| Java | Python |
|------|--------|
| `for (int x : arr)` | `for x in iterable:` |
| `break` | `break` |
| `continue` | `continue` |
| `break label;` | No direct equivalent |

## Code Examples
- `EnhancedForLoopDemo.java` — basic for-each over arrays
- `BreakContinueDemo.java` — `break` and `continue` usage
- `LabeledLoopDemo.java` — labeled break/continue in nested loops

## Common Pitfalls
- Using for-each when you need the index — fall back to a traditional `for` loop
- Assuming `break` exits multiple loops — it only exits the innermost loop without a label
- Modifying a collection during for-each iteration (throws `ConcurrentModificationException`)

## Exercises
See `exercises/README.md`.

## Quiz

1. What does `break` do inside a loop?
   A) Skips the rest of the current iteration  B) Exits the loop entirely  C) Restarts the loop  D) Throws an exception

2. Which loop type is best for iterating all elements of an array when you don't need the index?
   A) traditional for  B) while  C) enhanced for  D) do-while

3. If you have two nested loops and want to break out of both, you must use:
   A) a second break  B) a labeled break  C) return  D) continue

4. What does `continue` do in a for-each loop?
   A) Exits the loop  B) Jumps to the next iteration  C) Restarts from the beginning  D) Ends the program

5. Which Java construct is closest to Python's `for x in items:`?
   A) while loop  B) do-while loop  C) traditional for loop  D) enhanced for-loop

---
Answers: 1-B, 2-C, 3-B, 4-B, 5-D

## Key Takeaways
- Enhanced for-loops make iteration cleaner when indices aren't needed
- `break` stops looping; `continue` skips ahead
- Labels extend `break`/`continue` to outer loops

## Next Module
Module 13: Arrays — One Dimensional
