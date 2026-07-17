# Stack.Java — 0 to 100 Java Learning Sandbox

A linear, self-contained curriculum (101 modules, `module-0` through `module-100`) designed for developers
who already know at least one programming language and want to go from **zero Java knowledge to
intermediate/advanced Java**. No build tools, no site generators, no fluff — just plain Markdown lessons,
runnable code examples, practice exercises with solutions, and a quiz per module.

## Prerequisites

- **JDK 21 LTS** — several modules cover records, sealed classes, and pattern matching, which require
  modern Java. Download from [Adoptium](https://adoptium.net/) or your package manager.
- Check your version: `java -version` should show `21` or later.
- No IDE is required (any text editor + terminal works), though using IntelliJ IDEA Community Edition
  or VS Code with Java extensions is recommended for syntax highlighting and code navigation.

## How to Use This Repo

Modules must be completed **strictly in order** — each builds on the one before it.

For each module:

1. **Read** `README.md` — the lesson with theory, code walkthroughs, and a quiz.
2. **Run the examples** — navigate to `examples/`, compile and run each `.java` file.
3. **Do the exercises** — open `exercises/README.md` and attempt every problem.
4. **Check your work** — compare against the files in `solutions/`.
5. **Take the quiz** — at the bottom of each `README.md`, then check your answers.

### How to compile and run any example

```bash
cd module-X-topic-name/examples
javac ExampleName.java
java ExampleName
```

All examples and solutions are written with no `package` declarations (except the dedicated packages
module) so they compile with a single `javac` command and run with a single `java` command.

## Table of Contents

### Phase 1: Introduction & Setup (Modules 0–3)

- [Module 0: Introduction to Java — History, Philosophy, and Applications](module-0-introduction-to-java/)
- [Module 1: Setting Up Your Environment (JDK, JAVA_HOME, javac/java, IDE options)](module-1-setting-up-your-environment/)
- [Module 2: Your First Java Program (Hello World, anatomy of a class and main)](module-2-your-first-java-program/)
- [Module 3: Java Syntax Basics, Comments, and Program Structure](module-3-java-syntax-basics-comments-and-program-structure/)

### Phase 2: Core Language Fundamentals (Modules 4–19)

- [Module 4: Variables and Primitive Data Types](module-4-variables-and-primitive-data-types/)
- [Module 5: Type Casting and Conversion](module-5-type-casting-and-conversion/)
- [Module 6: Operators (Arithmetic, Relational, Logical, Bitwise, Assignment)](module-6-operators/)
- [Module 7: Reading Input from the Console (Scanner)](module-7-reading-input-from-the-console/)
- [Module 8: Strings and String Methods](module-8-strings-and-string-methods/)
- [Module 9: StringBuilder and StringBuffer](module-9-stringbuilder-and-stringbuffer/)
- [Module 10: Conditional Statements (if/else, switch)](module-10-conditional-statements/)
- [Module 11: Loops (for, while, do-while)](module-11-loops/)
- [Module 12: Enhanced for-loop, break, continue, and Labeled Loops](module-12-enhanced-for-loop-break-continue-and-labeled-loops/)
- [Module 13: Arrays (One-Dimensional)](module-13-arrays-one-dimensional/)
- [Module 14: Multidimensional Arrays](module-14-multidimensional-arrays/)
- [Module 15: The Arrays Utility Class](module-15-the-arrays-utility-class/)
- [Module 16: Methods — Declaration, Parameters, and Return Values](module-16-methods-declaration-parameters-and-return-values/)
- [Module 17: Method Overloading](module-17-method-overloading/)
- [Module 18: Variable Scope and an Intro to Stack vs Heap Memory](module-18-variable-scope-and-an-intro-to-stack-vs-heap-memory/)
- [Module 19: Recursion](module-19-recursion/)

### Phase 3: Object-Oriented Programming (Modules 20–38)

- [Module 20: Introduction to Object-Oriented Programming Concepts](module-20-introduction-to-object-oriented-programming-concepts/)
- [Module 21: Classes and Objects](module-21-classes-and-objects/)
- [Module 22: Constructors](module-22-constructors/)
- [Module 23: The `this` Keyword](module-23-the-this-keyword/)
- [Module 24: Access Modifiers (public, private, protected, default)](module-24-access-modifiers/)
- [Module 25: Encapsulation](module-25-encapsulation/)
- [Module 26: The `static` Keyword (fields, methods, blocks)](module-26-the-static-keyword/)
- [Module 27: Inheritance Basics](module-27-inheritance-basics/)
- [Module 28: The `super` Keyword and Method Overriding](module-28-the-super-keyword-and-method-overriding/)
- [Module 29: Polymorphism](module-29-polymorphism/)
- [Module 30: Abstract Classes](module-30-abstract-classes/)
- [Module 31: Interfaces](module-31-interfaces/)
- [Module 32: Interfaces vs Abstract Classes; Default and Static Interface Methods](module-32-interfaces-vs-abstract-classes-default-and-static-interface-methods/)
- [Module 33: Object Class Methods (equals, hashCode, toString)](module-33-object-class-methods/)
- [Module 34: Packages and Imports](module-34-packages-and-imports/)
- [Module 35: The `final` Keyword](module-35-the-final-keyword/)
- [Module 36: Enums](module-36-enums/)
- [Module 37: Nested and Inner Classes](module-37-nested-and-inner-classes/)
- [Module 38: Anonymous Classes](module-38-anonymous-classes/)

### Phase 4: Exception Handling & Generics (Modules 39–44)

- [Module 39: Exception Handling Basics (try/catch/finally)](module-39-exception-handling-basics/)
- [Module 40: Checked vs Unchecked Exceptions; throw and throws](module-40-checked-vs-unchecked-exceptions/)
- [Module 41: Custom Exceptions](module-41-custom-exceptions/)
- [Module 42: try-with-resources](module-42-try-with-resources/)
- [Module 43: Generics Basics](module-43-generics-basics/)
- [Module 44: Bounded Generics and Wildcards](module-44-bounded-generics-and-wildcards/)

### Phase 5: Collections Framework (Modules 45–53)

- [Module 45: Collections Framework Overview](module-45-collections-framework-overview/)
- [Module 46: The List Interface (ArrayList, LinkedList)](module-46-the-list-interface/)
- [Module 47: The Set Interface (HashSet, LinkedHashSet, TreeSet)](module-47-the-set-interface/)
- [Module 48: The Map Interface (HashMap, LinkedHashMap, TreeMap)](module-48-the-map-interface/)
- [Module 49: Queue and Deque](module-49-queue-and-deque/)
- [Module 50: Iterator, Comparable, and Comparator](module-50-iterator-comparable-and-comparator/)
- [Module 51: The Collections Utility Class](module-51-the-collections-utility-class/)
- [Module 52: Autoboxing, Unboxing, and Wrapper Classes](module-52-autoboxing-unboxing-and-wrapper-classes/)
- [Module 53: Immutability and the String Pool](module-53-immutability-and-the-string-pool/)

### Phase 6: Functional Java (Modules 54–60)

- [Module 54: Lambda Expressions](module-54-lambda-expressions/)
- [Module 55: Functional Interfaces](module-55-functional-interfaces/)
- [Module 56: Method References](module-56-method-references/)
- [Module 57: Streams API Basics](module-57-streams-api-basics/)
- [Module 58: Streams — Intermediate/Terminal Operations and Collectors](module-58-streams-intermediate-terminal-operations-and-collectors/)
- [Module 59: The Optional Class](module-59-the-optional-class/)
- [Module 60: The Date and Time API (java.time)](module-60-the-date-and-time-api/)

### Phase 7: I/O and Concurrency (Modules 61–68)

- [Module 61: File I/O Basics (File class, reading/writing files)](module-61-file-io-basics/)
- [Module 62: Java NIO Basics](module-62-java-nio-basics/)
- [Module 63: Serialization](module-63-serialization/)
- [Module 64: Multithreading Basics (Thread, Runnable)](module-64-multithreading-basics/)
- [Module 65: Thread Lifecycle and Synchronization](module-65-thread-lifecycle-and-synchronization/)
- [Module 66: Executors and Thread Pools](module-66-executors-and-thread-pools/)
- [Module 67: Concurrent Collections and Atomic Classes](module-67-concurrent-collections-and-atomic-classes/)
- [Module 68: CompletableFuture and Asynchronous Programming](module-68-completablefuture-and-asynchronous-programming/)

### Phase 8: Databases & Networking (Modules 69–72)

- [Module 69: JDBC Basics — Connecting to a Database](module-69-jdbc-basics-connecting-to-a-database/)
- [Module 70: JDBC CRUD Operations](module-70-jdbc-crud-operations/)
- [Module 71: Networking Basics (Sockets)](module-71-networking-basics/)
- [Module 72: The Java HTTP Client](module-72-the-java-http-client/)

### Phase 9: Tooling & Testing Concepts (Modules 73–74)

- [Module 73: Introduction to Build Tools (Maven and Gradle, Conceptual Overview)](module-73-introduction-to-build-tools/)
- [Module 74: Unit Testing Concepts with JUnit](module-74-unit-testing-concepts-with-junit/)

### Phase 10: Design & Architecture (Modules 75–80)

- [Module 75: Design Patterns I — Singleton and Factory](module-75-design-patterns-i-singleton-and-factory/)
- [Module 76: Design Patterns II — Builder and Observer](module-76-design-patterns-ii-builder-and-observer/)
- [Module 77: Design Patterns III — Strategy and Decorator](module-77-design-patterns-iii-strategy-and-decorator/)
- [Module 78: SOLID Principles](module-78-solid-principles/)
- [Module 79: The Java Memory Model and Garbage Collection](module-79-the-java-memory-model-and-garbage-collection/)
- [Module 80: JVM Internals — Class Loading and Bytecode](module-80-jvm-internals-class-loading-and-bytecode/)

### Phase 11: Modern Java Features (Modules 81–86)

- [Module 81: The Reflection API](module-81-the-reflection-api/)
- [Module 82: Annotations](module-82-annotations/)
- [Module 83: Records (Java 16+)](module-83-records/)
- [Module 84: Sealed Classes (Java 17+)](module-84-sealed-classes/)
- [Module 85: Pattern Matching (instanceof and switch expressions)](module-85-pattern-matching/)
- [Module 86: The Java Platform Module System (JPMS)](module-86-the-java-platform-module-system/)

### Phase 12: GUI Programming (Modules 87–91)

- [Module 87: Introduction to GUI Programming — Swing Basics](module-87-introduction-to-gui-programming-swing-basics/)
- [Module 88: Swing — Layouts and Event Handling](module-88-swing-layouts-and-event-handling/)
- [Module 89: JavaFX Basics](module-89-javafx-basics/)
- [Module 90: JavaFX — FXML and Styling](module-90-javafx-fxml-and-styling/)
- [Module 91: Mini Project: Building a Simple JavaFX Desktop App](module-91-mini-project-building-a-simple-javafx-desktop-app/)

### Phase 13: Introduction to Spring (Modules 92–95)

- [Module 92: Introduction to the Spring Framework and Dependency Injection](module-92-introduction-to-the-spring-framework-and-dependency-injection/)
- [Module 93: Spring Boot Basics — Setting Up a Project](module-93-spring-boot-basics-setting-up-a-project/)
- [Module 94: Spring Boot — Building REST APIs](module-94-spring-boot-building-rest-apis/)
- [Module 95: Spring Boot — Connecting to a Database with Spring Data JPA](module-95-spring-boot-connecting-to-a-database-with-spring-data-jpa/)

### Phase 14: Professional Practices & Capstone (Modules 96–100)

- [Module 96: Logging in Java (java.util.logging and the SLF4J Concept)](module-96-logging-in-java/)
- [Module 97: Best Practices and Clean Code in Java](module-97-best-practices-and-clean-code-in-java/)
- [Module 98: Debugging Techniques and Tools](module-98-debugging-techniques-and-tools/)
- [Module 99: Capstone Project Part 1 — Planning and Building a Console Application](module-99-capstone-part-1-planning-and-building-a-console-application/)
- [Module 100: Capstone Project Part 2 — Polishing the Capstone and Where to Go Next](module-100-capstone-part-2-final-project-and-next-steps/)

## Where to Go After Module 100

Congratulations on completing all 101 modules! Here are logical next steps:

- **Kotlin** — a modern JVM language that interoperates seamlessly with Java and is now the official
  language for Android development.
- **Android Development** — build mobile apps using Java or Kotlin with Android Studio.
- **Spring Ecosystem Deep Dive** — explore Spring Cloud, Spring Security, Spring Reactive (WebFlux),
  and Spring Batch.
- **Microservices** — learn about service discovery, API gateways, distributed tracing, and container
  orchestration with Docker and Kubernetes.
- **Open Source Java Projects** — contribute to projects like Spring Boot, Hibernate, Apache Kafka,
  Elasticsearch, or the OpenJDK itself.
- **JVM Languages** — explore Scala, Clojure, or Groovy to see different paradigms on the same runtime.
