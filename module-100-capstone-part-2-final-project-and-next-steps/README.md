# Module 100: Capstone Project Part 2 — Final Project and Next Steps

## Overview
Part 2 of the Library Management System adds member management, fine calculation, sorting, lambdas/streams, proper exception handling, and logging. By the end you will have a polished console application that demonstrates most of the Java concepts you have learned across all 101 modules.

## Learning Objectives
- Extend an existing codebase with new features
- Use lambda expressions and streams for search/filter/sort
- Implement custom exceptions for business logic
- Add logging with `java.util.logging`
- Calculate fines based on overdue days
- Reflect on which module concepts are being applied

## Prerequisites
- Module 99: Capstone Part 1 (you must have a working Library with Book and file I/O)

## Theory

### New Features

**Member Management**
```java
class Member {
    String name;
    String memberId;
    List<Loan> loans;
}
```

**Fine Calculation**
```java
long daysOverdue = ChronoUnit.DAYS.between(dueDate, now);
if (daysOverdue > 0) fine = daysOverdue * DAILY_FINE_RATE;
```

**Lambda/Streams for Search & Sort**
```java
books.stream()
     .filter(b -> b.getTitle().toLowerCase().contains(query))
     .sorted(Comparator.comparing(Book::getTitle))
     .collect(Collectors.toList());
```

**Logging**
```java
private static final Logger LOG = Logger.getLogger(Library.class.getName());
LOG.info("Book checked out: " + book.getTitle());
```

### What Concepts Did You Just Use?

| Feature | Module(s) |
|---------|-----------|
| Classes and objects | 21–22 |
| Encapsulation (private fields, getters) | 24–25 |
| Inheritance / polymorphism (if you extended classes) | 27–29 |
| Interfaces (Comparable, Comparator) | 31, 50 |
| Enums (BookStatus, if used) | 36 |
| Custom exceptions | 41 |
| try-with-resources | 42 |
| Collections (List, Map) | 45–48 |
| Lambdas and streams | 54, 57–58 |
| Optional | 59 |
| Date/Time API (fine calc) | 60 |
| File I/O (BufferedReader, PrintWriter) | 61 |
| Logging | 96 |
| Clean code / best practices | 97 |
| Debugging (no doubt you did some!) | 98 |

## Code Examples
- `Member.java` — the member domain class
- `LibraryExtended.java` — library with members, fines, lambdas, logging
- `LibraryAppFinal.java` — polished console app with all features

## Common Pitfalls
- Not calculating fines correctly for same-day returns
- Forgetting to mark a book as available on return
- Using `==` for String comparison in menu choices
- Logging user input that may contain sensitive data

## Exercises
See `exercises/README.md` for the full Part 2 requirements.

## Quiz

1. Which `java.time` class is best for calculating days between two dates?
   A) `Duration`  B) `Period`  C) `ChronoUnit`  D) `Instant`

2. Which stream operation transforms a stream into a different type?
   A) `filter`  B) `map`  C) `forEach`  D) `limit`

3. What concept from Modules 54–58 is used for `b -> b.getTitle().toLowerCase().contains(query)`?
   A) Anonymous class  B) Lambda expression  C) Method reference  D) Enum

4. Which module introduced `try-with-resources` for auto-closing I/O resources?
   A) 39  B) 41  C) 42  D) 61

5. What is the purpose of a custom exception like `BookNotAvailableException`?
   A) To log errors  B) To represent a domain-specific error condition  C) To replace NullPointerException  D) To improve performance

---
Answers: 1-C, 2-B, 3-B, 4-C, 5-B

## Key Takeaways
- A well-designed codebase can be extended easily — each new feature maps to earlier learning
- Lambdas and streams make collection operations declarative and concise
- Real applications combine multiple concepts: OOP + I/O + collections + logging + error handling
- The capstone proves you can build a complete, useful application from scratch

## Where to Go Next
You've completed all 101 modules! 🎉

See the [top-level README](../README.md#where-to-go-after-module-100) for suggested next steps:
- Kotlin
- Android Development
- Spring Ecosystem Deep Dive
- Microservices
- Open Source Java Projects
- JVM Languages
