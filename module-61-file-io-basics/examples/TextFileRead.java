import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextFileRead {
    public static void main(String[] args) {
        String filename = "sample.txt";

        // Create a sample file first
        try (java.io.PrintWriter pw = new java.io.PrintWriter(new java.io.FileWriter(filename))) {
            pw.println("Line 1: Hello, World!");
            pw.println("Line 2: Java File I/O");
            pw.println("Line 3: try-with-resources");
        } catch (IOException e) {
            System.out.println("Error creating sample file: " + e.getMessage());
            return;
        }

        System.out.println("Reading " + filename + " with BufferedReader:");

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            int lineNum = 1;
            while ((line = br.readLine()) != null) {
                System.out.println(lineNum + ": " + line);
                lineNum++;
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        // Cleanup
        new java.io.File(filename).delete();
    }
}
