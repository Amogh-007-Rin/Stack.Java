# Module 17: Method Overloading

## Overview
Method overloading lets you define multiple methods with the **same name** but **different parameters** within the same class. The compiler picks the correct version based on the arguments at compile time — this is **compile-time polymorphism**.

## Learning Objectives
- Define overloaded methods
- Understand how the compiler resolves overloaded calls
- Explain type promotion in overload resolution

## Prerequisites
- Methods (Module 16)
- Type casting (Module 5)

## Theory

### Same Name, Different Parameters
Overloaded methods must differ in:
- Number of parameters, or
- Type of parameters (order matters)

Return type alone is **not** sufficient to distinguish overloaded methods.

```java
public static int add(int a, int b) { return a + b; }
public static int add(int a, int b, int c) { return a + b + c; }
public static double add(double a, double b) { return a + b; }
```

### Compile-Time Polymorphism
The compiler determines which overloaded method to call based on the argument types and count. This decision is made at compile time, not at runtime.

```java
add(3, 4);        // calls int add(int, int)
add(3.0, 4.0);    // calls double add(double, double)
add(3, 4, 5);     // calls int add(int, int, int)
```

### Type Promotion
When no exact match exists, the compiler looks for a version whose parameter types can accept the arguments through widening promotion:

`byte → short → int → long → float → double`
`char → int → long → float → double`

## Code Examples
- `MethodOverloadingDemo.java` — overloading by count and type
- `TypePromotionDemo.java` — promotion in overload resolution

## Common Pitfalls
- Defining overloaded methods that differ only by return type — compile error
- Ambiguous calls (e.g., `add(3, 3.0)` when both `add(int, double)` and `add(double, int)` exist)
- Assuming overloading is resolved at runtime (it is compile-time)

## Exercises
See `exercises/README.md`.

## Quiz

1. Method overloading is an example of:
   A) Runtime polymorphism  B) Compile-time polymorphism  C) Dynamic binding  D) Inheritance

2. Can two methods have the same name and same parameter types but different return types?
   A) Yes  B) No  C) Only if one is static  D) Only in different classes

3. Which does NOT create a valid overload?
   A) Different number of params  B) Different param types  C) Different return type only  D) Different param order

4. Given `plus(int, double)` and `plus(double, int)`, what does `plus(3, 3.0)` call?
   A) `plus(int, double)`  B) `plus(double, int)`  C) Ambiguous — compile error  D) Neither

5. When no exact match is found, the compiler tries:
   A) Narrowing conversion  B) Widening promotion  C) Boxing  D) Reflection

---
Answers: 1-B, 2-B, 3-C, 4-A, 5-B

## Key Takeaways
- Overloaded methods share a name but differ in parameter lists
- Resolution happens at compile time
- Return type alone cannot distinguish overloads

## Next Module
Module 18: Variable Scope and Stack vs Heap Memory
