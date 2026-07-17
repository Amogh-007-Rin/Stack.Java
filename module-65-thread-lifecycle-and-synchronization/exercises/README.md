# Module 65 Exercises

## Exercise 1: Safe Counter
Fix the race condition from Module 64's CounterRace using the `synchronized` keyword. Ensure the counter reaches exactly 2000.

## Exercise 2: Producer-Consumer with wait/notify
Implement a bounded buffer (size 3) where one thread produces numbers 1-20 and another consumes them. Use `wait()` and `notifyAll()`.

## Exercise 3: Deadlock Detection and Fix
Given the deadlock example from the lesson, fix it by acquiring locks in a consistent global order.

## Exercise 4: Volatile Flag
Write a program where one thread runs a loop until a `volatile boolean` flag is set by the main thread. Demonstrate that without `volatile`, the loop may never terminate.
