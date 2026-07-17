import java.util.Scanner;

/*
 * Intent: divide numbers entered by the user and show the result.
 * Bug: integer division with a zero denominator throws ArithmeticException.
 */
public class DivisionByZeroDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter numerator: ");
        int a = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter denominator: ");
        int b = Integer.parseInt(scanner.nextLine());

        // BUG: no check for b == 0
        int result = a / b;
        System.out.println("Result: " + result);

        scanner.close();
    }
}
