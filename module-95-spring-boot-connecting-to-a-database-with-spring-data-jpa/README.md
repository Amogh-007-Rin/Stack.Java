# Module 95: Spring Boot — Connecting to a Database with Spring Data JPA

## Overview
Spring Data JPA provides a repository abstraction over JPA (Java Persistence API), drastically reducing the amount of boilerplate needed for database access. Hibernate is the default JPA provider in Spring Boot. This module covers entity mapping, repository interfaces, and wiring everything together with a REST controller — all configured with an in-memory H2 database.

## Learning Objectives
- Define JPA entities with `@Entity`, `@Id`, `@GeneratedValue`
- Create repository interfaces extending `JpaRepository`
- Perform CRUD operations without writing SQL
- Configure H2 in-memory database in `application.properties`
- Understand `@Transactional` basics
- Build a full REST API backed by a database

## Prerequisites
- Module 94 (REST APIs)
- Module 69-70 (JDBC basics are helpful but not required)
- Basic SQL knowledge

## Theory

### JPA Entity
A POJO annotated with `@Entity`, mapped to a database table:

```java
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double price;
    // getters and setters
}
```

### JpaRepository
Spring Data JPA provides `JpaRepository<T, ID>` with built-in methods:
- `findAll()`, `findById(ID)`, `save(T)`, `deleteById(ID)`
- Custom query methods via method naming conventions (`findByName(String name)`)
- `@Query` for custom JPQL/SQL

### application.properties for H2
```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
spring.h2.console.enabled=true
```

### @Transactional
Spring manages database transactions automatically. `@Transactional` can be applied at the class or method level to define transaction boundaries. Spring Data JPA repositories are already transactional for write operations.

### Relationship Annotations
| Annotation | Purpose |
|---|---|
| `@OneToMany` / `@ManyToOne` | One-to-many/many-to-one relationship |
| `@ManyToMany` | Many-to-many relationship |
| `@JoinColumn` | Specifies the foreign key column |
| `@JsonIgnore` | Prevents infinite JSON recursion on bidirectional relationships |

## Code Examples

### Example 1: ProductEntity
A standalone JPA entity POJO showing annotations for table mapping.

### Example 2: ProductRepository
The repository interface showing standard CRUD and custom query methods.

### Example 3: ProductController
A REST controller that injects the repository and exposes CRUD endpoints.

## Common Pitfalls
- **Missing `@Id`** — Every entity must have a primary key.
- **No-arg constructor** — JPA requires a default (no-arg) constructor.
- **LazyInitializationException** — Accessing lazy-loaded collections outside a transaction. Use `@Transactional` or `FetchType.EAGER`.
- **Table/column name conflicts** — Use `@Table(name = "...")` and `@Column(name = "...")` when names differ.
- **Circular JSON serialization** — Use `@JsonIgnore` or DTOs for bidirectional relationships.
- **H2 console access** — Ensure `spring.h2.console.enabled=true` and path is set.

## Exercises
See [exercises/README.md](exercises/README.md).

## Quiz

1. Which annotation marks a class as a JPA entity?
   a) `@Table`
   b) `@Component`
   c) `@Entity`
   d) `@Repository`

2. Which interface provides built-in CRUD methods without implementation?
   a) `CrudRepository`
   b) `JpaRepository`
   c) `PagingAndSortingRepository`
   d) All of the above

3. What Hibernate DDL auto option creates tables on startup and updates them?
   a) `create`
   b) `update`
   c) `validate`
   d) `none`

4. True or False: `@GeneratedValue` is required for every entity field.

5. Which annotation prevents infinite JSON recursion in bidirectional JPA relationships?
   a) `@JsonBackReference`
   b) `@JsonIgnore`
   c) `@JsonManagedReference`
   d) Both a and c (Jackson-specific annotations)

---

**Answers**: 1-c, 2-d, 3-b, 4-False (only for auto-generated IDs), 5-b (also a/c in Jackson pair)

## Key Takeaways
- Spring Data JPA eliminates DAO boilerplate — `JpaRepository` provides standard CRUD.
- H2 is ideal for development and testing; switch to PostgreSQL/MySQL in production.
- Entity classes require `@Id`, a no-arg constructor, and getters/setters (or records with proper config).
- `@Transactional` manages transaction boundaries automatically.

## Next Module
Module 96 — Logging in Java, where you will learn to use SLF4J, Logback, and configure logging levels.
