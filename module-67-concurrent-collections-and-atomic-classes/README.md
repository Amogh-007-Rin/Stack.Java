# Module 67: Concurrent Collections and Atomic Classes

## Overview
Java's `java.util.concurrent` package provides thread-safe collections and atomic variables that outperform traditional synchronization in many scenarios. This module covers the most commonly used concurrent data structures.

## Learning Objectives
- Use `ConcurrentHashMap` for thread-safe map operations
- Use `CopyOnWriteArrayList` for thread-safe iteration
- Use `BlockingQueue` implementations for producer-consumer patterns
- Use `AtomicInteger`, `AtomicLong`, `AtomicReference` for lock-free thread safety
- Know when to choose concurrent collections over synchronized wrappers

## Prerequisites
- Module 65 (Thread Lifecycle and Synchronization)
- Module 66 (Executors and Thread Pools)

## Theory

### ConcurrentHashMap
- Thread-safe, high-performance HashMap
- No `ConcurrentModificationException` during iteration
- `putIfAbsent`, `replace`, `computeIfAbsent` for atomic operations
- Internal segmentation (or tree-based in Java 8+)

### CopyOnWriteArrayList
- Thread-safe variant of ArrayList
- Every modification creates a new copy of the underlying array
- Iterators never throw `ConcurrentModificationException`
- Best for read-heavy, write-rare scenarios

### BlockingQueue
- Thread-safe queue with blocking operations
- `put(e)` — blocks if full
- `take()` — blocks if empty
- `offer(e, timeout)` — timed offer
- `poll(timeout)` — timed poll
- Implementations: `LinkedBlockingQueue`, `ArrayBlockingQueue`

### Atomic Classes
- `AtomicInteger`, `AtomicLong`, `AtomicBoolean`, `AtomicReference`
- Lock-free, using CAS (Compare-And-Swap) instructions
- Methods: `get()`, `set()`, `incrementAndGet()`, `compareAndSet()`

### Concurrent Collections vs Synchronized Wrappers
| Aspect | Concurrent Collection | `Collections.synchronizedXxx()` |
|--------|---------------------|-------------------------------|
| Lock scope | Per-bucket or per-node | Entire collection |
| Iteration | Safe without external sync | Requires manual sync |
| Performance | High | Low under contention |
| Composition | Atomic compound methods | No atomic compound ops |

## Code Examples
See `examples/`:
- `ConcurrentHashMapDemo.java` – Thread-safe map operations
- `CopyOnWriteArrayListDemo.java` – Safe iteration while modifying
- `BlockingQueueDemo.java` – Producer-consumer with BlockingQueue
- `AtomicCounterDemo.java` – Lock-free counter

## Common Pitfalls
- Using `ConcurrentHashMap` when `HashMap` would suffice (overhead)
- Using `CopyOnWriteArrayList` for write-heavy workloads (copy cost)
- Forgetting that `AtomicInteger` only guarantees atomicity per call, not across calls
- Using `synchronized` collections when concurrent collections are available

## Exercises
See `exercises/README.md`.

## Quiz

1. Which concurrent collection is best for a read-heavy, rarely-modified list?
   a) `ConcurrentHashMap`   b) `CopyOnWriteArrayList`
   c) `LinkedBlockingQueue`   d) `ArrayList`

2. What does `BlockingQueue.take()` do if the queue is empty?
   a) Returns null   b) Throws exception   c) Blocks until available   d) Returns -1

3. Which method atomically increments an `AtomicInteger` and returns the new value?
   a) `getAndIncrement()`   b) `incrementAndGet()`   c) `addAndGet()`   d) `increment()`

4. When iterating a `ConcurrentHashMap`, which exception is NOT thrown?
   a) `NullPointerException`   b) `ConcurrentModificationException`
   c) `ClassCastException`   d) `IllegalArgumentException`

5. Which `ConcurrentHashMap` method atomically inserts if absent?
   a) `put()`   b) `putIfAbsent()`   c) `addIfAbsent()`   d) `insertIfAbsent()`

---
Answers: 1-b, 2-c, 3-b, 4-b, 5-b

## Key Takeaways
- `ConcurrentHashMap` is the go-to thread-safe map
- `CopyOnWriteArrayList` excels for read-heavy workloads
- `BlockingQueue` simplifies producer-consumer patterns
- Atomic classes offer lock-free thread safety for single variables

## Next Module
Module 68: CompletableFuture and Asynchronous Programming
