# Module 41 Exercises: Custom Exceptions

## Exercise 1: InsufficientFundsException
Create a checked custom exception `InsufficientFundsException` with a message constructor. Write a `BankAccount` class with a `withdraw(double amount)` method that throws this exception if the amount exceeds the balance. Test in `main`.

## Exercise 2: TemperatureOutOfRangeException
Create an unchecked custom exception `TemperatureOutOfRangeException` (extends `RuntimeException`). Write a `Thermostat` class with a `setTemperature(double temp)` method that throws it if temp is below 0 or above 40.

## Exercise 3: DatabaseException with Cause
Create a checked custom exception `DatabaseException` with constructors for message, cause, and both. Write a `Database` class with a `connect(String url)` method that throws `DatabaseException` wrapping a hypothetical `SQLException` cause (use a try-catch to wrap it).

## Exercise 4: Validation Framework
Create a `ValidationException` (checked) with message and cause constructors. Write a `Person` class with fields `name` and `age`. Validate that name is non-null and non-empty, and age is between 0 and 120. Throw `ValidationException` for invalid fields. Test with valid and invalid data.
