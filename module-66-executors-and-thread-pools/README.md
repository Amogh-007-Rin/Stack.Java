# Module 66: Executors and Thread Pools

## Overview
Managing threads manually is error-prone. The `java.util.concurrent` package provides the `ExecutorService` framework for thread pool management, task submission, and result retrieval.

## Learning Objectives
- Create thread pools with the `Executors` factory
- Submit tasks with `execute()` (Runnable) and `submit()` (Runnable/Callable)
- Retrieve results with `Future<T>`
- Gracefully shut down thread pools
- Distinguish `Callable<T>` from `Runnable`

## Prerequisites
- Module 64 (Multithreading Basics)
- Module 65 (Thread Lifecycle and Synchronization)

## Theory
Thread pools reuse a fixed number of threads, avoiding the overhead of creating new threads for each task.

### ExecutorService Factory Methods

| Method | Behavior |
|--------|----------|
| `newFixedThreadPool(n)` | Fixed-size pool; queues excess tasks |
| `newCachedThreadPool()` | Creates threads as needed; reuses idle ones |
| `newSingleThreadExecutor()` | Single thread; executes tasks sequentially |
| `newScheduledThreadPool(n)` | Schedules tasks with delay/period |

### submit vs execute
- `execute(Runnable)` — fire-and-forget, returns void
- `submit(Callable<T>)` — returns `Future<T>` for result retrieval
- `submit(Runnable)` — returns `Future<?>` that completes when task ends

### Callable vs Runnable
| Feature | Runnable | Callable<T> |
|---------|----------|-------------|
| Return value | void | T |
| Exception | Checked exceptions propagate | Can throw checked exceptions |
| Method | `run()` | `call()` |

### Shutdown
- `shutdown()` — no new tasks accepted; waits for running tasks
- `shutdownNow()` — attempts to stop running tasks; returns queued tasks

## Code Examples
See `examples/`:
- `FixedThreadPoolDemo.java` – Fixed pool with Runnable
- `CachedThreadPoolDemo.java` – Cached pool
- `ScheduledThreadPoolDemo.java` – Scheduled tasks
- `CallableFutureDemo.java` – Callable with Future

## Common Pitfalls
- Forgetting to shut down the executor (JVM won't exit)
- Calling `shutdownNow()` when `shutdown()` suffices
- Blocking on `Future.get()` without timeout
- Creating a cached pool for CPU-bound tasks (unbounded threads)
- Ignoring `InterruptedException` from `get()`

## Exercises
See `exercises/README.md`.

## Quiz

1. Which method returns a `Future` when submitting a task?
   a) `execute()`   b) `submit()`   c) `run()`   d) `start()`

2. What is the key difference between `Callable` and `Runnable`?
   a) Callable runs in a separate thread   b) Callable returns a value
   c) Runnable can throw exceptions   d) No difference

3. What does `shutdown()` do?
   a) Stops all threads immediately   b) Prevents new tasks, waits for running
   c) Returns queued tasks   d) Terminates the JVM

4. Which executor is best for short-lived, bursty workloads?
   a) `newFixedThreadPool`   b) `newCachedThreadPool`
   c) `newSingleThreadExecutor`   d) `newScheduledThreadPool`

5. How do you get the result from a `Future<T>`?
   a) `result()`   b) `getResult()`   c) `get()`   d) `value()`

---
Answers: 1-b, 2-b, 3-b, 4-b, 5-c

## Key Takeaways
- Use `Executors` factory methods to create thread pools
- Prefer `submit()` with `Callable` when results are needed
- Always shut down executors to release resources
- Use `newFixedThreadPool` for CPU-bound, `newCachedThreadPool` for I/O-bound tasks

## Next Module
Module 67: Concurrent Collections and Atomic Classes
