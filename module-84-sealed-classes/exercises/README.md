# Module 84 Exercises: Sealed Classes

Compile with `javac *.java` and run with `java <ExerciseN>`.

## Exercise 1: Vehicle Hierarchy
Create a sealed class `Vehicle` permitted to `Car`, `Truck`, and `Motorcycle`. Each subclass should have relevant fields (e.g., `Car` has `doors`, `Truck` has `cargoCapacity`, `Motorcycle` has `engineCC`). Make `Car` `final`, `Truck` `sealed` (permitting `PickupTruck`), and `Motorcycle` `non-sealed`.

## Exercise 2: JSON Value
Create a sealed interface `JsonValue` permitted to `JsonString`, `JsonNumber`, `JsonArray`, `JsonObject`, and `JsonNull`. Each should have a `toJson()` method that returns the JSON string representation. Create a small demo that builds and prints a JSON structure.

## Exercise 3: Exhaustive Check
Create a sealed interface `Operation` with `permits Add`, `Subtract`, `Multiply`, `Divide`. Each is a record that implements `Operation` with an `int apply(int a, int b)` method. Write a method that uses `instanceof` pattern matching (not switch) to apply any operation exhaustively.
