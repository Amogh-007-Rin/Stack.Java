# Module 51: The Collections Utility Class

## Overview
`java.util.Collections` provides static utility methods that operate on or return collections. Think of it as a toolbox of algorithms for the Collections Framework.

## Learning Objectives
- Sort, reverse, and shuffle lists
- Perform binary search on sorted lists
- Find max and min elements
- Create unmodifiable and synchronized views
- Understand when each utility method is appropriate

## Prerequisites
- Module 50: Iterator, Comparable, and Comparator
- Familiarity with List, Set, Map

## Theory

### Sorting and Ordering
```java
Collections.sort(list);                    // natural order
Collections.sort(list, comparator);        // custom order
Collections.reverse(list);                 // reverse current order
Collections.shuffle(list);                 // randomize
```

### Searching
```java
int index = Collections.binarySearch(list, key);
// requires sorted list, returns index or -(insertionPoint) - 1
```

### Extremes
```java
T max = Collections.max(collection);
T min = Collections.min(collection, comparator);  // with custom order
```

### Unmodifiable Views (Read-Only)
```java
List<String> readOnly = Collections.unmodifiableList(list);
Set<String> readOnlySet = Collections.unmodifiableSet(set);
Map<String, Integer> readOnlyMap = Collections.unmodifiableMap(map);
// Any mutation attempt throws UnsupportedOperationException
```

### Synchronized Views (Thread-Safe)
```java
List<String> syncList = Collections.synchronizedList(new ArrayList<>());
// Must still synchronize on the list during iteration:
synchronized (syncList) {
    for (String s : syncList) { ... }
}
```

### Other Utilities
```java
Collections.frequency(coll, obj);          // count occurrences
Collections.disjoint(coll1, coll2);        // no common elements?
Collections.fill(list, obj);               // replace all elements
Collections.copy(dest, src);               // copy list
Collections.replaceAll(list, old, new);    // replace values
```

## Code Examples
See `examples/`:
- `CollectionsSortDemo.java` — sort, reverse, shuffle, binarySearch
- `CollectionsUtilityDemo.java` — max, min, frequency, unmodifiable, synchronized

## Common Pitfalls
- Calling binarySearch on an unsorted list (results undefined)
- Thinking unmodifiableList makes elements immutable (it does not)
- Forgetting manual synchronization during iteration of synchronized wrappers
- Modifying a collection while holding an unmodifiable reference to the original

## Exercises
See `exercises/README.md`

## Quiz

**Q1:** What does Collections.binarySearch return if the key is not found?
**Q2:** What exception is thrown when modifying an unmodifiable view?
**Q3:** Which method randomly reorders a list?
**Q4:** True or False: Collections.unmodifiableList makes the elements immutable.
**Q5:** What must you do when iterating a synchronized list?

---
**A1:** -(insertionPoint) - 1 (a negative value). **A2:** UnsupportedOperationException. **A3:** shuffle(). **A4:** False — only the structure is protected. **A5:** Synchronize on the list during iteration.

## Key Takeaways
- Collections class provides reusable algorithms
- binarySearch requires a sorted list
- Unmodifiable views protect structure, not elements
- Synchronized wrappers need manual synchronization during iteration

## Next Module
Module 52: Autoboxing, Unboxing, and Wrapper Classes — bridging primitives and objects.
