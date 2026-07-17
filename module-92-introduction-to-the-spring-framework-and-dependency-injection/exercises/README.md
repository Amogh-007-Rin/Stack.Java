# Module 92 — Exercises

## Exercise 1: Manual Dependency Injection
Write a program with the following structure:
- `Database` interface with method `void connect()`
- `MySqlDatabase` and `PostgresDatabase` implementations
- `AppService` class that depends on `Database` via constructor injection
- A `main` method that wires everything manually and calls `connect()`

## Exercise 2: Spring-Style Annotation Configuration
Write a plain Java program that simulates Spring's annotation scanning. Define:
- A custom `@Component` annotation
- A custom `@Autowired` annotation  
- A simple container class that scans for `@Component`-annotated classes and auto-wires fields marked with `@Autowired`
- Demonstrate with a `Car` class that has an `Engine` dependency

## Exercise 3: Scope Simulation
Write a program that shows the difference between singleton and prototype scope:
- Create a `ServiceRegistry` that caches singletons (always returns same instance)
- Create a `PrototypeFactory` that creates a new instance each time
- Show that two requests to singleton return `==` while prototype returns `!=`

## Exercise 4: Compare with Manual Factory Pattern
Refactor the following tight coupling into DI:
```java
class ReportGenerator {
    private PdfFormatter formatter = new PdfFormatter();
    void generate() { formatter.format(); }
}
```
Write the DI version with an interface, implementations, and external wiring.
