# Module 66 Exercises

## Exercise 1: Sum Calculator
Use a `Callable` to compute the sum of numbers from 1 to N in a thread pool. Return the result via `Future` and print it.

## Exercise 2: Task Collector
Submit 10 `Callable` tasks that return random integers. Collect all results from their `Future` objects and compute the average.

## Exercise 3: Periodic Scheduler
Schedule a task that prints "It's time!" every 3 seconds, starting after 1 second delay. Let it run for 10 seconds, then shut down.

## Exercise 4: Shutdown vs ShutdownNow
Submit many long-running tasks. Compare `shutdown()` (waits for completion) vs `shutdownNow()` (interrupts). Show the difference in behavior.
