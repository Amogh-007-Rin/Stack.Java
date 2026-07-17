# Module 13: Arrays — One Dimensional

## Overview
Arrays are fixed-length containers that hold elements of the same type. In Java, arrays are objects with a `length` field and zero-based indexing.

## Learning Objectives
- Declare, create, and initialize one-dimensional arrays
- Access elements using indexing
- Iterate over arrays with loops
- Understand default values for array elements

## Prerequisites
- Variables and data types (Module 4)
- Loops (Module 11)

## Theory

### Declaration, Creation, Initialization
```java
int[] numbers;              // declaration
numbers = new int[5];       // creation (all zeros)

int[] scores = {90, 85, 88}; // declaration + initialization
```

All three steps can be combined. The size is fixed after creation.

### length and Indexing
- `arr.length` gives the number of elements (no parentheses — it's a field, not a method)
- Indices run from `0` to `length - 1`
- Accessing an invalid index throws `ArrayIndexOutOfBoundsException`

### Default Values
When an array is created with `new`, elements get default values: `0` for numeric types, `false` for `boolean`, `'\u0000'` for `char`, `null` for references.

### Comparison to C / JavaScript
| Feature | Java | C | JavaScript |
|---------|------|---|------------|
| Length field | `arr.length` | `sizeof(arr)/sizeof(arr[0])` | `arr.length` |
| Bounds check | Yes (exception) | No (undefined behavior) | Yes |
| Dynamic resizing | No (use ArrayList) | No (use realloc) | Yes (push/pop) |
| Default values | Yes (zero/null) | Garbage | `undefined` |

## Code Examples
- `ArrayDeclarationDemo.java` — declaration, creation, initialization
- `ArrayIterationDemo.java` — loops with arrays
- `ArrayDefaultValuesDemo.java` — default values demonstration

## Common Pitfalls
- Confusing `length` (field) with `length()` (String method)
- Off-by-one errors: last index is `length - 1`
- Assuming arrays can grow — they cannot; use `ArrayList` for dynamic sizing

## Exercises
See `exercises/README.md`.

## Quiz

1. What is the index of the first element in a Java array?
   A) 1  B) 0  C) -1  D) It depends

2. What is the default value of elements in a `new int[5]`?
   A) null  B) undefined  C) 0  D) -1

3. What happens if you access `arr[arr.length]`?
   A) Returns the last element  B) Returns null  C) Compiler error  D) ArrayIndexOutOfBoundsException

4. How do you get the number of elements in an array `arr`?
   A) `arr.size()`  B) `arr.length()`  C) `arr.length`  D) `arr.count`

5. Which statement creates an array containing 1, 2, 3?
   A) `int[] a = new int[]{1,2,3};`  B) `int a[] = {1,2,3};`  C) Both A and B  D) Neither

---
Answers: 1-B, 2-C, 3-D, 4-C, 5-C

## Key Takeaways
- Arrays are zero-indexed, fixed-size objects
- Default values are applied on creation with `new`
- Always check bounds to avoid runtime exceptions

## Next Module
Module 14: Multidimensional Arrays
