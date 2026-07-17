// Student Name : Amogh Dath Kalasapura Arunkumar
// Student Id   : 24168333
// Student Email : amoghdath.kalasapuraarunkumar@mail.bcu.ac.uk
// Submission Date : 31st October 2025

public class ScrabbleBoardPrinter {

    public static void printBoard(char[][] board) {
        if (board == null || board.length == 0 || board[0].length == 0) {
            System.out.println("Empty board.");
            return;
        }

        int numCols = board[0].length;
        
        // Print top border
        System.out.print("+");
        for (int i = 0; i < (numCols * 2) + 1; i++) {
            System.out.print("-");
        }
        System.out.println("+");

        // Print board rows
        for (char[] row : board) {
            System.out.print("| ");
            for (int i = 0; i < numCols; i++) {
                System.out.print(row[i] + (i == numCols - 1 ? "" : " "));
            }
            System.out.println(" |");
        }

        // Print bottom border
        System.out.print("+");
        for (int i = 0; i < (numCols * 2) + 1; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    public static void main(String[] args) {
        char[][] testBoard = new char[][] {
            { '.', '.', 'W', '.', '.' },
            { '.', '.', 'O', '.', '.' },
            { '.', '.', 'R', '.', '.' },
            { 'H', 'E', 'L', 'L', 'O' },
            { '.', '.', 'D', '.', '.' }
        };
        printBoard(testBoard);

        char[][] smallBoard = new char[][] {
            { 'A', 'B' },
            { 'C', 'D' }
        };
        System.out.println("\nSmall Board:");
        printBoard(smallBoard);

        char[][] singleCellBoard = new char[][] {
            { 'X' }
        };
        System.out.println("\nSingle Cell Board:");
        printBoard(singleCellBoard);
    }
}
