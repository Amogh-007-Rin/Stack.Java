# Module 94 — Exercises

## Exercise 1: Task REST Controller
Write a `@RestController` for managing tasks with:
- `GET /api/tasks` — list all tasks
- `GET /api/tasks/{id}` — get one task by ID
- `POST /api/tasks` — create a task (required fields: title, description)
- Use an in-memory `CopyOnWriteArrayList`
- Return 201 for creation, 404 for missing task
- Define a `Task` record with fields: `int id`, `String title`, `String description`, `boolean completed`

## Exercise 2: Query Parameter Filtering
Write a `@RestController` that:
- Stores a list of products (id, name, category, price)
- `GET /api/products` returns all products
- `GET /api/products?category=electronics` filters by category
- `GET /api/products?minPrice=50&maxPrice=200` filters by price range
- Support combining both filters

## Exercise 3: DTO with Validation Concepts
Write a standalone Java program (no Spring) that:
- Defines a `UserDto` record with `@NotBlank String name`, `@Email String email`, `@Min(18) int age`
- Define custom annotation stubs (`@NotBlank`, `@Email`, `@Min`)
- Implement a simple validator that checks each annotation and prints violations
- This simulates Spring's `@Valid` + Bean Validation
