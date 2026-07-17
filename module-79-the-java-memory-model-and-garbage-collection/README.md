# Module 79: The Java Memory Model and Garbage Collection

## Overview
This module explores how the JVM manages memory — the heap, stack, and method area — and how garbage collection reclaims unused objects. Understanding memory management is critical for writing performant Java applications and diagnosing memory issues.

## Learning Objectives
- Describe the JVM memory model: heap (young/old generations), stack, metaspace
- Explain how GC algorithms work (mark-sweep, mark-compact, generational)
- Understand G1 GC (default since Java 9)
- Recognize how memory leaks can still occur in Java
- Explain why `System.gc()` is just a hint and `finalize()` is deprecated

## Prerequisites
- Basic Java syntax
- Understanding of object references
- Threading basics (stack per thread)

## Theory

### JVM Memory Areas
- **Heap**: Shared by all threads. Stores all object instances. Divided into:
  - **Young Generation** (Eden + Survivor spaces) — new objects
  - **Old Generation** (Tenured) — long-lived objects
- **Stack**: One per thread. Stores local variables, method calls, references to heap objects.
- **Metaspace** (Java 8+): Replaces PermGen. Stores class metadata. Native memory (not heap).

### Garbage Collection Algorithms
- **Mark-Sweep**: Mark reachable objects, sweep (delete) unmarked ones. Can cause fragmentation.
- **Mark-Compact**: Mark, then compact (defragment) by sliding live objects together.
- **Generational Collection**: Based on the weak generational hypothesis (most objects die young). Young GC (Minor GC) is frequent and fast. Old GC (Major GC) is less frequent but more expensive.

### G1 GC (Garbage First)
Default since Java 9. Divides heap into regions. Prioritizes collecting regions with the most garbage first. Pauses are predictable and configurable (`-XX:MaxGCPauseMillis`).

### System.gc()
Just a *hint* to the JVM. The JVM may ignore it. In production, avoid calling it — it triggers a full GC which causes long pause times.

### finalize() (Deprecated since Java 18)
`finalize()` was called by the GC before reclaiming an object. It was unpredictable, could cause resurrection, and degraded GC performance. Deprecated in Java 9, removed in Java 18. Use `Cleaner` or `try-with-resources` instead.

### Memory Leaks in Java
Despite GC, memory leaks happen because objects can be unintentionally held (strongly referenced). Common causes:
- Static collections that grow indefinitely
- Unclosed resources (streams, connections)
- Cached objects without eviction
- Inner classes holding implicit references to outer classes
- ThreadLocal variables not removed
- Listener/Callback registration without unregistration

## Code Examples

### MemoryLayoutDemo.java
Visualizes stack and heap with a simple recursive method (causes StackOverflowError).

### GcDemo.java
Demonstrates objects being garbage collected and suggests using `-XX:+PrintGCDetails`.

### MemoryLeakDemo.java
Demonstrates a memory leak via a static collection.

## Common Pitfalls
- Believing `System.gc()` guarantees garbage collection
- Using `finalize()` for resource cleanup (deprecated and unreliable)
- Ignoring memory leaks because "Java has GC"
- Not tuning GC settings for specific application needs
- Confusing stack and heap memory

## Exercises

See [exercises/README.md](exercises/README.md).

## Quiz

**Q1:** What are the three main areas of the JVM memory?
**Q2:** What is the default GC in Java 9+?
**Q3:** Why is `finalize()` deprecated?
**Q4:** Can Java applications have memory leaks? How?
**Q5:** What happens when you call `System.gc()`?

---

<details>
<summary>Answers</summary>

**A1:** Heap, Stack, Metaspace
**A2:** G1 GC (Garbage First)
**A3:** It is unpredictable, can resurrect objects, and degrades GC performance. Replaced by `Cleaner` and try-with-resources
**A4:** Yes — via unintended strong references (static collections, unclosed resources, listeners not unregistered)
**A5:** It's just a hint to the JVM. The JVM may ignore it entirely
</details>

## Key Takeaways
- JVM memory is divided into heap (young/old), stack (per thread), and metaspace
- Generational collection exploits that most objects die young
- G1 GC is the default since Java 9, designed for predictable pause times
- Java can still leak memory — GC only reclaims unreachable objects
- `finalize()` is deprecated; use `Cleaner` or try-with-resources
- Tune GC with JVM flags based on application characteristics

## Next Module
[Module 80: JVM Internals - Class Loading and Bytecode](../module-80-jvm-internals-class-loading-and-bytecode/README.md)
