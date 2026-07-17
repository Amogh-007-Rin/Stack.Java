# Module 37: Nested and Inner Classes — Exercises

## Exercise 1: Static Nested Class — Computer

Create a class `Computer` with:
- A field `String brand`
- A constructor that sets brand
- A static nested class `Processor` with:
  - Fields: `String model`, `double speedGHz`
  - Constructor to initialize both
  - Method `void display()` that prints processor details

Write a main method that creates a `Computer.Processor` and displays its info.

## Exercise 2: Inner Class — Bank and Account

Create a class `Bank` with:
- A field `String bankName`
- A constructor that sets bankName
- An inner class `Account` with:
  - Fields: `String accountNumber`, `double balance`
  - Constructor to initialize both
  - Method `void display()` that prints account details including the bank name

Write a main method that creates a Bank, then creates an Account using the bank instance, and displays the account.

## Exercise 3: Local Class — Email Validator

Create a class `Validator` with:
- A method `boolean isValidEmail(String email)` that:
  - Defines a local class `EmailChecker` with a method `boolean check(String e)`
  - The check method returns true if the email contains "@" and "."
  - Uses the local class to perform the validation

Write a main method that tests several email addresses.
