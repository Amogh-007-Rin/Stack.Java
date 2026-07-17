# Module 58 Exercises

## Exercise 1: Word Frequency Counter (Easy)

Given a list of sentences, use `flatMap` to split each sentence into words, then use `Collectors.groupingBy` with `Collectors.counting()` to count word frequencies. Print words that appear more than once.

Test with:
```java
List<String> sentences = Arrays.asList(
    "hello world hello",
    "world is beautiful",
    "hello everyone"
);
```

Expected: `hello=3, world=2`.

## Exercise 2: Product Statistics (Medium)

Create a `Product` record with `String name`, `String category`, `double price`. Create at least 8 products across 3-4 categories. Use:
- `Collectors.groupingBy` to group products by category
- `Collectors.summarizingDouble` to get price stats per category
- `partitioningBy` to split into expensive (> $50) and cheap

Print the stats for each category.

## Exercise 3: Number Ranges with flatMap (Medium)

Given a list of `int[]` arrays (each containing a range [start, end)), use `flatMap` with `IntStream.range` to flatten them into a single stream of all numbers, then:
- Remove duplicates
- Filter even numbers
- Find the sum using `reduce`
- Collect the first 10 numbers into a list

Test with: `int[][] ranges = {{1, 5}, {3, 8}, {10, 15}};`.

## Exercise 4: Employee Directory (Hard)

Create an `Employee` record with `String name`, `String department`, `double salary`. Create at least 6 employees across 3 departments. Build an employee directory (`Map<String, String>`) mapping employee name to their info string using `toMap`. Then:
- Use `groupingBy` to partition employees by department
- Use `summarizingDouble` to get salary stats per department
- Print the name of the highest-paid employee in each department (use `maxBy` collector inside `groupingBy`)
