import java.util.Scanner;

public class HasNextExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        if (scanner.hasNextInt()) {
            int value = scanner.nextInt();
            System.out.println("You entered: " + value);
        } else {
            String badInput = scanner.next();
            System.out.println("\"" + badInput + "\" is not a valid integer");
        }

        System.out.print("\nEnter a floating-point number: ");
        if (scanner.hasNextDouble()) {
            double d = scanner.nextDouble();
            System.out.println("You entered: " + d);
        } else {
            System.out.println("Invalid input");
        }

        scanner.close();
    }
}
