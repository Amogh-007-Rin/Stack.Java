import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        Queue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.offer(30);
        priorityQueue.offer(10);
        priorityQueue.offer(20);

        System.out.println("PriorityQueue (natural order):");
        while (!priorityQueue.isEmpty()) {
            System.out.println("  " + priorityQueue.poll());
        }

        // Custom order: longest book first
        Queue<String> byLength = new PriorityQueue<>(
            (a, b) -> Integer.compare(b.length(), a.length())
        );
        byLength.offer("Dune");
        byLength.offer("Neuromancer");
        byLength.offer("It");

        System.out.println("\nBy length (longest first):");
        while (!byLength.isEmpty()) {
            System.out.println("  " + byLength.poll());
        }
    }
}
