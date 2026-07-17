public class AutoCloseableDemo {
    public static void main(String[] args) {
        System.out.println("=== Custom AutoCloseable Resource ===");

        try (CustomResource resource = new CustomResource("File #1")) {
            resource.process();
        } catch (Exception e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}

class CustomResource implements AutoCloseable {
    private final String name;

    public CustomResource(String name) {
        this.name = name;
        System.out.println("Opened resource: " + name);
    }

    public void process() {
        System.out.println("Processing " + name);
    }

    @Override
    public void close() {
        System.out.println("Closed resource: " + name);
    }
}
