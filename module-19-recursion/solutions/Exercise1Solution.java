public class Exercise1Solution {

    public static int sum(int n) {
        if (n == 1) return 1;
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("sum(5) = " + sum(5));
        System.out.println("sum(10) = " + sum(10));
    }
}
