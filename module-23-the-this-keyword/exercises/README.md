# Module 23 — Exercises

## Exercise 1: Employee Class with `this`
Create an `Employee` class with fields `name`, `position`, and `salary`. Use `this` in setters and constructors to disambiguate from parameters. Include a `display()` method that prints all fields.

Write an `EmployeeDemo` class that creates two employees and displays them.

## Exercise 2: Method Chaining — `StringBuilder`-Style
Create a `MessageBuilder` class with a `String message` field (initially empty). Add methods:
- `append(String text)` — appends text and returns `this`
- `prepend(String text)` — prepends text and returns `this`
- `toUpperCase()` — converts message to uppercase and returns `this`
- `display()` — prints the current message

Write a `MessageDemo` class that chains a series of calls and displays the result.

## Exercise 3: Constructor Chaining with `this()`
Create a `Student` class with fields `name`, `id` (int), and `gpa` (double). Provide:
- A no-arg constructor that chains to the full constructor with "Unknown", 0, 0.0
- A constructor with name and id (gpa defaults to 0.0)
- A full constructor with all three fields

Add a `display()` method. Write a `StudentDemo` class that creates one student using each constructor.

## Exercise 4: Fluent Configuration
Create a `ServerConfig` class with fields `host`, `port` (int), `timeout` (int), and `useSSL` (boolean). Provide setters that return `this`. Write a `ConfigDemo` class that configures a server with chained calls like:
```
new ServerConfig().setHost("localhost").setPort(8080).setTimeout(5000).setUseSSL(true)
```
Then add a `display()` method to show the configuration.

---

*Solutions are in the `solutions/` directory.*
