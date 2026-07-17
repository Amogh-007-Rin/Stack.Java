public class VersionCheck {
    public static void main(String[] args) {
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        System.out.println("JVM Version: " + System.getProperty("java.vm.version"));
        System.out.println("OS Name: " + System.getProperty("os.name"));
    }
}
