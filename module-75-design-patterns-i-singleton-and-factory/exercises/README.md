# Module 75: Exercises - Singleton and Factory

## Exercise 1: Bill Pugh Singleton
Implement a `ConfigManager` class using the Bill Pugh Singleton pattern. It should hold a `Map<String, String>` for configuration properties. Add methods `set(String key, String value)` and `get(String key)`. Demonstrate that only one instance exists.

## Exercise 2: Thread-Safe Counter Singleton
Implement a thread-safe `Counter` singleton that maintains an `int count`. Provide `increment()` and `getCount()` methods. Use double-checked locking. Write a test that starts 10 threads, each incrementing the counter 1000 times, and verify the final count is 10000.

## Exercise 3: Factory for Payment Methods
Create an interface `Payment` with a method `void pay(double amount)`. Implement `CreditCardPayment`, `PayPalPayment`, and `CryptoPayment`. Write a `PaymentFactory` with a static method `createPayment(String type, String details)` that returns the appropriate payment object.

## Exercise 4: Logger Singleton
Implement a `Logger` singleton with methods `info(String msg)`, `warn(String msg)`, and `error(String msg)`. Each method should print `[LEVEL] message`. Use lazy initialization (not thread-safe for simplicity). Write a main method demonstrating logging from different parts of the application.
