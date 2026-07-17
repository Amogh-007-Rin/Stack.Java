import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int b = scanner.nextInt();

        System.out.print("Enter operator (+, -, *, /): ");
        String op = scanner.next();

        int result;
        switch (op) {
            case "+": result = a + b; break;
            case "-": result = a - b; break;
            case "*": result = a * b; break;
            case "/":
                if (b == 0) {
                    System.out.println("Error: division by zero");
                    scanner.close();
                    return;
                }
                result = a / b;
                break;
            default:
                System.out.println("Unknown operator");
                scanner.close();
                return;
        }
        System.out.println(a + " " + op + " " + b + " = " + result);

        scanner.close();
    }
}
