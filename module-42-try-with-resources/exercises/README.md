# Module 42 Exercises: Try-With-Resources

## Exercise 1: File Copy with Try-With-Resources
Write a program that copies one file to another using try-with-resources. Accept source and destination filenames as command-line arguments. Use `FileInputStream` and `FileOutputStream`. Handle `IOException`.

## Exercise 2: Custom AutoCloseable Logger
Create a `Logger` class that implements `AutoCloseable`. Its constructor prints "Logger opened". It has a `log(String message)` method. Its `close()` prints "Logger closed". Use it in try-with-resources.

## Exercise 3: Multiple Resources - Read and Process
Write a program that opens a `BufferedReader` and a `PrintWriter` in a single try-with-resources statement. Read lines from an input file (from args) and write them (prefixed with line numbers) to an output file. Handle `IOException`.

## Exercise 4: Suppressed Exception Investigation
Create a `DatabaseConnection` that implements `AutoCloseable` and throws an exception in `close()`. In the try block, throw a different exception. In the catch block, print the main exception and all suppressed exceptions.
