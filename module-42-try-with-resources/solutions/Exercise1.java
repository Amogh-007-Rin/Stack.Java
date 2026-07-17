import java.io.*;

public class Exercise1 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java Exercise1 <source> <destination>");
            return;
        }

        try (FileInputStream fis = new FileInputStream(args[0]);
             FileOutputStream fos = new FileOutputStream(args[1])) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
            System.out.println("File copied from " + args[0] + " to " + args[1]);
        } catch (IOException e) {
            System.out.println("Error copying file: " + e.getMessage());
        }
    }
}
