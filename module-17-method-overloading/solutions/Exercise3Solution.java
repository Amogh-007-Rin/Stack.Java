public class Exercise3Solution {

    public static void method(int a, double b) {
        System.out.println("int, double");
    }

    public static void method(double a, int b) {
        System.out.println("double, int");
    }

    public static void main(String[] args) {
        // method(3, 4);
        // Uncommenting the line above causes a compile error:
        // "reference to method is ambiguous" because 3 can match
        // either int or double, and 4 can match either int or double,
        // so the compiler cannot decide between the two overloads.

        // Use explicit typecasting to resolve:
        method(3, (double) 4);
        method((double) 3, 4);
    }
}
