# Module 58: Streams — Intermediate, Terminal Operations, and Collectors

## Overview

Building on the basics, this module covers advanced stream operations: `flatMap` for flattening nested structures, `takeWhile`/`dropWhile` for conditional truncation, `reduce` for custom aggregation, and the `Collectors` utility class for sophisticated mutable reductions.

## Learning Objectives

- Flatten nested collections with `flatMap`
- Use `peek` for debugging pipeline stages
- Apply `mapToInt`, `mapToLong`, `mapToDouble` for primitive streams
- Use `takeWhile` and `dropWhile` (Java 9+) for conditional operations
- Reduce streams with `reduce`, `min`, `max`
- Short-circuit with `anyMatch`, `allMatch`, `noneMatch`, `findFirst`, `findAny`
- Use `Collectors.toMap`, `joining`, `groupingBy`, `partitioningBy`, `summarizingInt`

## Prerequisites

- Module 57: Streams API Basics

## Theory

### More Intermediate Operations

| Operation    | Purpose                                     |
|--------------|---------------------------------------------|
| `flatMap`    | Map each element to a stream, then flatten  |
| `peek`       | Apply side effect (debugging)               |
| `mapToInt`   | Convert to `IntStream` for numeric ops      |
| `takeWhile`  | Take elements while predicate is true       |
| `dropWhile`  | Drop elements while predicate is true       |

### More Terminal Operations

| Operation        | Purpose                                  |
|------------------|------------------------------------------|
| `reduce`         | Combine elements into a single value     |
| `min`/`max`      | Find min/max with a comparator           |
| `anyMatch`       | True if any element matches predicate    |
| `allMatch`       | True if all elements match               |
| `noneMatch`      | True if no elements match                |
| `findFirst`      | First element in stream order            |
| `findAny`        | Any element (non-deterministic in parallel) |

### Collectors

| Collector             | Returns                          |
|-----------------------|----------------------------------|
| `toList()`            | `List<T>`                        |
| `toSet()`             | `Set<T>`                         |
| `toMap(k, v)`         | `Map<K,V>`                       |
| `joining(delimiter)`  | Concatenated `String`            |
| `groupingBy(f)`       | `Map<K, List<V>>`                |
| `partitioningBy(p)`   | `Map<Boolean, List<V>>`          |
| `summarizingInt(f)`   | `IntSummaryStatistics`           |

## Code Examples

- `FlatMapAndPeek.java` — flatMap for nested lists, peek for debugging
- `TakeWhileDropWhile.java` — Java 9+ conditional truncation
- `ReduceAndMatch.java` — reduce, anyMatch, allMatch, noneMatch, findFirst, findAny
- `CollectorsDemo.java` — toMap, joining, groupingBy, partitioningBy, summarizingInt

## Common Pitfalls

- **`flatMap` with wrong return type**: the lambda must return a `Stream`, not a collection.
- **Using `peek` for non-debugging logic**: `peek` is meant for debugging; using it for business logic is a code smell.
- **Mutable state in `reduce`**: use `collect` instead of `reduce` with mutable accumulators.
- **Assuming `findFirst` vs `findAny`**: `findFirst` is more constrained in parallel streams; use `findAny` when order doesn't matter.
- **Using `toMap` with duplicate keys**: throws `IllegalStateException` unless a merge function is provided.

## Exercises

See `exercises/README.md`.

## Quiz

1. What does `flatMap` return for each element?
   a) A single value
   b) A `Stream` of values
   c) A `Collection`
   d) An `Optional`

2. What is the primary purpose of `peek`?
   a) Transforming elements
   b) Debugging and logging
   c) Filtering elements
   d) Reducing the stream

3. Which collector would you use to split a stream into two groups based on a predicate?
   a) `groupingBy`
   b) `partitioningBy`
   c) `toMap`
   d) `joining`

4. `takeWhile` stops processing when:
   a) The stream runs out of elements
   b) A predicate returns `false`
   c) A predicate returns `true`
   d) The first element is encountered

5. What happens if `toMap` encounters duplicate keys?
   a) Overwrites with the last value
   b) Throws `IllegalStateException`
   c) Skips duplicates
   d) Collects into a `List` of values

---

Answers: 1-b, 2-b, 3-b, 4-b, 5-b (unless a merge function is provided)

## Key Takeaways

- `flatMap` flattens nested streams into a single stream.
- `takeWhile`/`dropWhile` provide conditional stream truncation.
- `Collectors.groupingBy` and `partitioningBy` enable SQL-like grouping.
- Short-circuit operations (`anyMatch`, `findFirst`) improve performance.

## Next Module

Module 59: The Optional Class — a container for nullable values
