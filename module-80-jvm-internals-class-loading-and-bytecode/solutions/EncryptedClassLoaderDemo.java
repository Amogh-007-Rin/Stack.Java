import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

class XorClassLoader extends ClassLoader {

    private static final byte XOR_KEY = 0x42;

    @Override
    public Class<?> findClass(String name) throws ClassNotFoundException {
        String fileName = name.replace('.', '/') + ".encrypted";

        try (InputStream is = getResourceAsStream(fileName);
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

            if (is == null) {
                throw new ClassNotFoundException(name + " (encrypted file not found)");
            }

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = is.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }

            byte[] encryptedData = baos.toByteArray();
            byte[] classData = new byte[encryptedData.length];
            for (int i = 0; i < encryptedData.length; i++) {
                classData[i] = (byte) (encryptedData[i] ^ XOR_KEY);
            }

            return defineClass(name, classData, 0, classData.length);

        } catch (IOException e) {
            throw new ClassNotFoundException(name, e);
        }
    }
}

public class EncryptedClassLoaderDemo {

    public static void main(String[] args) throws Exception {
        System.out.println("=== Encrypted Class Loader Demo ===");
        System.out.println("This demo shows how to load an XOR-encrypted class.");

        XorClassLoader loader = new XorClassLoader();

        try {
            Class<?> messageClass = loader.loadClass("MessageDemo");
            Object instance = messageClass.getDeclaredConstructor().newInstance();
            messageClass.getMethod("display").invoke(instance);
        } catch (ClassNotFoundException e) {
            System.out.println("Create an encrypted class file using:");
            System.out.println(" 1. Write a MessageDemo.java file");
            System.out.println(" 2. Compile: javac MessageDemo.java");
            System.out.println(" 3. Encrypt: copy MessageDemo.class MessageDemo.encrypted");
            System.out.println("    (XOR with 0x42)");
            System.out.println(" 4. Place MessageDemo.encrypted in classpath");
            System.out.println();
            System.out.println("For now, here is the encryption utility:");
            byte key = 0x42;
            Path classFile = Path.of("MessageDemo.class");
            if (Files.exists(classFile)) {
                byte[] data = Files.readAllBytes(classFile);
                byte[] encrypted = new byte[data.length];
                for (int i = 0; i < data.length; i++) {
                    encrypted[i] = (byte) (data[i] ^ key);
                }
                Files.write(Path.of("MessageDemo.encrypted"), encrypted);
                System.out.println("Encrypted: MessageDemo.encrypted created");
            } else {
                System.out.println("MessageDemo.class not found");
            }
        }
    }
}
