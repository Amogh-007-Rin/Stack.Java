# Module 68 Exercises

## Exercise 1: Fetch and Transform
Use `supplyAsync` to simulate fetching a username from a remote service (delay 500ms, return "Alice"). Chain with `thenApply` to add a greeting prefix and print the result.

## Exercise 2: Async Pipeline
Create a three-stage async pipeline: fetch a number (1s delay), multiply by 2 (thenApply), then print the result (thenAccept).

## Exercise 3: Combine Two Services
Simulate fetching user data and user orders in parallel using `thenCombine`. Combine both results into a single summary string.

## Exercise 4: Error Recovery
Create a `supplyAsync` that randomly throws an exception. Use `exceptionally` to return a default value and `handle` to log both success and failure.

## Exercise 5: Wait for All
Use `allOf` to wait for 5 parallel async tasks, each returning a random number. Collect the results and compute the average.
