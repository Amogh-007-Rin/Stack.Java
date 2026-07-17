# Module 44: Bounded Generics and Wildcards

## Overview
Bounded type parameters restrict the types that can be used with generics. Wildcards (`?`) provide flexibility when working with unknown types. Together they enable powerful yet type-safe APIs.

## Learning Objectives
- Use bounded type parameters with `extends`
- Understand upper bounded wildcards (`? extends T`)
- Understand lower bounded wildcards (`? super T`)
- Apply the PECS principle (Producer Extends, Consumer Super)
- Choose between bounded type parameters and wildcards

## Prerequisites
- Module 43: Generics Basics

## Theory

### Bounded Type Parameters
Restrict type parameters to a specific hierarchy:

```java
public class NumberBox<T extends Number> {
    private T value;

    public double doubleValue() {
        return value.doubleValue(); // Number methods available
    }
}
```

### Wildcards
- `?` — unbounded wildcard (any type)
- `? extends T` — upper bounded (T or subtype)
- `? super T` — lower bounded (T or supertype)

### PECS Principle
**P**roducer **E**xtends, **C**onsumer **S**uper

```java
// Producer: you read items from the collection
void readAll(List<? extends Number> list) {
    for (Number n : list) { /* read */ }
}

// Consumer: you write items to the collection
void addAll(List<? super Integer> list) {
    list.add(1); // write
}
```

### When to Use Each
| Use Case | Syntax |
|----------|--------|
| Method works with any type | `<T>` or `?` |
| Type must be a Number subclass | `<T extends Number>` |
| Read items (producer) | `? extends T` |
| Write items (consumer) | `? super T` |
| Read and write | No wildcard, use exact type |

## Code Examples
- `BoundedTypeDemo.java` — bounded type parameters
- `WildcardDemo.java` — wildcards in methods
- `PECSDemo.java` — Producer Extends, Consumer Super

## Common Pitfalls
- Using `? extends T` when you need to add items (can't add except null)
- Using `? super T` when you need to read items (returns Object)
- Forgetting that `T extends Number` means T is Number or subclass
- Confusing bounded type parameters with wildcards
- Putting extends/super on the wrong side

## Exercises
Four exercises in `exercises/README.md`.

## Quiz
1. What does `<T extends Number>` mean?
   a) T must be exactly Number  b) T may be Number or a subclass  c) T is unrelated  d) T must be a primitive

2. With `List<? extends Number>`, can you add a new Integer?
   a) Yes  b) No  c) Only if it's null  d) Only at index 0

3. According to PECS, what wildcard should a producer use?
   a) ? super T  b) ? extends T  c) ?  d) T

4. `List<? super Integer>` can hold:
   a) Only Integer  b) Integer and its subclasses  c) Integer and its superclasses  d) Any type

5. What is the unbounded wildcard?
   a) *  b) ?  c) Object  d) T

---
Answers: 1-b, 2-b, 3-b, 4-c, 5-b

## Key Takeaways
- `T extends Number` restricts T to Number subtypes, enabling method calls
- `? extends T` for producers (read only)
- `? super T` for consumers (write only)
- PECS: Producer Extends, Consumer Super
- Wildcards make APIs flexible while maintaining type safety

## Next Module
This is the final module of Phase 4. Congratulations on completing the Java exception handling and generics series!
