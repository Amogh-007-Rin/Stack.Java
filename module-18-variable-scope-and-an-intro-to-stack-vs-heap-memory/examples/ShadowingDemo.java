public class ShadowingDemo {

    static int value = 10;

    public static void main(String[] args) {
        int value = 20;
        System.out.println("Local value: " + value);
        System.out.println("Class value: " + ShadowingDemo.value);

        {
            int innerValue = 30;
            System.out.println("Block value: " + innerValue);
        }

        System.out.println("Local value after block: " + value);
    }
}
