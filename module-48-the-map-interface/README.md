# Module 48: The Map Interface

## Overview
`Map` stores key-value pairs. Each key maps to exactly one value. Java provides `HashMap`, `LinkedHashMap`, and `TreeMap` as primary implementations.

## Learning Objectives
- Use HashMap, LinkedHashMap, and TreeMap effectively
- Master key Map methods: put, get, containsKey, keySet, values, entrySet
- Choose the right Map implementation
- Compare Java Maps to Python dicts

## Prerequisites
- Module 47: The Set Interface
- equals/hashCode contract

## Theory

### HashMap
- Unsorted, unordered
- O(1) put/get (average)
- Allows one null key, many null values
- Most common Map implementation

### LinkedHashMap
- HashMap + doubly-linked list
- Predictable iteration order (insertion or access order)
- Slightly more memory than HashMap

### TreeMap
- Sorted by keys (natural order or Comparator)
- O(log n) operations
- No null keys (NullPointerException)

### Key Methods
```java
map.put(key, value)           // insert or update
map.get(key)                  // retrieve or null
map.containsKey(key)          // existence check
map.keySet()                  // Set of keys
map.values()                  // Collection of values
map.entrySet()                // Set of Map.Entry pairs
```

### Iterating a Map
```java
for (Map.Entry<String, Integer> e : map.entrySet()) {
    String k = e.getKey();
    Integer v = e.getValue();
}
```

### Comparison to Python dict
| Feature | Java HashMap | Python dict |
|---------|-------------|-------------|
| Insertion order (3.7+) | No (LinkedHashMap) | Yes |
| Null keys | One allowed | Not allowed |
| Type safety | Generics | Dynamic |
| Literal syntax | No | `{k: v}` |

## Code Examples
See `examples/`:
- `MapDemo.java` — HashMap operations with library books
- `MapIterationDemo.java` — iterating keySet, values, entrySet

## Common Pitfalls
- Using get() and checking for null to test existence (use containsKey)
- Forgetting that Map.Entry is an interface, not a concrete class
- Modifying a map during iteration (use ConcurrentHashMap or copy)
- Using mutable objects as keys

## Exercises
See `exercises/README.md`

## Quiz

**Q1:** Which Map implementation maintains insertion order?
**Q2:** What does map.get(key) return if the key does not exist?
**Q3:** How do you iterate over both keys and values efficiently?
**Q4:** Can HashMap have null keys?
**Q5:** What is the time complexity of TreeMap.get()?

---
**A1:** LinkedHashMap. **A2:** null. **A3:** Using entrySet(). **A4:** Yes, one null key. **A5:** O(log n).

## Key Takeaways
- HashMap for general use, LinkedHashMap for ordered iteration, TreeMap for sorted keys
- Always use entrySet() for key+value iteration
- Map is NOT a Collection (different hierarchy)
- Java 9+ provides Map.of for small immutable maps

## Next Module
Module 49: Queue and Deque — FIFO, LIFO, PriorityQueue, and ArrayDeque.
