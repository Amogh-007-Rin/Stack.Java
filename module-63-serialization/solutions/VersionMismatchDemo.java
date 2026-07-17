import java.io.*;

class VersionedData implements Serializable {
    private static final long serialVersionUID = 2L;

    private String name;
    private int value;
    private String extraField; // added after serialization

    public VersionedData(String name, int value) {
        this.name = name;
        this.value = value;
        this.extraField = "default";
    }

    @Override
    public String toString() {
        return "VersionedData{name='" + name + "', value=" + value
            + ", extraField='" + extraField + "'}";
    }
}

public class VersionMismatchDemo {
    public static void main(String[] args) {
        // Step 1: serialize
        VersionedData data = new VersionedData("test", 42);
        String filename = "versioned.ser";

        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(filename))) {
            oos.writeObject(data);
            System.out.println("Serialized: " + data);
        } catch (IOException e) {
            System.out.println("Serialization error: " + e.getMessage());
            return;
        }

        // Step 2: deserialize (requires matching serialVersionUID)
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(filename))) {
            VersionedData loaded = (VersionedData) ois.readObject();
            System.out.println("Deserialized: " + loaded);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization error: " + e.getMessage());
            System.out.println("Hint: Change serialVersionUID to 1L to see mismatch");
        }

        new java.io.File(filename).delete();
    }
}
