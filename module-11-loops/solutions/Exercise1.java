public class Exercise1 {
    public static void main(String[] args) {
        int n = 7;
        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println(n + "! = " + factorial);
    }
}
