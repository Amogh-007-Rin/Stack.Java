import java.util.*;

public class Solution4 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            numbers.add(i);
        }
        System.out.println("Before: " + numbers);

        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            int n = it.next();
            if (n % 3 != 0) {
                it.remove();
            }
        }
        System.out.println("After (multiples of 3): " + numbers);
    }
}
