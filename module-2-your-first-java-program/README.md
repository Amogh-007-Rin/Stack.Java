# Module 2: Your First Java Program

## Overview

In this module you will write, compile, and run your first Java program. We will dissect every part of a Java class: the `class` declaration, the `main` method signature, and `System.out.println`. By the end, you will understand the structure of a basic Java application and be able to write simple output programs.

## Learning Objectives

By the end of this module, you will be able to:
- Write a complete Java class with a `main` method
- Explain the purpose of `public`, `static`, `void`, and `String[] args`
- Use `System.out.println()` and `System.out.print()` to produce text output
- Compile and run a Java program from the terminal
- Add and use a local variable of type `String`

## Prerequisites

- Completion of [Module 0: Introduction to Java](../module-0-introduction-to-java/README.md)
- Completion of [Module 1: Setting Up Your Environment](../module-1-setting-up-your-environment/README.md)
- A working JDK installation verified with `javac -version`

## Theory

#### Anatomy of a Java Class

Every Java program lives inside a **class**. A class is a blueprint for objects (more on this in Module 21). For now, treat a class as the container for your code.

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

Let's break down each piece:

| Part | Meaning |
|------|---------|
| `public` | Access modifier — this class is accessible from anywhere |
| `class` | Keyword that declares a class |
| `HelloWorld` | The class name — **must match the filename** (`HelloWorld.java`) |
| `{ ... }` | The class body — everything inside belongs to this class |

#### The main Method — Entry Point

Every Java application starts execution at the `main` method. The signature is always:

```java
public static void main(String[] args)
```

| Keyword | Purpose |
|---------|---------|
| `public` | The JVM needs to call this method from outside the class |
| `static` | Allows the JVM to call `main` without creating an object of the class |
| `void` | The method does not return any value |
| `main` | The name the JVM looks for as the entry point |

The parameter `String[] args` is an array of command-line arguments. If you run `java HelloWorld Alice Bob`, then `args[0]` is `"Alice"` and `args[1]` is `"Bob"`.

#### System.out.println

`System.out` is a `PrintStream` object that represents the standard output (your terminal). The method `println` prints a string followed by a newline. The equivalent `print` method prints without a trailing newline.

```java
System.out.println("Hello");  // prints "Hello" and moves to next line
System.out.print("Hello");    // prints "Hello" but stays on the same line
```

#### String Literals

Text enclosed in double quotes — `"this is a string"` — is a **string literal**. In Java, strings are objects of the `String` class, but you do not need `new` to create them. String literals are covered in depth in Module 8.

#### Variables

A variable is a named storage location with a specific type. In Java, you must declare the type before using the variable:

```java
String greeting = "Good morning!";
System.out.println(greeting);
```

The type is on the left (`String`), the name is `greeting`, and the value is assigned with `=`.

#### Naming Convention

- **Classes:** PascalCase (`HelloWorld`, `MyFirstProgram`)
- **Methods and variables:** camelCase (`main`, `greeting`, `userName`)
- **Constants:** UPPER_SNAKE_CASE (`MAX_SIZE`)
- Source filenames must match the public class name exactly, including case.

## Code Examples

| File | Description |
|------|-------------|
| `HelloWorld.java` | Minimal program printing "Hello, World!" |
| `Greeting.java` | Prints a greeting stored in a `String` variable |

## Common Pitfalls

- **Filename mismatch:** If your class is `HelloWorld`, the file must be `HelloWorld.java` (case-sensitive on most systems).
- **Missing `main` method:** The JVM entry point is specifically `public static void main(String[] args)`. Variations like `public void main(...)` or `static void main(...)` will not work.
- **Forgetting `String[] args`:** The parameter `String[] args` (or `String... args`) is required. Some older tutorials omit it; this will cause a runtime error.
- **Omitting semicolons:** Each statement in Java must end with a semicolon (`;`). Forgetting one causes a compilation error.
- **Using `System.out.println` without `System`:** The full path `System.out.println` is required. `out.println()` alone will not compile.

## Exercises

1. **Personalized Hello.** Create a file called `PersonalGreeting.java` that declares a `String` variable named `name` with your name, then prints `"Hello, [name]!"` using that variable.

2. **Multi-line Banner.** Create a file called `Banner.java` that prints the following pattern using three separate `System.out.println` calls:

   ```
   ******************************
   *  Welcome to Stack.Java!    *
   ******************************
   ```

3. **Command-line Greeting.** Create a file called `CommandGreeting.java` that uses `args[0]` to greet a person whose name is passed as a command-line argument. If no argument is provided, print `"Hello, stranger!"`. (Hint: check `args.length` to see how many arguments were passed.)

## Quiz

1. What is the correct signature of the `main` method?
   a) `public void main(String[] args)`
   b) `public static void main(String[] args)`
   c) `static void main(String[] args)`
   d) `public static int main(String[] args)`

2. The Java source filename must match:
   a) The name of the first method
   b) The public class name
   c) The name of the `main` method
   d) Any name you choose

3. Which method prints text and moves to a new line?
   a) `System.out.print()`
   b) `System.out.println()`
   c) `System.out.write()`
   d) `System.out.printf()`

4. What does `void` mean in the `main` method declaration?
   a) The method takes no parameters
   b) The method is empty
   c) The method returns no value
   d) The method cannot be overridden

5. What is stored in `args` when running `java HelloWorld` with no additional arguments?
   a) `null`
   b) An empty array of length 0
   c) An array with one element `""`
   d) A compilation error

---

**Quiz Answers:** 1-b, 2-b, 3-b, 4-c, 5-b

## Key Takeaways

- Every Java application needs a class with a `public static void main(String[] args)` method.
- The filename must match the public class name exactly (case-sensitive).
- `System.out.println()` prints a line of text to the terminal.
- Variables must be declared with a type before use.
- Command-line arguments are accessible via the `args` parameter.

## Next Module

Proceed to [Module 3: Java Syntax Basics — Comments and Program Structure](../module-3-java-syntax-basics-comments-and-program-structure/README.md).

### Previous Module

Return to [Module 1: Setting Up Your Environment](../module-1-setting-up-your-environment/README.md).
