# Module 46: The List Interface

## Overview
`List` is an ordered collection that allows duplicates and positional access. Java provides two primary implementations: `ArrayList` (resizable array) and `LinkedList` (doubly-linked list).

## Learning Objectives
- Use ArrayList and LinkedList effectively
- Master common List methods: add, get, set, remove, size, contains, indexOf
- Choose the right implementation for a given scenario
- Iterate over a List using for loop, for-each, and Iterator

## Prerequisites
- Module 45: Collections Framework Overview
- Basic generics

## Theory

### ArrayList
- Backed by a dynamic array
- Fast random access: O(1) get/set
- Slow insert/delete at middle: O(n)
- Best for: read-heavy, index-based access

### LinkedList
- Backed by doubly-linked nodes
- Fast insert/delete at ends: O(1)
- Slow random access: O(n) traversal
- Best for: frequent insert/delete at beginning/end

### Common Methods
```java
list.add(e)          // append
list.add(i, e)       // insert at index
list.get(i)          // element at index
list.set(i, e)       // replace at index
list.remove(i)       // remove by index
list.size()          // element count
list.contains(e)     // check existence
list.indexOf(e)      // first index or -1
```

### Iteration Styles
```java
// for loop with index (List only)
for (int i = 0; i < list.size(); i++) { ... }

// for-each (works with any Iterable)
for (String s : list) { ... }

// Iterator (safe removal)
Iterator<String> it = list.iterator();
while (it.hasNext()) { String s = it.next(); ... }
```

## Code Examples
See `examples/`:
- `ArrayListDemo.java` — ArrayList operations
- `LinkedListDemo.java` — LinkedList as queue/deque
- `ListIterationDemo.java` — three iteration strategies

## Common Pitfalls
- Calling `list.remove(i)` vs `list.remove(Object)` when i is an int
- ConcurrentModificationException when modifying in for-each
- Using ArrayList when frequent head insertions are needed
- Assuming indexOf returns 0-based index (it does, but -1 means missing)

## Exercises
See `exercises/README.md`

## Quiz

**Q1:** Which List implementation offers O(1) get by index?
**Q2:** What exception occurs when modifying a list during for-each iteration?
**Q3:** LinkedList implements which two interfaces besides List?
**Q4:** What does `indexOf` return if the element is not found?
**Q5:** Which method safely removes an element during Iterator traversal?

---
**A1:** ArrayList. **A2:** ConcurrentModificationException. **A3:** Queue and Deque. **A4:** -1. **A5:** Iterator.remove().

## Key Takeaways
- ArrayList: fast random access, slow middle modifications
- LinkedList: fast end modifications, slow random access
- Use Iterator for safe removal during traversal
- Beware of autoboxing when calling remove with an int

## Next Module
Module 47: The Set Interface — HashSet, LinkedHashSet, TreeSet, and the equals/hashCode contract.
