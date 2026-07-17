import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

class SimpleClassLoader extends ClassLoader {

    @Override
    public Class<?> findClass(String name) throws ClassNotFoundException {
        String fileName = name.replace('.', '/') + ".class";

        try (InputStream is = getResourceAsStream(fileName);
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

            if (is == null) {
                throw new ClassNotFoundException(name);
            }

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = is.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }

            byte[] classData = baos.toByteArray();
            return defineClass(name, classData, 0, classData.length);

        } catch (IOException e) {
            throw new ClassNotFoundException(name, e);
        }
    }
}

public class CustomClassLoaderDemo {

    public static void main(String[] args) throws Exception {
        System.out.println("=== Custom ClassLoader Demo ===");

        SimpleClassLoader customLoader = new SimpleClassLoader();

        Class<?> loadedClass = customLoader.loadClass("BytecodeDemo");
        System.out.println("Class loaded: " + loadedClass.getName());
        System.out.println("ClassLoader: " + loadedClass.getClassLoader());

        Object instance = loadedClass.getDeclaredConstructor().newInstance();
        System.out.println("Instance created: " + instance);

        System.out.println();
        System.out.println("Note: The parent-first delegation means");
        System.out.println("the application classloader loads the class if it's on the classpath.");
        System.out.println("Custom loaders are useful for plugins and hot deployment.");
    }
}
