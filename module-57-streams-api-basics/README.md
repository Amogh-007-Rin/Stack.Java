# Module 57: Streams API Basics

## Overview

The Streams API, introduced in Java 8, enables **declarative data processing** on collections. A stream is a sequence of elements that supports functional-style operations. Stream pipelines separate *what* to do from *how* to do it, leading to more readable and often more efficient code.

## Learning Objectives

- Understand the stream pipeline pattern: source → intermediate operations → terminal operation
- Create streams from collections, arrays, and values
- Apply intermediate operations: `filter`, `map`, `distinct`, `sorted`, `limit`, `skip`
- Apply terminal operations: `forEach`, `collect`, `count`, `toList` (Java 16+)
- Explain that streams are single-use and lazy

## Prerequisites

- Module 54: Lambda Expressions
- Module 55: Functional Interfaces

## Theory

### Stream Pipeline

A stream has three parts:

```
Source (Collection, array, generator)
  → Intermediate ops (filter, map, sorted, ...)  // lazy
  → Terminal op (forEach, collect, count, ...)   // triggers execution
```

### Creating Streams

```java
// From a collection
List<String> list = List.of("a", "b", "c");
Stream<String> stream = list.stream();

// From values
Stream<Integer> nums = Stream.of(1, 2, 3);

// From an array
int[] arr = {1, 2, 3};
IntStream intStream = Arrays.stream(arr);
```

### Intermediate Operations

These return a new stream and are **lazy** — they don't execute until a terminal op is called.

| Operation   | Purpose                                  |
|-------------|------------------------------------------|
| `filter`    | Keep elements matching a predicate       |
| `map`       | Transform each element                   |
| `distinct`  | Remove duplicates (uses `equals`)        |
| `sorted`    | Sort elements (natural or comparator)    |
| `limit(n)`  | Truncate to first n elements             |
| `skip(n)`   | Discard first n elements                 |

### Terminal Operations

These trigger the pipeline and produce a result or side effect.

| Operation   | Purpose                                  |
|-------------|------------------------------------------|
| `forEach`   | Perform action on each element           |
| `collect`   | Accumulate elements into a collection    |
| `count`     | Return the number of elements            |
| `toList()`  | Collect into an unmodifiable list (Java 16+) |

### Important Properties

- **Single-use**: a stream cannot be reused after a terminal operation.
- **Lazy**: intermediate ops only execute when a terminal op is invoked.
- **No storage**: streams don't store elements; they pull from the source.

### Comparison to Other Languages

| Concept         | Java Stream                          | C# LINQ                          | Python                          |
|-----------------|--------------------------------------|----------------------------------|---------------------------------|
| Create          | `list.stream()`                      | `list.AsEnumerable()`            | `iter(list)`                    |
| Filter          | `.filter(pred)`                      | `.Where(pred)`                   | `filter(pred, list)`            |
| Map             | `.map(func)`                         | `.Select(func)`                  | `map(func, list)`               |
| Sort            | `.sorted()`                          | `.OrderBy(x => x)`               | `sorted(list)`                  |
| First n         | `.limit(n)`                          | `.Take(n)`                       | `itertools.islice(iter, n)`     |
| Terminal        | `.collect(Collectors.toList())`      | `.ToList()`                      | `list(iter)`                    |

## Code Examples

- `CreatingStreams.java` — Stream.of, Collection.stream(), Arrays.stream()
- `IntermediateOps.java` — filter, map, distinct, sorted, limit, skip
- `TerminalOps.java` — forEach, collect, count, toList
- `StreamPipeline.java` — End-to-end pipeline with all stages

## Common Pitfalls

- **Reusing a stream**: calling a terminal op twice on the same stream throws `IllegalStateException`.
- **Forgetting a terminal op**: without it, nothing executes.
- **Modifying the source**: concurrent modification of the backing collection during stream processing causes `ConcurrentModificationException`.
- **Using `parallelStream()` on small datasets**: parallel overhead may be worse than sequential.
- **Assuming `sorted()` on streams mutates the source**: it returns a new sorted stream.

## Exercises

See `exercises/README.md`.

## Quiz

1. Which part of a stream pipeline triggers execution?
   a) Source
   b) Intermediate operation
   c) Terminal operation
   d) All of the above

2. What happens if you call a terminal operation twice on the same stream?
   a) It re-executes from the beginning
   b) It throws `IllegalStateException`
   c) It returns the same result
   d) It throws `NullPointerException`

3. Which intermediate operation removes duplicates?
   a) `filter`
   b) `distinct`
   c) `unique`
   d) `dedup`

4. What does `Stream.of(1, 2, 3).skip(2).limit(1).toList()` return?
   a) `[1]`
   b) `[3]`
   c) `[2, 3]`
   d) `[]`

5. `list.stream().filter(x -> x > 0).map(x -> x * 2)` — is this valid?
   a) Yes, it will produce a transformed stream
   b) No, filter and map cannot be chained
   c) No, there is no terminal operation
   d) Yes, but only with `parallelStream`

---

Answers: 1-c, 2-b, 3-b, 4-b, 5-a (pipeline is valid but will only execute when a terminal op is added)

## Key Takeaways

- Stream pipelines consist of a source, lazy intermediate ops, and an eager terminal op.
- Streams are single-use — create a new stream for each pipeline.
- `toList()` (Java 16+) is the simplest way to collect into a list.
- The Streams API encourages declarative, functional-style code over imperative loops.

## Next Module

Module 58: Streams — Intermediate, Terminal Operations, and Collectors (advanced operations)
