import java.util.*;

public class Solution2 {
    public static void main(String[] args) {
        List<String> titles = List.of("Snow Crash", "Dune", "Neuromancer", "Foundation", "Altered Carbon");

        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        for (String t : titles) {
            hashSet.add(t);
            linkedHashSet.add(t);
            treeSet.add(t);
        }

        System.out.println("HashSet (no order):       " + hashSet);
        System.out.println("LinkedHashSet (insertion): " + linkedHashSet);
        System.out.println("TreeSet (sorted):          " + treeSet);
    }
}
