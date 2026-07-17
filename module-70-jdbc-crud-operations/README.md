# Module 70: JDBC CRUD Operations

## Overview
Building on Module 69, this module covers safe and efficient database manipulation: parameterized queries with `PreparedStatement`, executing INSERT/UPDATE/DELETE, managing transactions, and batch updates.

## Learning Objectives
- Use `PreparedStatement` with parameter placeholders (`?`)
- Prevent SQL injection via parameterized queries
- Perform INSERT, UPDATE, DELETE with `executeUpdate`
- Control transactions with `setAutoCommit`, `commit`, `rollback`
- Execute batch updates for performance
- Compare `Statement` vs `PreparedStatement`

## Prerequisites
- Module 69 (Connection, Statement, ResultSet)
- SQL INSERT, UPDATE, DELETE syntax

## Theory

### PreparedStatement — Why?
`Statement` concatenates user input into SQL strings — a SQL injection risk. `PreparedStatement` uses `?` placeholders and sends values separately, so malicious input is never interpreted as SQL.

```java
// UNSAFE — never do this
stmt.executeQuery("SELECT * FROM users WHERE name = '" + userInput + "'");

// SAFE
PreparedStatement ps = conn.prepareStatement("SELECT * FROM users WHERE name = ?");
ps.setString(1, userInput);
```

### executeUpdate
Returns the number of rows affected:
```java
int rows = ps.executeUpdate();  // for INSERT, UPDATE, DELETE
```

### Transaction Management
By default each SQL is auto-committed. For atomic multi-step operations:
```java
conn.setAutoCommit(false);
try {
    // multiple statements
    conn.commit();
} catch (SQLException e) {
    conn.rollback();
}
```

### Batch Updates
Send many statements in one network round-trip:
```java
ps.addBatch();
int[] results = ps.executeBatch();
```

## Code Examples

### 01_PreparedStatementDemo
Safe INSERT and query with parameters.

### 02_TransactionDemo
Atomic transfer — debit one account, credit another, rollback on failure.

### 03_BatchUpdateDemo
Insert 1000 rows in a batch.

## Common Pitfalls
- **Index starts at 1** — `ps.setXxx(1, value)`, not 0.
- **Forgetting `executeBatch()`** — `addBatch` queues; nothing happens until `executeBatch`.
- **Not rolling back on error** — Without `rollback`, partial changes remain even after an exception.
- **Mixing Statement and PreparedStatement** — Choose one; `PreparedStatement` is almost always better.

## Exercises

See [exercises/README.md](exercises/README.md).

## Quiz

1. Which interface should you use to prevent SQL injection?
2. What does `executeUpdate` return for an INSERT statement?
3. Which method sets the start of a manual transaction?
4. What happens if you forget to call `commit()` after `setAutoCommit(false)`?
5. Write the method signature for adding a batch entry.

---
Answers: 1. PreparedStatement, 2. number of rows inserted, 3. `conn.setAutoCommit(false)`, 4. Changes are lost (rolled back on close), 5. `addBatch()`

## Key Takeaways
- `PreparedStatement` is safer and often faster than `Statement`.
- Transactions ensure atomicity — all-or-nothing.
- Batch updates drastically reduce network overhead.

## Next Module
Module 71 — Networking Basics (Socket, ServerSocket, client-server model)
