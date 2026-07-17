# Module 18: Variable Scope and an Intro to Stack vs Heap Memory

## Overview
Variable scope determines where a variable can be accessed. Understanding stack vs heap memory explains how method calls and objects are managed at runtime.

## Learning Objectives
- Distinguish local, parameter, and class-level scope
- Understand variable shadowing
- Explain stack frames and heap allocation
- Compare Java's stack/heap to C's

## Prerequisites
- Methods (Module 16)
- Basic understanding of objects (Module 20 can be taken concurrently)

## Theory

### Scope Levels
```java
public class ScopeDemo {
    static int classVar = 1;  // class-level scope

    public static void method(int param) {
        int localVar = 2;      // local scope (within method)
        if (true) {
            int blockVar = 3;  // block scope (within if)
        }
    }
}
```
- **Class-level**: accessible from anywhere in the class
- **Parameter**: accessible within the method
- **Local / block**: accessible from declaration to end of enclosing block

### Shadowing
A variable in an inner scope can "shadow" a variable in an outer scope by having the same name:
```java
int x = 10;
if (true) {
    int x = 20;  // shadows outer x
    System.out.println(x);  // 20
}
System.out.println(x);  // 10
```

### Stack vs Heap
- **Stack**: stores local variables, method parameters, and return addresses. Each method call creates a **stack frame**, which is destroyed when the method returns.
- **Heap**: stores objects and arrays. Objects persist until garbage collected.

```
Stack                          Heap
┌──────────┐                   ┌──────────┐
│ frame:   │                   │          │
│ main()   │──→  int[] arr ───→│ [0,0,0]  │
│ arr ref  │                   │          │
└──────────┘                   └──────────┘
```

### Comparison to C
| Aspect | Java | C |
|--------|------|---|
| Stack allocation | Local primitives & references | Local variables (all types) |
| Heap allocation | Objects via `new` | Objects via `malloc` |
| Deallocation | Garbage collector | Manual `free` |
| Stack overflow | `StackOverflowError` | Segmentation fault |

## Code Examples
- `ScopeDemo.java` — local, parameter, and block scope
- `ShadowingDemo.java` — variable shadowing
- `StackVsHeapDemo.java` — stack/heap visualization

## Common Pitfalls
- Trying to access a block-scoped variable outside its block
- Assuming shadowing is an error (it compiles, but may confuse readers)
- Thinking all variables live on the heap (only objects do)

## Exercises
See `exercises/README.md`.

## Quiz

1. Where are local primitive variables stored?
   A) Heap  B) Stack  C) Both  D) Neither

2. Where are object instances stored?
   A) Stack  B) Heap  C) Method area  D) Register

3. What is a stack frame?
   A) An object on the heap  B) Data for one method call on the stack  C) A type of array  D) A garbage collector

4. What happens when a variable in an inner scope has the same name as one in an outer scope?
   A) Compiler error  B) Runtime error  C) Shadowing  D) The outer variable is overwritten

5. When does a stack frame get destroyed?
   A) When the object is garbage collected  B) When the method returns  C) When the program ends  D) Never

---
Answers: 1-B, 2-B, 3-B, 4-C, 5-B

## Key Takeaways
- Scope defines where a variable is accessible
- Stack holds method call data (frames); heap holds objects
- Shadowing happens when inner scope reuses a name from outer scope

## Next Module
Module 19: Recursion
