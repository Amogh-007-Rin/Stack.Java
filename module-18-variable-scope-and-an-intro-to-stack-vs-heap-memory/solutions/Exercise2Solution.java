public class Exercise2Solution {

    public static void main(String[] args) {
        if (true) {
            int x = 10;
            System.out.println("Inside block: " + x);
        }

        // The line below would cause a compile error:
        // System.out.println("Outside block: " + x);
        // Reason: x is declared inside the if block and is only
        // accessible within that block (block scope).
        // Once the block ends, x goes out of scope.
    }
}
