public class Exercise1Solution {
    public static void main(String[] args) {
        int[] numbers = {4, -1, 7, -3, 9};
        int firstNegative = 0;
        boolean found = false;

        for (int n : numbers) {
            if (n < 0) {
                firstNegative = n;
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("First negative number: " + firstNegative);
        } else {
            System.out.println("No negative number found");
        }
    }
}
