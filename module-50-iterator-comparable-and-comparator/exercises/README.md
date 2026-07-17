# Module 50 Exercises: Iterator, Comparable, and Comparator

## Exercise 1: Custom Iterator
Create a class `BookCollection` that implements `Iterable<Book>`. It should wrap a list of books and return an iterator. Use it in a for-each loop.

## Exercise 2: Comparable for Books
Create a `Book` class with `title` and `pageCount`. Implement Comparable to sort by page count (ascending). Create a list of books and sort using Collections.sort. Print the sorted list.

## Exercise 3: Multiple Comparators
Create a `Patron` class with `name` and `membershipYear`. Write two Comparators:
- By name (alphabetical)
- By membershipYear (oldest first)
Sort the same list using each Comparator.

## Exercise 4: Iterator with Filter
Create a list of integers 1-20. Use an Iterator to remove all numbers that are NOT divisible by 3. Print the remaining numbers.
