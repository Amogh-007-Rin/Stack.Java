# Module 70 — Exercises

## Exercise 1: Parameterized Update
Write a program that:
1. Creates a table `employees (id INT, salary DECIMAL(10,2))`
2. Inserts 3 employees
3. Uses `PreparedStatement` to give a 10% raise to an employee specified by ID
4. Queries and prints the updated salary

## Exercise 2: Order Transaction
Write a program that simulates placing an order:
1. Tables: `orders (id INT, total DECIMAL(10,2))` and `inventory (item VARCHAR(50), qty INT)`
2. When an order is placed, insert into orders and decrement inventory
3. If inventory is insufficient (qty < 0 after decrement), roll back
4. Always commit only on success

## Exercise 3: Batch Delete
Write a program that:
1. Creates a table `sessions (id INT, active BOOLEAN)`
2. Inserts 100 rows (some active, some inactive)
3. Uses batch updates to delete all inactive sessions in a single batch
