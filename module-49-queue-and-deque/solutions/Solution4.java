import java.util.*;

public class Solution4 {
    public static void main(String[] args) {
        int maxSize = 3;
        ArrayDeque<String> queue = new ArrayDeque<>();

        String[] items = {"A", "B", "C", "D"};
        for (String item : items) {
            if (queue.size() == maxSize) {
                String removed = queue.removeFirst();
                System.out.println("Queue full, removed: " + removed);
            }
            queue.addLast(item);
            System.out.println("After add " + item + ": " + queue);
        }
    }
}
