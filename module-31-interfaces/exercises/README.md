# Module 31: Interfaces — Exercises

## Exercise 1: Flyable and Swimmable

Create two interfaces:
- `Flyable` with method `void fly()`
- `Swimmable` with method `void swim()`

Create a class `Duck` that implements both interfaces. Create a class `Airplane` that implements only `Flyable`.

Write a main method that creates a `Duck` and an `Airplane` and calls their methods.

## Exercise 2: Payment Interface

Create an interface `Payment` with:
- Method `void processPayment(double amount)`

Create two classes:
- `CreditCardPayment` — prints "Processing credit card payment of $X"
- `PayPalPayment` — prints "Processing PayPal payment of $X"

Write a main method that creates an array of `Payment` references and processes payments polymorphically.

## Exercise 3: Resizable Interface

Create an interface `Resizable` with:
- Method `void resize(double factor)`
- Method `void resetSize()`

Create a class `Image` that implements `Resizable`:
- Fields: `int width`, `int height`, `int originalWidth`, `int originalHeight`
- Constructor sets initial dimensions and stores originals
- `resize(double factor)` multiplies both dimensions by factor
- `resetSize()` restores original dimensions
- Method `void display()` prints current dimensions

Write a main method that creates an Image, resizes it, displays it, and resets it.
