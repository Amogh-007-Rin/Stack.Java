public class Exercise3 {
    public static void main(String[] args) {
        int height = 5;

        for (int row = 1; row <= height; row++) {
            for (int space = 1; space <= height - row; space++) {
                System.out.print(" ");
            }
            for (int num = 1; num <= row; num++) {
                System.out.print(num);
            }
            for (int num = row - 1; num >= 1; num--) {
                System.out.print(num);
            }
            System.out.println();
        }
    }
}
