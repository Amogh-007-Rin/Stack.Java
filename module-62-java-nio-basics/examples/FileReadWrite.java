import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class FileReadWrite {
    public static void main(String[] args) {
        Path file = Paths.get("nio_sample.txt");

        try {
            List<String> lines = Arrays.asList(
                "Line 1: NIO.2 makes file I/O easy",
                "Line 2: No need for BufferedReader",
                "Line 3: readAllLines returns a List"
            );
            Files.write(file, lines);
            System.out.println("Wrote " + lines.size() + " lines to " + file);

            List<String> readBack = Files.readAllLines(file);
            System.out.println("Read back:");
            for (int i = 0; i < readBack.size(); i++) {
                System.out.println("  " + (i + 1) + ": " + readBack.get(i));
            }

            Files.delete(file);
            System.out.println("Deleted " + file);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
