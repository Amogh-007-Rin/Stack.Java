import java.io.*;
import java.util.zip.*;

public class MultipleResourcesDemo {
    public static void main(String[] args) {
        System.out.println("=== Multiple Resources ===");

        String data = "Multiple resources example data.";

        try (FileOutputStream fos = new FileOutputStream("data.txt");
             GZIPOutputStream gzos = new GZIPOutputStream(fos);
             DataOutputStream dos = new DataOutputStream(gzos)) {

            dos.writeUTF(data);
            System.out.println("Data written with multiple resources.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Resources closed automatically in reverse order.");
    }
}
