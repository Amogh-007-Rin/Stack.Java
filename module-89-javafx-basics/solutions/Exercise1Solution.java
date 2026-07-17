import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Exercise1Solution extends Application {
    @Override
    public void start(Stage stage) {
        TextField firstNameField = new TextField();
        TextField lastNameField = new TextField();
        TextField emailField = new TextField();

        GridPane form = new GridPane();
        form.setHgap(10);
        form.setVgap(10);
        form.setPadding(new Insets(10));
        form.add(new Label("First Name:"), 0, 0);
        form.add(firstNameField, 1, 0);
        form.add(new Label("Last Name:"), 0, 1);
        form.add(lastNameField, 1, 1);
        form.add(new Label("Email:"), 0, 2);
        form.add(emailField, 1, 2);

        TextArea output = new TextArea();
        output.setEditable(false);
        output.setPrefHeight(150);

        Button submitButton = new Button("Submit");
        submitButton.setOnAction(e -> {
            output.setText(
                "First Name: " + firstNameField.getText() + "\n" +
                "Last Name:  " + lastNameField.getText() + "\n" +
                "Email:      " + emailField.getText()
            );
        });

        Button clearButton = new Button("Clear");
        clearButton.setOnAction(e -> {
            firstNameField.clear();
            lastNameField.clear();
            emailField.clear();
            output.clear();
        });

        VBox root = new VBox(10, form, submitButton, clearButton, output);
        Scene scene = new Scene(root, 400, 350);
        stage.setTitle("Personal Information Form");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
