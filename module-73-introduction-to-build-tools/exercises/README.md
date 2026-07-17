# Module 73 — Exercises

These exercises are conceptual/written — no code to run.

## Exercise 1: Read a pom.xml
Given this snippet, identify the `groupId`, `artifactId`, version, and one dependency:
```xml
<project>
    <groupId>org.myorg</groupId>
    <artifactId>utility-lib</artifactId>
    <version>2.1</version>
    <dependencies>
        <dependency>
            <groupId>org.apache.commons</groupId>
            <artifactId>commons-lang3</artifactId>
            <version>3.12.0</version>
        </dependency>
    </dependencies>
</project>
```

## Exercise 2: Translate pom.xml to build.gradle
Convert the Maven POM from Exercise 1 into an equivalent Gradle `build.gradle` file.

## Exercise 3: Maven Lifecycle Order
List the following Maven phases in correct order: `install`, `compile`, `package`, `test`, `validate`, `deploy`.

## Exercise 4: Dependency Scope
Explain the difference between Maven scopes `compile`, `test`, and `runtime`. Give an example of when you would use each.

## Exercise 5: Maven vs Gradle
Write a short paragraph comparing Maven and Gradle. Which would you choose for a new project and why?
