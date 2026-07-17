# Module 72: The Java HTTP Client

## Overview
Java 11 introduced `java.net.http.HttpClient` — a modern, feature-rich HTTP client that supports HTTP/2, WebSockets, and both synchronous and asynchronous requests. This module covers GET/POST requests, response handling, and JSON parsing (with string operations — no external libraries).

## Learning Objectives
- Create and configure an `HttpClient`
- Build `HttpRequest` objects with GET and POST methods
- Send requests synchronously (`send`) and asynchronously (`sendAsync`)
- Read and parse `HttpResponse` bodies as strings
- Compare with Python's `requests` and JavaScript's `fetch`

## Prerequisites
- Module 71 (networking basics helpful but not required)
- Familiarity with HTTP methods (GET, POST) and status codes

## Theory

### HttpClient Architecture
```java
HttpClient client = HttpClient.newHttpClient();
HttpRequest request = HttpRequest.newBuilder(URI.create(url)).build();
HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
```

### Synchronous vs Asynchronous
| Method | Behavior |
|--------|----------|
| `send(request, handler)` | Blocks until response received |
| `sendAsync(request, handler)` | Returns `CompletableFuture<HttpResponse>` — non-blocking |

### JSON Handling
Without external libraries, parse JSON manually using `String` methods (`indexOf`, `substring`, `split`), or use Java's built-in `javax.json` if available. For this module we use simple string parsing.

### Comparison

| Feature | Java HttpClient | Python `requests` | JS `fetch` |
|---------|----------------|-------------------|------------|
| Sync | `send()` | `requests.get()` | `await fetch()` |
| Async | `sendAsync()` | `requests.get()` (blocking) or `aiohttp` | `fetch()` returns Promise |
| Built-in | Yes (Java 11+) | Third-party but standard | Yes (browser) |

## Code Examples

### 01_HttpGetDemo
Synchronous GET request to a public API.

### 02_HttpPostDemo
Synchronous POST request with a JSON body.

### 03_AsyncHttpDemo
Non-blocking GET using `sendAsync` and `CompletableFuture`.

## Common Pitfalls
- **HTTP Client is heavy** — Create once and reuse; don't create a new `HttpClient` per request.
- **Blocking the main thread** — Use `sendAsync` for non-blocking in UI or server apps.
- **Not handling timeouts** — Set `connectTimeout` and `readTimeout` to avoid hanging.
- **Ignoring status codes** — Always check `response.statusCode()` before processing body.

## Exercises

See [exercises/README.md](exercises/README.md).

## Quiz

1. Which class is the entry point for making HTTP requests in Java 11+?
2. What does `sendAsync` return?
3. Which method on `HttpResponse` returns the status code?
4. True or False: `HttpClient` is immutable and thread-safe.
5. What is the body handler for reading the response as a String?

---
Answers: 1. `HttpClient`, 2. `CompletableFuture<HttpResponse>`, 3. `statusCode()`, 4. True, 5. `BodyHandlers.ofString()`

## Key Takeaways
- Java 11+ has a built-in HTTP client — no need for Apache HttpClient or OkHttp for basic needs.
- Use `send` for simple scripts; prefer `sendAsync` for reactive or concurrent code.
- Always check status codes and set timeouts.

## Next Module
Module 73 — Introduction to Build Tools (Maven and Gradle)
