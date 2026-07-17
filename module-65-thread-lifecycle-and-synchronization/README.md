# Module 65: Thread Lifecycle and Synchronization

## Overview
This module dives into the six thread states, the `synchronized` keyword for mutual exclusion, inter-thread coordination with `wait()`/`notify()`, and concurrency hazards like deadlock.

## Learning Objectives
- Identify all six thread states and their transitions
- Use `synchronized` methods and blocks for thread safety
- Understand intrinsic locks (monitors)
- Coordinate threads with `wait()`, `notify()`, `notifyAll()`
- Recognize and avoid deadlock, livelock, and starvation
- Understand the `volatile` keyword

## Prerequisites
- Module 64 (Multithreading Basics)

## Theory

### Thread States
1. **NEW** — Created but not started
2. **RUNNABLE** — Executing or ready to execute
3. **BLOCKED** — Waiting to acquire a monitor lock
4. **WAITING** — Waiting indefinitely (`wait()`, `join()`)
5. **TIMED_WAITING** — Waiting with a timeout (`sleep()`, `wait(timeout)`)
6. **TERMINATED** — `run()` completed

### Synchronization
Every Java object has an intrinsic lock (monitor). The `synchronized` keyword acquires this lock:
```java
synchronized (obj) { ... }    // block-level
synchronized void method() {} // method-level
```

### wait/notify Protocol
- `wait()` — releases lock and waits for notification
- `notify()` — wakes one waiting thread
- `notifyAll()` — wakes all waiting threads
- Must be called inside a `synchronized` block on the same object

### volatile
The `volatile` keyword guarantees visibility of writes across threads. Reads always see the latest write. Does **not** provide atomicity.

### Concurrency Hazards
- **Deadlock**: Two or more threads blocked forever, each holding a lock the other needs
- **Livelock**: Threads keep responding to each other but make no progress
- **Starvation**: A thread is perpetually denied access to a resource

## Code Examples
See `examples/`:
- `ThreadStateDemo.java` – Observing thread states
- `SynchronizedCounter.java` – Synchronized methods
- `WaitNotifyDemo.java` – Producer-consumer with wait/notify
- `DeadlockDemo.java` – Classic deadlock

## Common Pitfalls
- Synchronizing on a mutable field (lock object changes)
- Calling `wait()` outside a `synchronized` block
- Using `notify()` when `notifyAll()` is needed
- Deadlock from inconsistent lock ordering
- Forgetting that `volatile` does not provide atomicity

## Exercises
See `exercises/README.md`.

## Quiz

1. Which state is a thread in when it calls `Thread.sleep(1000)`?
   a) WAITING   b) TIMED_WAITING   c) BLOCKED   d) RUNNABLE

2. What does `synchronized` guarantee?
   a) Atomicity only   b) Visibility only   c) Both atomicity and visibility   d) Ordering

3. Which method must be called inside a `synchronized` block?
   a) `sleep()`   b) `yield()`   c) `wait()`   d) `interrupt()`

4. What is the primary cause of deadlock?
   a) Too many threads   b) Inconsistent lock ordering   c) Slow I/O   d) CPU starvation

5. What does `volatile` guarantee?
   a) Atomicity of compound operations   b) Visibility across threads
   c) Mutual exclusion   d) Reordering prevention only

---
Answers: 1-b, 2-c, 3-c, 4-b, 5-b

## Key Takeaways
- Use `synchronized` for mutual exclusion and visibility
- Always call `wait()`/`notify()` within `synchronized` blocks
- Acquire locks in a consistent order to avoid deadlock
- Use `volatile` for simple flags, not for compound operations

## Next Module
Module 66: Executors and Thread Pools
