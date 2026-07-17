import java.util.Scanner;

public class NextIntNextLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        // scanner.nextLine();  // FIX: uncomment to consume newline

        System.out.print("Enter a message: ");
        String message = scanner.nextLine();

        System.out.println("Number: " + number);
        System.out.println("Message: \"" + message + "\"");

        if (message.isEmpty()) {
            System.out.println("(Message was empty — nextLine() consumed leftover newline)");
        }

        scanner.close();
    }
}
