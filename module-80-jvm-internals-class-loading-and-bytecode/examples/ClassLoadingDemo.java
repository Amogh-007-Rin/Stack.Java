public class ClassLoadingDemo {

    static {
        System.out.println("ClassLoadingDemo class loaded by: "
                + ClassLoadingDemo.class.getClassLoader());
    }

    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("=== ClassLoader Hierarchy Demo ===");

        ClassLoader appLoader = ClassLoadingDemo.class.getClassLoader();
        System.out.println("Application ClassLoader: " + appLoader);

        ClassLoader platformLoader = appLoader.getParent();
        System.out.println("Platform ClassLoader: " + platformLoader);

        ClassLoader bootstrapLoader = platformLoader.getParent();
        System.out.println("Bootstrap ClassLoader: " + bootstrapLoader);

        System.out.println();
        System.out.println("=== Loading a class dynamically ===");
        Class<?> loadedClass = Class.forName("java.util.ArrayList");
        System.out.println("Loaded: " + loadedClass.getName());
        System.out.println("Loaded by: " + loadedClass.getClassLoader());

        System.out.println();
        System.out.println("=== Checking classloader for String ===");
        ClassLoader stringLoader = String.class.getClassLoader();
        System.out.println("String classloader: " + stringLoader);
        System.out.println("(null means bootstrap classloader)");
    }
}
