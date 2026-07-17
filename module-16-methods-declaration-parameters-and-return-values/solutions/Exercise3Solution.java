public class Exercise3Solution {

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Inside swap: a=" + a + ", b=" + b);
    }

    public static void main(String[] args) {
        int x = 3;
        int y = 5;

        System.out.println("Before swap: x=" + x + ", y=" + y);
        swap(x, y);
        System.out.println("After swap: x=" + x + ", y=" + y);

        // The swap doesn't work because Java is pass-by-value.
        // Inside swap(), parameters a and b are local copies of x and y.
        // Swapping a and b has no effect on the original variables x and y.
    }
}
