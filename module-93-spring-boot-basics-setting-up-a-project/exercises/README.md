# Module 93 — Exercises

## Exercise 1: Create a Main Application Class
Write a complete Spring Boot main class with:
- `@SpringBootApplication` annotation
- A `CommandLineRunner` bean that prints "Application started on port: " followed by the value of `server.port` (default 8080)
- An `@Bean` that returns a `String` containing the application version

## Exercise 2: External Configuration
Create an `application.properties` file and a Java class that reads:
- `app.name`
- `app.version`
- `app.description`

Print them to the console. (Standalone — no Spring needed; use `Properties` or Spring's `Environment` if using Spring Boot.)

## Exercise 3: Profile-Based Configuration
Write a Java program that demonstrates the concept of Spring profiles:
- Define a `DataSourceConfig` interface with `String getUrl()`
- Implement `DevDataSourceConfig` and `ProdDataSourceConfig`
- Simulate profile switching by reading a `spring.profiles.active` property
- Return the appropriate config based on the profile
