public class Exercise1Solution {

    public static int abs(int n) {
        if (n < 0) return -n;
        return n;
    }

    public static void main(String[] args) {
        System.out.println("abs(5): " + abs(5));
        System.out.println("abs(-3): " + abs(-3));
        System.out.println("abs(0): " + abs(0));
    }
}
