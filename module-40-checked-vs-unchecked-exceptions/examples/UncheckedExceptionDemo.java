public class UncheckedExceptionDemo {
    public static void main(String[] args) {
        System.out.println("=== Unchecked (Runtime) Exceptions ===");
        System.out.println("Compiler does NOT require handling these.");

        String str = null;
        Object[] arr = new String[2];

        try {
            str.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }

        try {
            int x = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }

        System.out.println("Program continues.");
    }
}
