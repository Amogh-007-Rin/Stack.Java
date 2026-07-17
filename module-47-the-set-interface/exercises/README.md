# Module 47 Exercises: The Set Interface

## Exercise 1: Set Basics
Create a program that:
- Creates a HashSet of strings (book genres)
- Adds 5 genres, including 1 duplicate
- Prints the set (note the duplicate is absent)
- Checks if a genre exists
- Prints the size

## Exercise 2: Set Comparison
Create a HashSet, LinkedHashSet, and TreeSet of the same 5 book titles. Add them in a specific order and print each set. Observe the order differences.

## Exercise 3: Custom Object with equals/hashCode
Create a `Patron` class with `id` (int) and `name` (String). Properly override equals and hashCode based on `id`. Create a HashSet of patrons, add some, and demonstrate that two patrons with the same `id` are treated as equal.

## Exercise 4: Removing Duplicates
Write a program that reads a list of words (hardcoded) and uses a Set to print only the unique words, preserving the order they first appeared.
