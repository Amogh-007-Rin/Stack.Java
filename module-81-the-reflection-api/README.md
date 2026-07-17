# Module 81: The Reflection API

## Overview
Reflection is a powerful feature in Java that allows a program to inspect and modify its own structure and behavior at runtime. It enables dynamic class loading, field access, method invocation, and constructor access — all without knowing the types at compile time.

## Learning Objectives
- Understand what the `Class` object represents and how to obtain it
- Inspect class members: fields, methods, constructors
- Modify private fields and invoke methods at runtime
- Recognize the performance, security, and encapsulation implications of reflection

## Prerequisites
- Basic Java syntax and OOP concepts
- Familiarity with exception handling (checked vs unchecked)
- Understanding of access modifiers (public, private, protected)

## Theory

### The `Class` Object
Every Java object has an associated `Class` object containing metadata about the class. There are three ways to obtain it:

```java
Class<?> c1 = String.class;         // .class literal
Class<?> c2 = "hello".getClass();   // .getClass() on an instance
Class<?> c3 = Class.forName("java.lang.String"); // fully qualified name
```

### Inspecting Class Members
Once you have a `Class<?>` reference, you can inspect its structure:

| Method | Returns | Includes inherited? | Includes private? |
|--------|---------|---------------------|-------------------|
| `getFields()` | `Field[]` | Yes | No |
| `getDeclaredFields()` | `Field[]` | No | Yes |
| `getMethods()` | `Method[]` | Yes | No |
| `getDeclaredMethods()` | `Method[]` | No | Yes |
| `getConstructors()` | `Constructor<?>[]` | No | No |
| `getDeclaredConstructors()` | `Constructor<?>[]` | No | Yes |

### Modifying via Reflection
With `setAccessible(true)` you can bypass Java access control checks:

```java
Field field = obj.getClass().getDeclaredField("name");
field.setAccessible(true);
field.set(obj, "newValue");
```

Methods can be invoked dynamically:

```java
Method method = obj.getClass().getMethod("getName");
String result = (String) method.invoke(obj);
```

### Reflection Is Powerful but Costly
- **Slow** — reflection calls cannot be inlined by the JIT compiler; they can be 10–100× slower than direct calls
- **Breaks encapsulation** — private fields and methods become accessible from outside the class
- **No compile-time safety** — errors like `NoSuchMethodException` only appear at runtime
- **Security managers** may restrict or deny reflection access

## Code Examples

See the `examples/` directory for runnable Java files:
- `ReflectionBasics.java` — obtaining the `Class` object and inspecting fields, methods, constructors
- `FieldAccessExample.java` — reading and writing private fields
- `MethodInvocationExample.java` — invoking methods, including private ones
- `DynamicInstantiation.java` — creating instances via `Class.forName()` and constructors

## Common Pitfalls

- **`Class.forName()` requires fully qualified names** — include the package (e.g., `"java.util.ArrayList"`, not `"ArrayList"`)
- **`InvocationTargetException` wrapping** — if the invoked method throws an exception, it is wrapped in `InvocationTargetException`; call `.getCause()` to get the original
- **Forgetting `setAccessible(true)`** — accessing a private member without it throws `IllegalAccessException`
- **Generic type erasure** — reflection works on raw types; `List<String>` becomes just `List`, which can lead to `ClassCastException`
- **Performance in hot paths** — avoid reflection in loops or frequently called code

## Exercises

See `exercises/README.md` for practice problems.

## Quiz

1. Which method returns all fields declared in the class, including private ones?
   a) `getFields()`
   b) `getDeclaredFields()`
   c) `getAllFields()`
   d) `getInstanceFields()`

2. What exception must you handle when calling `Class.forName()`?
   a) `IOException`
   b) `ClassNotFoundException`
   c) `NoSuchMethodException`
   d) `InstantiationException`

3. What is the correct way to invoke a private method via reflection?
   a) `method.invoke(obj)` directly
   b) `method.setAccessible(true); method.invoke(obj)`
   c) `method.makePublic(); method.invoke(obj)`
   d) `method.invoke(obj, true)`

4. Which statement about `getMethods()` is true?
   a) It returns only methods declared in the class itself
   b) It returns only private methods
   c) It returns public methods, including inherited ones
   d) It returns constructors as well

5. What is the primary performance concern with reflection?
   a) It increases memory usage permanently
   b) It cannot be inlined by the JIT, making calls slower
   c) It requires network access
   d) It slows down all code in the application

---

**Answers:** 1-b, 2-b, 3-b, 4-c, 5-b

## Key Takeaways
- The `Class` object is the entry point to all reflection — obtain it via `.class`, `.getClass()`, or `Class.forName()`
- `getDeclared*()` methods give access to private members; `get*()` only returns public ones
- `setAccessible(true)` is required to access private members; use it sparingly
- Reflection is slow and breaks encapsulation — prefer direct calls when possible

## Next Module
[Module 82: Annotations](../module-82-annotations/README.md)
