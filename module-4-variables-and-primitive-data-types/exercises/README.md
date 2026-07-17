# Module 4 Exercises

## Exercise 1: Temperature Converter (Easy)

Write a program that declares a `double` variable for Celsius, converts it to Fahrenheit using the formula `F = C * 9/5 + 32`, and prints both values.

## Exercise 2: Data Type Sizing (Medium)

Write a program that declares one variable of each primitive type. Print each variable's value and also compute/print the result of incrementing each by 1. Observe overflow behavior on `byte` and `short` when their max value is exceeded.

## Exercise 3: Compound Interest Calculator (Hard)

Write a program that calculates compound interest. Declare `double principal = 1000.0`, `double rate = 0.05`, `int years = 10`. Use `long` for the number of compounding periods (`periodsPerYear = 12L`). Compute `amount = principal * Math.pow(1 + rate / periodsPerYear, periodsPerYear * years)`. Print the result formatted to 2 decimal places using `System.out.printf("%.2f", amount)`.
