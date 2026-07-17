# Module 3: Exercises

## Instructions

Complete the following exercises to practice comments, identifiers, and syntax rules in Java.

## Exercises

### Exercise 1: Commented HelloWorld (Easy)

Take the `HelloWorld.java` program from Module 2 and add at least one of each comment type:
- A Javadoc comment on the class
- A multi-line comment inside `main` explaining the program
- A single-line comment on the `System.out.println` line

Save the file as `HelloWorldCommented.java`.

---

### Exercise 2: Fix Invalid Identifiers (Medium)

The following program has invalid identifiers that prevent compilation. Fix all identifier errors while keeping the same logic. Save the corrected file as `ValidIdentifiers.java`.

```java
public class 1stProgram {
    public static void main(String[] args) {
        int 2ndValue = 10;
        int my-value = 20;
        int class = 30;
        System.out.println(2ndValue + my-value + class);
    }
}
```

**Hint:** Identifiers cannot start with a digit, cannot contain hyphens, and cannot be reserved keywords.

---

### Exercise 3: Find and Fix Syntax Errors (Hard)

The following program has **three** deliberate errors. Find and fix all of them, then save the corrected file as `FixedSyntax.java`.

```java
public class SyntaxErrors {
    public static void main(String[] args) {
        /* This is a comment /* with nesting */ 
        System.out.println("Hello")
        System.out.println("World");
    }

```

**Hint:** Look for mismatched braces, missing semicolons, and invalid comment syntax.
