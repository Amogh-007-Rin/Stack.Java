public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {
        System.out.println("LazySingleton instance created");
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from LazySingleton!");
    }

    public static void main(String[] args) {
        System.out.println("Before getInstance() call");
        LazySingleton s1 = LazySingleton.getInstance();
        LazySingleton s2 = LazySingleton.getInstance();
        System.out.println("Same instance: " + (s1 == s2));
        s1.showMessage();
    }
}
