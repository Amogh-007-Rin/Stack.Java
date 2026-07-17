# Module 16: Methods — Declaration, Parameters, and Return Values

## Overview
Methods are reusable blocks of code. In Java, every method belongs to a class. Java uses **pass-by-value** exclusively — a critical distinction from languages with pass-by-reference.

## Learning Objectives
- Declare methods with correct syntax
- Understand access modifiers, return types, and parameters
- Grasp pass-by-value deeply
- Use `void` and early `return`

## Prerequisites
- Basic program structure (Module 3)
- Variables and types (Module 4)

## Theory

### Method Syntax
```java
public static int add(int a, int b) {
    return a + b;
}
```
- `public` — access modifier
- `static` — belongs to the class (vs. instance)
- `int` — return type (use `void` for no return)
- `add` — method name
- `(int a, int b)` — parameter list

### Pass-by-Value
Java copies the argument's **value** into the parameter. For primitives, that's the actual value. For objects, that's the reference value (the memory address). The called method cannot change the caller's variable to point to a different object, but it **can** mutate the object's fields.

```java
public static void change(int x) {
    x = 99;  // only changes the local copy
}

public static void changeName(StringBuilder sb) {
    sb.append("x");  // mutates the object
    sb = new StringBuilder("new");  // only changes local reference
}
```

### Return Types
- `void` — no value returned
- Any primitive or reference type
- Must return a value on every path (except `void`)

### Early Return
```java
public static boolean isPositive(int n) {
    if (n <= 0) return false;
    return true;
}
```

## Code Examples
- `MethodSyntaxDemo.java` — declaration and invocation
- `PassByValueDemo.java` — pass-by-value demonstration
- `VoidAndReturnDemo.java` — void and early return

## Common Pitfalls
- Thinking Java passes objects by reference (it passes references by value)
- Forgetting to return a value on all code paths
- Confusing parameters with arguments

## Exercises
See `exercises/README.md`.

## Quiz

1. Java uses which parameter passing mechanism?
   A) Pass-by-reference  B) Pass-by-value  C) Pass-by-name  D) Pass-by-pointer

2. If you pass an object to a method, can the method change which object the caller's variable refers to?
   A) Yes  B) No  C) Only for Strings  D) Only for arrays

3. What does `void` mean as a return type?
   A) The method returns null  B) The method returns 0  C) The method returns nothing  D) The method is abstract

4. Which is a valid method declaration?
   A) `void method() {}`  B) `method void() {}`  C) `void method {}`  D) `method() void {}`

5. If a method returns `int`, what must every code path do?
   A) Print something  B) Return an int  C) Call another method  D) Declare a variable

---
Answers: 1-B, 2-B, 3-C, 4-A, 5-B

## Key Takeaways
- Method syntax: `access_modifier return_type name(params)`
- Java is always pass-by-value
- Every code path in a non-void method must return a value

## Next Module
Module 17: Method Overloading
