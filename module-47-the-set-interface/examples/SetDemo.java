import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Dune");
        hashSet.add("Neuromancer");
        hashSet.add("Snow Crash");
        hashSet.add("Dune");  // duplicate ignored
        System.out.println("HashSet (no order): " + hashSet);

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Dune");
        linkedHashSet.add("Neuromancer");
        linkedHashSet.add("Snow Crash");
        System.out.println("LinkedHashSet (insertion order): " + linkedHashSet);

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Dune");
        treeSet.add("Neuromancer");
        treeSet.add("Snow Crash");
        System.out.println("TreeSet (sorted): " + treeSet);
    }
}
