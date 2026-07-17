public class ArithmeticRelationalLogical {
    public static void main(String[] args) {
        int a = 10, b = 3;

        System.out.println("Arithmetic:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        System.out.println("\nRelational:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b:  " + (a > b));
        System.out.println("a < b:  " + (a < b));

        System.out.println("\nLogical (short-circuit):");
        System.out.println("a > 0 && b > 0: " + (a > 0 && b > 0));

        boolean obj = true;
        boolean result = obj && (a++ > 0);  // short-circuit: a++ NOT evaluated
        System.out.println("After short-circuit: a = " + a + " (not incremented)");

        boolean result2 = obj & (b++ > 0);  // non-short-circuit: b++ evaluated
        System.out.println("After non-short-circuit: b = " + b + " (incremented)");
    }
}
