import java.io.*;

public class Exercise3 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java Exercise3 <input> <output>");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]));
             PrintWriter writer = new PrintWriter(new FileWriter(args[1]))) {

            String line;
            int lineNumber = 1;
            while ((line = reader.readLine()) != null) {
                writer.println(lineNumber + ": " + line);
                lineNumber++;
            }
            System.out.println("Processed " + (lineNumber - 1) + " lines.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
