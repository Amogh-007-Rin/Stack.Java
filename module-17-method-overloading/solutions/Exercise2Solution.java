public class Exercise2Solution {

    public static void printType(int value) {
        System.out.println("int: " + value);
    }

    public static void printType(double value) {
        System.out.println("double: " + value);
    }

    public static void printType(String value) {
        System.out.println("String: " + value);
    }

    public static void main(String[] args) {
        printType(42);
        printType(3.14);
        printType("Hello");
    }
}
