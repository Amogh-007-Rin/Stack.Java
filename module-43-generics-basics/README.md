# Module 43: Generics Basics

## Overview
Generics enable types (classes and methods) to operate on objects of various types while providing compile-time type safety. Introduced in Java 5, generics eliminate the need for casting and prevent `ClassCastException` at runtime.

## Learning Objectives
- Understand why generics improve type safety
- Create generic classes with type parameters
- Write generic methods
- Use the diamond operator `<>` for type inference
- Compare with C++ templates and C# generics

## Prerequisites
- Basic Java classes and objects
- Collections framework familiarity helpful but not required

## Theory

### Why Generics?
Without generics, you use `Object` and cast:

```java
List list = new ArrayList();
list.add("hello");
String s = (String) list.get(0); // cast required
```

With generics, the compiler knows the type:

```java
List<String> list = new ArrayList<>();
list.add("hello");
String s = list.get(0); // no cast needed
```

### Generic Classes
```java
public class Box<T> {
    private T content;

    public void set(T content) {
        this.content = content;
    }

    public T get() {
        return content;
    }
}
```

Usage:

```java
Box<Integer> intBox = new Box<>();
intBox.set(42);
int value = intBox.get(); // no cast
```

### Generic Methods
Type parameter is declared before the return type:

```java
public <T> void printArray(T[] array) {
    for (T item : array) {
        System.out.println(item);
    }
}
```

### Diamond Operator `<>`
Java 7+ allows the diamond operator to infer type:

```java
Box<String> box = new Box<>(); // <> instead of <String>
```

### Comparison with Other Languages
| Feature | Java Generics | C++ Templates | C# Generics |
|---------|--------------|---------------|-------------|
| Type erasure | Yes | No (reified) | No (reified) |
| Runtime type info | Limited | Full | Full |
| Value types | Boxed only | Supported | Supported |
| Compilation | Single class | Multiple instantiations | Single IL |

## Code Examples
- `BoxDemo.java` — generic Box class
- `GenericMethodDemo.java` — generic methods
- `DiamondOperatorDemo.java` — diamond operator inference

## Common Pitfalls
- Cannot use primitives as type arguments (use wrappers)
- Cannot create instances of type parameter: `new T()` is illegal
- Cannot create arrays of parameterized types
- Static fields cannot use class type parameter
- Type erasure removes generic type info at runtime

## Exercises
Four exercises in `exercises/README.md`.

## Quiz
1. What is the primary benefit of generics?
   a) Faster code  b) Type safety without casting  c) Smaller bytecode  d) Dynamic typing

2. The diamond operator `<>` was introduced in which Java version?
   a) Java 5  b) Java 6  c) Java 7  d) Java 8

3. Can you use `int` as a type argument directly?
   a) Yes  b) No, use Integer  c) Only in Java 8+  d) Only with generics

4. Where is the type parameter declared in a generic method?
   a) Before the method name  b) After the method name  c) Before the return type  d) After parameters

5. What happens to generic type information at runtime in Java?
   a) It is preserved  b) It is erased  c) It is converted  d) It is optimized

---
Answers: 1-b, 2-c, 3-b, 4-c, 5-b

## Key Takeaways
- Generics provide compile-time type safety
- `Box<T>` syntax for generic classes
- `<T> void method(T item)` for generic methods
- Diamond operator `<>` reduces verbosity
- Type erasure removes generic info at runtime

## Next Module
Module 44: Bounded Generics and Wildcards — constraining and flexibly using generics.
