public class Exercise2Solution {
    public static void main(String[] args) {
        int[][] original = {{1, 2, 3}, {4, 5, 6}};
        int rows = original.length;
        int cols = original[0].length;

        int[][] transposed = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = original[i][j];
            }
        }

        System.out.println("Transposed matrix:");
        for (int[] row : transposed) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
