# Module 19: Recursion

## Overview
A recursive method calls itself to solve a problem by breaking it into smaller subproblems. Every recursive method needs a **base case** (stopping condition) and a **recursive case** (calling itself with simpler input).

## Learning Objectives
- Write recursive methods with base and recursive cases
- Trace recursive calls through stack frames
- Implement factorial, Fibonacci, and binary search recursively
- Compare recursion across languages

## Prerequisites
- Methods (Module 16)
- Stack frames (Module 18)

## Theory

### Recursive Method Structure
```java
public static int factorial(int n) {
    if (n <= 1) return 1;   // base case
    return n * factorial(n - 1);  // recursive case
}
```

### Stack Frames in Recursion
Each recursive call pushes a new stack frame. When the base case is reached, frames start popping off (unwinding). Deep recursion can cause `StackOverflowError`.

### Examples
- **Factorial**: `n! = n * (n-1)!` with `0! = 1`
- **Fibonacci**: `fib(n) = fib(n-1) + fib(n-2)` with `fib(0)=0, fib(1)=1`
- **Binary search**: divide the search range in half recursively

### Comparison to Other Languages
| Language | Recursion Support | Tail-Call Optimization |
|----------|------------------|----------------------|
| Java | Yes | No |
| Python | Yes | No |
| C | Yes | Implementation-dependent |
| Scheme | Yes | Required |

## Code Examples
- `FactorialDemo.java` — recursive factorial
- `FibonacciDemo.java` — recursive Fibonacci
- `BinarySearchDemo.java` — recursive binary search

## Common Pitfalls
- Missing or incorrect base case → infinite recursion → stack overflow
- Exponential time complexity (naive Fibonacci) — use memoization or iteration
- Assuming tail-call optimization exists (Java does not have it)

## Exercises
See `exercises/README.md`.

## Quiz

1. What is a base case in recursion?
   A) The first call to the method  B) The condition that stops recursion  C) The largest input  D) A loop

2. For `factorial(5)`, how many stack frames are pushed (including the initial call)?
   A) 4  B) 5  C) 6  D) 1

3. What happens if a recursive method has no base case?
   A) Returns 0  B) StackOverflowError  C) Infinite loop  D) Compiler error

4. Recursive binary search has a time complexity of:
   A) O(n)  B) O(n²)  C) O(log n)  D) O(2ⁿ)

5. Does Java optimize tail-recursive calls?
   A) Yes  B) No  C) Only for static methods  D) Only with @TailRecursive annotation

---
Answers: 1-B, 2-C, 3-B, 4-C, 5-B

## Key Takeaways
- Recursion = base case + recursive case
- Each call creates a stack frame
- Java lacks tail-call optimization; use iteration for performance-critical recursion

## Next Module
Module 20: Introduction to Object-Oriented Programming Concepts
