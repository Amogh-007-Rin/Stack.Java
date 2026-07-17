# Project Spec: Stack.Java — 0 to 100 Java Learning Sandbox

## 1. Project Overview

**Repository name:** `Stack.Java`

**Purpose:** A linear, self-contained, beginner-friendly Java curriculum that takes a learner who already
knows at least one programming language (Python, JavaScript, C, etc.) from **zero Java knowledge to
intermediate/advanced Java** — covering core language fundamentals, OOP, collections, functional
programming, concurrency, I/O, JDBC, GUI programming (Swing/JavaFX), an introduction to Spring Boot,
JVM internals, modern Java features, and design patterns.

**Format:** Exactly **101 modules**, numbered `module-0` through `module-100`, to be completed strictly
in linear order. Each module is a self-contained folder with a lesson, runnable code examples, practice
exercises, full solutions, and a short quiz. No build tool (no Maven/Gradle) — everything compiles and
runs with plain `javac` / `java`. Content is plain Markdown only (no static site generator, no GitHub
Pages tooling) — just well-formatted `README.md` files.

**Target learner:** A developer who is new to Java but comfortable with programming concepts (variables,
functions, loops, basic data structures) in another language. Explanations should NOT re-teach "what is
a variable" from scratch, but SHOULD carefully explain everything that is Java-specific or unusual
compared to other mainstream languages (static typing, JVM, checked exceptions, the collections
framework, etc.).

