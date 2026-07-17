# Module 52: Autoboxing, Unboxing, and Wrapper Classes

## Overview
Wrapper classes (`Integer`, `Double`, `Boolean`, etc.) encapsulate primitives as objects. Autoboxing/unboxing (Java 5+) automates the conversion, making primitives and wrappers nearly interchangeable in code.

## Learning Objectives
- Understand each wrapper class and its purpose
- Explain autoboxing and unboxing mechanics
- Describe the Integer cache (-128 to 127)
- Recognize performance implications
- Compare Java's approach to Python's fully-boxed model

## Prerequisites
- Basic understanding of primitives vs objects
- Generics (collections require objects, not primitives)

## Theory

### Wrapper Classes
| Primitive | Wrapper | Constructor | Parsing |
|-----------|---------|-------------|---------|
| byte | Byte | `Byte(byte)` | `Byte.parseByte(s)` |
| short | Short | `Short(short)` | `Short.parseShort(s)` |
| int | Integer | `Integer(int)` | `Integer.parseInt(s)` |
| long | Long | `Long(long)` | `Long.parseLong(s)` |
| float | Float | `Float(float)` | `Float.parseFloat(s)` |
| double | Double | `Double(double)` | `Double.parseDouble(s)` |
| char | Character | `Character(char)` | — |
| boolean | Boolean | `Boolean(boolean)` | `Boolean.parseBoolean(s)` |

### Autoboxing and Unboxing
```java
// autoboxing: int → Integer
Integer boxed = 42;

// unboxing: Integer → int
int raw = boxed;

// in collections:
List<Integer> list = new ArrayList<>();
list.add(42);                      // autobox
int val = list.get(0);             // unbox
```

### Integer Cache (-128 to 127)
```java
Integer a = 127;
Integer b = 127;
System.out.println(a == b);        // true (cached)

Integer c = 128;
Integer d = 128;
System.out.println(c == d);        // false (new objects)
```
Applies to Integer, Long, Short, Byte, Character (0–127), Boolean (both values).

### Performance Considerations
- Each boxing creates a new object (or reuses from cache for small values)
- Excessive boxing in loops causes GC pressure
```java
// BAD: creates 10,000 Integer objects
Integer sum = 0;
for (int i = 0; i < 10_000; i++) sum += i;

// GOOD: use primitive
int sum = 0;
for (int i = 0; i < 10_000; i++) sum += i;
```

### Comparison to Python
In Python, *everything* is an object (even `int`). There is no primitive distinction. Python also caches small integers (-5 to 256). Java gives you explicit control over when boxing occurs.

## Code Examples
See `examples/`:
- `AutoboxingDemo.java` — autoboxing/unboxing in action
- `WrapperCacheDemo.java` — demonstrating the Integer cache
- `PerformanceDemo.java` — performance comparison

## Common Pitfalls
- Comparing Integer objects with `==` instead of `.equals()`
- NullPointerException when unboxing a null wrapper
- Performance degradation from repeated boxing in loops
- Assuming all Integer values are cached (only -128 to 127)

## Exercises
See `exercises/README.md`

## Quiz

**Q1:** Which class wraps the `int` primitive?
**Q2:** What is the range of the Integer cache?
**Q3:** What happens when you unbox a null Integer?
**Q4:** True or False: `new Integer(42) == new Integer(42)` is always true.
**Q5:** Which is faster in a tight numeric loop — int or Integer?

---
**A1:** Integer. **A2:** -128 to 127. **A3:** NullPointerException. **A4:** False (different objects). **A5:** int (primitive).

## Key Takeaways
- Wrappers let primitives be used in collections and generics
- Autoboxing/unboxing is syntactic sugar — objects still get created
- Use `.equals()` to compare wrapper objects, not `==`
- Prefer primitives in performance-sensitive code

## Next Module
Module 53: Immutability and the String Pool — final classes, defensive copies, and immutable collections.
