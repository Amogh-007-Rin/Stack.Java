import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.stream.Stream;

public class DirectoryCopy {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java DirectoryCopy <source> <target>");
            return;
        }

        Path source = Paths.get(args[0]);
        Path target = Paths.get(args[1]);

        if (!Files.isDirectory(source)) {
            System.out.println("Source must be a directory");
            return;
        }

        try (Stream<Path> stream = Files.walk(source)) {
            stream.forEach(src -> {
                Path dst = target.resolve(source.relativize(src));
                try {
                    if (Files.isDirectory(src)) {
                        Files.createDirectories(dst);
                    } else {
                        Files.copy(src, dst, StandardCopyOption.REPLACE_EXISTING);
                    }
                } catch (IOException e) {
                    System.out.println("Error copying " + src + ": " + e.getMessage());
                }
            });
            System.out.println("Copied from " + source + " to " + target);
        } catch (IOException e) {
            System.out.println("Error walking source: " + e.getMessage());
        }
    }
}
