import java.util.LinkedList;
import java.util.Queue;

// BAD: Inheritance for code reuse — fragile and misleading
class BadRecentQueue extends LinkedList<String> {
    public String getRecent() {
        return peekLast();
    }
    // Inherits add(), remove(), clear(), etc. — too much exposure!
}

// GOOD: Composition — encapsulate what you need
class RecentQueue {
    private final LinkedList<String> delegate = new LinkedList<>();
    private static final int MAX_SIZE = 10;

    void add(String item) {
        if (delegate.size() == MAX_SIZE) {
            delegate.removeFirst();
        }
        delegate.addLast(item);
    }

    String getRecent() {
        return delegate.peekLast();
    }

    int size() {
        return delegate.size();
    }
}

public class CompositionDemo {
    public static void main(String[] args) {
        RecentQueue recent = new RecentQueue();
        recent.add("Page 1");
        recent.add("Page 2");
        recent.add("Page 3");
        System.out.println("Most recent: " + recent.getRecent());
        System.out.println("Queue size: " + recent.size());

        System.out.println("\nWith composition the API surface is intentional.");
        System.out.println("With inheritance BadRecentQueue exposes all LinkedList methods.");
    }
}
