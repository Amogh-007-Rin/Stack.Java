# Module 52 Exercises: Autoboxing, Unboxing, and Wrapper Classes

## Exercise 1: Wrapper Equality Trap
Create a program that demonstrates the Integer cache bug. Compare `Integer.valueOf(100) == Integer.valueOf(100)` and `Integer.valueOf(200) == Integer.valueOf(200)`. Explain the output.

## Exercise 2: Null Unboxing Danger
Write a program that creates a method returning a possibly-null Integer. Attempt to unbox it into an int and catch the NullPointerException gracefully.

## Exercise 3: Parsing and Conversion
Write a program that:
- Parses a String "42" to int, double, and Integer
- Converts an int to binary, hex, and octal strings using Integer methods
- Parses "true" and "false" to boolean

## Exercise 4: Performance Test
Write a program that compares the time to sum 1 million integers using primitive int vs Integer with autoboxing. Print the time ratio.
