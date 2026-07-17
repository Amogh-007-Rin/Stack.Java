# Module 35: The Final Keyword — Exercises

## Exercise 1: Circle with Final Fields

Create a class `Circle` with:
- A `final` field `double PI` initialized to 3.14159
- A `final` field `double radius` (blank final, initialized in constructor)
- Constructor that takes radius
- Method `double area()` returning PI * radius * radius
- Method `double circumference()` returning 2 * PI * radius

Write a main method that creates a Circle and prints its area and circumference.

## Exercise 2: Final Method Prevention

Create a class hierarchy:
- `Vehicle` with a `final` method `void start()` that prints "Vehicle starting..."
- `Vehicle` with a non-final method `void describe()` that prints "This is a vehicle"
- `Car` extends `Vehicle` and overrides `describe()` to print "This is a car"

Write a main method that creates a Car and calls both methods. Note that `start()` cannot be overridden.

## Exercise 3: Final Utility Class

Create a `final` class `StringUtils` with:
- A `static final` field `String EMPTY` initialized to `""`
- A `static` method `boolean isBlank(String s)` that returns true if s is null or blank
- A `static` method `String reverse(String s)` that returns the reversed string

Write a main method that demonstrates these utilities.
