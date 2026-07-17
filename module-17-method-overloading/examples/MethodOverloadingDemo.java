public class MethodOverloadingDemo {

    public static int add(int a, int b) {
        System.out.println("int add(int, int)");
        return a + b;
    }

    public static int add(int a, int b, int c) {
        System.out.println("int add(int, int, int)");
        return a + b + c;
    }

    public static double add(double a, double b) {
        System.out.println("double add(double, double)");
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Result: " + add(3, 4));
        System.out.println("Result: " + add(3, 4, 5));
        System.out.println("Result: " + add(3.5, 2.5));
    }
}
