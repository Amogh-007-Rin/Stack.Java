import java.util.*;

public class Solution2 {
    public static void main(String[] args) {
        List<Integer> ratings = new ArrayList<>(List.of(5, 4, 5, 3, 5, 2, 4, 3, 5, 4));
        System.out.println("Ratings: " + ratings);

        int max = Collections.max(ratings);
        int min = Collections.min(ratings);
        int freq5 = Collections.frequency(ratings, 5);
        int freq3 = Collections.frequency(ratings, 3);

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Count of 5: " + freq5);
        System.out.println("Count of 3: " + freq3);
    }
}
