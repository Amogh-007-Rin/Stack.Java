import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResourcesDemo {

    // BAD: manual close in finally — verbose and error-prone
    static String readOldWay(String path) throws IOException {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(path));
            return br.readLine();
        } finally {
            if (br != null) {
                br.close();
            }
        }
    }

    // GOOD: try-with-resources — auto-closed, concise
    static String readNewWay(String path) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        }
    }

    // Multiple resources
    static void copy(String src, String dest) throws IOException {
        try (BufferedReader in = new BufferedReader(new FileReader(src));
             BufferedWriter out = new BufferedWriter(new FileWriter(dest))) {
            String line;
            while ((line = in.readLine()) != null) {
                out.write(line);
                out.newLine();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        String tmp = "/tmp/try-with-resources-test.txt";
        try (BufferedWriter w = new BufferedWriter(new FileWriter(tmp))) {
            w.write("Hello from try-with-resources!");
        }

        String content = readNewWay(tmp);
        System.out.println("Read back: " + content);

        copy(tmp, tmp + ".bak");
        System.out.println("Copied successfully");
    }
}
