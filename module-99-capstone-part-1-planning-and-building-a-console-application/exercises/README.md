# Module 99: Capstone Project Part 1 — Library Management System

## Overview
This is a single large project instead of individual exercises. Build a fully functional console-based Library Management System.

## Requirements

### Core Classes

**Book**
- Fields: `title` (String), `author` (String), `isbn` (String), `copies` (int) — available copies
- Constructor, getters, setters for `copies`
- `boolean isAvailable()` — returns true if copies > 0
- `boolean checkout()` — decrements copies if available; returns success
- `void returnCopy()` — increments copies
- `String toCsv()` / `static Book fromCsv(String)` — CSV serialization
- `toString()` for display

**Library**
- Internal `List<Book>` storage
- `addBook(Book)`, `listBooks()` — return a copy of the list
- `searchByTitle(String)` / `searchByAuthor(String)` — case-insensitive substring matching
- `findByIsbn(String)` — exact match; returns `Book` or `null`
- `checkoutBook(String isbn)` / `returnBook(String isbn)` — delegates to Book
- `saveToFile(String filename)` — writes all books as CSV lines
- `loadFromFile(String filename)` — clears and reloads from CSV

### Console Interface (LibraryApp)
- Main loop with a text menu
- Options: Add Book, List Books, Search by Title, Search by Author, Checkout Book, Return Book, Save & Exit
- Read user input with `Scanner.nextLine()`

### File Persistence
- On startup, load from `library.csv` if it exists
- On "Save & Exit", write all books to `library.csv`

## Acceptance Criteria
- [ ] `Book` class is complete with all methods
- [ ] `Library` class manages books and supports search
- [ ] `LibraryApp` has a working menu loop
- [ ] Books persist across application restarts via CSV
- [ ] Cannot checkout a book with zero copies
- [ ] Return increments the copy count
- [ ] Search works case-insensitively by title and author

## Submission
The `solutions/` directory contains the complete reference implementation. Compare your solution against it.
