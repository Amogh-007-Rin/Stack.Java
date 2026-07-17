# Module 1: Setting Up Your Environment

## Overview

Before writing and running Java programs, you need a working Java Development Kit (JDK) on your machine. This module guides you through verifying an existing installation or obtaining the JDK, setting environment variables, and compiling/running your first program from the command line.

## Learning Objectives

By the end of this module, you will be able to:
- Verify whether the JDK is already installed on your system
- Install the JDK (if needed) on Windows, macOS, or Linux
- Set the `JAVA_HOME` environment variable and update `PATH`
- Use `javac` to compile a `.java` file
- Use `java` to run a compiled `.class` file
- Choose and set up an IDE for Java development

## Prerequisites

- Completion of [Module 0: Introduction to Java](../module-0-introduction-to-java/README.md)
- Administrative/sudo access on your machine (for installation)
- A terminal or command prompt

## Theory

#### What is the JDK?

The JDK (Java Development Kit) is a bundle that includes:
- The **Java compiler** (`javac`) — translates `.java` source files into `.class` bytecode files
- The **Java runtime** (`java`) — launches the JVM to execute bytecode
- The **archiver** (`jar`) — packages class files into Java archives
- The **debugger** (`jdb`) — for interactive debugging
- Core class libraries and documentation

#### Verifying an Existing Installation

Many operating systems come with a JRE pre-installed, but the JDK is usually not. Open a terminal and run:

```bash
java -version
```

If the JDK is installed, you will see output like:

```
openjdk version "21.0.2" 2024-01-16 LTS
OpenJDK Runtime Environment (build 21.0.2+13)
OpenJDK 64-Bit Server VM (build 21.0.2+13, mixed mode, sharing)
```

If you see `command not found` or an older version, you need to install the JDK.

#### Installing the JDK 21 LTS

**Option A: Eclipse Adoptium (recommended for all platforms)**
1. Visit https://adoptium.net
2. Download the latest JDK 21 LTS installer for your OS
3. Run the installer

**Option B: Package managers**
- **Ubuntu/Debian:** `sudo apt install openjdk-21-jdk`
- **macOS (Homebrew):** `brew install openjdk@21`
- **Windows:** Use the Adoptium installer or `winget install EclipseAdoptium.Temurin.21.JDK`

#### Setting JAVA_HOME and PATH

The `JAVA_HOME` environment variable should point to the JDK installation directory. Many tools (Maven, Gradle, Tomcat) rely on it.

- **Linux/macOS:** Add to `~/.bashrc`, `~/.zshrc`, or `~/.profile`:
  ```bash
  export JAVA_HOME=/usr/lib/jvm/java-21-openjdk-amd64
  export PATH=$JAVA_HOME/bin:$PATH
  ```
- **Windows (System Properties > Environment Variables):**
  ```
  Variable name: JAVA_HOME
  Variable value: C:\Program Files\Eclipse Adoptium\jdk-21.0.2.13-hotspot
  ```
  Then append `%JAVA_HOME%\bin` to the `PATH` variable.

#### Compiling and Running

The workflow is always:

```bash
javac MyFile.java    # Step 1: compile source to bytecode
java MyFile           # Step 2: run the bytecode (no .class extension)
```

#### IDE Options

While the command line is sufficient, an IDE improves productivity:

| IDE | Pros | Platform |
|-----|------|----------|
| **IntelliJ IDEA Community** | Smartest Java support, refactoring, free | All |
| **Eclipse** | Highly extensible, mature | All |
| **VS Code** with Java extensions | Lightweight, fast | All |
| **NetBeans** | Great for beginners, self-contained | All |

All of these are free. IntelliJ IDEA Community Edition is recommended for this course.

## Code Examples

See the following files in the `examples/` directory:

| File | Purpose |
|------|---------|
| `VersionCheck.java` | Prints the JVM version using `System.getProperty()` |
| `CompileTest.java` | A trivial program to verify compilation and execution work |

## Common Pitfalls

- **Installing only the JRE:** `java -version` works, but `javac` fails. Always install the full JDK.
- **Missing `JAVA_HOME`:** Tools like Maven will fail to find Java even if `java` works. Set `JAVA_HOME` properly.
- **Spaces in the JDK path:** On Windows, paths like `C:\Program Files\Java\...` may cause issues in some tools. Consider installing JDK to a path without spaces (e.g., `C:\Java\jdk-21`).
- **Forgetting to reload shell config:** After editing `~/.bashrc` / `~/.zshrc`, run `source ~/.bashrc` (or restart your terminal).
- **Running `java MyFile.class`:** The `java` command expects the class name, not the file name. Use `java MyFile`, not `java MyFile.class`.

## Exercises

1. **Verify your installation.** Run `java -version` and `javac -version` from your terminal. Write down the exact output. If either command fails, install the JDK using the instructions above.

2. **Compile and run CompileTest.** Navigate to `module-1-setting-up-your-environment/examples/`, compile `CompileTest.java` using `javac`, and run it with `java`. Take a screenshot of the terminal output (or copy the text into a file).

3. **Set JAVA_HOME.** Determine where your JDK is installed (`which javac` on Linux/macOS, `where javac` on Windows). Set `JAVA_HOME` to that directory and verify with `echo $JAVA_HOME` (Linux/macOS) or `echo %JAVA_HOME%` (Windows). Write a one-paragraph explanation of why `JAVA_HOME` matters for Java development.

## Quiz

1. Which command compiles a Java source file?
   a) `java`
   b) `javac`
   c) `jdb`
   d) `jar`

2. What does the `java` command expect as its argument?
   a) The `.java` file name
   b) The `.class` file name
   c) The fully-qualified class name
   d) The bytecode file with extension

3. The environment variable that points to the JDK installation directory is:
   a) `JAVA_PATH`
   b) `JAVA_HOME`
   c) `JDK_ROOT`
   d) `JAVAC_HOME`

4. Which of the following is NOT included in the JDK?
   a) `javac` compiler
   b) `java` runtime launcher
   c) Web browser
   d) `jar` archiver

5. What should you do after editing `~/.bashrc` to apply changes?
   a) Reboot the computer
   b) Run `source ~/.bashrc` (or restart terminal)
   c) Run `eval ~/.bashrc`
   d) Restart the shell process manually

---

**Quiz Answers:** 1-b, 2-c, 3-b, 4-c, 5-b

## Key Takeaways

- The JDK includes `javac` (compiler) and `java` (runtime launcher).
- Always set `JAVA_HOME` to the JDK root and add `$JAVA_HOME/bin` to `PATH`.
- The compilation lifecycle is: `javac` produces `.class` bytecode; `java` executes it.
- Choose an IDE (IntelliJ IDEA recommended) for an easier development experience.

## Next Module

Proceed to [Module 2: Your First Java Program](../module-2-your-first-java-program/README.md) to write your first real Java program.

### Previous Module

Return to [Module 0: Introduction to Java](../module-0-introduction-to-java/README.md).
