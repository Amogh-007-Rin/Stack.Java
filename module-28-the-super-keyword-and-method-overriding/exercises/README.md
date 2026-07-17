# Module 28 — Exercises

## Exercise 1: Employee with Super
Create an `Employee` superclass with fields `name` (String), `baseSalary` (double). Add a constructor and a method `getDetails()` that returns "Name: [name], Salary: $[baseSalary]".

Create a `Manager` subclass that adds a `bonus` (double) field. Override `getDetails()` to call `super.getDetails()` and append ", Bonus: $[bonus], Total: $[baseSalary + bonus]".

Write a `EmployeeDemo` class that creates one of each and prints details.

## Exercise 2: Shape Hierarchy
Create a `Shape` superclass with a method `getArea()` that returns 0.0 and a method `display()` that prints "Shape area: " + getArea().

Create subclasses:
- `Circle` with field `radius`, constructor that calls `super()`, and overrides `getArea()` to return π * r²
- `Rectangle` with fields `length` and `width`, constructor, and overrides `getArea()`

In each subclass's `display()` method, call `super.display()` first, then print additional info (e.g., "Radius: [radius]").

Write a `ShapeDemo` class that creates one of each and calls `display()`.

## Exercise 3: Override Rules Validation
Create a `Base` class with:
- A `public` method `calculate(int x)` returning `int`
- A `protected` method `process()` that prints "Base process"

Create a `Derived` class that attempts to:
- Override `calculate` correctly (same signature, covariant return with Integer) ✓
- Override `process` with `public` visibility (widening visibility is okay) ✓
- Add a comment showing what would NOT compile (reducing visibility, different signature)

Write a `ValidationDemo` class to test.

---

*Solutions are in the `solutions/` directory.*
