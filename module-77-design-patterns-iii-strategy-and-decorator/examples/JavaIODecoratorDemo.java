import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class JavaIODecoratorDemo {

    public static void main(String[] args) {
        String filename = "JavaIODecoratorDemo.java";

        System.out.println("=== Reading with BufferedReader ===");
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        System.out.println("=== Reading with LineNumberReader ===");
        try (LineNumberReader reader = new LineNumberReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(reader.getLineNumber() + ": " + line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
