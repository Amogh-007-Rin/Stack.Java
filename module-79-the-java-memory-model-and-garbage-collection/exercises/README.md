# Module 79: Exercises - Java Memory Model and Garbage Collection

## Exercise 1: StackOverflow Analysis
Write a recursive method that calculates factorial without a base case (or with a very deep recursion). Observe the `StackOverflowError`. Then fix it by using iteration. Explain in comments why the stack overflow occurred.

## Exercise 2: Memory Leak Detection
Create a program that intentionally leaks memory using a static `List<byte[]>`. Add a `SoftReference`-based cache alternative. Compare the behavior. Run with `-Xmx64m` to observe the difference.

## Exercise 3: Object Resurrection in finalize()
Create a class where `finalize()` adds `this` to a static list (resurrecting the object). Demonstrate that `finalize()` runs only once even if the object becomes garbage again. Note: this works only in Java 17 and earlier.
