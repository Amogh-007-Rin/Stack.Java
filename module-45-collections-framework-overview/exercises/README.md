# Module 45 Exercises: Collections Framework Overview

## Exercise 1: Array to Collection Conversion
Write a program that creates an array of 5 book titles, converts it to an ArrayList, adds two more titles, removes one, and prints the final list.

## Exercise 2: Collection Type Selector
Given a list of use cases, choose the appropriate Collection type (List, Set, Queue, or Map) and explain why. Use cases:
- A waiting list for library computers
- A unique set of ISBN numbers
- A mapping from student ID to borrowed book count
- A list of daily visitors in order of arrival

## Exercise 3: Collection Hierarchy Diagram
Write a program that:
- Creates one instance of each: ArrayList, HashSet, TreeSet, and HashMap
- Adds 3 elements to each
- Prints their class name and size
- Demonstrates that Map is NOT a Collection by checking `map instanceof Collection`

## Exercise 4: Iterable Implementation
Create a custom class `Library` that implements `Iterable<String>` and allows iterating over its book collection using a for-each loop.
