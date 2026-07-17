public class Exercise4 {
    public static void main(String[] args) {
        try (DatabaseConnection conn = new DatabaseConnection()) {
            System.out.println("Executing query...");
            throw new RuntimeException("Query execution failed");
        } catch (RuntimeException e) {
            System.out.println("Main exception: " + e.getMessage());

            Throwable[] suppressed = e.getSuppressed();
            System.out.println("Number of suppressed: " + suppressed.length);
            for (Throwable t : suppressed) {
                System.out.println("  Suppressed: " + t.getClass().getSimpleName()
                    + " - " + t.getMessage());
            }
        }
    }
}

class DatabaseConnection implements AutoCloseable {
    public DatabaseConnection() {
        System.out.println("Database connection opened.");
    }

    @Override
    public void close() {
        System.out.println("Closing database connection...");
        throw new RuntimeException("Connection close failed");
    }
}
