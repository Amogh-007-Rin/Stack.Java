import java.io.IOException;
import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;

public class PhoneParser {
    /*
     * Parses a phone data string, in the following format:
     * 
     *     model screenSize batteryCapacity
     * 
     * The model name is encoded with underscores instead of spaces.
     */
    public static Phone parse(String data) {
        // TODO: parse the phone data string, and return a Phone object.
        // you may use string manipulation, a regex, or a Scanner
        if (data == null) {
            throw new IllegalArgumentException("input data is null");
        }
        String trimmed = data.trim();
        if (trimmed.isEmpty()) {
            throw new IllegalArgumentException("input data is empty");
        }
        String[] parts = trimmed.split("\\s+");
        if (parts.length != 3) {
            throw new IllegalArgumentException("expected 3 tokens (model screenSize battery) but got: " + trimmed);
        }
        String model = parts[0].replace('_', ' ');
        double screenSize;
        int battery;
        try {
            screenSize = Double.parseDouble(parts[1]);
            battery = Integer.parseInt(parts[2]);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("invalid numeric fields in: " + trimmed, e);
        }
        return new Phone(model, screenSize, battery);
    }
     
    /*
     * Returns a PhoneList by parsing a text file containing the phone data.
     */
    public static PhoneList parseFile(String filename) throws IOException {
        // TODO: create a PhoneList
        PhoneList list = new PhoneList();
        
        // TODO: create a BufferedReader to read from the file
        Path path = Paths.get(filename);
        try (BufferedReader br = Files.newBufferedReader(path)) {
            // TODO: for each line, parse it as a Phone and add it to the list 
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) continue;
                Phone p = parse(line);
                list.addPhone(p);
            }
        }
        
        return list;
    }
}
