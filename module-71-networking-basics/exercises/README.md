# Module 71 — Exercises

## Exercise 1: Uppercase Server
Modify the echo server so that it converts every received line to UPPERCASE before sending it back.

## Exercise 2: Quote Server
Write a server that:
1. Holds a list of 5 quotes (hardcoded)
2. When a client sends `"quote"`, responds with a random quote
3. When a client sends `"bye"`, disconnects

## Exercise 3: Date/Time Client
Write a client that:
1. Connects to a server on port 7779
2. Sends the string `"time"`
3. Receives and prints the current date and time from the server
Write the corresponding server that responds with `java.time.LocalDateTime.now()`.
