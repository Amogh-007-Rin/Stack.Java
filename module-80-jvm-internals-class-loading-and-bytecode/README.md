# Module 80: JVM Internals - Class Loading and Bytecode

## Overview
This module explores the inner workings of the JVM — how Java classes are loaded, linked, and initialized, and what bytecode looks like. Understanding these internals helps with debugging, performance tuning, and security analysis.

## Learning Objectives
- Describe the class loading lifecycle: loading, linking (verification, preparation, resolution), initialization
- Explain the classloader hierarchy: bootstrap, extension/platform, application
- Understand the parent-first delegation model
- Read basic bytecode using `javap`
- Recognize the structure of a `.class` file

## Prerequisites
- Java compilation and execution workflow
- Basic understanding of JVM memory
- Command-line familiarity

## Theory

### Class Loading Lifecycle
The JVM loads classes in three main phases:

1. **Loading**: Finding the binary representation (.class file) and creating a `Class` object.
2. **Linking**:
   - *Verification*: Ensures the bytecode is valid and safe (no illegal jumps, type violations).
   - *Preparation*: Allocates memory for static fields and sets default values.
   - *Resolution*: Resolves symbolic references to direct references (optional — can be deferred).
3. **Initialization**: Executes static initializers and static field assignments.

### Classloaders
- **Bootstrap Classloader**: Loads core Java classes (`java.lang.*`, `java.util.*`). Written in native code. No parent.
- **Extension/Platform Classloader**: Loads classes from the Java platform extensions (module path).
- **Application/System Classloader**: Loads classes from the application classpath.

### Delegation Model (Parent-First)
When a classloader is asked to load a class, it first delegates to its parent. Only if the parent cannot find the class does the child attempt to load it. This ensures core Java classes are always loaded by the bootstrap classloader, preventing replacement attacks.

### Bytecode Basics
A `.class` file contains:
- **Magic Number**: `0xCAFEBABE`
- **Version**: Minor and major version numbers
- **Constant Pool**: Symbolic references (class names, method names, field descriptors)
- **Access Flags**: `public`, `final`, `abstract`, etc.
- **This/Super Class**: References to the current class and superclass
- **Interfaces, Fields, Methods, Attributes**

### javap Tool
The `javap` disassembler displays the structure and bytecode of a class file.

```
javap -c ClassName    // Disassemble (show bytecode)
javap -verbose ClassName  // Show everything (constant pool, stack maps, etc.)
```

## Code Examples

### BytecodeDemo.java
A simple class with arithmetic and control flow, designed to be examined with `javap`.

### ClassLoadingDemo.java
Loads a class dynamically using `Class.forName()` and shows the classloader hierarchy.

### CustomClassLoaderDemo.java
A simple custom classloader that loads a class from a byte array.

## Common Pitfalls
- **ClassNotFoundException**: The class cannot be found by any classloader in the hierarchy.
- **NoClassDefFoundError**: The class was found at compile time but not at runtime.
- **LinkageError**: Version incompatibility or duplicated class definitions.
- **Assuming class loading is instantaneous**: Loading a large number of classes impacts startup time.
- **Custom classloaders**: Must follow the delegation model or risk ClassCastExceptions.

## Exercises

See [exercises/README.md](exercises/README.md).

## Quiz

**Q1:** What are the three phases of class loading?
**Q2:** What is the parent-first delegation model?
**Q3:** What tool is used to disassemble a .class file?
**Q4:** What is the magic number of a Java .class file?
**Q5:** Which classloader loads `java.lang.String`?

---

<details>
<summary>Answers</summary>

**A1:** Loading, Linking (verification, preparation, resolution), Initialization
**A2:** A classloader first asks its parent to load a class before trying to load it itself
**A3:** `javap`
**A4:** `0xCAFEBABE`
**A5:** The Bootstrap Classloader
</details>

## Key Takeaways
- Class loading is a three-phase process: loading, linking, initialization
- The parent-first delegation model ensures core classes are always loaded by the bootstrap classloader
- `javap` is essential for understanding bytecode and debugging class file issues
- Custom classloaders enable dynamic code loading (plugins, hot deployment)
- Understanding bytecode helps with optimization, security analysis, and debugging

## Next Module
[Module 91: Mini Project - Building a Simple JavaFX Desktop App](../module-91-mini-project-building-a-simple-javafx-desktop-app/README.md)
