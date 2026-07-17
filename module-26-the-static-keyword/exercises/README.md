# Module 26 — Exercises

## Exercise 1: Employee Counter
Create an `Employee` class with:
- Instance fields: `name` (String), `id` (int)
- A static field `nextId` starting at 1000 that auto-increments for each new employee
- A static field `employeeCount` that tracks how many employees have been created
- A constructor that sets name, assigns the next id, and increments counters
- Getters for name and id
- A static method `getEmployeeCount()` that returns the count

Write an `EmployeeDemo` class that creates several employees and prints their details and total count.

## Exercise 2: Configurable Settings
Create an `AppConfig` class with:
- Static fields: `appName`, `version`, `debugMode` (boolean)
- A static initializer block that sets defaults: "MyApp", "1.0.0", false
- Static methods: `setDebugMode(boolean)`, `isDebugMode()`, `displayConfig()`

Write a `ConfigDemo` class that displays the config, enables debug mode, and displays again.

## Exercise 3: Math Utility — Circle Calculator
Create a `CircleCalculator` class with static methods:
- `area(double radius)` — returns π * r²
- `circumference(double radius)` — returns 2 * π * r
- `diameter(double radius)` — returns 2 * r

Use `Math.PI` for π.

Write a `CircleDemo` class that calculates and prints area, circumference, and diameter for radius values of 1.0, 5.0, and 10.0.

---

*Solutions are in the `solutions/` directory.*
