import java.util.*;

public class Exercise4 {
    public static void main(String[] args) {
        Counter<String> stringCounter = new Counter<>();
        stringCounter.add("apple");
        stringCounter.add("banana");
        stringCounter.add("apple");
        System.out.println("String count: " + stringCounter.getCount());

        Counter<Integer> intCounter = new Counter<>();
        intCounter.add(1);
        intCounter.add(2);
        intCounter.add(1);
        intCounter.add(3);
        System.out.println("Integer count: " + intCounter.getCount());
    }
}

class Counter<T> {
    private final List<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
    }

    public int getCount() {
        return items.size();
    }
}
