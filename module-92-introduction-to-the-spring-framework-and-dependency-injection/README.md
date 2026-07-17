# Module 92: Introduction to the Spring Framework and Dependency Injection

## Overview
The Spring Framework is the most popular enterprise Java framework. At its core lies the **Inversion of Control (IoC) container** that manages object lifecycles and **Dependency Injection (DI)** — a pattern where an object receives its dependencies from an external source rather than creating them itself. This module covers the fundamental concepts of IoC and DI, compares Spring's approach to manual dependency management, and introduces the key annotations used to configure the container.

## Learning Objectives
- Understand the IoC principle and how it differs from traditional object creation
- Distinguish between constructor, setter, and field injection
- Recognize the roles of `@Component`, `@Autowired`, and `@Bean`
- Compare Spring's DI to manual wiring and Google Guice
- Understand ApplicationContext vs BeanFactory

## Prerequisites
- Solid understanding of OOP, interfaces, and polymorphism
- Familiarity with annotations (Module 82)

## Theory

### Inversion of Control (IoC)
Instead of a class creating its own dependencies, an external container creates them and injects them in. This decouples the class from its dependency implementations.

```
Traditional:  Service s = new Service(new DatabaseImpl());
Spring IoC:   Container creates DatabaseImpl → injects into Service
```

### ApplicationContext vs BeanFactory
| Interface     | Features |
|---------------|----------|
| BeanFactory   | Lazy initialization, minimal footprint |
| ApplicationContext | Eager initialization, event propagation, AOP support, messages (preferred) |

### Dependency Injection Styles

**Constructor Injection** (preferred — ensures required dependencies and immutability):
```java
public class Service {
    private final Repository repo;
    public Service(Repository repo) { this.repo = repo; }
}
```

**Setter Injection** (optional dependencies):
```java
public class Service {
    private Repository repo;
    @Autowired
    public void setRepo(Repository repo) { this.repo = repo; }
}
```

**Field Injection** (reflection-based, hard to test):
```java
public class Service {
    @Autowired
    private Repository repo;
}
```

### Key Annotations
| Annotation    | Purpose |
|---------------|---------|
| `@Component`  | Marks a class as a Spring-managed bean |
| `@Autowired`  | Tells Spring to inject a dependency |
| `@Bean`       | Declares a bean in a `@Configuration` class |
| `@Service`    | Specialization of `@Component` for service layer |
| `@Repository` | Specialization for data access layer |
| `@Controller` | Specialization for web layer |

## Code Examples

### Example 1: ManualDIDemo
Shows manual dependency injection in plain Java — no Spring framework required. This demonstrates the *pattern* of DI before introducing the container.

### Example 2: SpringStyleConfigDemo
Uses annotations conceptually to show how the same wiring would look in a Spring-managed application. Requires Spring Boot dependencies to compile.

### Example 3: DIContainerComparison
Compares manual DI, Spring-like annotation scanning, and a simplified Guice-style binder — all in plain Java.

## Common Pitfalls
- **Field injection is hard to test** — Prefer constructor injection for required dependencies.
- **Circular dependencies** — Spring can detect them at startup; refactor to break the cycle.
- **Too many beans** — Keep the container focused; not everything needs to be a bean.
- **Forgetting `@ComponentScan`** — Spring only discovers beans in scanned packages.

## Exercises
See [exercises/README.md](exercises/README.md).

## Quiz

1. Which DI style is most recommended for required dependencies in Spring?
   a) Field injection
   b) Setter injection
   c) Constructor injection
   d) Interface injection

2. What does `ApplicationContext` provide that `BeanFactory` does not?
   a) Dependency injection
   b) Event propagation
   c) Bean lifecycle management
   d) Singleton scope

3. Which annotation marks a class as a candidate for Spring-managed bean discovery?
   a) `@Bean`
   b) `@Autowired`
   c) `@Component`
   d) `@Inject`

4. True or False: Constructor injection guarantees that a bean's dependencies are available when the bean is first used.

5. Which of the following is NOT a benefit of IoC/DI?
   a) Easier unit testing
   b) Loose coupling
   c) Faster runtime performance
   d) Improved configuration management

---

**Answers**: 1-c, 2-b, 3-c, 4-True, 5-c

## Key Takeaways
- IoC inverts control: the container manages dependencies, not the class itself.
- Constructor injection is the safest and most testable DI style.
- Spring provides multiple annotations to declare and wire beans.
- `ApplicationContext` is the richer, production-ready container.

## Next Module
Module 93 — Spring Boot Basics: Setting Up a Project, where you'll learn how Spring Boot simplifies project configuration and auto-configuration.
