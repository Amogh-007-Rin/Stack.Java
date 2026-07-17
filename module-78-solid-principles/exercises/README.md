# Module 78: Exercises - SOLID Principles

## Exercise 1: SRP - Report Generator
Refactor a `Report` class that currently calculates data, formats HTML, and saves to a file. Split into `ReportData`, `HtmlFormatter`, and `FileSaver` classes. Write a main method that demonstrates the refactored code.

## Exercise 2: OCP - Discount Calculator
Create a `DiscountCalculator` that violates OCP (uses if/switch for different customer types). Then refactor it into a `DiscountStrategy` interface with `RegularDiscount`, `VIPDiscount`, and `SeasonalDiscount` implementations. The calculator should work with any new discount type without modification.

## Exercise 3: LSP - Bird Problem
Create a `Bird` base class with a `fly()` method, and demonstrate LSP violation when `Penguin` extends `Bird` (penguins can't fly). Fix by creating a `Bird` base with `move()` and a `Flyable` interface for birds that fly.

## Exercise 4: DIP - Database Application
Create a `UserService` that depends directly on a `MySQLDatabase` class. Refactor to depend on a `Database` interface. Add an `InMemoryDatabase` implementation used for testing. Demonstrate switching between database implementations via constructor injection.
