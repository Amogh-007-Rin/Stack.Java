# Module 39 Exercises: Exception Handling Basics

## Exercise 1: Divide with Exception Handling
Write a program that takes two integers as command-line arguments and divides the first by the second. Handle `ArithmeticException` and `ArrayIndexOutOfBoundsException` separately.

**Expected behavior:**
- If two arguments are not provided, catch `ArrayIndexOutOfBoundsException` and print "Please provide two numbers."
- If the second argument is 0, catch `ArithmeticException` and print "Cannot divide by zero."
- Otherwise, print the result.

## Exercise 2: Safe Array Access
Write a program that creates an array of 5 strings. Prompt the user for an index (use `Integer.parseInt` on args) and print the element at that index. Handle:
- `ArrayIndexOutOfBoundsException` — print "Index out of bounds."
- `NumberFormatException` — print "Invalid number format."

Use a `finally` block that always prints "Operation complete."

## Exercise 3: Parse Integer with Fallback
Write a program that attempts to parse a command-line argument as an integer. If parsing fails due to `NumberFormatException`, print "Invalid input, using default value: 0" and assign 0. Use a `finally` block to print "Parsing attempt finished."

## Exercise 4: Nested try-catch
Write a program that demonstrates nested try-catch blocks. Outer try attempts to access an array element at a given index. Inner try divides that element by a second argument. Handle exceptions at the appropriate level:
- Outer: `ArrayIndexOutOfBoundsException`
- Inner: `ArithmeticException`
