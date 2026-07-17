# Module 8: Strings and String Methods

## Overview

`String` in Java is an **immutable** object. Unlike Python (where strings are also immutable) or C (where strings are mutable char arrays), Java's `String` immutability has performance implications and explains why methods like `toUpperCase()` return a **new** String rather than modifying the original.

## Learning Objectives

- Understand String immutability and the String pool
- Use common String methods: `length()`, `charAt()`, `substring()`, `indexOf()`, `equals()`, `equalsIgnoreCase()`, `toUpperCase()`, `toLowerCase()`, `trim()`, `split()`
- Distinguish `==` from `.equals()`
- Compare String behavior with Python/JS

## Prerequisites

This module builds on Module 7: Reading Input from the Console.

## Theory

### String Immutability

Once created, a String cannot be changed. Every "modification" returns a new String object.

```java
String s = "hello";
s.toUpperCase();       // returns "HELLO", s is still "hello"
s = s.toUpperCase();   // reassign to capture the result
```

### String Pool

String literals are interned (stored in a pool). Equal literals share the same reference, but Strings created with `new String("...")` do not.

```java
String a = "hello";
String b = "hello";
System.out.println(a == b);        // true (same pool reference)

String c = new String("hello");
System.out.println(a == c);        // false (different object)
System.out.println(a.equals(c));   // true (same content)
```

### Common Methods

| Method | Description |
|--------|-------------|
| `length()` | Returns character count |
| `charAt(i)` | Character at index i |
| `substring(begin, end)` | Substring from begin (inclusive) to end (exclusive) |
| `indexOf(s)` | First index of substring s, or -1 |
| `equals(s)` | Content comparison |
| `equalsIgnoreCase(s)` | Case-insensitive comparison |
| `toUpperCase()` / `toLowerCase()` | Case conversion |
| `trim()` | Removes leading/trailing whitespace |
| `split(regex)` | Splits by regex, returns String[] |

## Code Examples

- `StringMethods.java` — Demonstrates length, charAt, substring, indexOf, case methods
- `StringPoolEquals.java` — String pool vs new, == vs equals()
- `SplitTrim.java` — split() and trim() with various delimiters

## Common Pitfalls

- **Using `==` for string comparison** — compares references, not content. Always use `.equals()`.
- **Forgetting strings are immutable** — `s.replace("a", "b")` doesn't modify `s`.
- **`substring()` bounds** — end index is exclusive; `s.substring(0, s.length())` is valid, `s.substring(0, s.length()+1)` throws `IndexOutOfBoundsException`.
- **`split()` treats regex special characters** — `"."` matches any character; use `split("\\.")` to split on a literal dot.

## Exercises

See `exercises/README.md`.

## Quiz

1. `String s = "Hello"; s.toUpperCase(); System.out.println(s);` prints:
   a) HELLO  b) hello  c) Hello  d) Compile error

2. `"abc".length()` returns:
   a) 2  b) 3  c) 4  d) 'c'

3. `"abcdef".substring(1, 4)` returns:
   a) "abc"  b) "bcd"  c) "bcde"  d) "abcd"

4. How to compare String content?
   a) `==`  b) `.equals()`  c) `.compare()`  d) `.same()`

5. `"a,b,c,".split(",")` returns an array of length:
   a) 2  b) 3  c) 4  d) 5

---

Answers: 1-c, 2-b, 3-b, 4-b, 5-c

## Key Takeaways

- Strings are immutable: every "modification" creates a new object.
- Always use `.equals()` for content comparison, not `==`.
- String literals are interned; `new String()` creates a separate object.
- `split()` takes a regex — escape special characters with `\\`.

## Next Module

Module 9: StringBuilder and StringBuffer
