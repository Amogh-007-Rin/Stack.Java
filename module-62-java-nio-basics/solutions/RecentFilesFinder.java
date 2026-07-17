import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.Instant;
import java.util.function.BiPredicate;
import java.util.stream.Stream;

public class RecentFilesFinder {
    public static void main(String[] args) {
        Path start = args.length > 0 ? Paths.get(args[0]) : Paths.get(".");
        Instant cutoff = Instant.now().minusSeconds(24 * 60 * 60);

        BiPredicate<Path, BasicFileAttributes> matcher =
            (p, attrs) -> {
                if (attrs.isDirectory()) return false;
                return attrs.lastModifiedTime().toInstant().isAfter(cutoff);
            };

        try (Stream<Path> stream = Files.find(start, Integer.MAX_VALUE, matcher)) {
            stream.forEach(p -> {
                try {
                    BasicFileAttributes attrs = Files.readAttributes(p, BasicFileAttributes.class);
                    System.out.println(p + " (modified: " + attrs.lastModifiedTime() + ")");
                } catch (IOException e) {
                    System.out.println(p);
                }
            });
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
