import java.util.Arrays;

public class Exercise3Solution {
    public static void main(String[] args) {
        int[] a = {1, 4, 7};
        int[] b = {2, 5, 8};

        int[] merged = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) merged[i] = a[i];
        for (int i = 0; i < b.length; i++) merged[a.length + i] = b[i];

        Arrays.sort(merged);
        System.out.println(Arrays.toString(merged));
    }
}
