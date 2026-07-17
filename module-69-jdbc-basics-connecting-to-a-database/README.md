# Module 69: JDBC Basics — Connecting to a Database

## Overview
Java Database Connectivity (JDBC) is the standard Java API for connecting to relational databases. This module covers the core architecture: loading a driver, establishing a connection, executing queries, and processing results — all using H2 in-memory database for demonstration.

## Learning Objectives
- Understand JDBC architecture (DriverManager, Connection, Statement, ResultSet)
- Connect to a database using a JDBC URL
- Execute a simple SELECT query and process the ResultSet
- Understand how drivers are loaded (historical `Class.forName` vs modern auto-loading)
- Know where the H2 dependency JAR goes (or use Maven/Gradle in real projects)

## Prerequisites
- Basic Java (classes, exceptions, try-with-resources)
- Familiarity with SQL (SELECT, WHERE)

## Theory

### JDBC Architecture
```
Java App → JDBC API → DriverManager → Driver → Database
```

| Component     | Role |
|---------------|------|
| DriverManager | Manages registered drivers; hands out `Connection` objects |
| Connection    | Represents a session with the database |
| Statement     | Carries SQL to the database |
| ResultSet     | Iterable rows returned from a query |

### Connection URL Format (H2)
```
jdbc:h2:mem:testdb
```
`mem:` creates an in-memory database. Other schemes: `file:/path/to/db`, `tcp://host/name`.

### Loading the Driver
- **Historically (JDBC 3 and earlier):** `Class.forName("org.h2.Driver")`
- **Modern (JDBC 4+):** Auto-loading via `META-INF/services/java.sql.Driver` inside the JAR. No manual `Class.forName` needed — just having the JAR on the classpath is enough.

> **Note:** In real projects you never put JARs in the classpath manually. You use Maven or Gradle. The examples here use the classpath flag so you can run them without a build tool.

## Code Examples

### 01_DatabaseConnectionDemo
Shows the minimal code to open and close an H2 connection.

### 02_SimpleQueryDemo
Executes a SELECT and iterates the ResultSet.

### 03_DriverLoadingDemo
Demonstrates both the historical `Class.forName` approach and confirms the driver auto-loads.

## Common Pitfalls
- **Forgotten JAR** — If the H2 JAR is not on the classpath, `DriverManager.getConnection` throws `SQLException: No suitable driver`.
- **Not closing resources** — Always close `Connection`, `Statement`, `ResultSet`. Use try-with-resources.
- **Wrong URL format** — `jdbc:h2:~/test` defaults to the user home directory; `jdbc:h2:mem:` is in-memory only.

## Exercises

See [exercises/README.md](exercises/README.md).

## Quiz

1. Which interface represents a single database session?
2. What does `DriverManager.getConnection(url)` return?
3. True or False: JDBC 4+ still requires `Class.forName(...)` before every connection.
4. What is the H2 URL prefix for an in-memory database?
5. Which method moves the cursor to the next row in a ResultSet?

---
Answers: 1. Connection, 2. Connection, 3. False, 4. `jdbc:h2:mem:`, 5. `next()`

## Key Takeaways
- JDBC is a low-level, synchronous API for database access.
- The driver JAR must be on the classpath at runtime.
- Always use try-with-resources to guarantee cleanup.

## Next Module
Module 70 — JDBC CRUD Operations (PreparedStatement, transactions, batch updates)
