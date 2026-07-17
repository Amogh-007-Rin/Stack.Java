# Module 50: Iterator, Comparable, and Comparator

## Overview
This module covers three critical interfaces: `Iterator` for safe traversal, `Comparable` for natural ordering, and `Comparator` for custom ordering logic.

## Learning Objectives
- Use Iterator to traverse and remove from collections
- Implement Iterable for custom collections
- Implement Comparable for natural ordering
- Create Comparators for flexible sorting
- Compare to Python's `__lt__` and `sorted(key=...)`

## Prerequisites
- Module 46: The List Interface
- Module 47: The Set Interface

## Theory

### Iterator
```java
Iterator<E> it = collection.iterator();
while (it.hasNext()) {
    E element = it.next();
    // safe removal:
    it.remove();
}
```
- `hasNext()` — returns true if more elements exist
- `next()` — returns next element, throws NoSuchElementException if none
- `remove()` — removes last element returned by next()

### Iterable (for-each)
Any class implementing `Iterable<T>` can be used in for-each:
```java
for (T item : myIterable) { ... }
```

### Comparable (natural ordering)
```java
public class Book implements Comparable<Book> {
    @Override
    public int compareTo(Book other) {
        return this.title.compareTo(other.title);
    }
}
```
Returns negative (this < other), zero (equal), positive (this > other).

### Comparator (custom ordering)
```java
Comparator<Book> byPageCount = (b1, b2) ->
    Integer.compare(b1.getPages(), b2.getPages());
```

### Cross-Language Comparison
| Java | Python |
|------|--------|
| `Comparable.compareTo()` | `__lt__`, `__gt__`, etc. |
| `Comparator` | `sorted(key=..., reverse=...)` |
| `Collections.sort(list, cmp)` | `sorted(list, key=fn)` |

## Code Examples
See `examples/`:
- `IteratorDemo.java` — safe traversal and removal
- `ComparableDemo.java` — natural ordering of books
- `ComparatorDemo.java` — multiple comparators for different sort orders

## Common Pitfalls
- Calling remove() on Iterator without calling next() first
- Forgetting generics in Iterator declaration
- Implementing compareTo inconsistently with equals
- Mutating elements during iteration

## Exercises
See `exercises/README.md`

## Quiz

**Q1:** Which Iterator method returns the next element?
**Q2:** What happens if next() is called on an exhausted Iterator?
**Q3:** How many methods must be implemented for Comparable?
**Q4:** Can Comparator be implemented as a lambda?
**Q5:** What interface must a class implement to support for-each loops?

---
**A1:** next(). **A2:** NoSuchElementException. **A3:** One (compareTo). **A4:** Yes. **A5:** Iterable.

## Key Takeaways
- Iterator allows safe element removal during traversal
- Comparable defines natural ordering inside the class
- Comparator defines external ordering logic
- Both Comparable and Comparator work well with lambdas

## Next Module
Module 51: The Collections Utility Class — static methods for sorting, searching, and more.
