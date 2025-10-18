import java.util.*;

public class GuessingGame {
    private final int maxGuess;
    private final int correctGuess;
    private int guessCount;
    private boolean personWon;

    // Default constructor: max 10 guesses, default secret 47
    public GuessingGame() {
        this.maxGuess = 10;
        this.correctGuess = 47;
        this.guessCount = 0;
        this.personWon = false;
    }

    // Alternative constructor to set secret (useful for testing)
    public GuessingGame(int maxGuess, int correctGuess) {
        this.maxGuess = maxGuess;
        this.correctGuess = correctGuess;
        this.guessCount = 0;
        this.personWon = false;
    }

    // Returns number of guesses remaining and prints it
    public int getGuessRemaining() {
        int remaining = Math.max(0, maxGuess - guessCount);
        System.out.println("You have " + remaining + " guesses remaining.");
        return remaining;
    }

    // Returns whether the game is over (used and printed)
    public boolean isGameOver() {
        return personWon || guessCount >= maxGuess;
    }

    public void gameOver() {
        if (isGameOver()) {
            System.out.println("Your game is over.");
            if (personWon) {
                System.out.println("You won the game!");
            } else {
                System.out.println("You have used all guesses.");
            }
        } else {
            System.out.println("Your game is not over yet.");
            getGuessRemaining();
        }
    }

    // Reads one guess from scanner, validates and updates state.
    // Returns true if the guess was processed (valid numeric), false otherwise.
    public boolean guess(Scanner sc) {
        if (isGameOver()) {
            System.out.println("Game is already over. Restart to play again.");
            return false;
        }

        System.out.print("Choose a number between 1 and 100: ");
        int guess;
        try {
            guess = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
            sc.nextLine(); // consume invalid token
            return false;
        }

        if (guess < 1 || guess > 100) {
            System.out.println("Wrong guess! Please choose a number between 1 and 100.");
            return false;
        }

        guessCount++;

        if (guess == correctGuess) {
            personWon = true;
            System.out.println("You have guessed the number correctly. Congratulations, you have won the game!");
        } else if (guess < correctGuess) {
            System.out.println("Too low. Try again.");
        } else {
            System.out.println("Too high. Try again.");
        }

        if (!personWon && guessCount >= maxGuess) {
            System.out.println("No more guesses left.");
        }

        return true;
    }

    public void gameWon() {
        if (personWon) {
            System.out.println("You have won the game. Please restart the program to play again.");
        } else {
            System.out.println("Game has not been won yet. Keep trying.");
        }
    }

    // Simple interactive menu
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GuessingGame game = new GuessingGame(); // use default; or new GuessingGame(10, 47)

        System.out.println("==================== WELCOME TO THE GUESSING GAME ====================");
        boolean exit = false;
        while (!exit) {
            System.out.println("\nPlease select an option:");
            System.out.println("1. View number of guesses remaining");
            System.out.println("2. See whether or not the game is over");
            System.out.println("3. See whether or not the game has been won");
            System.out.println("4. Make a guess");
            System.out.println("0. Exit");
            System.out.print("Option: ");

            int option;
            try {
                option = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Enter a number from the menu.");
                sc.nextLine();
                continue;
            }

            switch (option) {
                case 1:
                    game.getGuessRemaining();
                    break;
                case 2:
                    game.gameOver();
                    break;
                case 3:
                    game.gameWon();
                    break;
                case 4:
                    game.guess(sc);
                    break;
                case 0:
                    exit = true;
                    System.out.println("Exiting game. Goodbye.");
                    break;
                default:
                    System.out.println("Unknown option. Please choose 0-4.");
            }
        }

        sc.close();
    }
}
