import java.io.*;

public class Exercise3 {
    public static void main(String[] args) {
        try {
            parseFile(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }

        if (args.length > 1) {
            int value = parseIntSafely(args[1]);
            System.out.println("Parsed int: " + value);
        }
    }

    static void parseFile(String path) throws FileNotFoundException {
        FileReader reader = new FileReader(path);
        System.out.println("File " + path + " opened successfully.");
    }

    static int parseIntSafely(String s) throws NumberFormatException {
        return Integer.parseInt(s);
    }
}
