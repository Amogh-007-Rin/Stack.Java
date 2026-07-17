import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;
import java.util.function.BiPredicate;

public class DirectoryWalk {
    public static void main(String[] args) {
        Path start = Paths.get(".");

        System.out.println("=== Files.walk (all entries) ===");
        try (Stream<Path> stream = Files.walk(start, 3)) {
            stream.filter(p -> p.toString().endsWith(".java"))
                  .forEach(p -> System.out.println("  " + p));
        } catch (IOException e) {
            System.out.println("Walk error: " + e.getMessage());
        }

        System.out.println("\n=== Files.find (Java files only) ===");
        BiPredicate<Path, BasicFileAttributes> matcher =
            (p, attrs) -> p.toString().endsWith(".java") && !attrs.isDirectory();

        try (Stream<Path> stream = Files.find(start, 3, matcher)) {
            stream.forEach(p -> System.out.println("  " + p));
        } catch (IOException e) {
            System.out.println("Find error: " + e.getMessage());
        }
    }
}
