import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class JavaFileFinder {
    public static void main(String[] args) {
        Path start = args.length > 0 ? Paths.get(args[0]) : Paths.get(".");

        if (!Files.isDirectory(start)) {
            System.out.println("Not a directory: " + start);
            return;
        }

        try (Stream<Path> stream = Files.walk(start)) {
            stream.filter(p -> p.toString().endsWith(".java"))
                  .map(Path::toAbsolutePath)
                  .forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
