class StaticInitDemo {

    static {
        System.out.println("Static initializer of StaticInitDemo is running!");
    }

    public static void sayHello() {
        System.out.println("Hello from StaticInitDemo!");
    }
}

public class ClassLoadingComparison {

    public static void main(String[] args) throws Exception {
        System.out.println("=== Class.forName() ===");
        System.out.println("Calling Class.forName() - static initializer WILL run:");
        Class<?> class1 = Class.forName("StaticInitDemo");
        System.out.println("Class loaded: " + class1.getName());

        System.out.println();
        System.out.println("=== ClassLoader.loadClass() ===");
        System.out.println("Calling loadClass() - static initializer will NOT run yet:");
        Class<?> class2 = ClassLoadingComparison.class.getClassLoader()
                .loadClass("StaticInitDemo");
        System.out.println("Class loaded: " + class2.getName());

        System.out.println();
        System.out.println("Now calling a static method on the loadClass-loaded class:");
        StaticInitDemo.sayHello();

        System.out.println();
        System.out.println("Summary: forName() runs static initializer immediately,");
        System.out.println("loadClass() defers initialization until first active use.");
    }
}
