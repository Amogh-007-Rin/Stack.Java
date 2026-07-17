import java.io.File;

public class DirectoryTreePrinter {
    public static void main(String[] args) {
        String rootPath = args.length > 0 ? args[0] : ".";
        File root = new File(rootPath);

        if (!root.exists()) {
            System.out.println("Path does not exist: " + rootPath);
            return;
        }

        printTree(root, "");
    }

    private static void printTree(File file, String indent) {
        System.out.println(indent + (file.isDirectory() ? "+ " : "- ") + file.getName());

        if (file.isDirectory()) {
            File[] children = file.listFiles();
            if (children != null) {
                for (File child : children) {
                    printTree(child, indent + "  ");
                }
            }
        }
    }
}
