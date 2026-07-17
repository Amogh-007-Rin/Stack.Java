# Module 96: Exercises — Logging

## Exercise 1: File Logger
Write a program `FileLoggerDemo.java` that creates a `Logger` named `"FileLoggerDemo"`, attaches a `FileHandler` that writes to `app.log`, and logs 10 messages at various levels. Verify the file was created and contains the messages.

## Exercise 2: Parameterized Logging
Write a program `TransactionLogger.java` that processes an array of transactions (each with `id`, `amount`, `status`). Log each transaction using parameterized `{0}` `{1}` placeholders at `FINE` level. Also log a summary (count, total amount) at `INFO` level.

## Exercise 3: Custom Formatter
Write a program `CustomFormatterDemo.java` that creates a custom `Formatter` subclass producing log lines in the format:
```
[LEVEL] 2025-01-15 14:30:00 - Message
```
Apply it to a `ConsoleHandler` and log at least one message at each of `INFO`, `WARNING`, and `SEVERE`.
