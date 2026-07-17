# Module 78: SOLID Principles

## Overview
SOLID is a mnemonic for five design principles that make software designs more understandable, flexible, and maintainable. Introduced by Robert C. Martin, these principles guide object-oriented design. This module covers each principle with violations and fixes using small, focused examples.

## Learning Objectives
- Explain and apply each SOLID principle
- Identify violations in existing code
- Refactor code to conform to SOLID principles
- Understand the trade-offs each principle addresses

## Prerequisites
- Interfaces, abstract classes, inheritance, polymorphism
- Basic design pattern knowledge (Strategy)
- Dependency injection concepts

## Theory

### Single Responsibility Principle (SRP)
A class should have one, and only one, reason to change. Each class should be responsible for a single part of the program's functionality.

**Violation**: A class that handles both business logic and persistence.

**Fix**: Separate into `InvoiceCalculator` and `InvoiceRepository`.

### Open/Closed Principle (OCP)
Classes should be open for extension but closed for modification. New functionality should be added by extending (via inheritance or composition), not by modifying existing code.

**Violation**: A switch statement that handles different shapes in an area calculator.

**Fix**: Use polymorphism — each shape implements an `Area` interface.

### Liskov Substitution Principle (LSP)
Objects of a superclass should be replaceable with objects of a subclass without affecting the correctness of the program. Subtypes must satisfy the behavioral contract of the base type.

**Violation**: A `Rectangle` base class and `Square` subclass where setting width affects height.

**Fix**: Make both immutable or use a common `Shape` interface.

### Interface Segregation Principle (ISP)
Clients should not be forced to depend on interfaces they do not use. Large interfaces should be split into smaller, more specific ones.

**Violation**: A `Worker` interface with methods for both office workers and robots.

**Fix**: Split into `Workable`, `Eatable`, `Sleepable` interfaces.

### Dependency Inversion Principle (DIP)
High-level modules should not depend on low-level modules. Both should depend on abstractions (interfaces). Abstractions should not depend on details; details should depend on abstractions.

**Violation**: A `NotificationService` directly instantiating `EmailSender`.

**Fix**: Depend on a `MessageSender` interface, inject via constructor.

## Code Examples

### SrpExample.java
Violation and fix of Single Responsibility Principle.

### OcpExample.java
Violation and fix of Open/Closed Principle.

### LspExample.java
Violation and fix of Liskov Substitution Principle.

### IspExample.java
Violation and fix of Interface Segregation Principle.

### DipExample.java
Violation and fix of Dependency Inversion Principle.

## Common Pitfalls
- Over-engineering: Applying SOLID unnecessarily to simple, stable code
- SRP taken too far: Creating too many tiny classes (class explosion)
- LSP confusion: Believing inheritance hierarchies always obey LSP
- DIP with no DI: DIP requires dependency injection, not just interfaces
- Mixing ISP with SRP: ISP is about interface design, SRP is about class responsibility

## Exercises

See [exercises/README.md](exercises/README.md).

## Quiz

**Q1:** What does the "O" in SOLID stand for?
**Q2:** Which principle states that a class should have only one reason to change?
**Q3:** If a `Square` extends `Rectangle` and changing width also changes height, which principle is violated?
**Q4:** How does ISP differ from SRP?
**Q5:** What mechanism is typically used to implement DIP?

---

<details>
<summary>Answers</summary>

**A1:** Open/Closed Principle
**A2:** Single Responsibility Principle (SRP)
**A3:** Liskov Substitution Principle (LSP)
**A4:** ISP is about interface design (splitting large interfaces), SRP is about class responsibility
**A5:** Dependency Injection (constructor injection)
</details>

## Key Takeaways
- SOLID principles guide OOP design toward maintainable, extensible code
- Each principle addresses a specific type of design rigidity or fragility
- Violations often manifest as classes that are hard to test or modify
- Apply SOLID pragmatically — over-engineering is also a problem
- Together, SOLID forms the foundation of clean architecture

## Next Module
[Module 79: The Java Memory Model and Garbage Collection](../module-79-the-java-memory-model-and-garbage-collection/README.md)
