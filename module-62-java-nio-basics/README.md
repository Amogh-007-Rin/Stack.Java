# Module 62: Java NIO Basics

## Overview
This module covers NIO.2 (New I/O 2), introduced in Java 7 as a modern replacement for `java.io.File`. The `java.nio.file` package provides the `Path`, `Paths`, and `Files` classes for efficient file operations.

## Learning Objectives
- Use `Path` and `Paths` to represent file paths
- Perform file read/write with `Files.readAllLines` and `Files.write`
- Copy, move, delete files with `Files` utility methods
- Traverse directories with `Files.walk` and `Files.find`
- Compare NIO.2 with the traditional `java.io` approach

## Prerequisites
- Module 61 (File I/O Basics)
- Familiarity with Java streams and lambda expressions

## Theory
NIO.2 provides a richer, more expressive API than `java.io.File`. The `Path` interface replaces `File`, and `Files` is a utility class with static methods.

### Key Components

| Class/Interface | Purpose |
|----------------|---------|
| `java.nio.file.Path` | Immutable path representation |
| `java.nio.file.Paths` | Factory for creating `Path` instances |
| `java.nio.file.Files` | Static utility methods for file operations |
| `java.nio.file.FileSystem` | Underlying file system |

### Common `Files` Methods
- `Files.readAllLines(path)` — reads all lines into a `List<String>`
- `Files.write(path, lines)` — writes lines to a file
- `Files.copy(source, target)` — copies a file or directory
- `Files.move(source, target)` — moves or renames
- `Files.delete(path)` — deletes a file or empty directory
- `Files.createDirectories(path)` — creates directories (like `mkdir -p`)
- `Files.walk(path)` — recursive stream of entries
- `Files.find(path, depth, matcher)` — filtered recursive walk

## Code Examples
See `examples/`:
- `PathDemo.java` – Path creation and manipulation
- `FileReadWrite.java` – Reading and writing with Files
- `FileCopyMove.java` – Copy, move, delete operations
- `DirectoryWalk.java` – Walking and finding files

## Common Pitfalls
- Forgetting that `Path` is immutable (methods return new instances)
- Using `Files.delete` on non-empty directories (use `Files.walk` + delete)
- Not catching `IOException` (NIO methods throw checked exceptions)
- Mixing `java.io.File` and `java.nio.file.Path` unnecessarily
- Assuming `readAllLines` is suitable for very large files

## Exercises
See `exercises/README.md`.

## Quiz

1. Which method creates a `Path` from a string?
   a) `Path.get()`   b) `Paths.get()`   c) `File.toPath()`   d) Both b and c

2. What does `Files.readAllLines()` return?
   a) `String`   b) `Stream<String>`   c) `List<String>`   d) `String[]`

3. Which method recursively walks a directory tree?
   a) `Files.list()`   b) `Files.lines()`   c) `Files.walk()`   d) `Files.find()`

4. What happens if `Files.delete()` is called on a non-empty directory?
   a) Deletes all contents first   b) Throws `DirectoryNotEmptyException`
   c) Returns false   d) Deletes only the directory entries

5. How does `Files.createDirectories()` differ from `Files.createDirectory()`?
   a) They are identical   b) createDirectories creates parent dirs too
   c) createDirectory takes an extra param   d) createDirectories returns `Path`

---
Answers: 1-d, 2-c, 3-c, 4-b, 5-b

## Key Takeaways
- NIO.2 is the modern replacement for `java.io.File`
- `Files` static methods reduce boilerplate
- `Files.walk` and `Files.find` enable powerful directory traversal
- NIO.2 works naturally with Java 8 streams

## Next Module
Module 63: Serialization
