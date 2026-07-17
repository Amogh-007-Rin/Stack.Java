# Module 33: Object Class Methods — Exercises

## Exercise 1: Book Class

Create a class `Book` with:
- Fields: `String title`, `String author`, `int year`
- Constructor to initialize all fields
- Override `toString()` to return "Book{title='...', author='...', year=...}"
- Override `equals()` to compare all three fields
- Override `hashCode()` using `Objects.hash()`

Write a main method that creates two equal books and one different book, and tests equality and hash codes.

## Exercise 2: Student Class

Create a class `Student` with:
- Fields: `int id`, `String name`, `double gpa`
- Constructor to initialize all fields
- Override `toString()` to return a formatted string
- Override `equals()` to compare all three fields
- Override `hashCode()` using `Objects.hash()`

Write a main method that creates a `HashSet<Student>` and adds several students (including a duplicate). Print the set size and contents.

## Exercise 3: Product Class with SKU-based Equality

Create a class `Product` with:
- Fields: `String sku`, `String name`, `double price`
- Constructor to initialize all fields
- Override `toString()` to return a formatted string
- Override `equals()` to compare only the `sku` field (since SKU is unique)
- Override `hashCode()` based on `sku` only

Write a main method that creates two products with the same SKU but different names/prices, and verify they are considered equal.
