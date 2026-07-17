import java.util.Arrays;
import java.util.List;

/*
 * Intent: print each element of the list.
 * Bug: off-by-one error — iterates past the end of the array.
 */
public class BuggyLoopDemo {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("A", "B", "C");

        // BUG: should be items.size(), not items.size() + 1
        for (int i = 0; i <= items.size(); i++) {
            System.out.println("Item: " + items.get(i));
        }
    }
}
