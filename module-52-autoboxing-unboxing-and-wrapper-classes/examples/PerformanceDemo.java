public class PerformanceDemo {
    public static void main(String[] args) {
        int iterations = 10_000_000;

        // Primitive loop
        long start = System.nanoTime();
        int primitiveSum = 0;
        for (int i = 0; i < iterations; i++) {
            primitiveSum += i;
        }
        long primitiveTime = System.nanoTime() - start;
        System.out.println("Primitive sum: " + primitiveSum + " (" + primitiveTime / 1_000_000 + "ms)");

        // Boxed loop (with autoboxing)
        start = System.nanoTime();
        Integer boxedSum = 0;
        for (int i = 0; i < iterations; i++) {
            boxedSum += i;  // unbox + add + autobox each iteration
        }
        long boxedTime = System.nanoTime() - start;
        System.out.println("Boxed sum: " + boxedSum + " (" + boxedTime / 1_000_000 + "ms)");

        double slowdown = (double) boxedTime / primitiveTime;
        System.out.printf("Boxed version is %.1fx slower%n", slowdown);
    }
}
