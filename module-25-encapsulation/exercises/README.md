# Module 25 — Exercises

## Exercise 1: Encapsulated Product
Create a `Product` class with private fields `name`, `price`, and `quantityInStock`. Provide:
- A constructor that initializes all fields
- Getters for all fields
- Setters with validation:
  - `setPrice(double)` — must be > 0
  - `setQuantityInStock(int)` — must be >= 0
  - `setName(String)` — must not be null or empty
- A method `reduceStock(int amount)` that decreases quantity only if sufficient stock exists

Write a `ProductDemo` class that tests valid and invalid inputs.

## Exercise 2: Encapsulated Student
Create a `Student` class with private fields `name`, `id`, `grades` (an `int[]`). Provide:
- A constructor taking name and id (grades initializes to empty array of length 0)
- Getters: `getName()`, `getId()`, `getGrades()` (return a copy of the array)
- Methods: `addGrade(int grade)` (adds grade to array), `getAverage()` (returns average as double)
- Validation: grade must be 0-100

Write a `StudentDemo` class that creates a student, adds grades, and prints the average.

## Exercise 3: BankAccount with Transactions
Create a `BankAccount` class with private fields `accountHolder`, `accountNumber`, `balance`, and `transactionCount`. Provide:
- Constructor taking accountHolder and accountNumber (balance starts at 0)
- Getters for all fields
- `deposit(double)` — adds to balance, increments transactionCount, validates amount > 0
- `withdraw(double)` — subtracts if sufficient funds, validates amount > 0
- No setter for balance (only modification is through deposit/withdraw)

Write a `BankDemo` class that performs several deposits and withdrawals.

---

*Solutions are in the `solutions/` directory.*
