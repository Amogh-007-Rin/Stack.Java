# Module 71: Networking Basics

## Overview
This module introduces Java networking with `Socket` and `ServerSocket`. You will build a simple echo server, connect a client, and understand the difference between TCP and UDP.

## Learning Objectives
- Understand the client-server model
- Use `ServerSocket` to accept TCP connections
- Use `Socket` to communicate with a server
- Read/write data over a socket with `BufferedReader`/`PrintWriter`
- Handle multiple clients sequentially
- Distinguish TCP vs UDP and when to use each

## Prerequisites
- Java I/O streams (`InputStream`, `OutputStream`, `Reader`, `Writer`)
- Basic exception handling

## Theory

### TCP vs UDP
| Feature | TCP | UDP |
|---------|-----|-----|
| Connection | Connection-oriented | Connectionless |
| Reliability | Guaranteed delivery | Best-effort |
| Ordering | Ordered packets | No ordering |
| Use cases | HTTP, email, file transfer | Streaming, DNS, gaming |
| Java class | `Socket`, `ServerSocket` | `DatagramSocket` |

### Client-Server Flow
```
Server:  ServerSocket(port) → accept() → Socket → I/O → close()
Client:  Socket(host, port) → I/O → close()
```

### Handling Multiple Clients
The simplest approach: loop calling `accept()`, handle one client at a time (single-threaded). A production server would use threads or a thread pool.

## Code Examples

### 01_EchoServer
Listens on port 7777, reads a line from the client, sends it back.

### 02_EchoClient
Connects to localhost:7777, sends a message, prints the echoed response.

### 03_MultiClientServer
Same echo logic but loops to accept multiple clients sequentially.

## Common Pitfalls
- **Port already in use** — Choose ports above 1024; handle `BindException`.
- **Blocking calls** — `accept()`, `readLine()` block indefinitely. No timeout by default.
- **Not closing** — Always close sockets and streams in `finally` or try-with-resources.
- **Mismatched newline** — `readLine()` needs `\n` or `\r\n`; use `println` on the sending side.

## Exercises

See [exercises/README.md](exercises/README.md).

## Quiz

1. Which class listens for incoming TCP connections?
2. What method blocks until a client connects?
3. True or False: UDP guarantees packet delivery.
4. What is the minimum port number a non-root user can bind to on most OS?
5. Which stream class is convenient for reading lines of text from a socket?

---
Answers: 1. ServerSocket, 2. `accept()`, 3. False, 4. 1024, 5. `BufferedReader`

## Key Takeaways
- `ServerSocket.accept()` returns a `Socket` per client.
- Use `BufferedReader.readLine()` and `PrintWriter.println()` for text protocols.
- Single-threaded servers handle one client at a time; use threads for concurrency.

## Next Module
Module 72 — The Java HTTP Client (Java 11+ `java.net.http`)
