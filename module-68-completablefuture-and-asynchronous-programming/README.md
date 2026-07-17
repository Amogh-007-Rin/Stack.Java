# Module 68: CompletableFuture and Asynchronous Programming

## Overview
`CompletableFuture` (Java 8+) enables asynchronous, non-blocking programming through a promise-based API. It supports chaining, combining, and composing async tasks with rich exception handling.

## Learning Objectives
- Create async tasks with `supplyAsync` and `runAsync`
- Chain operations with `thenApply`, `thenAccept`, `thenRun`
- Combine independent futures with `thenCombine`, `allOf`, `anyOf`
- Handle exceptions with `exceptionally`, `handle`, `whenComplete`
- Compare with JavaScript Promises and Python asyncio

## Prerequisites
- Module 66 (Executors and Thread Pools)
- Lambda expressions and method references

## Theory
A `CompletableFuture<T>` represents a future result of an asynchronous computation. Unlike `Future<T>`, it can be explicitly completed and chained.

### Creating Async Tasks

| Method | Description |
|--------|-------------|
| `supplyAsync(Supplier<T>)` | Async task returning a value |
| `supplyAsync(Supplier<T>, Executor)` | With custom executor |
| `runAsync(Runnable)` | Async task with no return value |

### Chaining

| Method | Input | Output |
|--------|-------|--------|
| `thenApply(Function)` | T | U |
| `thenAccept(Consumer)` | T | void |
| `thenRun(Runnable)` | void | void |

### Combining

| Method | Description |
|--------|-------------|
| `thenCombine(other, BiFunction)` | Combines results of two futures |
| `allOf(CompletableFuture<?>...)` | Completes when all complete |
| `anyOf(CompletableFuture<?>...)` | Completes when any completes |

### Exception Handling

| Method | Description |
|--------|-------------|
| `exceptionally(Function<Throwable, T>)` | Recover from error |
| `handle(BiFunction<T, Throwable, U>)` | Handle success or error |
| `whenComplete(BiConsumer<T, Throwable>)` | Side-effect on completion |

### Comparison

| Concept | Java | JavaScript | Python |
|---------|------|------------|--------|
| Async primitive | `CompletableFuture` | `Promise` | `Future`/`Task` |
| Chain | `thenApply` | `.then()` | `await` |
| Combine | `thenCombine` | `Promise.all` | `asyncio.gather` |
| Error | `exceptionally` | `.catch()` | `except` |

## Code Examples
See `examples/`:
- `SupplyAsyncDemo.java` – supplyAsync + thenApply
- `RunAsyncDemo.java` – runAsync + thenAccept + thenRun
- `CombineDemo.java` – thenCombine, allOf, anyOf
- `ExceptionHandlingDemo.java` – exceptionally, handle, whenComplete

## Common Pitfalls
- Forgetting that async tasks run on `ForkJoinPool.commonPool()` by default
- Blocking with `get()`/`join()` inside an async chain
- Not handling exceptions (silent failures)
- Using `thenApply` for side-effects instead of `thenAccept`
- Creating deeply nested chains when composition would be cleaner

## Exercises
See `exercises/README.md`.

## Quiz

1. Which method creates an async task that returns a value?
   a) `runAsync()`   b) `supplyAsync()`   c) `executeAsync()`   d) `startAsync()`

2. Which chaining method transforms a `CompletableFuture<T>` to `CompletableFuture<U>`?
   a) `thenAccept`   b) `thenRun`   c) `thenApply`   d) `thenCombine`

3. How do you recover from an exception in a CompletableFuture chain?
   a) `catch()`   b) `exceptionally()`   c) `recover()`   d) `onError()`

4. What does `allOf()` return when all futures complete?
   a) `CompletableFuture<Void>`   b) `CompletableFuture<List<T>>`
   c) `CompletableFuture<Object>`   d) `void`

5. Which method is equivalent to JavaScript's `Promise.all`?
   a) `anyOf`   b) `allOf`   c) `thenCombine`   d) `join`

---
Answers: 1-b, 2-c, 3-b, 4-a, 5-b

## Key Takeaways
- `supplyAsync` for async tasks with results; `runAsync` for fire-and-forget
- Chain with `thenApply` (transform), `thenAccept` (consume), `thenRun` (execute)
- Combine independent futures with `thenCombine`, `allOf`, `anyOf`
- Always handle exceptions with `exceptionally` or `handle`

## Next Module
Continue your journey into advanced Java topics!
