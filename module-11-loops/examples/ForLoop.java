public class ForLoop {
    public static void main(String[] args) {
        System.out.println("Counting up:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("\nCounting down:");
        for (int i = 5; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("\nArray iteration:");
        for (int idx = 0; idx < numbers.length; idx++) {
            System.out.println("numbers[" + idx + "] = " + numbers[idx]);
        }

        System.out.println("\nNested loop (multiplication table):");
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 3; col++) {
                System.out.printf("%3d", row * col);
            }
            System.out.println();
        }
    }
}
