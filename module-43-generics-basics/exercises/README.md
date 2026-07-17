# Module 43 Exercises: Generics Basics

## Exercise 1: Generic Storage Class
Create a generic class `Storage<T>` that stores a single value. Provide methods `store(T item)`, `retrieve()`, and a `boolean isEmpty()` method. Test with `String`, `Integer`, and `Double`.

## Exercise 2: Generic Pair Class
Create a generic `Pair<T, U>` class with two fields of possibly different types. Include a method `swap()` that returns a new `Pair<U, T>` with the values swapped. Test it.

## Exercise 3: Generic Array Reverser
Write a generic method `reverse(T[] array)` that reverses an array in place. Test with `String[]` and `Integer[]`.

## Exercise 4: Generic Counter
Create a generic class `Counter<T>` that counts how many items of each type have been added. Provide `add(T item)` and `int getCount()`. Use a `List<T>` internally. Test with multiple types.
