# Module 53: Immutability and the String Pool

## Overview
Immutability is a powerful design principle. Strings are immutable in Java, with literals stored in the String Pool. This module explores String internals, creating custom immutable classes, and using immutable collections.

## Learning Objectives
- Explain String immutability and its benefits
- Describe the String pool and intern() method
- Create custom immutable classes
- Use List.of, Set.of, Map.of for immutable collections
- Understand defensive copying

## Prerequisites
- Module 52: Wrapper Classes
- Basic class design

## Theory

### String Immutability
- Strings are `final` and immutable
- Any "modification" returns a new String
- Benefits: thread-safety, caching (hashCode), security

### String Pool / intern()
```java
String a = "hello";           // pool literal
String b = "hello";           // same pool reference
String c = new String("hello"); // heap object
String d = c.intern();        // pool reference

System.out.println(a == b);   // true
System.out.println(a == c);   // false
System.out.println(a == d);   // true
```

### Creating an Immutable Class
Rules:
1. Declare class as `final` (cannot be subclassed)
2. Make all fields `private final`
3. No setter methods
4. If field is mutable, make defensive copies in constructor and getters
5. Don't expose methods that modify internal state

```java
public final class Book {
    private final String title;
    private final List<String> authors;

    public Book(String title, List<String> authors) {
        this.title = title;
        this.authors = List.copyOf(authors);  // defensive copy
    }

    public String getTitle() { return title; }

    public List<String> getAuthors() {
        return authors;  // already immutable list
    }
}
```

### Immutable Collections (Java 9+)
```java
List<String> list = List.of("a", "b", "c");
Set<String> set = Set.of("x", "y", "z");
Map<String, Integer> map = Map.of("one", 1, "two", 2);
```
- Null elements not allowed
- No structural modifications
- Backed by compact internal representation

## Code Examples
See `examples/`:
- `StringPoolDemo.java` — string literals, new String, intern()
- `ImmutableClassDemo.java` — creating an immutable Book class
- `ImmutableCollectionsDemo.java` — List.of, Set.of, Map.of

## Common Pitfalls
- Forgetting defensive copies for mutable fields (Date, arrays, collections)
- Using `==` for String comparison instead of `.equals()`
- Assuming `List.of()` allows null elements
- Thinking `final` on a reference makes the object immutable (it does not)
- Exposing internal mutable references through getters

## Exercises
See `exercises/README.md`

## Quiz

**Q1:** What does String.intern() do?
**Q2:** How many null elements can a List.of() contain?
**Q3:** True or False: A final reference guarantees the object cannot be modified.
**Q4:** Name one rule for creating an immutable class.
**Q5:** What is the benefit of String immutability for multithreading?

---
**A1:** Returns a canonical representation from the String pool. **A2:** Zero — null is not allowed. **A3:** False — final only prevents reassignment, not mutation. **A4:** final class, private final fields, no setters, defensive copies, or no mutable methods. **A5:** Thread-safety (immutable objects are inherently thread-safe).

## Key Takeaways
- Strings are immutable and pooled for efficiency
- Create immutable classes with final, private final, defensive copies
- Use List.of/Set.of/Map.of for convenient immutable collections
- Immutability simplifies concurrent programming

## Next Module
Phase 6 begins! You have completed the Collections Framework and core utilities.
