# Module 82 Exercises: Annotations

Compile with `javac *.java` and run with `java <ExerciseN>`.

## Exercise 1: @Todo Annotation
Create a custom annotation `@Todo` with elements:
- `description()` — `String`, required
- `priority()` — `int`, default `5`

Apply it to three methods in a class.

## Exercise 2: Todo Processor
Write a processor class that scans the class from Exercise 1, finds all methods annotated with `@Todo`, and prints their description and priority.

**Expected output:**
```
TODO on login: Implement login (priority: 1)
TODO on logout: Add logout button (priority: 3)
TODO on fixBug: Fix minor bug (priority: 5)
```

## Exercise 3: @Deprecated Reporter
Write a program that uses reflection to scan a class and report all methods or fields annotated with `@Deprecated`. Test it on a class with deprecated members.
