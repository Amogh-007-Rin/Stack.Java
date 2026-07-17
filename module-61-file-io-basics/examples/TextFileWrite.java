import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TextFileWrite {
    public static void main(String[] args) {
        String filename = "output.txt";

        // Write using BufferedWriter
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            bw.write("Hello from BufferedWriter");
            bw.newLine();
            bw.write("Line 2");
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Error writing with BufferedWriter: " + e.getMessage());
            return;
        }

        // Append using PrintWriter
        try (PrintWriter pw = new PrintWriter(new FileWriter(filename, true))) {
            pw.println("Appended line 3");
            pw.println("Appended line 4");
            pw.printf("Formatted: %d + %d = %d%n", 2, 3, 2 + 3);
        } catch (IOException e) {
            System.out.println("Error appending with PrintWriter: " + e.getMessage());
            return;
        }

        // Read back and print
        try (java.io.BufferedReader br = new java.io.BufferedReader(new java.io.FileReader(filename))) {
            System.out.println("Contents of " + filename + ":");
            br.lines().forEach(l -> System.out.println("  " + l));
        } catch (IOException e) {
            System.out.println("Error reading back: " + e.getMessage());
        }

        new java.io.File(filename).delete();
    }
}
