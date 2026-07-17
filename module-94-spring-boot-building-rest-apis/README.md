# Module 94: Spring Boot — Building REST APIs

## Overview
Spring Boot makes building RESTful web services straightforward using annotation-driven controllers. This module covers the key annotations for defining endpoints, handling request data, and returning JSON responses. Spring Boot's embedded web server (Tomcat by default) and auto-configured Jackson support eliminate most boilerplate.

## Learning Objectives
- Create REST controllers with `@RestController`
- Map HTTP requests using `@RequestMapping`, `@GetMapping`, `@PostMapping`
- Extract data with `@RequestParam`, `@PathVariable`, `@RequestBody`
- Understand HTTP methods and their corresponding status codes
- Return JSON responses (auto-serialized by Jackson)
- Test endpoints with `curl`

## Prerequisites
- Module 93 (Spring Boot setup)
- Basic HTTP knowledge (GET, POST, status codes)
- JSON fundamentals

## Theory

### Key Annotations

| Annotation | Purpose |
|---|---|
| `@RestController` | Combines `@Controller` + `@ResponseBody` — returns data directly, not views |
| `@RequestMapping` | Class-level or method-level URL mapping |
| `@GetMapping` | Shortcut for `@RequestMapping(method = GET)` |
| `@PostMapping` | Shortcut for `@RequestMapping(method = POST)` |
| `@PutMapping` | Shortcut for `@RequestMapping(method = PUT)` |
| `@DeleteMapping` | Shortcut for `@RequestMapping(method = DELETE)` |
| `@RequestParam` | Binds a query parameter (`?name=value`) to a method parameter |
| `@PathVariable` | Binds a URI template variable (`/users/{id}`) |
| `@RequestBody` | Deserializes the HTTP request body into a Java object |

### HTTP Methods and Status Codes
| Method | Common Status | Usage |
|--------|---------------|-------|
| GET | 200 OK | Retrieve resources |
| POST | 201 Created | Create resources |
| PUT | 200 OK | Update resources |
| DELETE | 204 No Content | Delete resources |

### JSON Serialization
Spring Boot auto-configures **Jackson** (via `spring-boot-starter-web`). Any object returned from a `@RestController` method is automatically serialized to JSON. Jackson uses getters to determine property names.

```java
@GetMapping("/user")
public User getUser() {
    return new User("Alice", "alice@example.com");
}
// Response: {"name":"Alice","email":"alice@example.com"}
```

### Sample curl Commands
```bash
# GET request
curl http://localhost:8080/api/items

# POST with JSON body
curl -X POST http://localhost:8080/api/items \
  -H "Content-Type: application/json" \
  -d '{"name":"New Item","price":9.99}'

# GET with path variable
curl http://localhost:8080/api/items/1
```

## Code Examples

### Example 1: SimpleRestController
A minimal REST controller with GET and POST endpoints using an in-memory list.

### Example 2: RequestParamAndPathVariableDemo
Shows various ways to extract data from the request URL.

### Example 3: JSONSerializationDemo
A standalone demo showing how Jackson serializes Java objects (no Spring required).

## Common Pitfalls
- **Missing `@ResponseBody` on `@Controller`** — Use `@RestController` instead to avoid this.
- **Jackson infinite recursion** — Bidirectional relationships need `@JsonIgnore` or `@JsonManagedReference`.
- **Wrong content type** — POST endpoints expecting JSON must have `Content-Type: application/json` header.
- **Not handling empty bodies** — `@RequestBody` can be annotated with `@Nullable` or use `Optional`.

## Exercises
See [exercises/README.md](exercises/README.md).

## Quiz

1. Which annotation combines `@Controller` and `@ResponseBody`?
   a) `@Component`
   b) `@Service`
   c) `@RestController`
   d) `@WebController`

2. Which annotation extracts a value from `/users/{id}`?
   a) `@RequestParam`
   b) `@PathVariable`
   c) `@RequestBody`
   d) `@RequestAttribute`

3. What HTTP status code should a POST endpoint return on successful creation?
   a) 200 OK
   b) 201 Created
   c) 204 No Content
   d) 301 Moved

4. True or False: Jackson is automatically configured when `spring-boot-starter-web` is on the classpath.

5. Which annotation maps only HTTP POST requests to a method?
   a) `@GetMapping`
   b) `@PostMapping`
   c) `@PutMapping`
   d) `@RequestMapping(method = POST)`

---

**Answers**: 1-c, 2-b, 3-b, 4-True, 5-b (d also works but b is the preferred shortcut)

## Key Takeaways
- `@RestController` is the foundation for building REST APIs in Spring Boot.
- Use `@GetMapping`, `@PostMapping`, etc. for concise endpoint definitions.
- `@RequestParam`, `@PathVariable`, and `@RequestBody` handle incoming data.
- Jackson serialization happens automatically with `spring-boot-starter-web`.

## Next Module
Module 95 — Spring Boot: Connecting to a Database with Spring Data JPA, where you will learn to persist data using JPA entities, repositories, and H2.
