# Module 61: File I/O Basics

## Overview
This module introduces traditional Java I/O using the `java.io` package. You will learn how to work with files and directories using the `File` class and read/write text files using character streams.

## Learning Objectives
- Use the `File` class to inspect and manipulate files and directories
- Read text files with `FileReader` and `BufferedReader`
- Write text files with `FileWriter`, `BufferedWriter`, and `PrintWriter`
- Manage resources safely with try-with-resources
- Compare Java's approach to Python `open()` and C `FILE*`

## Prerequisites
- Basic Java syntax and exception handling
- Understanding of absolute vs relative paths

## Theory
Java's `java.io` package provides classes for system input/output. The `File` class represents a file or directory path but does **not** read or write content. Character streams (`Reader`/`Writer` subclasses) handle text data.

### Key Classes

| Class | Purpose |
|-------|---------|
| `java.io.File` | File/directory path, metadata, and basic operations |
| `java.io.FileReader` | Read character files |
| `java.io.BufferedReader` | Buffered reading (readLine) |
| `java.io.FileWriter` | Write character files |
| `java.io.BufferedWriter` | Buffered writing (newLine) |
| `java.io.PrintWriter` | Formatted text writing (println, printf) |

### try-with-resources
Introduced in Java 7, automatically closes resources implementing `AutoCloseable`:

```java
try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
    String line;
    while ((line = br.readLine()) != null) { ... }
}
```

## Code Examples
See `examples/` for runnable programs:
- `FileInfoDemo.java` – File metadata and checks
- `DirectoryLister.java` – List and create directories
- `TextFileRead.java` – Reading text files
- `TextFileWrite.java` – Writing text files with try-with-resources

## Common Pitfalls
- Forgetting to close resources (use try-with-resources)
- Using `File` for content reading (it does not read content)
- Not checking `exists()` before operations
- Platform-dependent path separators (use `File.separator`)
- `delete()` on a non-empty directory fails silently

## Exercises
See `exercises/README.md` for problem statements. Solutions are in `solutions/`.

## Quiz

1. Which class is used to read a text file line by line?
   a) `FileReader`   b) `BufferedReader`   c) `File`   d) `PrintWriter`

2. What does `file.mkdirs()` do differently from `file.mkdir()`?
   a) Creates the file instead of directory   b) Creates intermediate directories
   c) Returns void   d) Throws an exception on failure

3. Which statement best describes try-with-resources?
   a) Replaces `try-catch-finally` for resource cleanup
   b) Only works with `File` objects
   c) Eliminates all checked exceptions
   d) Requires manual `close()` calls

4. What is the return type of `listFiles()` on a `File` representing a directory?
   a) `String[]`   b) `File[]`   c) `List<File>`   d) `Path[]`

5. Which method appends a newline and flushes in one call?
   a) `write()`   b) `append()`   c) `println()`   d) `newLine()`

---
Answers: 1-b, 2-b, 3-a, 4-b, 5-c

## Key Takeaways
- `File` handles paths and metadata; streams handle content
- Always use try-with-resources for auto-closing
- `BufferedReader.readLine()` is efficient for line-by-line reading
- `PrintWriter` offers convenient `println`/`printf` methods

## Next Module
Module 62: Java NIO Basics — the modern replacement for `java.io`
