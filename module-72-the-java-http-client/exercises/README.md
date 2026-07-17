# Module 72 — Exercises

## Exercise 1: GET with Query Parameters
Write a program that sends a GET request to `https://httpbin.org/get?foo=bar&baz=qux` and prints the `"args"` portion of the JSON response (just print the full body, then highlight args by printing the substring between `"args"` and the next `,`).

## Exercise 2: POST JSON and Parse Response
Write a program that POSTs this JSON: `{"username": "testuser", "password": "secret123"}`
to `https://httpbin.org/post`. Parse the response body to extract the `"json"` field (by searching for `"json":` and extracting the value between `{` and `}` that follows).

## Exercise 3: Multiple Async Requests
Write a program that sends 3 concurrent async GET requests to `https://httpbin.org/get`, waits for all of them using `CompletableFuture.allOf`, and prints each response status code.
