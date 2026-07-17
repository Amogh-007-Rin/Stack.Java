import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Exercise1SolutionController {
    @FXML private TextField fullNameField;
    @FXML private TextField emailField;
    @FXML private PasswordField passwordField;
    @FXML private PasswordField confirmField;
    @FXML private Label messageLabel;

    @FXML
    private void handleRegister(ActionEvent event) {
        String name = fullNameField.getText().trim();
        String email = emailField.getText().trim();
        String password = passwordField.getText();
        String confirm = confirmField.getText();

        if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
            messageLabel.setText("All fields are required.");
            messageLabel.setStyle("-fx-text-fill: red;");
            return;
        }
        if (!password.equals(confirm)) {
            messageLabel.setText("Passwords do not match.");
            messageLabel.setStyle("-fx-text-fill: red;");
            return;
        }
        if (!email.contains("@")) {
            messageLabel.setText("Invalid email address.");
            messageLabel.setStyle("-fx-text-fill: red;");
            return;
        }
        messageLabel.setText("Registration successful! Welcome, " + name + ".");
        messageLabel.setStyle("-fx-text-fill: green;");
    }
}
