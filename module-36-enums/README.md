# Module 36: Enums

## Overview

An **enum** (enumeration) is a special Java type that defines a fixed set of named constants. Unlike enums in C/C++ (which are just integers), Java enums are full-featured classes that can have fields, constructors, and methods. They provide type safety and are ideal for representing fixed sets of values like days of the week, directions, or status codes.

## Learning Objectives

- Declare enums using the `enum` keyword
- Use enum constants with `ordinal()` and `values()`
- Add fields, constructors, and methods to enums
- Use enums in `switch` statements
- Compare Java enums to C/C++ enums

## Prerequisites

- Module 21: Classes and Objects
- Module 11: Loops
- Module 10: Conditional Statements

## Theory

### Basic Enum Declaration

An enum is a special type that defines a set of named constants.

```java
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
```

### Enum Methods

Every enum has built-in methods:
- `ordinal()` — returns the position (0-based)
- `values()` — returns an array of all constants
- `name()` — returns the constant name as a string

```java
for (Day d : Day.values()) {
    System.out.println(d.ordinal() + ": " + d);
}
```

### Enum with Fields and Methods

Enums can have fields, constructors, and methods.

```java
enum Size {
    SMALL(1), MEDIUM(2), LARGE(3);

    private int value;
    Size(int value) { this.value = value; }
    public int getValue() { return value; }
}
```

### Enum in Switch

Enums work naturally with `switch` statements.

```java
switch (day) {
    case MONDAY: System.out.println("Start of week"); break;
    case FRIDAY: System.out.println("TGIF"); break;
}
```

## Code Examples

- `SimpleEnumDemo.java` — Basic enum with ordinal() and values()
- `EnumWithFieldsDemo.java` — Enum with fields, constructors, and methods
- `EnumSwitchDemo.java` — Enum in switch statements

## Common Pitfalls

- Using `ordinal()` for business logic (order can change)
- Forgetting that enum constants are objects, not integers
- Trying to extend an enum (enums implicitly extend `java.lang.Enum`)
- Using `==` vs `equals()` for enum comparison (both work, but `==` is preferred)

## Exercises

See `exercises/README.md`.

## Quiz

1. Which method returns the position of an enum constant?
   a) `position()`  b) `index()`  c) `ordinal()`  d) `order()`

2. Can an enum have a constructor?
   a) No  b) Yes, but only private  c) Yes, public  d) Only default

3. Which method returns all enum constants as an array?
   a) `all()`  b) `values()`  c) `list()`  d) `constants()`

4. In a switch statement, enum cases are written:
   a) With quotes  b) Without the enum type prefix  c) With the enum name  d) As integers

5. Java enums implicitly extend:
   a) `Object`  b) `Enum`  c) `Enumeration`  d) `Serializable`

---

Answers: 1-b, 2-b, 3-b, 4-b, 5-b

## Key Takeaways

- Enums define a fixed set of named constants
- Enums can have fields, constructors, and methods
- Use `ordinal()` for position and `values()` to iterate
- Enums work naturally in `switch` statements
- Java enums are more powerful than C/C++ enums (they are full classes)

## Next Module

Module 37: Nested and Inner Classes — classes defined inside other classes.
