public class Exercise1Solution {

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static int max(int a, int b, int c) {
        int temp = (a > b) ? a : b;
        return (temp > c) ? temp : c;
    }

    public static double max(double a, double b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        System.out.println("max(3, 7): " + max(3, 7));
        System.out.println("max(3, 7, 5): " + max(3, 7, 5));
        System.out.println("max(3.5, 2.8): " + max(3.5, 2.8));
    }
}
