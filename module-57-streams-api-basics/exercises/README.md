# Module 57 Exercises

## Exercise 1: Name Processor (Easy)

Given `List<String> names = List.of("Alice", "Bob", "Charlie", "David", "Eve", "Frank");`, use streams to:
- Filter names starting with 'A' or 'B'
- Convert them to uppercase
- Sort them alphabetically
- Collect the result into a new list using `toList()`
- Print the result

## Exercise 2: Word Statistics (Medium)

Write a program that takes a sentence and uses streams to:
- Split into words (using `Pattern.compile("\\s+").splitAsStream(sentence)` or `Arrays.stream(sentence.split("\\s+"))`)
- Remove duplicates
- Filter words longer than 3 characters
- Print the number of remaining words (using `count`)
- Print the shortest word (hint: use `min` with a comparator on `String::length`)

Test with: `"the quick brown fox jumps over the lazy dog"`.

## Exercise 3: Number Ranges (Medium)

Generate `List<Integer>` from 1 to 100 (use `IntStream.rangeClosed`). Use stream operations to:
- Skip the first 10 numbers
- Keep only even numbers
- Limit to 20 numbers
- Square each number
- Collect into a `List<Integer>`
- Print the sum of the list

## Exercise 4: Custom Object Pipeline (Hard)

Create a `Product` record with `String name`, `String category`, `double price`. Create a list containing at least 6 products across 3 categories. Use streams to:
- Filter products with price > 10.0
- Sort by price descending
- Map to formatted strings like `"Laptop: $999.99"`
- Collect the first 3 into a list
- Print each using `forEach(System.out::println)`
