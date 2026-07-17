# Module 98: Debugging Techniques and Tools

## Overview
Bugs are inevitable. The skill is not avoiding them entirely but systematically finding and fixing them. This module covers the spectrum from quick-and-dirty `println` debugging through IDE debuggers, command-line `jdb`, stack trace analysis, and JDK production diagnostics tools.

## Learning Objectives
- Use `System.out.println` for quick diagnosis
- Operate an IDE debugger (breakpoints, step over/into, watches)
- Debug with `jdb` from the command line
- Read and analyze a Java stack trace
- Use `jstack`, `jmap`, `jstat`, and `jconsole` for production diagnostics

## Prerequisites
- Module 39–41: Exceptions
- Module 64–66: Threading basics (helpful for jstack/jconsole)

## Theory

### println Debugging
Sometimes the fastest way is adding `System.out.println("DEBUG: x = " + x);`. It is universally available, requires no setup, and works everywhere. Remove or guard with a boolean flag before committing.

### IDE Debugger (IntelliJ / VS Code / Eclipse)
- **Breakpoints**: pause execution at a line
- **Step Over** (F8): execute current line and move to the next
- **Step Into** (F7): enter the method called on the current line
- **Step Out** (Shift+F8): return to the caller
- **Watch Expressions**: evaluate arbitrary expressions at a breakpoint
- **Conditional Breakpoints**: pause only when a condition is true

### jdb — Java Debugger
Command-line debugger shipped with the JDK. Attach to a running process or launch a class:
```bash
jdb -classpath . ClassName
```
Common commands: `stop at Class:line`, `print expr`, `locals`, `cont`, `step`, `list`.

### Stack Trace Reading
```
Exception in thread "main" java.lang.NullPointerException
    at com.example.Library.findBook(Library.java:25)  ← root cause
    at com.example.Main.main(Main.java:10)            ← call chain
```
- Read from top to bottom: the topmost frame is where the exception was thrown
- Look for your own code (not library frames) to find the source

### JDK Production Tools
| Tool | Purpose |
|------|---------|
| `jstack <pid>` | Print thread dump (deadlock detection) |
| `jmap -heap <pid>` | Print heap summary |
| `jstat -gc <pid>` | Garbage collection statistics |
| `jconsole` | GUI monitoring (heap, threads, CPU) |

## Code Examples
- `BuggyLoopDemo.java` — off-by-one error in an array loop
- `NullPointerBugDemo.java` — uninitialized reference
- `DivisionByZeroDemo.java` — integer division oversight

## Common Pitfalls
- Leaving `println` debugging in production code
- Not reading the full stack trace (the real cause is often 2-3 frames deeper)
- Using `jstack` on a process you don't own (permission denied)
- Debugging multi-threaded issues with a regular debugger (race conditions vanish under breakpoints)

## Exercises
See `exercises/README.md`.

## Quiz

1. Which `jdb` command continues execution until the next breakpoint?
   A) `step`  B) `cont`  C) `next`  D) `run`

2. Where should you look first in a stack trace to find the root cause?
   A) The bottom frame  B) The topmost frame from your code  C) The middle  D) The last library frame

3. Which JDK tool prints a thread dump for a running process?
   A) `jmap`  B) `jstat`  C) `jstack`  D) `javac`

4. What is the main risk of using `System.out.println` debugging?
   A) It is slow  B) It may remain in production code  C) It does not work with threads  D) It requires a special import

5. Which debugger action executes the current line and moves to the next line?
   A) Step Into  B) Step Out  C) Step Over  D) Resume

---
Answers: 1-B, 2-B, 3-C, 4-B, 5-C

## Key Takeaways
- Start with the cheapest tool (println), escalate to debugger, then to diagnostic tools
- Stack traces are your friend — read them carefully top-to-bottom
- Production tools (jstack, jmap, jstat) are invaluable for issues that only appear in deployment
- A debugger lets you inspect state; logging lets you track history

## Next Module
Module 99: Capstone Project Part 1 — Planning and Building a Console Application
