# Module 44 Exercises: Bounded Generics and Wildcards

## Exercise 1: Comparable Pair
Create a generic class `ComparablePair<T extends Comparable<T>>` that stores two values and has a method `max()` that returns the larger of the two. Test with `Integer` and `String`.

## Exercise 2: Wildcard Average Calculator
Write a static method `average(List<? extends Number> list)` that computes and returns the average of all numbers as a `double`. Test with `List<Integer>`, `List<Double>`, and `List<Long>`.

## Exercise 3: Add All with Super
Write a static method `addAll(List<? super Integer> dest, int start, int end)` that adds all integers from `start` to `end` (inclusive) to the destination list. Test with `List<Integer>` and `List<Number>`.

## Exercise 4: Copy with Bounded Wildcards
Write a generic method `copyFirstN(List<? extends T> source, List<? super T> dest, int n)` that copies the first `n` elements from source to dest. Use PECS. Test with source as `List<Integer>` and dest as `List<Object>`.
