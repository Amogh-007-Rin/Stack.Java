# Module 59 Exercises

## Exercise 1: Safe Division (Easy)

Write a method `static Optional<Integer> divide(int a, int b)` that returns `Optional.empty()` if `b` is 0, otherwise `Optional.of(a / b)`. In `main`, test with:
- `divide(10, 2)` — should print 5
- `divide(10, 0)` — should print "Division by zero"
- Use `map` and `orElse` to produce the output.

## Exercise 2: Config Reader (Medium)

Simulate a configuration lookup. Create a `Map<String, String>` config with keys like `"host"`, `"port"`, `"debug"`. Write a method `static Optional<String> getConfig(Map<String, String> config, String key)`. Then use `Optional` chaining to:
- Look up `"port"`
- Parse it to `Integer` using `map` and `Integer::parseInt`
- If parsing fails or key is missing, default to `8080`
- Print the port value

## Exercise 3: User Lookup Chain (Hard)

Create a `User` record with fields `String name`, `Optional<String> email`, `Optional<String> phone`. Create a `List<User>` with at least 4 users (some missing email, some missing phone, one missing both). Write a method `static Optional<String> findFirstEmailOrPhone(List<User> users, String name)` that:
- Finds a user by name
- Returns the email if present
- Otherwise returns the phone
- Otherwise returns `Optional.empty()`

Use `flatMap`, `map`, and `or` (Java 9+) or chaining to implement the logic.
