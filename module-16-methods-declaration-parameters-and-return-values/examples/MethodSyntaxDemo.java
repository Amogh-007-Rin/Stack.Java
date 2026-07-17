public class MethodSyntaxDemo {

    public static int add(int a, int b) {
        return a + b;
    }

    public static double average(double x, double y) {
        return (x + y) / 2.0;
    }

    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        int sum = add(3, 7);
        System.out.println("3 + 7 = " + sum);

        double avg = average(10.0, 20.0);
        System.out.println("Average: " + avg);

        greet("Alice");
    }
}
