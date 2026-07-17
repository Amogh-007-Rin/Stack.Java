import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Exercise3Solution {

    public static List<String> loadLines(String path) throws IOException {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        }
        return lines;
    }

    public static void main(String[] args) throws IOException {
        String tmp = "/tmp/exercise3-test.txt";
        try (java.io.PrintWriter w = new java.io.PrintWriter(tmp)) {
            w.println("First line");
            w.println("Second line");
            w.println("Third line");
        }
        List<String> lines = loadLines(tmp);
        System.out.println("Loaded " + lines.size() + " lines:");
        lines.forEach(System.out::println);
    }
}
