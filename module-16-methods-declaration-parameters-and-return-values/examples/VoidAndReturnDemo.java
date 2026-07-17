public class VoidAndReturnDemo {

    public static void printPositive(int n) {
        if (n <= 0) return;
        System.out.println(n + " is positive");
    }

    public static boolean isEven(int n) {
        if (n % 2 == 0) return true;
        return false;
    }

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        printPositive(5);
        printPositive(-3);
        System.out.println("4 is even: " + isEven(4));
        System.out.println("Max of 7 and 3: " + max(7, 3));
    }
}
