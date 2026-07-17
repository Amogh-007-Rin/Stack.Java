# Module 24 — Exercises

## Exercise 1: BankAccount with Access Modifiers
Create a `BankAccount` class with:
- `private` field `balance` (double)
- `public` field `accountHolder` (String)
- `default` field `accountNumber` (String)
- `private` method `logTransaction(String type, double amount)` that prints a log message
- `public` methods `deposit(double)`, `withdraw(double)`, and `getBalance()` that use the private log method

Write a `BankAccessDemo` class (same package) that tests which fields/methods it can access.

## Exercise 2: Person with Protected
Create a `Person` class in the default package with:
- `private` String `name`
- `protected` int `age`
- `public` String `email`
- A constructor to initialize all fields
- `public` getter for name

Create a `Student` subclass that extends `Person` and adds a `studentId` field. In `Student`, write a method `displayAccess()` that prints which Person fields it can access directly.

Write a `PersonDemo` class to test.

## Exercise 3: Access Level Table
Write a `AccessLevelDemo` class with a `main` method that prints a formatted table showing the four access levels and their visibility (similar to `VisibilityTable.java`). Add comments explaining when you would use each level.

---

*Solutions are in the `solutions/` directory.*
