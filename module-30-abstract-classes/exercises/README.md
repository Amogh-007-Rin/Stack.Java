# Module 30: Abstract Classes — Exercises

## Exercise 1: Abstract Employee Class

Create an abstract class `Employee` with:
- Fields: `String name`, `double baseSalary`
- Constructor to initialize both fields
- Abstract method: `double calculatePay()`
- Concrete method: `void displayInfo()` that prints name and calculated pay

Create two concrete subclasses:
- `SalariedEmployee` — pay is baseSalary (annual salary divided by 12)
- `HourlyEmployee` — has an additional `int hoursWorked` field; pay is baseSalary * hoursWorked

Write a main method that creates one of each and displays their info.

## Exercise 2: Abstract Logger

Create an abstract class `Logger` with:
- A field `String level` (e.g., "INFO", "ERROR")
- A constructor that sets the level
- An abstract method `void log(String message)`
- A concrete method `void info(String message)` that calls `log("[INFO] " + message)`
- A concrete method `void error(String message)` that calls `log("[ERROR] " + message)`

Create two subclasses:
- `ConsoleLogger` — prints to console
- `FileLogger` — prints to a simulated file (just print "Writing to file: " + message)

Write a main method that demonstrates both loggers.

## Exercise 3: Abstract Bank Account

Create an abstract class `BankAccount` with:
- Fields: `String accountNumber`, `double balance`
- Constructor to initialize both
- Abstract methods: `void deposit(double amount)`, `void withdraw(double amount)`, `double getBalance()`
- Concrete method: `void printStatement()` that prints account number and balance

Create two subclasses:
- `SavingsAccount` — has `double interestRate`; `deposit` adds to balance; `withdraw` only if sufficient funds
- `CheckingAccount` — has `double overdraftLimit`; `withdraw` allows balance to go negative up to the limit

Write a main method that creates one of each and performs deposits/withdrawals.
