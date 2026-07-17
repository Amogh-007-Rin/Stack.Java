import java.util.*;

public class DequeDemo {
    public static void main(String[] args) {
        // Deque as Queue (FIFO)
        ArrayDeque<String> queue = new ArrayDeque<>();
        queue.addLast("First");
        queue.addLast("Second");
        queue.addLast("Third");
        System.out.println("As queue: " + queue);
        System.out.println("Poll: " + queue.pollFirst());

        // Deque as Stack (LIFO)
        ArrayDeque<String> stack = new ArrayDeque<>();
        stack.push("Bottom");
        stack.push("Middle");
        stack.push("Top");
        System.out.println("\nAs stack: " + stack);
        System.out.println("Pop: " + stack.pop());
        System.out.println("Remaining: " + stack);

        // Mixed operations
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.addFirst("Front");
        deque.addLast("Back");
        deque.addFirst("New Front");
        System.out.println("\nDeque: " + deque);
        System.out.println("First: " + deque.getFirst());
        System.out.println("Last: " + deque.getLast());
    }
}
