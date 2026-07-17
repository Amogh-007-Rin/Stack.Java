import java.io.*;

public class CheckedExceptionDemo {
    public static void main(String[] args) {
        System.out.println("=== Handling Checked Exception with try-catch ===");
        try {
            readFile("nonexistent.txt");
        } catch (IOException e) {
            System.out.println("Caught checked exception: " + e.getMessage());
        }
        System.out.println("Program continues.");
    }

    static void readFile(String path) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        System.out.println(reader.readLine());
        reader.close();
    }
}
