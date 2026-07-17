# Module 45: Collections Framework Overview

## Overview
The Java Collections Framework (JCF) provides a unified architecture for storing and manipulating groups of objects. It includes interfaces, implementations, and algorithms that handle common data structures like lists, sets, queues, and maps.

## Learning Objectives
- Understand the Collections Framework hierarchy
- Identify core interfaces: Collection, List, Set, Queue, Map
- Explain how Iterable enables for-each loops
- Compare collections to arrays
- Contrast JCF with Python and C++ STL equivalents

## Prerequisites
- Basic Java syntax (classes, methods, generics)
- Arrays and loops

## Theory

### The Hierarchy
```
Iterable
  └── Collection
         ├── List
         ├── Set
         └── Queue
              Map (separate, not a Collection)
```

- **Iterable** — enables for-each loops
- **Collection** — root interface with `add`, `remove`, `size`, `isEmpty`, `contains`
- **List** — ordered, allows duplicates, positional access
- **Set** — no duplicates, no guaranteed order (depends on impl)
- **Queue** — holds elements for processing, typically FIFO
- **Map** — key-value pairs, not a subclass of Collection

### Why Collections Over Arrays
| Feature | Array | Collection |
|---------|-------|------------|
| Dynamic size | Fixed | Grows/shrinks |
| Type safety | Built-in | Generics |
| Utility methods | None | sort, search, shuffle |
| Interoperability | Low | High (fits into framework) |

### Cross-Language Comparison
| Java | Python | C++ STL |
|------|--------|---------|
| ArrayList | list | std::vector |
| HashSet | set | std::unordered_set |
| TreeSet | — | std::set |
| HashMap | dict | std::unordered_map |
| TreeMap | — | std::map |
| PriorityQueue | heapq | std::priority_queue |
| ArrayDeque | collections.deque | std::deque |

## Code Examples
See `examples/` directory:
- `CollectionDemo.java` — overview of basic collection usage
- `IterableExample.java` — Iterable and for-each mechanics
- `WhyCollections.java` — comparing arrays vs collections

## Common Pitfalls
- Treating Map as a subclass of Collection (it is not)
- Using raw types instead of generics (e.g., `List` vs `List<String>`)
- Forgetting that arrays have fixed size and cannot be resized
- Assuming all collections are thread-safe (most are not)

## Exercises
See `exercises/README.md`

## Quiz

**Q1:** Which interface is the root of the collections hierarchy?
**Q2:** True or False: Map extends Collection.
**Q3:** Which Java class corresponds to Python's `list`?
**Q4:** What method must a class implement to be used in a for-each loop?
**Q5:** Name one advantage of collections over arrays.

---
**A1:** Iterable (or Collection is the root of the Collections Framework proper). **A2:** False. **A3:** ArrayList. **A4:** Iterable (or the class must implement Iterable). **A5:** Dynamic sizing, utility methods, or interoperability.

## Key Takeaways
- JCF is organized around core interfaces: List, Set, Queue, Map
- Collections are more flexible than arrays
- Use generics for type safety
- Map is separate from the Collection hierarchy

## Next Module
Module 46: The List Interface — ArrayList vs LinkedList, common operations, and iteration strategies.
