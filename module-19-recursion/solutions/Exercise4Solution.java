public class Exercise4Solution {

    public static void printDescending(int n) {
        if (n < 1) return;
        System.out.println(n);
        printDescending(n - 1);
    }

    public static void main(String[] args) {
        printDescending(5);
        System.out.println("Blast off!");
    }
}
