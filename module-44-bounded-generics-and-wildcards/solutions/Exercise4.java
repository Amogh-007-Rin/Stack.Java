import java.util.*;

public class Exercise4 {
    public static void main(String[] args) {
        List<Integer> source = List.of(10, 20, 30, 40, 50);
        List<Object> dest = new ArrayList<>();

        copyFirstN(source, dest, 3);
        System.out.println("Copied first 3: " + dest);

        dest.clear();
        copyFirstN(source, dest, 5);
        System.out.println("Copied all 5: " + dest);
    }

    static <T> void copyFirstN(List<? extends T> source, List<? super T> dest, int n) {
        int count = 0;
        for (T item : source) {
            if (count >= n) break;
            dest.add(item);
            count++;
        }
    }
}
