# Module 64 Exercises

## Exercise 1: Greeting Threads
Create two threads using both `Thread` subclass and `Runnable`. Each thread should print a greeting message with its name.

## Exercise 2: Countdown Timer
Write a program that starts a thread counting down from 10 to 1 with 1-second delays, printing each number and the thread name.

## Exercise 3: Counter Race
Create two threads that both increment a shared `int counter` 1000 times. Print the final value. (Observe the race condition — it will likely not be 2000.)

## Exercise 4: Daemon vs User
Write a program that starts a daemon thread (infinite loop printing dots) and a user thread (prints for 2 seconds then exits). Observe that the JVM exits when only the daemon remains.
