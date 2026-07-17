# Module 22 — Exercises

## Exercise 1: Product Class with Constructors
Create a `Product` class with fields `name` (String), `price` (double), and `quantity` (int). Provide:
- A no-arg constructor that sets default values: "Unknown", 0.0, 0
- A constructor that takes `name` and `price`
- A constructor that takes all three fields
- Use `this()` to chain where possible

Add a `displayProduct()` method that prints all fields.

Write a `ProductDemo` class that creates one Product using each constructor.

## Exercise 2: Rectangle with Constructors
Create a `Rectangle` class with fields `length` and `width` (double). Provide:
- A no-arg constructor that creates a 1x1 rectangle
- A constructor that takes a single `side` parameter (creates a square)
- A constructor that takes `length` and `width`

Add an `area()` and `display()` method.

Write a `RectangleDemo` class demonstrating all three constructors.

## Exercise 3: Library Book Construction
Create a `LibraryBook` class with fields `title`, `author`, `yearPublished` (int), and `isAvailable` (boolean). Provide:
- A constructor that takes all fields
- A constructor that takes title, author, year (isAvailable defaults to true)
- A no-arg constructor that chains to the 3-param constructor with "Unknown"

Add a `display()` method.

Write a `LibraryDemo` class that creates three books using different constructors and prints them.

## Exercise 4: Constructor Overloading Pitfall
Create a `PitfallDemo` class that demonstrates what happens when you:
1. Define a class with only a parameterized constructor
2. Try to call `new ClassName()` in main (this should not compile)
3. Comment that line out and show the fix — adding a no-arg constructor

---

*Solutions are in the `solutions/` directory.*
