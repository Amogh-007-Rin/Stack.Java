# Module 29 — Exercises

## Exercise 1: Employee Polymorphism
Create an `Employee` superclass with a method `work()` that prints "[name] is working." Add a field `name`.

Create subclasses:
- `Developer` — overrides `work()` to print "[name] is coding."
- `Designer` — overrides `work()` to print "[name] is designing."
- `Manager` — overrides `work()` to print "[name] is managing."

Write an `EmployeeDemo` class that:
1. Creates an array of `Employee` references containing one of each type
2. Loops through and calls `work()` on each (demonstrating polymorphism)
3. Uses `instanceof` to find the Manager and prints "Found the manager!"

## Exercise 2: Shape Area (Polymorphic)
Create a `Shape` superclass with a method `getArea()` returning 0.0.

Create subclasses:
- `Circle` (field: `radius`) — overrides `getArea()` as π * r²
- `Rectangle` (fields: `length`, `width`) — overrides `getArea()` as length * width
- `Triangle` (fields: `base`, `height`) — overrides `getArea()` as 0.5 * base * height

Write a `ShapeDemo` class that creates an array of shapes, calculates total area, and prints each shape's area using polymorphism.

## Exercise 3: Media Library
Create a `MediaItem` superclass with `title` (String) and a method `play()` that prints "Playing [title]."

Create subclasses:
- `Song` — adds `artist` field, overrides `play()` to print "🎵 Playing [title] by [artist]"
- `Movie` — adds `director` field, overrides `play()` to print "🎬 Playing [title] directed by [director]"
- `AudioBook` — adds `narrator` field, overrides `play()` to print "🎧 Listening to [title] narrated by [narrator]"

Write a `MediaDemo` class that creates a playlist (array) of MediaItem references, loops through calling `play()`, and uses `instanceof` to count how many of each type exist.

## Exercise 4: Method Overloading vs Overriding
Write a `PolyComparison` class with:
- A method `print(String s)` and an overloaded `print(String s, int times)` that prints the string multiple times
- Create a `SubPrinter` class that extends `PolyComparison` and overrides `print(String s)` to print "[OVERRIDE] " + s
- Demonstrate both compile-time (overloading) and runtime (overriding) polymorphism

---

*Solutions are in the `solutions/` directory.*
