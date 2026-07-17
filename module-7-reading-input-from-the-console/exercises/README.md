# Module 7 Exercises

## Exercise 1: Personal Greeting (Easy)

Write a program that reads the user's first name (single token) and last name, then prints a personalized greeting. Use `next()` for first name and `nextLine()` for last name. Handle the `next()` / `nextLine()` newline issue correctly.

## Exercise 2: Simple Calculator (Medium)

Write a program that reads two integers and an operator (`+`, `-`, `*`, `/`) from the user. Read the operator as a `String` using `next()`. Perform the operation and print the result. Handle division by zero gracefully (print an error message instead of crashing).

## Exercise 3: Running Sum with Validation (Hard)

Write a program that repeatedly asks the user for integers and keeps a running total. Use `hasNextInt()` to validate input. If the user enters something that is not an integer, print "Invalid input, try again" and discard the bad token. Continue until the user enters `0`, then print the total. Hint: use a while loop with `hasNextInt()`.
