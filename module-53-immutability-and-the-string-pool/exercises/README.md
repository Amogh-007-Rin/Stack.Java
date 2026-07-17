# Module 53 Exercises: Immutability and the String Pool

## Exercise 1: String Pool Exploration
Write a program that:
- Creates two String literals "hello" and compares with ==
- Creates a String with `new String("hello")` and compares with == to the literal
- Interns the new String and compares again
- Creates a compile-time constant via concatenation and compares

## Exercise 2: Immutable Patron Class
Create an immutable `Patron` class with:
- `id` (int)
- `name` (String)
- `borrowedBooks` (List<String>)
Make defensive copies in the constructor and getters. Demonstrate that external modification of the original list does not affect the Patron.

## Exercise 3: Immutable Collections
Use `List.of`, `Set.of`, and `Map.of` to create immutable collections. Attempt to modify each and handle the exceptions. Show that `List.copyOf` creates a separate immutable copy.

## Exercise 4: Mutable Field Defense
Create an immutable class that holds a `Date` field (java.util.Date). Use defensive copying in the constructor and getter. Demonstrate that the original Date can be changed without affecting the immutable object.
