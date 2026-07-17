# Module 3: Java Syntax Basics — Comments and Program Structure

## Overview

Every language has rules about how code is written and organized. In this module you will learn about Java's **comments** (three types), **identifiers** (naming rules), **reserved keywords**, **statement terminators** (the semicolon), and **blocks** (curly braces). These building blocks form the foundation of every Java source file.

## Learning Objectives

By the end of this module, you will be able to:
- Write single-line, multi-line, and Javadoc comments
- Create valid Java identifiers following language rules and conventions
- Identify Java reserved keywords
- Understand that every statement ends with a semicolon
- Group statements into blocks using curly braces

## Prerequisites

- Completion of [Module 02: Your First Java Program](../module-02-your-first-java-program/README.md)
- Familiarity with the `main` method and `System.out.println`

## Theory

#### Comments

Comments are ignored by the compiler. They exist solely for human readers. Java has three comment types:

| Type | Syntax | Usage |
|------|--------|-------|
| Single-line | `// text` | Brief notes inline |
| Multi-line | `/* text */` | Longer explanations (cannot be nested) |
| Javadoc | `/** text */` | API documentation, processed by `javadoc` tool |

```java
// This is a single-line comment.

/*
   This is a multi-line comment.
   It spans several lines.
*/

/**
 * This is a Javadoc comment.
 * It describes what the class or method does.
 * @param name the person's name
 * @return a greeting string
 */
```

**Important:** Multi-line comments (`/* ... */`) cannot be nested inside each other. The first `*/` ends the comment.

#### Identifiers

An **identifier** is a name given to a class, method, variable, or other element. Rules:

1. Must begin with a letter (`a-z`, `A-Z`), underscore (`_`), or dollar sign (`$`)
2. Subsequent characters can include digits (`0-9`) as well
3. **Cannot** be a reserved keyword
4. **Case-sensitive** — `myVar` and `myvar` are different
5. No spaces allowed

Valid examples: `count`, `_temp`, `$value`, `firstName`, `MAX_SIZE`

Invalid examples: `2fast` (starts with digit), `my-var` (hyphen), `class` (keyword), `my var` (space)

#### Keywords

Keywords are reserved words with special meaning in Java. You cannot use them as identifiers. Here are the most common ones for now:

```
abstract    assert      boolean     break       byte
case        catch       char        class       const*
continue    default     do          double      else
enum        extends     final       finally     float
for         goto*       if          implements  import
instanceof  int         interface   long        native
new         package     private     protected   public
return      short       static      strictfp    super
switch      synchronized this       throw       throws
transient   try         void        volatile    while
```

(`const` and `goto` are reserved but not used.)

The keyword `true`, `false`, and `null` are literals, not keywords per se, but they also cannot be used as identifiers.

#### Statement Terminators

In Java, every **statement** ends with a semicolon (`;`). A statement is a complete unit of execution:

```java
int x = 5;           // declaration statement
System.out.println(x);  // method call statement
x = x + 1;           // assignment statement
```

Missing a semicolon causes a compilation error:

```java
int x = 5          // ERROR: missing semicolon
System.out.println(x);
```

#### Blocks

A **block** is a group of zero or more statements enclosed in curly braces `{ }`. Blocks define the scope of variables and the body of classes, methods, and control structures.

```java
public class Example {          // class block start
    public static void main(String[] args) {  // method block start
        int x = 10;
        if (x > 5) {            // if block start
            System.out.println("x is greater than 5");
        }                       // if block end
    }                           // method block end
}                               // class block end
```

Blocks can be nested. Variables declared inside a block are only visible within that block (this is called **scope**).

## Code Examples

| File | Description |
|------|-------------|
| `CommentsDemo.java` | Demonstrates all three comment types in a working program |
| `IdentifiersDemo.java` | Shows valid and invalid identifiers (commented out), plus keyword usage |

## Common Pitfalls

- **Nesting `/* */` comments:** `/* outer /* inner */ more */` fails because the first `*/` closes the outer comment, leaving `more */` as code.
- **Using keywords as identifiers:** `int class = 5;` will not compile. Always check the keyword list.
- **Starting an identifier with a digit:** `int 1stPlace = 1;` is invalid. Prefix with a letter: `int firstPlace = 1;`.
- **Forgetting the semicolon:** Especially on the statement just before a closing brace. The compiler error message usually points to the line *after* the missing semicolon, which can be confusing.
- **Mismatched braces:** Every opening `{` must have a closing `}`. Most IDEs highlight matching braces, but if you're using a plain editor, keep careful track.

## Exercises

1. **Add comments.** Take the `HelloWorld.java` from Module 2 and add at least one comment of each type (single-line, multi-line, Javadoc) explaining what each part of the program does. Save as `HelloWorldCommented.java`.

2. **Fix the identifiers.** The following code has invalid identifiers. Fix them so it compiles:

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

3. **Find the syntax errors.** The following code has three deliberate errors (missing semicolons, mismatched braces, invalid comment). Find and fix all of them:

   ```java
   public class SyntaxErrors {
       public static void main(String[] args) {
           /* This is a comment /* with nesting */ 
           System.out.println("Hello")
           System.out.println("World");
       }
   }
   ```

## Quiz

1. Which of the following is a valid Java identifier?
   a) `2fast`
   b) `my-var`
   c) `_count`
   d) `class`

2. What happens if you nest `/* */` comments?
   a) It works fine
   b) The compiler treats the inner `*/` as the end of the outer comment, causing an error
   c) The entire file becomes a comment
   d) Java ignores the nesting characters

3. Which of the following is NOT a Java keyword?
   a) `if`
   b) `then`
   c) `while`
   d) `return`

4. How does Java terminate statements?
   a) With a period (`.`)
   b) With a semicolon (`;`)
   c) With a newline
   d) With a colon (`:`)

5. A block of code is defined by:
   a) Parentheses `( )`
   b) Square brackets `[ ]`
   c) Curly braces `{ }`
   d) Angle brackets `< >`

---

**Quiz Answers:** 1-c, 2-b, 3-b, 4-b, 5-c

## Key Takeaways

- Java has three comment types: `//`, `/* */`, and `/** */`.
- Identifiers start with a letter, `_`, or `$`, followed by letters, digits, `_`, or `$`. They cannot be keywords.
- Every statement ends with a semicolon (`;`).
- Curly braces `{ }` define blocks, and variables declared inside a block are scoped to that block.

## Next Module

Proceed to [Module 04: Variables and Primitive Data Types](../module-04-variables-and-primitive-data-types/README.md).

### Previous Module

Return to [Module 02: Your First Java Program](../module-02-your-first-java-program/README.md).
