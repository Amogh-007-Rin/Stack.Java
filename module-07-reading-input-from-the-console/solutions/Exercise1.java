import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = scanner.next();

        scanner.nextLine();  // consume newline

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.println("Hello, " + firstName + " " + lastName + "!");

        scanner.close();
    }
}
