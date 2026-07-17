# Module 95 — Exercises

## Exercise 1: Customer Entity
Write a JPA entity class `Customer` with:
- `Long id` (auto-generated)
- `String name` (not null)
- `String email` (unique)
- `LocalDate signupDate`
- Include required JPA annotations, no-arg constructor, getters/setters
- Write a standalone demo that creates instances and prints them (no JPA JAR needed)

## Exercise 2: Customer Repository
Write a `CustomerRepository` interface extending `JpaRepository` with these custom methods:
- `findByEmail(String email)` — returns `Optional<Customer>`
- `findByNameContaining(String keyword)` — returns `List<Customer>`
- `countBySignupDateAfter(LocalDate date)` — returns `long`

## Exercise 3: Full REST Controller
Write a `CustomerController` that:
- Injects `CustomerRepository` via constructor
- `GET /api/customers` — list all
- `GET /api/customers/{id}` — get by ID (404 if missing)
- `POST /api/customers` — create (201)
- `PUT /api/customers/{id}` — update (200 or 404)
- `DELETE /api/customers/{id}` — delete (204)
- `GET /api/customers/search?email=...` — find by email