**Agent instructions:** This spec should be treated as a single work order. Generate the ENTIRE
repository in this pass — all 101 module folders, each with full content (theory, examples, exercises,
solutions, and quiz) as specified in Section 5. Do not leave placeholder or "TODO" content in any module.
Every module must be complete and internally consistent with the modules before and after it (i.e. don't
use a language feature in module 12 that isn't introduced until module 40).

---

## 2. Repository Structure

```
Stack.Java/
├── README.md                     # Top-level landing page (see Section 6)
├── LICENSE                       # MIT License
├── module-0-introduction-to-java/
│   ├── README.md
│   ├── examples/
│   │   └── *.java
│   ├── exercises/
│   │   └── README.md             # exercise prompts (see Section 5.5)
│   └── solutions/
│       └── *.java
├── module-1-setting-up-your-environment/
│   ├── README.md
│   ├── examples/
│   ├── exercises/
│   └── solutions/
├── module-2-your-first-java-program/
│   └── ...
...
├── module-100-capstone-part-2-final-project-and-next-steps/
│   └── ...
```

### 2.1 Folder naming convention
`module-<number>-<kebab-case-title>`
Example: `module-27-inheritance-basics`

Numbers are NOT zero-padded (use `module-0`, `module-9`, `module-10`, `module-100` — not `module-00`).
This keeps names simple; sorting is handled by the top-level README's table of contents, not by relying
on filesystem ordering.

### 2.2 File naming inside each module
- `README.md` — the lesson itself.
- `examples/Example1.java`, `examples/Example2.java`, etc. — one public class per file, named
  descriptively (e.g. `examples/StringConcatenation.java`), each independently runnable via
  `javac ExampleX.java && java ExampleX`.
- `exercises/README.md` — numbered exercise prompts, no solution code, no answers.
- `solutions/Exercise1Solution.java`, `solutions/Exercise2Solution.java`, etc. — matching solutions,
  fully working and compilable standalone.

### 2.3 Package declarations
To keep things beginner-friendly with plain `javac`, **do not use `package` declarations** in any
example or solution file. All files should be runnable directly from within their own directory with
no classpath gymnastics (`javac Foo.java && java Foo`). If a module's topic requires demonstrating
packages (e.g. the dedicated "Packages and imports" module), that module is the one exception where a
small self-contained multi-folder example demonstrating package structure is acceptable — clearly
explained.

---

## 3. Per-Module Folder Contents (template every module must follow)

Every module folder contains exactly these four things:

1. **`README.md`** — the lesson (structure specified in Section 5)
2. **`examples/`** — 2 to 5 runnable `.java` files demonstrating the module's concepts, each preceded
   by inline comments explaining what's happening line-by-line where non-obvious
3. **`exercises/README.md`** — 3 to 5 practice exercises, ordered easy → hard
4. **`solutions/`** — one solution file per exercise, fully working

---

## 4. Top-Level README Requirements

The root `README.md` must include:

1. **Project title and one-paragraph pitch** — what Stack.Java is and who it's for.
2. **Prerequisites** — JDK version required (use JDK 21 LTS as the baseline, since several modules
   cover records, sealed classes, and pattern matching which need modern Java), how to check your
   installed version (`java -version`), and a note that no IDE is required (though one is recommended).
3. **How to use this repo** — explain the linear structure, that modules must be done in order, and the
   standard workflow per module: read `README.md` → run the examples → do the exercises → check your
   work against `solutions/` → take the quiz.
4. **How to compile and run any example** — a short universal snippet:
   ```
   cd module-X-topic-name/examples
   javac ExampleName.java
   java ExampleName
   ```
5. **Full table of contents** — a linear list of all 101 modules, each linking to its folder, grouped
   under the phase headers from Section 7 (Phase 1: Foundations, Phase 2: OOP, etc.) purely as visual
   section breaks in the table of contents — the modules themselves remain flat and linear (no folder
   nesting by phase).
6. **"Where to go after module 100"** — a short closing section pointing toward logical next steps
   (Kotlin, Android development, Spring ecosystem deep dive, microservices, contributing to open source
   Java projects).

Keep the top-level README lean per the user's preference — no CONTRIBUTING.md, no progress-tracker
file, no learning-schedule/pacing calendar. Just this README and the LICENSE.

---

## 5. Content Requirements for Each Module's `README.md`

Every single module (0 through 100, no exceptions) must follow this exact section structure:

```markdown
# Module <N>: <Title>

## Overview
2-4 sentences: what this module covers and why it matters / where it's used in real Java code.

## Learning Objectives
A bullet list of 3-6 concrete, checkable objectives ("You will be able to...").

## Prerequisites
One line: "This module builds on Module <N-1>: <title>" (and any other specific earlier modules whose
concepts are directly reused, if relevant).

## Theory
The main teaching content. Use clear prose, headed sub-sections, and inline short code snippets.
Since the audience already knows another language, explicitly call out comparisons where useful
(e.g. "Unlike Python, Java requires every variable to have a declared type" or "Java's `switch`
expression, added in Java 14, works like Kotlin's `when` or Rust's `match`"). Avoid over-explaining
universal programming concepts the learner already knows from other languages.

## Code Examples
Reference and briefly walk through each file in `examples/`, explaining what to notice in each one.
Instruct the reader to compile and run them locally.

## Common Pitfalls
A short bullet list of mistakes beginners typically make with this specific topic (e.g. confusing `==`
with `.equals()` for object comparison — introduced at the module where this first becomes relevant).

## Exercises
A short pointer to `exercises/README.md` and an instruction to attempt them before checking
`solutions/`.

## Quiz
5 short questions (mix of multiple-choice and short-answer) testing the module's learning objectives.
Provide an "Answers" section at the very bottom of the README, below a `---` separator, so learners can
self-check without accidentally seeing answers while reading.

## Key Takeaways
3-5 bullet points summarizing the module.

## Next Module
A link to the next module folder, e.g. "→ Continue to [Module <N+1>: <title>](../module-<N+1>-slug/)".
Module 0 additionally needs no "previous module" link; Module 100 has no "next module" link and instead
links back to the top-level README's "Where to go after module 100" section.
```

### 5.1 Tone and style
- Clear, encouraging, precise. No filler, no marketing language.
- Prefer showing a small code snippet over a long paragraph of prose wherever a concept is code-shaped.
- Use proper Markdown code fences with `java` syntax highlighting for every code block.
- Keep terminology consistent across modules (pick one term and stick with it — e.g. always say
  "method" not sometimes "function").

### 5.2 Code quality bar
- All code in `examples/` and `solutions/` must compile cleanly with `javac` on JDK 21 with no warnings
  (aside from unavoidable deprecation notices when a module is specifically teaching about a deprecated
  API for historical/context reasons).
- Code should follow standard Java naming conventions (PascalCase classes, camelCase methods/variables,
  UPPER_SNAKE_CASE constants) from the very first example, and Module 1/2 should explicitly teach these
  conventions.
- Every example file has a brief comment block at the top stating what it demonstrates.

### 5.3 Exercises (`exercises/README.md`)
- 3-5 problems per module, ordered by increasing difficulty.
- Each problem clearly states: the task, any starter expectations (e.g. class/method name to use so the
  solution is checkable), and expected sample output where relevant.
- Exercises must only require concepts taught in the current module or earlier — never a forward
  reference.

### 5.4 Solutions
- One fully working file per exercise, matching exercise numbering (`Exercise1Solution.java`, etc.)
- Include a short comment at the top of each solution explaining the approach, not just the code.

### 5.5 Quizzes
- 5 questions per module, placed inside the module's `README.md` as specified above.
- Mix format: 2-3 multiple choice, 1-2 short answer/predict-the-output, 1 "why" conceptual question.
- Answers included at the bottom of the same file, separated clearly so they don't spoil the quiz on
  first read.

---

## 6. Consistency & Continuity Rules

- **Strict linear dependency:** a concept may only be used in a module if it was taught in that module or
  an earlier one. The agent should build the full 101-module topic list first (Section 7), verify the
  ordering is dependency-safe, and only then generate content.
- **No forward references** in explanations either (e.g. don't say "we'll use streams for this later" in
  Module 10 if streams aren't taught until Module 57 — just avoid the mention entirely).
- **Running example threads are optional but encouraged**: where natural, reuse a small recurring theme
  (e.g. a simple `Library`, `BankAccount`, or `Inventory` domain model) across consecutive related
  modules (e.g. across the OOP phase, or across the JDBC phase) so learners see concepts build on a
  familiar example rather than a new throwaway domain every module.
- **JDK version:** target JDK 21 (LTS) throughout. Modules covering records, sealed classes, and pattern
  matching (Modules 83-85) should note the Java version each feature was introduced in, even though the
  whole repo targets 21.

---

## 7. Full Module List (0–100)

The agent must generate all 101 of these, in this exact order, using this exact numbering and these
titles (kebab-case them for folder names per Section 2.1). Phase headers below are for organizational
clarity only (used in the top-level README table of contents) — they do not create subfolders.

### Phase 1: Introduction & Setup (Modules 0-3)
0. Introduction to Java — History, Philosophy, and Applications
1. Setting Up Your Environment (JDK, JAVA_HOME, javac/java, IDE options)
2. Your First Java Program (Hello World, anatomy of a class and `main`)
3. Java Syntax Basics, Comments, and Program Structure

### Phase 2: Core Language Fundamentals (Modules 4-19)
4. Variables and Primitive Data Types
5. Type Casting and Conversion
6. Operators (Arithmetic, Relational, Logical, Bitwise, Assignment)
7. Reading Input from the Console (Scanner)
8. Strings and String Methods
9. StringBuilder and StringBuffer
10. Conditional Statements (if/else, switch)
11. Loops (for, while, do-while)
12. Enhanced for-loop, break, continue, and Labeled Loops
13. Arrays (One-Dimensional)
14. Multidimensional Arrays
15. The Arrays Utility Class
16. Methods — Declaration, Parameters, and Return Values
17. Method Overloading
18. Variable Scope and an Intro to Stack vs Heap Memory
19. Recursion

### Phase 3: Object-Oriented Programming (Modules 20-38)
20. Introduction to Object-Oriented Programming Concepts
21. Classes and Objects
22. Constructors
23. The `this` Keyword
24. Access Modifiers (public, private, protected, default)
25. Encapsulation
26. The `static` Keyword (fields, methods, blocks)
27. Inheritance Basics
28. The `super` Keyword and Method Overriding
29. Polymorphism
30. Abstract Classes
31. Interfaces
32. Interfaces vs Abstract Classes; Default and Static Interface Methods
33. Object Class Methods (`equals`, `hashCode`, `toString`)
34. Packages and Imports
35. The `final` Keyword
36. Enums
37. Nested and Inner Classes
38. Anonymous Classes

### Phase 4: Exception Handling & Generics (Modules 39-44)
39. Exception Handling Basics (try/catch/finally)
40. Checked vs Unchecked Exceptions; throw and throws
41. Custom Exceptions
42. try-with-resources
43. Generics Basics
44. Bounded Generics and Wildcards

### Phase 5: Collections Framework (Modules 45-53)
45. Collections Framework Overview
46. The List Interface (ArrayList, LinkedList)
47. The Set Interface (HashSet, LinkedHashSet, TreeSet)
48. The Map Interface (HashMap, LinkedHashMap, TreeMap)
49. Queue and Deque
50. Iterator, Comparable, and Comparator
51. The Collections Utility Class
52. Autoboxing, Unboxing, and Wrapper Classes
53. Immutability and the String Pool

### Phase 6: Functional Java (Modules 54-60)
54. Lambda Expressions
55. Functional Interfaces
56. Method References
57. Streams API Basics
58. Streams — Intermediate/Terminal Operations and Collectors
59. The Optional Class
60. The Date and Time API (java.time)

### Phase 7: I/O and Concurrency (Modules 61-68)
61. File I/O Basics (File class, reading/writing files)
62. Java NIO Basics
63. Serialization
64. Multithreading Basics (Thread, Runnable)
65. Thread Lifecycle and Synchronization
66. Executors and Thread Pools
67. Concurrent Collections and Atomic Classes
68. CompletableFuture and Asynchronous Programming

### Phase 8: Databases & Networking (Modules 69-72)
69. JDBC Basics — Connecting to a Database
70. JDBC CRUD Operations
71. Networking Basics (Sockets)
72. The Java HTTP Client

### Phase 9: Tooling & Testing Concepts (Modules 73-74)
73. Introduction to Build Tools (Maven and Gradle, Conceptual Overview)
74. Unit Testing Concepts with JUnit

### Phase 10: Design & Architecture (Modules 75-80)
75. Design Patterns I — Singleton and Factory
76. Design Patterns II — Builder and Observer
77. Design Patterns III — Strategy and Decorator
78. SOLID Principles
79. The Java Memory Model and Garbage Collection
80. JVM Internals — Class Loading and Bytecode

### Phase 11: Modern Java Features (Modules 81-86)
81. The Reflection API
82. Annotations
83. Records (Java 16+)
84. Sealed Classes (Java 17+)
85. Pattern Matching (instanceof and switch expressions)
86. The Java Platform Module System (JPMS)

### Phase 12: GUI Programming (Modules 87-91)
87. Introduction to GUI Programming — Swing Basics
88. Swing — Layouts and Event Handling
89. JavaFX Basics
90. JavaFX — FXML and Styling
91. Mini Project: Building a Simple JavaFX Desktop App

### Phase 13: Introduction to Spring (Modules 92-95)
92. Introduction to the Spring Framework and Dependency Injection
93. Spring Boot Basics — Setting Up a Project
94. Spring Boot — Building REST APIs
95. Spring Boot — Connecting to a Database with Spring Data JPA

### Phase 14: Professional Practices & Capstone (Modules 96-100)
96. Logging in Java (java.util.logging and the SLF4J Concept)
97. Best Practices and Clean Code in Java
98. Debugging Techniques and Tools
99. Capstone Project Part 1 — Planning and Building a Console Application
100. Capstone Project Part 2 — Polishing the Capstone and Where to Go Next

---

## 8. Special Notes on Specific Modules

- **Module 0** has no `examples/`/`exercises/`/`solutions/` code requirement in the traditional sense
  (it's conceptual: history, philosophy, "what can you build with Java," and Java's architecture —
  JVM/JRE/JDK, bytecode, "write once, run anywhere"). Still include a minimal `examples/` folder with
  one trivial `HelloWorld.java` to bridge into Module 2, and a short conceptual quiz.
- **Modules 92-95 (Spring)** are necessarily introductory only, given the no-build-tool constraint —
  clearly note in these modules' READMEs that Spring Boot in practice requires Maven or Gradle, and
  provide the minimal manual setup steps needed to follow along with plain `javac`/dependency jars
  where feasible, or clearly instruct the reader that for these 4 modules only, installing Maven (or
  using an IDE's built-in Spring Initializr support) is expected, since Spring Boot cannot reasonably be
  taught with raw `javac`. This is the one deliberate, clearly-flagged exception to the "no build tool"
  rule, scoped to exactly these 4 modules.
- **Modules 99-100 (Capstone)** should have the learner build one cohesive console-based application
  (e.g., a library management system, personal finance tracker, or task manager) that deliberately
  exercises OOP, collections, streams, exception handling, and file I/O learned throughout the course.
  Module 99 covers planning + core implementation; Module 100 covers refinement, a short "what Java
  concepts did you just use" retrospective mapped back to earlier module numbers, and the "next steps"
  pointer.

---

## 9. Definition of Done

The repository is complete when:

- [ ] 101 module folders exist, named and ordered exactly per Section 7.
- [ ] Every module folder contains `README.md`, `examples/`, `exercises/README.md`, and `solutions/`.
- [ ] Every `README.md` follows the exact section structure in Section 5.
- [ ] All code compiles cleanly with `javac` on JDK 21, with no package declarations (except the
      packages module) and no external dependencies (except the explicitly-flagged Spring modules).
- [ ] No module references a concept not yet introduced by that point in the sequence.
- [ ] The top-level `README.md` contains the full linear table of contents linking every module.
- [ ] A root `LICENSE` file (MIT) is present.
