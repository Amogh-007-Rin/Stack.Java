# Module 69 — Exercises

## Exercise 1: Connect and Validate
Write a program that connects to an H2 in-memory database `jdbc:h2:mem:company` and prints whether the connection is valid (timeout 3 seconds).

## Exercise 2: Create and Query a Table
Write a program that:
1. Creates a table `products (id INT, name VARCHAR(50), price DECIMAL(10,2))`
2. Inserts 3 rows
3. Queries and prints all rows where price > 10.00

## Exercise 3: Multi-Database URL
Write a program that attempts to connect to `jdbc:h2:mem:mydb` and `jdbc:h2:file:./testdb` (both). Print success/failure for each. Close all resources properly.
