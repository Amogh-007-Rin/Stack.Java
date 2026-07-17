# Module 83 Exercises: Records

Compile with `javac *.java` and run with `java <ExerciseN>`.

## Exercise 1: Rectangle Record
Create a `Rectangle` record with components `width` and `height` (both `double`). Add a method `area()` that returns the area. Add a compact constructor that throws `IllegalArgumentException` if any dimension is ≤ 0.

## Exercise 2: Student Record
Create a `Student` record with components `name` (`String`), `id` (`String`), `grade` (`double`). Use a compact constructor to:
- Reject empty names
- Reject negative or > 100 grades
- Normalize the ID to uppercase

## Exercise 3: Record as DTO
Create a `Book` record with `title`, `author`, `isbn`. Create a small program that creates a few books, stores them in a `List<Book>`, and filters by author. Demonstrate that `equals()` and `hashCode()` work correctly.
