# Module 34: Packages and Imports

## Overview

**Packages** are namespaces that organize Java classes and prevent naming conflicts. The `import` statement brings classes from other packages into scope. Java uses a **reverse domain name** convention for package naming (e.g., `com.example.myapp`). This module demonstrates multi-file, multi-package projects.

## Learning Objectives

- Create packages using the `package` declaration
- Use `import` statements to access classes from other packages
- Use fully qualified names to avoid ambiguity
- Follow Java package naming conventions (reverse domain)
- Compile and run code across packages

## Prerequisites

- Module 21: Classes and Objects
- Module 24: Access Modifiers

## Theory

### Package Declaration

The `package` statement must be the first line in a Java file (excluding comments). It declares which package the class belongs to.

```java
package com.stackjava.math;
```

### Import Statements

The `import` statement brings classes from other packages into scope so you can use simple names.

```java
import com.stackjava.math.Calculator;
import com.stackjava.math.AdvancedMath;
```

### Fully Qualified Names

You can also use fully qualified names without imports:

```java
com.stackjava.math.Calculator calc = new com.stackjava.math.Calculator();
```

### Package Naming Convention

Packages use reverse domain names to ensure uniqueness:

```
com.example.myapp
org.openjdk.demo
edu.university.department
```

### Directory Structure

Package names correspond to directory structure:
```
src/
  com/
    stackjava/
      math/
        Calculator.java
      app/
        Main.java
```

## Code Examples

- `com/stackjava/math/Calculator.java` — Simple calculator in the math package
- `com/stackjava/math/AdvancedMath.java` — Another class in the math package
- `com/stackjava/app/Main.java` — Main class in the app package using imports
- `PackageDemo.java` — No-package class using fully qualified names

## Common Pitfalls

- Forgetting the `package` declaration at the top of the file
- Mismatch between package declaration and directory structure
- Using `import` to import classes from the default package (not allowed)
- Importing a class that doesn't exist (compile error)
- Name collisions when importing two classes with the same name

## Exercises

See `exercises/README.md`.

## Quiz

1. What is the correct package naming convention?
   a) `com.example.myapp`  b) `com.example.myapp`  c) `com/example/myapp`  d) `com.example.myapp`

2. Which statement must appear first in a Java file (excluding comments)?
   a) `import`  b) `class`  c) `package`  d) `public`

3. Can you import a class from the default package?
   a) Yes  b) No  c) Only with wildcard  d) Only in Java 8+

4. What does `import java.util.*;` do?
   a) Imports all classes from java.util  b) Imports all classes from all subpackages  c) Imports java.util itself  d) Nothing

5. Fully qualified name means:
   a) Class name only  b) Package + class name  c) Class name + method  d) File path

---

Answers: 1-a, 2-b, 3-b, 4-a, 5-b

## Key Takeaways

- Packages organize classes into namespaces using reverse domain naming
- `import` brings classes into scope; fully qualified names avoid imports
- Directory structure must match package structure
- The default package has no name and cannot be imported from named packages

## Next Module

Module 35: The Final Keyword — constants, non-overridable methods, and non-extendable classes.
