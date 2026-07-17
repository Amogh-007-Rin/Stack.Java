# Module 34: Packages and Imports — Exercises

## Exercise 1: Geometry Package

Create a package `com.stackjava.geometry` with:
- A class `Circle` with field `double radius`, constructor, and method `double area()`
- A class `Rectangle` with fields `double width, double height`, constructor, and method `double area()`

Create a file `GeometryDemo.java` (no package) that imports both classes and demonstrates their usage.

## Exercise 2: Banking Package

Create a package `com.stackjava.banking` with:
- A class `Account` with fields `String accountNumber`, `double balance`, constructor, and methods `deposit()`, `withdraw()`, `getBalance()`
- A class `AccountUtils` with a static method `void printAccount(Account a)` that prints account details

Create a file `BankingDemo.java` (no package) that imports and uses both classes.

## Exercise 3: Library Multi-Package

Create two packages:
- `com.stackjava.library.model` with a class `Book` (fields: title, author, isbn)
- `com.stackjava.library.service` with a class `LibraryService` that has a method `void checkoutBook(Book b)`

Create a file `LibraryDemo.java` (no package) that imports both and demonstrates usage.
