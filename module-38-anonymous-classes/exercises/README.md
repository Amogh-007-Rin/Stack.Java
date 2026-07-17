# Module 38: Anonymous Classes — Exercises

## Exercise 1: GreetingService

Create an interface `GreetingService` with:
- A method `void greet(String name)`

Write a main method that:
- Creates two anonymous `GreetingService` instances:
  - One that prints "Hello, [name]!"
  - One that prints "Goodbye, [name]!"
- Calls both methods

## Exercise 2: StringProcessor

Create an interface `StringProcessor` with:
- A method `String process(String input)`

Write a main method that:
- Creates an anonymous `StringProcessor` that returns the uppercase version of the input
- Creates another anonymous `StringProcessor` that returns the reverse of the input
- Demonstrates both processors

## Exercise 3: Shape Area Calculator

Create an abstract class `Shape` with:
- A method `double area()` (abstract)

Write a main method that:
- Creates two anonymous `Shape` instances:
  - One representing a circle with radius 5 (PI * r * r)
  - One representing a rectangle with width 4 and height 6 (w * h)
- Prints the area of both shapes

