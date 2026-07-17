# Exercise 3 — Identified OOP Pillars

1. **Polymorphism** — The same `start()` method behaves differently for `Car` and `Motorcycle`. This is runtime polymorphism (method overriding).

2. **Encapsulation** — The `balance` field is private and can only be modified through public methods. The internal state is hidden from outside code.

3. **Inheritance** — `Dog` reuses the `eat()` behavior from `Animal` without rewriting it. This is an IS-A relationship.

4. **Polymorphism (via Abstraction)** — The `Payment` interface defines a contract; different classes implement it in their own way. This shows both abstraction (hiding implementation behind an interface) and polymorphism (different behaviors through the same interface).
