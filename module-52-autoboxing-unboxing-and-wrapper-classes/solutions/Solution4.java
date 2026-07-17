public class Solution4 {
    public static void main(String[] args) {
        int n = 1_000_000;

        long start = System.nanoTime();
        int sum1 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += i;
        }
        long primitiveTime = System.nanoTime() - start;

        start = System.nanoTime();
        Integer sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum2 += i;
        }
        long boxedTime = System.nanoTime() - start;

        System.out.println("Primitive sum: " + sum1 + " (" + primitiveTime / 1_000_000 + "ms)");
        System.out.println("Boxed sum:     " + sum2 + " (" + boxedTime / 1_000_000 + "ms)");
        System.out.printf("Ratio: %.1fx slower with boxing%n",
            (double) boxedTime / primitiveTime);
    }
}
