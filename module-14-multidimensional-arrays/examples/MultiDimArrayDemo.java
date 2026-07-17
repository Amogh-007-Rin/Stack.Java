public class MultiDimArrayDemo {
    public static void main(String[] args) {
        int[][] matrix = new int[2][3];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;

        int[][] table = {{10, 20, 30}, {40, 50, 60}};

        System.out.println("matrix[1][2]: " + matrix[1][2]);
        System.out.println("table[0][1]: " + table[0][1]);
        System.out.println("Number of rows: " + table.length);
        System.out.println("Number of cols in row 0: " + table[0].length);
    }
}
