# Module 5 Exercises

## Exercise 1: Implicit vs Explicit (Easy)

Write a program that declares an `int` variable with value `1000` and assigns it to variables of type `long`, `float`, `double`, `byte`, and `short`. Use a cast where necessary. Print all results and note which required casts.

## Exercise 2: Truncation and Rounding (Medium)

Write a program that takes a `double` literal (e.g., `7.8`), casts it to `int` (truncation), and then also rounds it using `Math.round()`. Compare the two results. Also cast a negative double (`-3.7`) to `int` and observe the truncation direction.

## Exercise 3: Overflow Detector (Hard)

Write a program that takes two `int` values (hard-coded), adds them, and detects whether overflow occurred. Hint: before adding, check if `Integer.MAX_VALUE - a < b` for positive overflow. Print a warning if overflow would happen, otherwise print the sum.
