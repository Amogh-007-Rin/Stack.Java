# Module 55 Exercises

## Exercise 1: Logger Levels (Easy)

Define an enum `LogLevel { INFO, WARN, ERROR }`. Create a `Map<LogLevel, Consumer<String>>` where each log level maps to a consumer that prints with a prefix (e.g., `[INFO]`, `[WARN]`, `[ERROR]`). Write a method `static void log(Map<LogLevel, Consumer<String>> loggers, LogLevel level, String msg)` that looks up the consumer and calls `accept`. Test with one message per level.

## Exercise 2: String Pipeline (Medium)

Create a `List<Function<String, String>>` pipeline containing at least 4 functions (e.g., strip, toUpperCase, replace vowels with `*`, truncate to 5 chars). Apply them in sequence using `andThen` starting from `Function.identity()`. Test with a few inputs and print the intermediate results.

## Exercise 3: Validator Builder (Hard)

Create a `Validator<T>` class that wraps a `Predicate<T>`. Provide:
- A static factory `Validator<T> of(Predicate<T> p)`
- `Validator<T> and(Predicate<T> other)` and `Validator<T> or(Predicate<T> other)`
- `boolean isValid(T value)`
- A `List<String> getErrors()` method that stores error messages from failed validations (accept a `String` error message in `of`)

Test with a `Validator<String>` that checks:
- Not null
- Not empty
- Length >= 3
- Contains at least one digit
