# Module 56: Method References

## Overview

Method references are a shorthand for lambda expressions that simply call an existing method. They make code even more concise and readable by reusing existing method names instead of writing lambda bodies. There are four kinds: static method, instance method, arbitrary object instance method, and constructor references.

## Learning Objectives

- Write static method references using `ClassName::staticMethod`
- Write instance method references using `instance::method`
- Write arbitrary object method references using `ClassName::instanceMethod`
- Write constructor references using `ClassName::new`
- Decide when a method reference is preferable to a lambda

## Prerequisites

- Module 54: Lambda Expressions
- Module 55: Functional Interfaces

## Theory

### The Four Kinds

| Kind                    | Syntax                   | Lambda Equivalent              | Example                     |
|-------------------------|--------------------------|--------------------------------|-----------------------------|
| Static method           | `Class::staticMethod`    | `(args) -> Class.staticMethod(args)` | `Math::max`           |
| Instance method (specific) | `instance::method`   | `(args) -> instance.method(args)`    | `System.out::println` |
| Instance method (arbitrary) | `Class::instanceMethod` | `(obj, args) -> obj.method(args)` | `String::toLowerCase` |
| Constructor             | `Class::new`             | `(args) -> new Class(args)`    | `ArrayList::new`            |

### Static Method Reference

```java
Function<Double, Double> sqrt = Math::sqrt;
// Equivalent lambda: x -> Math.sqrt(x)
```

### Instance Method Reference (Specific Object)

```java
List<String> names = Arrays.asList("Alice", "Bob");
names.forEach(System.out::println);
// Equivalent lambda: name -> System.out.println(name)
```

### Instance Method Reference (Arbitrary Object)

The first parameter becomes the target of the method.

```java
Function<String, String> lower = String::toLowerCase;
// Equivalent lambda: s -> s.toLowerCase()
// The String argument is the object on which toLowerCase is called

Comparator<String> byLength = Comparator.comparingInt(String::length);
// Equivalent lambda: (a, b) -> Integer.compare(a.length(), b.length())
```

### Constructor Reference

```java
Supplier<List<String>> listMaker = ArrayList::new;
// Equivalent lambda: () -> new ArrayList<>()

Function<String, Integer> parser = Integer::new;
// Equivalent lambda: s -> new Integer(s) // though valueOf is preferred
```

### When to Prefer Method References

- When the lambda body is a single method call: **use method reference**
- When method reference makes the intent clearer (e.g., `String::isEmpty` reads better than `s -> s.isEmpty()`)
- When the lambda body has additional logic: **keep the lambda**

## Code Examples

- `StaticMethodReference.java` — `Math::max`, `Integer::parseInt`, `String::valueOf`
- `InstanceMethodReference.java` — both specific and arbitrary object forms
- `ConstructorReference.java` — `ArrayList::new`, `String::new`, array constructor refs
- `MethodReferenceDecision.java` — when to use method reference vs lambda

## Common Pitfalls

- **Confusing `Class::staticMethod` with `Class::instanceMethod`**: `String::valueOf` (static) vs `String::toString` (instance on arbitrary).
- **Using method reference for side-effecting code**: `System.out::println` is fine, but avoid method references with unclear side effects.
- **Overloading ambiguity**: `Integer::new` could match `Integer(int)` or `Integer(String)`, which may cause ambiguity.
- **Assuming method references are always more readable**: sometimes a named lambda parameter is clearer.

## Exercises

See `exercises/README.md`.

## Quiz

1. Which of the following is a valid static method reference?
   a) `Math::max`
   b) `Math::new`
   c) `math::max`
   d) `Math::max()`

2. `String::toLowerCase` is an example of:
   a) Static method reference
   b) Instance method reference on a specific object
   c) Instance method reference on an arbitrary object
   d) Constructor reference

3. What is the lambda equivalent of `ArrayList::new`?
   a) `() -> new ArrayList()`
   b) `(list) -> new ArrayList(list)`
   c) `(size) -> new ArrayList(size)`
   d) Both a and c (context-dependent)

4. Which method reference should you use to pass `System.out.println` to `forEach`?
   a) `System::out::println`
   b) `System.out::println`
   c) `System::println`
   d) `out::println`

5. A method reference is preferred over a lambda when:
   a) The lambda body has multiple statements
   b) The lambda body is a single existing method call
   c) The lambda uses variable capture
   d) The lambda has three or more parameters

---

Answers: 1-a, 2-c, 3-d, 4-b, 5-b

## Key Takeaways

- Method references reduce boilerplate when a lambda just delegates to an existing method.
- Four forms exist: static, specific instance, arbitrary instance, and constructor.
- The compiler resolves overloads based on the target functional interface.
- Use method references when they improve clarity; keep lambdas when they don't.

## Next Module

Module 57: Streams API Basics — processing collections with declarative pipelines
