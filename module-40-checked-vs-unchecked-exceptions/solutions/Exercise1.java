import java.io.*;

public class Exercise1 {
    public static void main(String[] args) {
        try {
            String firstLine = readFirstLine(args[0]);
            System.out.println("First line: " + firstLine);
        } catch (IOException e) {
            System.out.println("File not found or cannot be read.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please provide a filename.");
        }
    }

    static String readFirstLine(String path) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line = reader.readLine();
        reader.close();
        return line;
    }
}
