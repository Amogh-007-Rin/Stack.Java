import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.Random;

public class Exercise5Solution extends Application {
    private int targetNumber;
    private int attempts;

    @Override
    public void start(Stage stage) {
        targetNumber = new Random().nextInt(100) + 1;
        attempts = 0;

        Label promptLabel = new Label("Guess a number between 1 and 100:");
        TextField guessField = new TextField();
        guessField.setPromptText("Enter your guess");

        Label resultLabel = new Label("Make a guess!");
        Label attemptLabel = new Label("Attempts: 0");

        Button guessButton = new Button("Guess");
        guessButton.setOnAction(e -> {
            try {
                int guess = Integer.parseInt(guessField.getText());
                attempts++;
                attemptLabel.setText("Attempts: " + attempts);
                if (guess < targetNumber) {
                    resultLabel.setText("Too low!");
                } else if (guess > targetNumber) {
                    resultLabel.setText("Too high!");
                } else {
                    resultLabel.setText("Correct! You got it in " + attempts + " attempts!");
                }
            } catch (NumberFormatException ex) {
                resultLabel.setText("Please enter a valid number.");
            }
        });

        Button newGameButton = new Button("New Game");
        newGameButton.setOnAction(e -> {
            targetNumber = new Random().nextInt(100) + 1;
            attempts = 0;
            attemptLabel.setText("Attempts: 0");
            resultLabel.setText("New game! Make a guess.");
            guessField.clear();
        });

        VBox root = new VBox(10, promptLabel, guessField, guessButton, resultLabel, attemptLabel, newGameButton);
        Scene scene = new Scene(root, 350, 250);
        stage.setTitle("Number Guessing Game");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
