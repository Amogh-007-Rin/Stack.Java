# Module 49: Queue and Deque

## Overview
`Queue` represents a collection for holding elements prior to processing, typically FIFO. `Deque` (double-ended queue) supports insertion and removal at both ends and can be used as a stack (LIFO).

## Learning Objectives
- Use Queue operations: offer, poll, peek, remove, element
- Use Deque operations: addFirst, addLast, removeFirst, removeLast
- Differentiate PriorityQueue from standard queues
- Use ArrayDeque as a fast stack
- Understand FIFO vs LIFO patterns

## Prerequisites
- Module 46: The List Interface
- Basic understanding of ordering

## Theory

### Queue (FIFO)
```
                 ┌──────────┐
  offer(e) ───>  │  Queue   │ ───> poll() / remove()
                 │  [1,2,3] │
                 └──────────┘
                     ↑
                   peek() / element()
```

| Operation | Throws Exception | Returns Special Value |
|-----------|-----------------|----------------------|
| Insert    | add(e)          | offer(e)             |
| Remove    | remove()        | poll()               |
| Examine   | element()       | peek()               |

### Deque (Double-Ended Queue)
- `addFirst(e)` / `removeFirst()` / `getFirst()`
- `addLast(e)` / `removeLast()` / `getLast()`
- Can be used as stack: `push()` = `addFirst()`, `pop()` = `removeFirst()`

### PriorityQueue
- Elements ordered by priority (natural order or Comparator)
- NOT FIFO — the head is the *smallest* element
- O(log n) insertion/removal

### ArrayDeque
- Resizable array implementation of Deque
- Faster than LinkedList for queue/stack operations
- Preferred over Stack class (which is legacy)

### FIFO vs LIFO
| Pattern | Data Structure | Methods |
|---------|---------------|---------|
| FIFO (Queue) | Queue / ArrayDeque | offer / poll |
| LIFO (Stack) | ArrayDeque / Stack | push / pop |

## Code Examples
See `examples/`:
- `QueueDemo.java` — FIFO queue with library print jobs
- `DequeDemo.java` — ArrayDeque as queue and stack
- `PriorityQueueDemo.java` — priority queue for book queue

## Common Pitfalls
- Calling add() instead of offer() on a bounded queue
- Expecting PriorityQueue to be FIFO
- Using legacy Stack class instead of ArrayDeque
- Forgetting poll() returns null on empty queue; remove() throws

## Exercises
See `exercises/README.md`

## Quiz

**Q1:** What does Queue.poll() return on an empty queue?
**Q2:** Which Deque method pushes an element onto the front?
**Q3:** Is PriorityQueue FIFO?
**Q4:** Which class is recommended over the legacy Stack class?
**Q5:** What is the time complexity of PriorityQueue.offer()?

---
**A1:** null. **A2:** addFirst() (or push()). **A3:** No — ordered by priority. **A4:** ArrayDeque. **A5:** O(log n).

## Key Takeaways
- Queue: FIFO, offer/poll/peek return null on empty
- Deque: operations at both ends; can replace Stack
- PriorityQueue: processes elements by priority
- ArrayDeque is the recommended general-purpose queue/stack

## Next Module
Module 50: Iterator, Comparable, and Comparator — traversal and sorting fundamentals.
