# Module 67 Exercises

## Exercise 1: Word Counter
Use `ConcurrentHashMap` to count word frequencies across multiple threads. Each thread processes a portion of a shared list of words and updates the map concurrently.

## Exercise 2: BlockingQueue Producer-Consumer
Implement a producer-consumer pattern using `LinkedBlockingQueue`. Produce 20 integers, consume them, and print each consumed value.

## Exercise 3: Atomic Bank Account
Simulate a bank account where multiple threads deposit and withdraw money. Use `AtomicLong` for the balance and demonstrate thread safety without `synchronized`.

## Exercise 4: Snapshot Iterator
Use `CopyOnWriteArrayList` to store a list of sensor readings. One thread adds readings every 100ms; another thread iterates the list every 500ms without risk of `ConcurrentModificationException`.
