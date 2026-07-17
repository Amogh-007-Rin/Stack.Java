public class Exercise3 {
    public static void main(String[] args) {
        int a = 2_000_000_000;
        int b = 1_500_000_000;

        if (b > 0 && a > Integer.MAX_VALUE - b) {
            System.out.println("Overflow would occur!");
        } else {
            int sum = a + b;
            System.out.println("Sum: " + sum);
        }

        int c = 500_000_000;
        if (c > 0 && a > Integer.MAX_VALUE - c) {
            System.out.println("Overflow would occur!");
        } else {
            int sum2 = a + c;
            System.out.println("Sum: " + sum2);
        }
    }
}
