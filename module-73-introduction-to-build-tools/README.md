# Module 73: Introduction to Build Tools

## Overview
Build tools automate compiling, testing, packaging, and dependency management. This module introduces Maven and Gradle — the two most popular build tools in the Java ecosystem.

## Learning Objectives
- Understand why build tools are essential for real-world Java projects
- Read a basic Maven `pom.xml` and understand its structure
- Read a basic Gradle `build.gradle` and understand its structure
- Know the Maven build lifecycle phases (compile, test, package, install)
- Compare Maven and Gradle strengths and weaknesses

## Prerequisites
- Completed previous modules (no coding required for this module)

## Theory

### Why Build Tools?
| Problem | Build Tool Solution |
|---------|-------------------|
| Managing JAR dependencies | Declare them in a file; tool downloads automatically |
| Reproducible builds | Same configuration = same output everywhere |
| Running tests | Single command runs all tests |
| Packaging | Tool creates JAR/WAR with all dependencies |
| Continuous Integration | CI server runs build commands, not manual steps |

### Maven
- Uses `pom.xml` (Project Object Model)
- Convention over configuration — standard directory layout
- Lifecycle phases: `validate` → `compile` → `test` → `package` → `verify` → `install` → `deploy`
- Plugin-based; most functionality comes from plugins

```xml
<project>
    <groupId>com.example</groupId>
    <artifactId>my-app</artifactId>
    <version>1.0</version>

    <dependencies>
        <dependency>
            <groupId>com.h2database</groupId>
            <artifactId>h2</artifactId>
            <version>2.2.224</version>
        </dependency>
    </dependencies>
</project>
```

### Gradle
- Uses `build.gradle` (Groovy) or `build.gradle.kts` (Kotlin DSL)
- Based on a directed acyclic graph (DAG) of tasks
- Faster than Maven for large projects (incremental builds, build cache)

```groovy
plugins {
    id 'java'
    id 'application'
}

repositories {
    mavenCentral()
}

dependencies {
    implementation 'com.h2database:h2:2.2.224'
    testImplementation 'org.junit.jupiter:junit-jupiter:5.10.0'
}
```

### Comparison: Maven vs Gradle
| Aspect | Maven | Gradle |
|--------|-------|--------|
| Configuration | XML (verbose) | Groovy/Kotlin DSL (concise) |
| Build model | Linear lifecycle phases | DAG of interdependent tasks |
| Performance | Good | Better (incremental, cache) |
| Learning curve | Moderate (XML) | Steeper (DSL language) |
| Adoption | Widely used (enterprise) | Growing (Android, modern) |
| Flexibility | Rigid conventions | Highly customizable |

## Code Examples

### pom.xml
A minimal Maven POM with H2 dependency.

### build.gradle
A minimal Gradle build file with H2 and JUnit dependencies.

## Common Pitfalls
- **Missing `repositories` in Gradle** — Without `mavenCentral()`, no dependencies resolve.
- **Incorrect `groupId`/`artifactId`** — Must match Maven Central exactly; use `search.maven.org` to verify.
- **Scope confusion** — `compile` vs `test` vs `runtime` (Maven); `implementation` vs `testImplementation` (Gradle).
- **Not running `clean`** — Stale class files can cause obscure errors.

## Exercises

See [exercises/README.md](exercises/README.md).

## Quiz

1. What is the Maven build file called?
2. What Gradle lifecycle phase compiles source code?
3. Which Maven phase comes after `test`?
4. True or False: Gradle uses XML for its build configuration.
5. What command packages a Maven project into a JAR?

---
Answers: 1. `pom.xml`, 2. `compile` (or `classes`), 3. `package`, 4. False (Groovy or Kotlin DSL), 5. `mvn package`

## Key Takeaways
- Build tools replace manual `javac` and JAR management.
- Maven is convention-based and uses XML; Gradle is DAG-based and uses a DSL.
- Both integrate seamlessly with IDEs and CI/CD pipelines.

## Next Module
Module 74 — Unit Testing Concepts with JUnit 5
