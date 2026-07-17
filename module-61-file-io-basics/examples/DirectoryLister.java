import java.io.File;

public class DirectoryLister {
    public static void main(String[] args) {
        File dir = new File("testdir/subdir");
        if (!dir.exists()) {
            boolean created = dir.mkdirs();
            System.out.println("Directories created: " + created);
        }

        File parent = new File("testdir");
        if (parent.isDirectory()) {
            File[] files = parent.listFiles();
            System.out.println("Contents of " + parent.getAbsolutePath() + ":");
            for (File f : files) {
                String type = f.isDirectory() ? "[DIR]" : "[FILE]";
                System.out.println("  " + type + " " + f.getName());
            }
        }

        // Cleanup
        deleteRecursive(parent);
        System.out.println("Cleaned up testdir");
    }

    private static void deleteRecursive(File file) {
        if (file.isDirectory()) {
            for (File child : file.listFiles()) {
                deleteRecursive(child);
            }
        }
        file.delete();
    }
}
