# Module 93: Spring Boot Basics — Setting Up a Project

## Overview
Spring Boot eliminates much of the boilerplate required by the traditional Spring Framework through **auto-configuration** and **opinionated defaults**. This module covers how to bootstrap a Spring Boot project using Spring Initializr, the structure of a typical project, the role of the `@SpringBootApplication` annotation, and the configuration files that control application behavior.

> **Note:** This is one of the four modules where using Maven or Gradle is expected. While the examples include runnable concepts in plain Java, compiling and running a full Spring Boot application requires a build tool.

## Learning Objectives
- Use Spring Initializr (start.spring.io) to generate a project
- Understand the `@SpringBootApplication` composite annotation
- Recognize the standard Maven/Gradle project layout
- Configure an application using `application.properties` / `application.yml`
- Understand Spring Boot auto-configuration

## Prerequisites
- Module 92 (Spring IoC and DI concepts)
- Familiarity with Maven or Gradle basics (Module 73)
- Java 17+

## Theory

### @SpringBootApplication
A convenience annotation that combines three others:
| Annotation | Purpose |
|------------|---------|
| `@SpringBootConfiguration` | Marks the class as a configuration source |
| `@EnableAutoConfiguration` | Tells Spring Boot to auto-configure beans based on classpath dependencies |
| `@ComponentScan` | Scans the package and sub-packages for `@Component` classes |

### SpringApplication.run()
Bootstrap method that:
1. Creates the `ApplicationContext`
2. Triggers auto-configuration
3. Starts the embedded web server (if web dependencies present)
4. Runs `CommandLineRunner` / `ApplicationRunner` beans

### Project Structure (Maven)
```
my-project/
├── pom.xml
├── src/main/java/com/example/
│   ├── MyApplication.java          // @SpringBootApplication
│   └── controller/
│       └── HelloController.java
├── src/main/resources/
│   ├── application.properties
│   └── static/        (static assets)
└── src/test/java/
```

### application.properties / application.yml
Key-value configuration that Spring Boot reads at startup:
```properties
server.port=8081
spring.datasource.url=jdbc:h2:mem:testdb
```
YAML alternative:
```yaml
server:
  port: 8081
spring:
  datasource:
    url: jdbc:h2:mem:testdb
```

## Code Examples

### Example 1: MinimalSpringBootApp
A minimal `@SpringBootApplication` class with a `CommandLineRunner` bean. Requires Maven/Gradle to compile.

### Example 2: SpringBootStartupDemo
Shows how `SpringApplication.run()` returns an `ApplicationContext` and how to retrieve beans. Requires Maven/Gradle.

### Example 3: ApplicationPropertiesDemo
A standalone Java demo that reads `.properties` files manually to show the concept behind Spring Boot's property loading.

## Common Pitfalls
- **Main class not at root package** — `@ComponentScan` defaults to the package of the `@SpringBootApplication` class. Keep it at the top.
- **Forgetting `@SpringBootApplication`** — Without it, auto-configuration does not run.
- **Port conflict** — If port 8080 is in use, set `server.port` in `application.properties`.
- **Properties not loaded** — Ensure `application.properties` is in `src/main/resources/`, not `src/main/java/`.

## Exercises
See [exercises/README.md](exercises/README.md).

## Quiz

1. Which three annotations does `@SpringBootApplication` combine?
   a) `@Configuration`, `@Component`, `@Autowired`
   b) `@SpringBootConfiguration`, `@EnableAutoConfiguration`, `@ComponentScan`
   c) `@Bean`, `@Service`, `@Repository`
   d) `@SpringBootConfiguration`, `@Component`, `@Autowired`

2. Where should the class with `@SpringBootApplication` be located?
   a) In any package
   b) In the root package of the project
   c) In a `config` sub-package
   d) In the test source folder

3. What file extension is used for Spring Boot configuration?
   a) `.cfg`
   b) `.config`
   c) `.properties` or `.yml`
   d) `.xml`

4. True or False: `SpringApplication.run()` starts an embedded web server only if web dependencies are on the classpath.

5. Which tool can be used to generate a Spring Boot project scaffold?
   a) Maven archetype
   b) Spring Initializr
   c) Gradle init
   d) All of the above

---

**Answers**: 1-b, 2-b, 3-c, 4-True, 5-d

## Key Takeaways
- `@SpringBootApplication` enables auto-configuration and component scanning with a single annotation.
- Spring Boot's auto-configuration inspects classpath dependencies to configure beans intelligently.
- `application.properties` / `application.yml` is the central configuration file.
- The main class must be in the root package to ensure all beans are discovered.

## Next Module
Module 94 — Spring Boot: Building REST APIs, where you will create controllers, handle requests, and return JSON responses.
