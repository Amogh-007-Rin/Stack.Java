import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextFileFilter {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java TextFileFilter <file> <word>");
            return;
        }

        String filename = args[0];
        String word = args[1];

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains(word)) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
