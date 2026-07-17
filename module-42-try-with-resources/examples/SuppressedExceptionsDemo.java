public class SuppressedExceptionsDemo {
    public static void main(String[] args) {
        System.out.println("=== Suppressed Exceptions ===");

        try (FaultyResource res = new FaultyResource()) {
            throw new RuntimeException("Main exception in try block");
        } catch (RuntimeException e) {
            System.out.println("Main exception: " + e.getMessage());

            Throwable[] suppressed = e.getSuppressed();
            System.out.println("Suppressed exceptions: " + suppressed.length);
            for (Throwable t : suppressed) {
                System.out.println("  - " + t.getClass().getSimpleName() + ": " + t.getMessage());
            }
        }
    }
}

class FaultyResource implements AutoCloseable {
    public FaultyResource() {
        System.out.println("Resource opened.");
    }

    @Override
    public void close() {
        System.out.println("Resource closing...");
        throw new RuntimeException("Exception during close()");
    }
}
