# Module 99: Capstone Project Part 1 — Planning and Building a Console Application

## Overview
This module launches the two-part capstone project: a **Library Management System** console application. Part 1 focuses on planning the design, defining the core classes, implementing the data model, and getting a working application with in-memory storage and file persistence.

## Learning Objectives
- Plan a small Java project: identify classes, responsibilities, and relationships
- Build a domain model (`Book`, `Library`)
- Implement file-based persistence (read/write CSV)
- Create a console menu interface
- Apply concepts from earlier modules (I/O, collections, OOP)

## Prerequisites
- All modules 0–98 (especially File I/O, Collections, Exception Handling)

## Theory

### Project Planning
Before writing code, sketch the architecture:

```
Book             Library                LibraryApp
------           -------                ----------
- title           + books: List<Book>    + main() loop
- author          + addBook()            + showMenu()
- isbn            + listBooks()          + handleChoice()
- copies          + searchByTitle()
                  + searchByAuthor()
                  + checkoutBook()
                  + returnBook()
                  + saveToFile()
                  + loadFromFile()
```

### CSV Persistence
Store books in a comma-separated file. Each line = one book:
```
title,author,isbn,copies
Effective Java,Joshua Bloch,9780134685991,3
```

### Console Menu Pattern
```java
Scanner scanner = new Scanner(System.in);
while (true) {
    System.out.println("\n=== Library Menu ===");
    System.out.println("1. Add Book");
    System.out.println("2. List Books");
    System.out.println("3. Search by Title");
    System.out.println("4. Checkout Book");
    System.out.println("5. Return Book");
    System.out.println("6. Save & Exit");
    System.out.print("Choice: ");
    int choice = Integer.parseInt(scanner.nextLine());
    // dispatch
}
```

## Code Examples
- `Book.java` — the book domain class
- `Library.java` — collection management with search and file I/O
- `LibraryApp.java` — the console application entry point

## Common Pitfalls
- Over-complicating the design — a flat CSV file is fine for this project
- Not handling `null` returns from search methods — always guard with `Optional` or null checks
- Forgetting to close the `Scanner` and file resources
- Skipping input validation (empty strings, non-numeric ISBN)

## Exercises
See `exercises/README.md` for the full project description and requirements checklist.

## Quiz

1. Which class is responsible for persisting books to a file in the planned design?
   A) `Book`  B) `Library`  C) `LibraryApp`  D) `FileHandler`

2. What is a sensible format for storing books in a file?
   A) XML  B) CSV  C) Java serialization  D) JSON

3. Which method should you use to safely read a line of user input with `Scanner`?
   A) `next()`  B) `nextInt()`  C) `nextLine()`  D) `read()`

4. What does CSV stand for?
   A) Common Separated Values  B) Comma Separated Values  C) Class System Variable  D) Console Service Vector

5. What is the first step before writing code for a project?
   A) Write tests  B) Plan the architecture  C) Set up Maven  D) Create the GUI

---
Answers: 1-B, 2-B, 3-C, 4-B, 5-B

## Key Takeaways
- Start with a design sketch — even a napkin drawing helps
- Separate concerns: domain (Book), logic (Library), UI (LibraryApp)
- File persistence is straightforward with CSV and `BufferedReader`/`PrintWriter`
- A console menu loop is the simplest interactive UI — get it working first

## Next Module
Module 100: Capstone Project Part 2 — Final Project and Next Steps
