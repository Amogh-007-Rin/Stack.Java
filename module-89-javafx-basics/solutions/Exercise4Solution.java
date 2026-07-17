import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Exercise4Solution extends Application {
    @Override
    public void start(Stage stage) {
        ComboBox<String> fromUnit = new ComboBox<>();
        fromUnit.getItems().addAll("Meters", "Kilometers", "Miles");
        fromUnit.setValue("Meters");

        ComboBox<String> toUnit = new ComboBox<>();
        toUnit.getItems().addAll("Meters", "Kilometers", "Miles");
        toUnit.setValue("Kilometers");

        TextField inputField = new TextField();
        inputField.setPromptText("Enter value");

        Label resultLabel = new Label("Result: ");

        Button convertButton = new Button("Convert");
        convertButton.setOnAction(e -> {
            try {
                double value = Double.parseDouble(inputField.getText());
                double meters = toMeters(value, fromUnit.getValue());
                double result = fromMeters(meters, toUnit.getValue());
                resultLabel.setText("Result: " + result);
            } catch (NumberFormatException ex) {
                resultLabel.setText("Invalid number");
            }
        });

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(10));
        grid.add(new Label("From:"), 0, 0);
        grid.add(fromUnit, 1, 0);
        grid.add(new Label("To:"), 0, 1);
        grid.add(toUnit, 1, 1);
        grid.add(new Label("Value:"), 0, 2);
        grid.add(inputField, 1, 2);
        grid.add(convertButton, 0, 3);
        grid.add(resultLabel, 1, 3);

        Scene scene = new Scene(grid, 350, 200);
        stage.setTitle("Unit Converter");
        stage.setScene(scene);
        stage.show();
    }

    private double toMeters(double value, String unit) {
        return switch (unit) {
            case "Kilometers" -> value * 1000;
            case "Miles" -> value * 1609.34;
            default -> value;
        };
    }

    private double fromMeters(double meters, String unit) {
        return switch (unit) {
            case "Kilometers" -> meters / 1000;
            case "Miles" -> meters / 1609.34;
            default -> meters;
        };
    }

    public static void main(String[] args) {
        launch(args);
    }
}
