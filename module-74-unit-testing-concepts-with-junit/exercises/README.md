# Module 74 — Exercises

## Exercise 1: Test a Simple Class
Write JUnit 5 tests for this class:
```java
class TemperatureConverter {
    double celsiusToFahrenheit(double c) {
        return c * 9 / 5 + 32;
    }

    double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
}
```
Test: 0°C = 32°F, 100°C = 212°F, -40°C = -40°F.

## Exercise 2: Test for Exceptions
Write tests for this class:
```java
class BankAccount {
    private double balance;
    void withdraw(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Amount must be positive");
        if (amount > balance) throw new IllegalStateException("Insufficient funds");
        balance -= amount;
    }
    void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Amount must be positive");
        balance += amount;
    }
    double getBalance() { return balance; }
}
```

## Exercise 3: Lifecycle with Mutable State
Write a test class with:
1. A `List<String>` field initialized in `@BeforeEach`
2. Three tests that add/remove from the list
3. Verify the list is empty at the start of each test using `@BeforeEach`

## Exercise 4: Parameterized Test
Write a parameterized test that checks whether a given integer is even. Use `@ValueSource` with ints like 2, 4, 100, 0, -6, and assert `true` for each.
