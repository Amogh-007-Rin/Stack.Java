import java.util.*;

public class DiamondOperatorDemo {
    public static void main(String[] args) {
        System.out.println("=== Diamond Operator ===");

        // Before Java 7 (verbose):
        Map<String, List<Integer>> oldMap = new HashMap<String, List<Integer>>();

        // With diamond operator (Java 7+):
        Map<String, List<Integer>> newMap = new HashMap<>();

        // Works with custom generic classes too:
        Pair<String, Integer> pair = new Pair<>("Age", 30);
        System.out.println("Key: " + pair.getKey() + ", Value: " + pair.getValue());

        // Nested generics:
        List<DiamondBox<String>> boxList = new ArrayList<>();
        boxList.add(new DiamondBox<>());
        boxList.get(0).set("Nested generic");

        System.out.println("DiamondBox content: " + boxList.get(0).get());
    }
}

class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() { return key; }
    public V getValue() { return value; }
}

class DiamondBox<T> {
    private T content;

    public void set(T content) {
        this.content = content;
    }

    public T get() {
        return content;
    }
}
