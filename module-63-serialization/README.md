# Module 63: Serialization

## Overview
Serialization converts Java objects into a byte stream for persistence or network transmission. Deserialization reconstructs objects from the byte stream. This module covers the `Serializable` interface, `ObjectOutputStream`/`ObjectInputStream`, and related concepts.

## Learning Objectives
- Understand the `Serializable` marker interface
- Serialize and deserialize objects with `ObjectOutputStream`/`ObjectInputStream`
- Use `serialVersionUID` for version control
- Exclude fields with the `transient` keyword
- Be aware of security considerations

## Prerequisites
- Module 61 (File I/O Basics)
- Module 62 (Java NIO Basics) useful but not required

## Theory
Serialization in Java uses reflection to write object graphs. Only objects whose classes implement `Serializable` (a marker interface with no methods) can be serialized.

### Key Components

| Class/Feature | Purpose |
|---------------|---------|
| `java.io.Serializable` | Marker interface enabling serialization |
| `java.io.ObjectOutputStream` | Writes objects to an `OutputStream` |
| `java.io.ObjectInputStream` | Reads objects from an `InputStream` |
| `serialVersionUID` | Version identifier for serialized classes |
| `transient` | Marks fields to skip during serialization |
| `Externalizable` | Advanced interface for custom serialization (mention only) |

### serialVersionUID
Every serializable class should declare:
```java
private static final long serialVersionUID = 1L;
```
If not declared, the JVM computes one at runtime. Different JVM implementations may produce different values, causing `InvalidClassException` during deserialization.

### transient
Fields marked `transient` are not serialized. On deserialization, they revert to their default values (null for objects, 0 for primitives, false for booleans).

## Code Examples
See `examples/`:
- `Person.java` – Serializable class with serialVersionUID and transient
- `SerializeDemo.java` – Writing objects to a file
- `DeserializeDemo.java` – Reading objects from a file

## Common Pitfalls
- Missing `serialVersionUID` leading to `InvalidClassException`
- Serializing non-serializable fields (triggers `NotSerializableException`)
- Deserializing untrusted data (security risk)
- Assuming `transient` fields are preserved
- Serializing inner classes (they capture enclosing `this`)
- Static fields are not serialized (they belong to the class, not the instance)

## Exercises
See `exercises/README.md`.

## Quiz

1. What is `Serializable`?
   a) An abstract class   b) A marker interface   c) An annotation   d) A record

2. What exception indicates a class lacks `serialVersionUID`?
   a) `IOException`   b) `ClassNotFoundException`
   c) `InvalidClassException`   d) `NotSerializableException`

3. What value does a `transient String` field have after deserialization?
   a) Empty string ""   b) The original value   c) null   d) Throws exception

4. Which streams are used for serialization?
   a) `FileReader`/`FileWriter`   b) `ObjectOutputStream`/`ObjectInputStream`
   c) `DataOutputStream`/`DataInputStream`   d) `BufferedStream` pair

5. What is the primary security concern with deserialization?
   a) Slow performance   b) File size limits   c) Arbitrary code execution   d) Data loss

---
Answers: 1-b, 2-c, 3-c, 4-b, 5-c

## Key Takeaways
- Implement `Serializable` and declare `serialVersionUID`
- Use `transient` for sensitive or derived fields
- Never deserialize untrusted data
- `Externalizable` gives full control over serialization (advanced)

## Next Module
Module 64: Multithreading Basics
