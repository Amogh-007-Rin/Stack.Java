# Module 64: Multithreading Basics

## Overview
Multithreading allows concurrent execution of code within a single process. This module covers creating and managing threads in Java using the `Thread` class and `Runnable` interface.

## Learning Objectives
- Create threads by extending `Thread` and implementing `Runnable`
- Start threads with `start()` (not `run()`)
- Name threads and use `Thread.sleep()`
- Understand daemon vs user threads
- Compare with threading in Python and C

## Prerequisites
- Basic Java classes and inheritance
- Understanding of concurrent vs sequential execution

## Theory
Java provides two ways to define a thread's task:
1. **Extend `Thread`** — override `run()`
2. **Implement `Runnable`** — implement `run()`, pass to `Thread` constructor

### Starting Threads
Always call `start()`, not `run()` directly. `start()` creates a new OS thread and calls `run()` on it. Calling `run()` directly executes in the current thread.

### Thread Lifecycle Basics
- **New**: Created but not started
- **Runnable**: After `start()`, ready to run
- **Terminated**: After `run()` completes

### Daemon Threads
Daemon threads run in the background and do not prevent JVM exit. User threads keep the JVM alive. Set with `thread.setDaemon(true)` before `start()`.

### Comparison

| Feature | Java | Python | C (pthreads) |
|---------|------|--------|--------------|
| Create | `Thread` / `Runnable` | `threading.Thread` | `pthread_create` |
| Start | `start()` | `start()` | `pthread_create` |
| Sleep | `Thread.sleep(ms)` | `time.sleep(s)` | `sleep(s)` |
| Daemon | `setDaemon(true)` | `daemon=True` | Detached state |

## Code Examples
See `examples/`:
- `ThreadDemo.java` – Extending `Thread`
- `RunnableDemo.java` – Implementing `Runnable`
- `ThreadSleep.java` – Sleep and naming
- `DaemonDemo.java` – Daemon vs user threads

## Common Pitfalls
- Calling `run()` instead of `start()` (no new thread)
- Starting a thread twice (throws `IllegalThreadStateException`)
- Assuming thread execution order is deterministic
- Creating too many threads (resource exhaustion)
- Overlooking thread safety (leads to race conditions)

## Exercises
See `exercises/README.md`.

## Quiz

1. Which method must be called to start a new thread?
   a) `run()`   b) `start()`   c) `execute()`   d) `begin()`

2. What happens if you call `run()` directly on a `Thread` object?
   a) Starts a new thread   b) Runs in the current thread
   c) Throws an exception   d) Does nothing

3. Which statement about daemon threads is true?
   a) They run at higher priority   b) JVM exits when only daemon threads remain
   c) They cannot be created by the user   d) They never terminate

4. What does `Thread.sleep(1000)` do?
   a) Stops the thread permanently   b) Pauses the thread for 1 second
   c) Sleeps for 1 millisecond   d) Yields the CPU to other threads

5. How many ways can you define a thread's task in Java?
   a) 1   b) 2   c) 3   d) 4

---
Answers: 1-b, 2-b, 3-b, 4-b, 5-b

## Key Takeaways
- Use `Runnable` over extending `Thread` for better design
- Always call `start()` to begin a new thread
- Daemon threads do not keep the JVM alive
- `Thread.sleep()` throws `InterruptedException`

## Next Module
Module 65: Thread Lifecycle and Synchronization
