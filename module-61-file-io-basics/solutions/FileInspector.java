import java.io.File;

public class FileInspector {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java FileInspector <path>");
            return;
        }

        File file = new File(args[0]);

        if (!file.exists()) {
            System.out.println("Path does not exist: " + args[0]);
            return;
        }

        System.out.println("Name: " + file.getName());
        System.out.println("Type: " + (file.isFile() ? "File" : "Directory"));

        if (file.isFile()) {
            System.out.println("Size: " + file.length() + " bytes");
        } else {
            File[] children = file.listFiles();
            System.out.println("Entries: " + (children != null ? children.length : 0));
        }
    }
}
