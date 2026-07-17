import java.io.File;
import java.util.Date;

public class FileInfoDemo {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java FileInfoDemo <path>");
            return;
        }

        File file = new File(args[0]);

        System.out.println("Path: " + file.getPath());
        System.out.println("Absolute path: " + file.getAbsolutePath());
        System.out.println("Exists: " + file.exists());
        System.out.println("Is file: " + file.isFile());
        System.out.println("Is directory: " + file.isDirectory());
        System.out.println("Can read: " + file.canRead());
        System.out.println("Can write: " + file.canWrite());
        System.out.println("Length: " + file.length() + " bytes");
        System.out.println("Last modified: " + new Date(file.lastModified()));
        System.out.println("Parent: " + file.getParent());
        System.out.println("Name: " + file.getName());
    }
}
