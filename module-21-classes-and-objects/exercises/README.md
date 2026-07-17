# Module 21 — Exercises

## Exercise 1: Dog Class
Create a `Dog` class with fields `name` (String), `breed` (String), and `age` (int). Add two methods:
- `bark()` — prints "Woof! My name is [name]."
- `haveBirthday()` — increments age by 1 and prints "Happy birthday, [name]! Now [age] years old."

Write a separate `DogDemo` class with `main` that creates two `Dog` objects, sets their fields, calls their methods, and then calls `haveBirthday()` on one of them.

## Exercise 2: Rectangle Class
Create a `Rectangle` class with fields `length` and `width` (both double). Add methods:
- `area()` — returns the area (length * width)
- `perimeter()` — returns the perimeter (2 * (length + width))
- `isSquare()` — returns true if length equals width

Write a `RectangleDemo` class that creates two `Rectangle` objects, sets dimensions, and prints area, perimeter, and whether each is a square.

## Exercise 3: BankAccount Class
Create a `BankAccount` class with fields `accountHolder` (String), `accountNumber` (String), and `balance` (double). Add methods:
- `deposit(double amount)` — adds to balance and prints the new balance
- `withdraw(double amount)` — subtracts if sufficient funds, otherwise prints "Insufficient funds."
- `displayBalance()` — prints the current balance

Write a `BankAccountDemo` class that creates an account, deposits 500, withdraws 200, withdraws 400 (should fail), and displays the final balance.

## Exercise 4: Reference vs Primitive Challenge
Write a `ReferenceChallenge` class with `main` that:
1. Creates two `int` variables `a = 5` and `b = a`, then changes `b` to 10. Print both.
2. Creates a `Rectangle` object `r1`, sets length=10, width=5. Assigns `r2 = r1`, changes r2's length to 20. Print r1's length and r2's length.
3. Explains in a comment why the results differ.

---

*Solutions are in the `solutions/` directory. Compile with: `javac Solution*.java`*
