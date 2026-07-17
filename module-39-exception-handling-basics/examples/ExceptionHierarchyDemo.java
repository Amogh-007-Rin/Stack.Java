public class ExceptionHierarchyDemo {
    public static void main(String[] args) {
        System.out.println("=== Exception Hierarchy ===");

        System.out.println("Throwable is the root class.");
        System.out.println("  ├── Error (JVM-level, should not be caught)");
        System.out.println("  └── Exception (application-level)");
        System.out.println("       ├── RuntimeException (unchecked)");
        System.out.println("       └── Checked exceptions (e.g., IOException)");

        demonstrateRuntimeException();
        demonstrateCheckedException();
    }

    static void demonstrateRuntimeException() {
        try {
            int[] arr = new int[0];
            arr[1] = 42;
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getClass().getSimpleName());
        }
    }

    static void demonstrateCheckedException() {
        try {
            throw new Exception("This is a checked exception");
        } catch (Exception e) {
            System.out.println("Caught checked Exception: " + e.getMessage());
        }
    }
}
