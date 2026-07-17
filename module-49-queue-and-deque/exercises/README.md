# Module 49 Exercises: Queue and Deque

## Exercise 1: Library Print Queue
Simulate a print queue using Queue<String>. Add 5 document names. Print each one (poll) in FIFO order. Show the queue becoming empty.

## Exercise 2: Undo Stack with Deque
Use ArrayDeque as a stack (LIFO) to simulate an undo feature. Push 3 actions ("Add book", "Remove book", "Edit title"), then pop 2 (undo), showing the remaining action.

## Exercise 3: Priority Task Queue
Use PriorityQueue to manage library tasks by priority (1 = highest). Create a Task class with description and priority. Add 4 tasks with different priorities and process them in priority order.

## Exercise 4: Bounded Queue
Implement a simple bounded queue using ArrayDeque with a max size of 3. When adding a 4th element to the back, remove the front element first. Print the state after each operation.
