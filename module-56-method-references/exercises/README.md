# Module 56 Exercises

## Exercise 1: Person Sorter (Easy)

Create a `Person` class with fields `String name` and `int age`. Write a `main` method that creates a list of 4-5 `Person` objects. Using method references and `Comparator.comparing`, sort by:
- Name (using `Person::name` — note: you'll need a getter)
- Age (using `Person::age`)

Print the sorted list each time. Use `System.out::println` with `forEach`.

## Exercise 2: String Transformer Pipeline (Medium)

Create a list of `Function<String, String>` using method references where possible:
- `String::strip`
- `String::toUpperCase`
- `String::repeat` — use `s -> s.repeat(2)` since it takes an argument
- `String::concat` with a fixed suffix `"!"`

Apply the pipeline to `"  hello  "` using `Function::andThen` and print the result.

## Exercise 3: Generic Factory (Hard)

Write a `Factory<T>` class with:
- A `Supplier<T>` field
- A constructor that takes a `Supplier<T>`
- A static method `Factory<T> create(Supplier<T> supplier)`
- A method `T newInstance()` that delegates to the supplier

Demonstrate by creating factories for `StringBuilder`, `ArrayList<String>`, and `Integer` using constructor references. Create instances from each factory and perform a simple operation on the created objects.
