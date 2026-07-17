# Module 40 Exercises: Checked vs Unchecked Exceptions

## Exercise 1: File Reader with throws
Write a program with a method `readFirstLine(String path)` that reads and returns the first line of a file. Declare `throws IOException`. In `main`, call this method with a filename from args and handle the exception, printing "File not found or cannot be read."

## Exercise 2: Division with Unchecked Exceptions
Write a method `divide(int a, int b)` that returns `a / b`. Do NOT handle `ArithmeticException` — let it propagate. In `main`, call `divide` with arguments from the command line and catch `ArithmeticException` and `ArrayIndexOutOfBoundsException`.

## Exercise 3: Parse Utility with Checked Exception
Create a method `parseFile(String path)` that uses `FileReader` (throws `FileNotFoundException`). In `main`, call it and handle the checked exception. Also create a method `parseIntSafely(String s)` that returns an `int` and throws `NumberFormatException` (unchecked) — do not handle it in the method.

## Exercise 4: Banking Application
Write a simple banking class with a `withdraw(double amount)` method that throws `IllegalArgumentException` (unchecked) if amount is negative or exceeds balance. Also write `saveToFile(String filename)` that throws `IOException` (checked). Handle in `main` appropriately.
