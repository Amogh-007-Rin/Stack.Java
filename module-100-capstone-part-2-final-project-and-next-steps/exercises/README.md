# Module 100: Capstone Project Part 2 — Final Project and Next Steps

## Overview
Continue the Library Management System from Module 99. Add member management, fine calculation, sorting, streams/lambdas, exception handling, and logging.

## New Requirements

### 1. Member and Loan Classes
**Loan**
- Fields: `isbn`, `memberId`, `checkoutDate` (LocalDate), `returnDate` (LocalDate, nullable)
- Constructor, getters, setter for `returnDate`
- `long calculateFine(double dailyRate)` — returns 0 if returned on time, else `daysOverdue * dailyRate`
- Assume a 14-day loan period

**Member**
- Fields: `name`, `memberId`, `List<Loan> loans`
- `addLoan(Loan)`, `returnBook(String isbn)` — sets returnDate
- `double calculateTotalFines(double dailyRate)`

### 2. Extended Library
- Add `Member` management: `addMember()`, `findMember()`, `listMembers()`
- `checkoutBook(isbn, memberId)` — throws `IllegalArgumentException` or `IllegalStateException` on failure
- `returnBook(isbn, memberId)` — updates `Loan.returnDate` and increments book copies
- `calculateFine(memberId)` — returns total fines for a member
- Sorting: `sortByTitle()`, `sortByAuthor()`, `sortByCopies()` — use streams and `Comparator`
- Search must use lambda/streams with `filter`
- Add logging with `java.util.logging.Logger` for add/checkout/return/save operations

### 3. Updated Console Interface
New menu options (keep existing ones):
- 7. Add Member
- 8. List Members
- 9. Calculate Fine for Member
- 10. Sort Books (sub-menu: 1=Title, 2=Author, 3=Copies)
- 11. Save & Exit

### 4. Exception Handling
- All user input errors must be caught and a friendly message displayed (no raw stack traces to console)
- Custom exceptions (`BookNotAvailableException`, `MemberNotFoundException`) are optional but recommended

### 5. Persistence
- Books saved to `library_books.csv`
- Members saved to `library_members.csv`
- Note: Loans are not persisted in this version (they reset on restart)

## Retrospective
After completing, open the `README.md` and review the "What Concepts Did You Just Use?" table. Each feature links to its originating module — a reminder of how far you've come!

## Acceptance Criteria
- [ ] `Loan` and `Member` classes exist with fine calculation
- [ ] Checkout and return work with member association
- [ ] All searches use lambdas/streams
- [ ] Sorting works by title, author, copies
- [ ] Logging is present for key operations
- [ ] Errors are handled gracefully (no raw stack traces)
- [ ] Data persists across restarts (books + members)
- [ ] Fine calculation accounts for 14-day loan period
