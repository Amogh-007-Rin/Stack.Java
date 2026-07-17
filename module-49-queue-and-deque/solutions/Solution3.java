import java.util.*;

class Task implements Comparable<Task> {
    String description;
    int priority;  // 1 = highest

    Task(String description, int priority) {
        this.description = description;
        this.priority = priority;
    }

    @Override
    public int compareTo(Task other) {
        return Integer.compare(this.priority, other.priority);
    }

    @Override
    public String toString() {
        return "[P" + priority + "] " + description;
    }
}

public class Solution3 {
    public static void main(String[] args) {
        Queue<Task> tasks = new PriorityQueue<>();
        tasks.offer(new Task("Fix printer", 1));
        tasks.offer(new Task("Restock shelves", 3));
        tasks.offer(new Task("Process returns", 2));
        tasks.offer(new Task("Clean study area", 4));

        System.out.println("Processing tasks by priority:");
        while (!tasks.isEmpty()) {
            System.out.println("  " + tasks.poll());
        }
    }
}
