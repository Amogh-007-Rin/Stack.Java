public class PerformanceComparison {
    public static void main(String[] args) {
        int iterations = 50_000;

        long start = System.nanoTime();
        String result = "";
        for (int i = 0; i < iterations; i++) {
            result += "x";
        }
        long end = System.nanoTime();
        System.out.println("String + : " + (end - start) / 1_000_000 + " ms");

        start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append("x");
        }
        result = sb.toString();
        end = System.nanoTime();
        System.out.println("StringBuilder: " + (end - start) / 1_000_000 + " ms");

        start = System.nanoTime();
        StringBuffer sbuf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbuf.append("x");
        }
        result = sbuf.toString();
        end = System.nanoTime();
        System.out.println("StringBuffer : " + (end - start) / 1_000_000 + " ms");
    }
}
