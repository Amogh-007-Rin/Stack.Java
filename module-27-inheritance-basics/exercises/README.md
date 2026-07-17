# Module 27 — Exercises

## Exercise 1: Vehicle Hierarchy
Create a `Vehicle` superclass with fields `make` (String), `model` (String), and `year` (int). Add a constructor and a method `displayInfo()` that prints all fields.

Create two subclasses:
- `Car` that adds an `int doors` field and overrides `displayInfo()` to include doors
- `Motorcycle` that adds an `boolean hasSidecar` field and overrides `displayInfo()` to include sidecar info

Write a `VehicleDemo` class that creates one of each and calls `displayInfo()`.

## Exercise 2: Employee Hierarchy
Create an `Employee` superclass with fields `name` and `salary` (double). Add a constructor and a method `work()` that prints "[name] is working."

Create subclasses:
- `Manager` that overrides `work()` to print "[name] is managing the team."
- `Developer` that adds a `programmingLanguage` field and overrides `work()` to print "[name] is writing code in [language]."

Write a `EmployeeDemo` class that creates one of each and calls `work()`.

## Exercise 3: Library Item Hierarchy
Create a `LibraryItem` superclass with fields `title`, `author`, and `year` (int). Add a constructor and a method `getDescription()` that returns a String like "Title by Author (Year)".

Create subclasses:
- `Book` that adds `pages` (int) and overrides `getDescription()` to include pages
- `DVD` that adds `durationMinutes` (int) and overrides `getDescription()` to include duration

Write a `LibraryDemo` class that creates items and prints their descriptions.

---

*Solutions are in the `solutions/` directory.*
