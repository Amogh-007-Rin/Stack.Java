# Module 0: Introduction to Java

## Overview

Welcome to Stack.Java! This module introduces Java as a programming language and platform. You will learn about Java's history, core design philosophy, and how the Java ecosystem — JVM, JRE, JDK — enables cross-platform development via bytecode and the "Write Once, Run Anywhere" principle.

## Learning Objectives

By the end of this module, you will be able to:
- Describe the history and creators of Java
- Distinguish between the JVM, JRE, and JDK
- Explain what bytecode is and how it enables portability
- Understand the WORA philosophy
- Identify common types of Java applications

## Prerequisites

- Basic familiarity with programming concepts (variables, functions, conditionals, loops) from another language
- A computer with an internet connection
- Willingness to install software in Module 1

## Theory

#### Brief History of Java

Java was created by **James Gosling** at Sun Microsystems in the mid-1990s. Originally called "Oak," it was designed for interactive television but pivoted to internet programming. The first public release was Java 1.0 in 1996.

Key milestones:
- **1996** – Java 1.0 released
- **2006** – Java open-sourced under the GNU General Public License
- **2010** – Oracle Corporation acquires Sun Microsystems
- **2017** – Shift to a 6-month release cadence starting with Java 9
- **2021** – Java 17 (long-term support release)
- **2023** – Java 21 (latest LTS release)

Today Java is one of the most widely used programming languages in the world, powering everything from Android apps to large-scale enterprise systems.

#### Java's Design Philosophy

Java was designed with five core principles:

1. **Simple, object-oriented, and familiar** — The syntax intentionally resembles C and C++, making it accessible to developers from those backgrounds.
2. **Robust and secure** — Strong memory management, no explicit pointers, and built-in security features like the SecurityManager.
3. **Architecture-neutral and portable** — Java programs do not depend on the underlying hardware or operating system.
4. **High performance** — While initially interpreted, modern JVMs use just-in-time (JIT) compilation for near-native speeds.
5. **Interpreted, threaded, and dynamic** — Bytecode interpretation, built-in multithreading support, and dynamic class loading.

#### JVM, JRE, and JDK

These three acronyms form the backbone of the Java platform:

| Component | Full Name | What It Does |
|-----------|-----------|--------------|
| **JVM** | Java Virtual Machine | Executes Java bytecode at runtime; handles memory, garbage collection, and security |
| **JRE** | Java Runtime Environment | JVM + core class libraries (`java.lang`, `java.util`, etc.) — everything needed to *run* Java programs |
| **JDK** | Java Development Kit | JRE + development tools (`javac`, `jdb`, `jar`, etc.) — everything needed to *write and compile* Java programs |

The JDK is a superset of the JRE, which is in turn a superset of the JVM.

```
┌─────────────────────────────┐
│           JDK               │
│  ┌───────────────────────┐  │
│  │         JRE           │  │
│  │  ┌─────────────────┐  │  │
│  │  │       JVM       │  │  │
│  │  └─────────────────┘  │  │
│  │  + Core Libraries     │  │
│  └───────────────────────┘  │
│  + javac, jdb, jar, etc.    │
└─────────────────────────────┘
```

#### Bytecode and WORA

When you write Java source code (`.java` files), you compile it into **bytecode** (`.class` files) using the `javac` compiler. Bytecode is platform-independent — it does not care whether your OS is Windows, macOS, or Linux. The JVM reads this bytecode and translates it into native machine code for the specific platform at runtime.

```
Source Code (.java)  ──javac──▶  Bytecode (.class)  ──JVM──▶  Native Code
```

This is the **Write Once, Run Anywhere** (WORA) philosophy. A `.class` file compiled on Windows can run unchanged on a Linux server or a macOS desktop, as long as a compatible JVM is installed.

#### Types of Java Applications

- **Desktop applications** — GUI apps built with Swing or JavaFX
- **Web applications** — Servlets, Spring Boot, Jakarta EE
- **Mobile applications** — Android (uses Java and Kotlin, both JVM-based)
- **Enterprise applications** — Large-scale distributed systems
- **Embedded/IoT** — Smart cards, Raspberry Pi, sensors

## Code Examples

> **Note:** The example below is a preview. We will dissect every line in Module 2. For now, just observe the structure.

See `examples/HelloWorld.java` for a minimal Java program.

## Common Pitfalls

- **Confusing JDK and JRE:** Always install the JDK (not just the JRE) if you intend to *compile* code. The JRE only runs pre-compiled programs.
- **Thinking Java is obsolete:** Java remains a top-3 language in the TIOBE index, powering most Fortune 500 backends, Android development, and cloud-native applications.
- **Ignoring the JVM ecosystem:** Languages like Kotlin, Scala, Groovy, and Clojure all run on the JVM — learning Java opens the door to the entire JVM ecosystem.

## Exercises

1. **Fix the HelloWorld program.** Below is a Java program with errors. Identify and fix them, then run the corrected version.

   ```java
   public class HelloWorld {
       public static void main(String[] args) {
           System.out.println("Hello, World!)
       }
   }
   ```

2. **Add a second print statement.** Modify `HelloWorld.java` to print two separate lines: `"Hello, World!"` followed by `"Welcome to Java!"`.

3. **Personal greeting.** Create a new file called `MyInfo.java` that prints three lines: your name, your city, and your favorite programming language before Java. Example output:

   ```
   Name: Alice
   City: New York
   Previous language: Python
   ```

## Quiz

1. What does JVM stand for?
   a) Java Visual Machine
   b) Java Virtual Machine
   c) Java Version Model
   d) Java Variable Module

2. Which component includes everything needed to *compile* Java programs?
   a) JVM
   b) JRE
   c) JDK
   d) Bytecode

3. What is the intermediate representation of Java source code after compilation?
   a) Assembly
   b) Source code
   c) Bytecode
   d) Machine code

4. The WORA principle is made possible primarily by:
   a) The Java compiler
   b) The Java Virtual Machine
   c) The operating system
   d) The debugger

5. Who led the creation of Java at Sun Microsystems?
   a) Bjarne Stroustrup
   b) Dennis Ritchie
   c) James Gosling
   d) Guido van Rossum

---

**Quiz Answers:** 1-b, 2-c, 3-c, 4-b, 5-c

## Key Takeaways

- Java is a statically-typed, object-oriented language designed for portability and security.
- Source code (`.java`) is compiled to bytecode (`.class`), which runs on the JVM.
- JDK ⊃ JRE ⊃ JVM. Install the JDK to develop; only the JRE is needed to run.
- WORA means "compile once, run anywhere" — bytecode is platform-independent.

## Next Module

Proceed to [Module 1: Setting Up Your Environment](../module-1-setting-up-your-environment/README.md) to install Java on your machine.
