import java.io.*;

public class TryWithResourcesDemo {
    public static void main(String[] args) {
        System.out.println("=== Basic Try-With-Resources ===");

        String content = "Hello, try-with-resources!";
        String filename = "demo_output.txt";

        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(content);
            System.out.println("Written to file: " + filename);
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line = reader.readLine();
            System.out.println("Read from file: " + line);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
