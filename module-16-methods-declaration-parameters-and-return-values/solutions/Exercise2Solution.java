public class Exercise2Solution {

    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int n : arr) {
            sum += n;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] test = {10, 20, 30, 40};
        System.out.println("Sum: " + sumArray(test));
    }
}
