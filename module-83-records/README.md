# Module 83: Records

## Overview
Records are a special kind of class introduced in **Java 16** (JEP 395) that act as transparent carriers for immutable data. A record declaration automatically generates the constructor, accessors (named the same as the component), `equals()`, `hashCode()`, and `toString()`.

## Learning Objectives
- Define records with the compact `record Point(int x, int y) {}` syntax
- Understand what the compiler automatically generates
- Use compact constructors for input validation
- Recognize when records are appropriate vs. traditional POJOs

## Prerequisites
- Basic Java classes and constructors
- Understanding of `equals()` and `hashCode()` contracts

## Theory

### Record Syntax
```java
public record Point(int x, int y) {}
```

The compiler automatically generates:
- A constructor with all fields as parameters
- Accessor methods: `x()` and `y()` (not `getX()` / `getY()`)
- `equals()` — compares all components
- `hashCode()` — based on all components
- `toString()` — e.g., `Point[x=3, y=4]`

### Compact Constructors
For validation, use the compact constructor syntax — no parameter list, just the body:

```java
public record Rectangle(double width, double height) {
    public Rectangle {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Dimensions must be positive");
        }
    }
}
```

The compiler assigns the parameters to the fields automatically.

### Records vs. Traditional POJOs

| Aspect | Record | Traditional POJO |
|--------|--------|------------------|
| Boilerplate | Minimal — one line | Getters, setters, equals, hashCode, toString |
| Mutability | Immutable (final fields) | Typically mutable |
| Inheritance | Cannot extend other classes | Can extend any class |
| JavaBeans spec | Incompatible (no no-arg constructor, no setters) | Compatible |
| JPA entities | Not suitable | Suitable (with proper annotations) |
| Serialization | Custom serialization | Standard |

### Limitations
- Records **cannot extend** another class (they implicitly extend `java.lang.Record`)
- Fields are **implicitly `final`** — cannot be reassigned
- Records **cannot declare instance fields** beyond the components
- Records are implicitly `final` — cannot be abstract or extended

## Code Examples

See the `examples/` directory:
- `RecordBasics.java` — creating records and using auto-generated methods
- `RecordValidation.java` — compact constructors with input validation
- `RecordsVsPOJOs.java` — comparing record syntax with traditional POJO

## Common Pitfalls
- **Records are not JavaBeans** — no no-arg constructor, no setters. They won't work with JPA or frameworks that require the JavaBeans spec
- **Accessors are named `x()` not `getX()`** — this differs from the JavaBeans convention
- **Records cannot have mutable fields** — all components are `final`
- **Records can implement interfaces** — they can implement `Serializable`, `Comparable`, etc.
- **Records can have static fields and methods** — they are not restricted to only the component fields

## Exercises

See `exercises/README.md` for practice problems.

## Quiz

1. In which Java version were records standardized?
   a) Java 11
   b) Java 14 (preview)
   c) Java 16
   d) Java 17

2. Given `record Point(int x, int y) {}`, what is the name of the accessor for `x`?
   a) `getX()`
   b) `x()`
   c) `getX`
   d) `X()`

3. What happens if a record component is named `int`... actually the question is: Can a record extend another class?
   a) Yes, any class
   b) Yes, but only abstract classes
   c) No, records cannot extend classes
   d) Yes, but only other records

4. What is the purpose of the compact constructor?
   a) To define additional instance fields
   b) To perform validation before field assignment
   c) To create an empty constructor
   d) To make the record mutable

5. Why are records not suitable for JPA entities?
   a) They are too slow
   b) They lack a no-arg constructor and setters
   c) They cannot be serialized
   d) They use too much memory

---

**Answers:** 1-c, 2-b, 3-c, 4-b, 5-b

## Key Takeaways
- Records provide a concise syntax for immutable data carriers
- The compiler generates constructor, accessors, `equals()`, `hashCode()`, and `toString()`
- Compact constructors allow validation while keeping the syntax clean
- Records are not a replacement for POJOs — they are not suitable for JPA entities or mutable objects
- Use records for DTOs, value objects, and API responses

## Next Module
[Module 84: Sealed Classes](../module-84-sealed-classes/README.md)
