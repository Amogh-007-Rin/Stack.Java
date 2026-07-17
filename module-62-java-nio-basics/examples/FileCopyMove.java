import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileCopyMove {
    public static void main(String[] args) {
        try {
            Path source = Paths.get("source.txt");
            Path target = Paths.get("backup/target.txt");
            Path moved = Paths.get("moved.txt");
            Path dir = Paths.get("backup");

            // Create directories
            Files.createDirectories(dir);
            System.out.println("Created directory: " + dir);

            // Create source file
            Files.write(source, "Hello from NIO.2".getBytes());
            System.out.println("Created source: " + source);

            // Copy file
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Copied to: " + target);

            // Move file
            Files.move(source, moved, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Moved to: " + moved);

            // Delete files and directory
            Files.deleteIfExists(moved);
            Files.deleteIfExists(target);
            Files.deleteIfExists(dir);
            System.out.println("Cleaned up");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
