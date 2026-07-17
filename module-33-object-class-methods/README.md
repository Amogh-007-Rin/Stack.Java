# Module 33: Object Class Methods

## Overview

Every class in Java implicitly extends `java.lang.Object`. The `Object` class provides several methods that all objects inherit. The most commonly overridden are `toString()`, `equals()`, and `hashCode()`. Understanding their contracts is essential for correct behavior in collections, logging, and comparisons.

## Learning Objectives

- Understand that `Object` is the ultimate superclass of all classes
- Override `toString()` to provide meaningful string representation
- Override `equals()` to implement value equality
- Override `hashCode()` to maintain the equals-hashCode contract
- Recognize when default Object behavior is insufficient

## Prerequisites

- Module 27: Inheritance Basics
- Module 28: The super Keyword and Method Overriding

## Theory

### Object as the Ultimate Superclass

Every class in Java extends `Object` either directly or indirectly. The `Object` class provides:

- `toString()` — returns a string representation
- `equals(Object obj)` — checks reference equality by default
- `hashCode()` — returns a hash code (memory address based by default)
- `getClass()`, `clone()`, `finalize()`, `notify()`, `wait()`

### Overriding toString()

`toString()` returns a string representation of the object. The default is `ClassName@hashCode`. Override it to provide meaningful information.

```java
@Override
public String toString() {
    return "Person{name='" + name + "', age=" + age + "}";
}
```

### Overriding equals()

The `equals()` method checks value equality. The contract requires it to be:
- **Reflexive**: `x.equals(x)` is true
- **Symmetric**: `x.equals(y)` iff `y.equals(x)`
- **Transitive**: if `x.equals(y)` and `y.equals(z)` then `x.equals(z)`
- **Consistent**: multiple invocations return the same result
- **Non-null**: `x.equals(null)` is false

```java
@Override
public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Person p = (Person) obj;
    return age == p.age && name.equals(p.name);
}
```

### Overriding hashCode()

Whenever you override `equals()`, you must override `hashCode()` so that equal objects have equal hash codes.

```java
@Override
public int hashCode() {
    return Objects.hash(name, age);
}
```

## Code Examples

- `Person.java` — Class overriding toString(), equals(), and hashCode()
- `ToStringDemo.java` — Demonstrates default vs overridden toString()
- `EqualsHashCodeDemo.java` — Demonstrates equals/hashCode contract

## Common Pitfalls

- Overriding `equals()` without overriding `hashCode()` (breaks HashMap/HashSet)
- Using `instanceof` in `equals()` instead of `getClass()` (breaks symmetry with subclasses)
- Forgetting to call `super.equals()` in subclasses
- Using mutable fields in `hashCode()` (hash changes after object is in a collection)

## Exercises

See `exercises/README.md`.

## Quiz

1. What is the return type of `hashCode()`?
   a) `long`  b) `int`  c) `short`  d) `byte`

2. If `a.equals(b)` is true, what must be true about `a.hashCode()` and `b.hashCode()`?
   a) They must be equal  b) They must be different  c) No relationship  d) They must be positive

3. The default `toString()` returns:
   a) The object's data  b) ClassName@hexHashCode  c) null  d) Empty string

4. Which method is NOT in the Object class?
   a) `toString()`  b) `equals()`  c) `compareTo()`  d) `hashCode()`

5. What does `equals(null)` return?
   a) true  b) false  c) NullPointerException  d) Depends on implementation

---

Answers: 1-b, 2-a, 3-b, 4-c, 5-b

## Key Takeaways

- `Object` is the root of the Java class hierarchy
- Override `toString()` for meaningful object representation
- Override `equals()` for value equality and `hashCode()` alongside it
- Equal objects must have equal hash codes (but not vice versa)

## Next Module

Module 34: Packages and Imports — organizing code into namespaces.
