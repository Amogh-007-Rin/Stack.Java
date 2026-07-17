import java.io.*;

public class ThrowsKeywordDemo {
    public static void main(String[] args) {
        System.out.println("=== throws Keyword ===");

        try {
            processFile("data.txt");
        } catch (IOException e) {
            System.out.println("IOException propagated to main: " + e.getMessage());
        }

        try {
            validateAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException (unchecked): " + e.getMessage());
        }
    }

    static void processFile(String path) throws IOException {
        readContent(path);
    }

    static void readContent(String path) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        reader.close();
    }

    static void validateAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative: " + age);
        }
    }
}
