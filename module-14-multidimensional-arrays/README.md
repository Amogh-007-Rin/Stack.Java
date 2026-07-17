# Module 14: Multidimensional Arrays

## Overview
Java supports arrays of arrays (multidimensional arrays). Unlike C's rectangular 2D arrays, Java's are "ragged" — each row can have a different length.

## Learning Objectives
- Declare and initialize `int[][]` arrays
- Understand ragged (jagged) arrays
- Traverse multidimensional arrays with nested loops
- Compare Java's approach to C's

## Prerequisites
- One-dimensional arrays (Module 13)
- Nested loops (Module 11)

## Theory

### Syntax
```java
int[][] matrix = new int[3][4];  // 3 rows, 4 columns
int[][] table = {{1,2}, {3,4,5}, {6}};  // ragged
```

`int[][]` is an array of `int[]`. `matrix.length` is the number of rows.

### Ragged Arrays
Each row can have a different length:
```java
int[][] ragged = new int[3][];
ragged[0] = new int[2];
ragged[1] = new int[5];
ragged[2] = new int[1];
```

### Nested Loop Traversal
```java
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        // process matrix[i][j]
    }
}
```

### Comparison to C
| Aspect | Java | C |
|--------|------|---|
| Memory layout | Array of arrays (each row is a separate object) | Contiguous block |
| Ragged support | Native | Manual via pointer arrays |
| `matrix[i][j]` | Yes | Yes |
| Bounds checking | Always checked | Not checked |

## Code Examples
- `MultiDimArrayDemo.java` — declaration and initialization
- `RaggedArrayDemo.java` — ragged arrays
- `NestedLoopTraversalDemo.java` — traversal with nested loops

## Common Pitfalls
- Confusing `matrix.length` (rows) with `matrix[i].length` (columns in row i)
- Assuming all rows have the same length
- Using `int[3][4]` syntax (valid) vs `int[][]` (preferred)

## Exercises
See `exercises/README.md`.

## Quiz

1. What does `matrix.length` represent for `int[][] matrix`?
   A) Total number of elements  B) Number of rows  C) Number of columns  D) Size in bytes

2. What is a ragged array?
   A) An array with missing elements  B) An array where rows have different lengths  C) A one-dimensional array  D) An array with negative indices

3. How do you get the number of columns in row `i`?
   A) `matrix[i].length`  B) `matrix.length[i]`  C) `matrix.columns[i]`  D) `matrix[i].size()`

4. Java's multidimensional arrays are stored as:
   A) A single contiguous block  B) An array of arrays  C) A linked list  D) A hash table

5. What does `new int[3][]` create?
   A) A 3x3 matrix  B) A 3-element array where each element is null  C) A single row of 3 columns  D) Compiler error

---
Answers: 1-B, 2-B, 3-A, 4-B, 5-B

## Key Takeaways
- `int[][]` is an array of references to `int[]` objects
- Rows can have different lengths — always check `matrix[i].length`
- Use nested loops for traversal

## Next Module
Module 15: The Arrays Utility Class
