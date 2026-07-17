import java.util.*;

public class Solution3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list.getClass().getSimpleName() + " size=" + list.size());

        Set<String> hashSet = new HashSet<>();
        hashSet.add("X");
        hashSet.add("Y");
        hashSet.add("Z");
        System.out.println(hashSet.getClass().getSimpleName() + " size=" + hashSet.size());

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("M");
        treeSet.add("N");
        treeSet.add("O");
        System.out.println(treeSet.getClass().getSimpleName() + " size=" + treeSet.size());

        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        System.out.println(map.getClass().getSimpleName() + " size=" + map.size());

        System.out.println("map instanceof Collection: " + (map instanceof Collection));
    }
}
