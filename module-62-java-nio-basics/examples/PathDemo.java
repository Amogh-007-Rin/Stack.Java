import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {
    public static void main(String[] args) {
        Path p1 = Paths.get("/home/user/docs/file.txt");
        Path p2 = Paths.get("docs", "file.txt");
        Path p3 = Paths.get(".").toAbsolutePath().normalize();

        System.out.println("p1: " + p1);
        System.out.println("  File name: " + p1.getFileName());
        System.out.println("  Parent: " + p1.getParent());
        System.out.println("  Root: " + p1.getRoot());
        System.out.println("  Name count: " + p1.getNameCount());

        for (int i = 0; i < p1.getNameCount(); i++) {
            System.out.println("  Name[" + i + "]: " + p1.getName(i));
        }

        System.out.println();
        System.out.println("p2: " + p2);
        System.out.println("p3 (absolute normalized): " + p3);

        Path resolved = p3.resolve("subdir").resolve("data.txt");
        System.out.println("Resolved: " + resolved);

        Path relativized = p3.relativize(resolved);
        System.out.println("Relativized: " + relativized);
    }
}
