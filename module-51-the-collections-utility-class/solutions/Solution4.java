import java.util.*;

public class Solution4 {
    public static void main(String[] args) {
        List<String> mutable = new ArrayList<>(List.of("A", "B", "C"));
        List<String> view = Collections.unmodifiableList(mutable);

        System.out.println("View: " + view);

        try {
            view.add("D");
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot modify view: " + e);
        }

        mutable.add("D");
        System.out.println("After mutable.add: mutable=" + mutable + " view=" + view);
    }
}
