# Module 15: The Arrays Utility Class

## Overview
`java.util.Arrays` provides static methods for common array operations: printing, sorting, searching, filling, copying, and comparing.

## Learning Objectives
- Use `Arrays.toString()` to print arrays
- Sort arrays with `Arrays.sort()`
- Search with `Arrays.binarySearch()`
- Fill, copy, and compare arrays
- Understand static imports

## Prerequisites
- One-dimensional arrays (Module 13)
- Basic methods (Module 16 can be taken concurrently)

## Theory

### Key Methods
```java
import java.util.Arrays;

int[] arr = {5, 3, 1, 4, 2};

Arrays.sort(arr);                    // [1, 2, 3, 4, 5]
System.out.println(Arrays.toString(arr));

int index = Arrays.binarySearch(arr, 3);  // 2

int[] copy = Arrays.copyOf(arr, 10);      // copy with padding
Arrays.fill(arr, 0);                      // fill with zeros
boolean eq = Arrays.equals(arr, copy);    // compare
```

### Binary Search Precondition
The array must be **sorted** before calling `binarySearch`. If the key is not found, the return value is `-(insertionPoint) - 1`.

### Static Import
```java
import static java.util.Arrays.*;
```
Allows calling `toString(arr)` instead of `Arrays.toString(arr)`. Use sparingly for readability.

## Code Examples
- `ArraysToStringSortDemo.java` — toString and sort
- `ArraysSearchFillCopyDemo.java` — binarySearch, fill, copyOf
- `ArraysEqualsDemo.java` — equals and deepEquals

## Common Pitfalls
- Forgetting to sort before `binarySearch`
- Using `toString()` directly on an array (prints `[I@hash` instead of contents)
- Assuming `equals()` compares contents for arrays — it doesn't; use `Arrays.equals()`

## Exercises
See `exercises/README.md`.

## Quiz

1. What does `Arrays.toString(new int[]{3, 1, 2})` return?
   A) `[3, 1, 2]`  B) `[I@123`  C) `3,1,2`  D) `[3 1 2]`

2. What must be true before calling `Arrays.binarySearch()`?
   A) The array must be non-empty  B) The array must be sorted  C) The array must contain only positive numbers  D) Nothing

3. Which method copies an array with a new length?
   A) `Arrays.copy()`  B) `Arrays.copyOf()`  C) `Arrays.clone()`  D) `Arrays.duplicate()`

4. How do you properly compare two arrays for equality of contents?
   A) `arr1 == arr2`  B) `arr1.equals(arr2)`  C) `Arrays.equals(arr1, arr2)`  D) `arr1.compareTo(arr2)`

5. What does `Arrays.fill(arr, 42)` do?
   A) Sets the first element to 42  B) Sets every element to 42  C) Appends 42 to the array  D) Creates a new array of size 42

---
Answers: 1-A, 2-B, 3-B, 4-C, 5-B

## Key Takeaways
- Always use `Arrays.toString()` to print arrays
- Sort before binary search
- `Arrays.copyOf()` is the idiomatic way to resize/copy arrays

## Next Module
Module 16: Methods — Declaration, Parameters, and Return Values
