# Module 1: Exercises

## Instructions

Complete the following exercises to practice setting up your environment. Use the examples in `examples/` as reference.

## Exercises

### Exercise 1: System Information Printer (Easy)

Create a file called `VersionPrinter.java` that prints the following system details (use `System.getProperty(...)` with the property names shown):

```
Java Version: 21.0.2
Java Home: /usr/lib/jvm/java-21-openjdk-amd64
OS Name: Linux
```

Reference the `VersionCheck.java` example for how to use `System.getProperty()`.

---

### Exercise 2: Compilation Verification (Easy)

Create a file called `CompilerReady.java` that prints a confirmation message when compiled and run. The output should be three lines:

```
javac is ready!
java is ready!
Let's start coding!
```

This verifies that both the compiler and runtime work correctly on your machine.

---

### Exercise 3: JDK Path Message (Medium)

Create a file called `JdkPath.java` that prints your JDK installation path. Use a `String` variable to store the path and print it in a sentence. You will need to find your JDK path first (use `which javac` on Linux/macOS or `where javac` on Windows to discover it).

Expected output format:

```
My JDK is installed at: /usr/lib/jvm/java-21-openjdk-amd64
```
