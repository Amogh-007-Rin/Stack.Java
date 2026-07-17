# Module 47: The Set Interface

## Overview
`Set` models the mathematical set — a collection with no duplicate elements. Java provides three main implementations: `HashSet`, `LinkedHashSet`, and `TreeSet`, each with different ordering and performance guarantees.

## Learning Objectives
- Understand HashSet, LinkedHashSet, and TreeSet
- Implement equals() and hashCode() correctly
- Choose the right Set implementation
- Recognize when a Set is preferable to a List

## Prerequisites
- Module 46: The List Interface
- equals() and hashCode() basics

## Theory

### HashSet
- Backed by a hash table (HashMap)
- No guaranteed order
- O(1) add, remove, contains
- Requires proper hashCode() implementation

### LinkedHashSet
- HashSet + linked list preserving insertion order
- Slightly slower than HashSet
- Order = insertion order (not sorted)

### TreeSet
- Backed by a Red-Black tree
- Elements sorted (natural order or Comparator)
- O(log n) operations
- Elements must implement Comparable or provide Comparator

### equals/hashCode Contract
```java
public class Book {
    private String isbn;
    private String title;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }
}
```

### When to Use Each
| Use Case | Implementation |
|----------|---------------|
| Fast lookup, no ordering | HashSet |
| Maintain insertion order | LinkedHashSet |
| Sorted elements | TreeSet |

## Code Examples
See `examples/`:
- `SetDemo.java` — HashSet, LinkedHashSet, TreeSet comparison
- `CustomObjectSetDemo.java` — equals/hashCode with custom Book class

## Common Pitfalls
- Forgetting to override hashCode when overriding equals
- Mutable objects in HashSet (hashCode changes after insertion)
- Assuming HashSet preserves order
- Using TreeSet with objects that don't implement Comparable

## Exercises
See `exercises/README.md`

## Quiz

**Q1:** Which Set maintains insertion order?
**Q2:** What must be overridden for custom objects in a HashSet?
**Q3:** Which Set is backed by a Red-Black tree?
**Q4:** What is the time complexity of contains() in a HashSet?
**Q5:** True or False: A TreeSet can be used without Comparable if a Comparator is provided.

---
**A1:** LinkedHashSet. **A2:** Both equals() and hashCode(). **A3:** TreeSet. **A4:** O(1) average. **A5:** True.

## Key Takeaways
- HashSet for speed, LinkedHashSet for insertion order, TreeSet for sorting
- Always override equals AND hashCode together
- Don't mutate objects while they are in a Set
- TreeSet requires Comparable or Comparator

## Next Module
Module 48: The Map Interface — key-value storage with HashMap, LinkedHashMap, and TreeMap.
