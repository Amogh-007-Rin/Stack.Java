import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CSSStylingDemo extends Application {
    @Override
    public void start(Stage stage) {
        Label titleLabel = new Label("CSS Styling Demo");
        titleLabel.setStyle("-fx-font-size: 20px; -fx-font-weight: bold; -fx-text-fill: #2c3e50;");

        Button inlineButton = new Button("Inline Style");
        inlineButton.setStyle(
            "-fx-background-color: #3498db; -fx-text-fill: white; " +
            "-fx-font-size: 14px; -fx-padding: 10px 20px; -fx-border-radius: 5px;"
        );

        Button classButton = new Button("Style Class");
        classButton.getStyleClass().add("primary-button");

        Button hoverButton = new Button("Hover Me");
        hoverButton.setStyle(
            "-fx-background-color: #e74c3c; -fx-text-fill: white; " +
            "-fx-font-size: 14px; -fx-padding: 10px 20px;"
        );
        hoverButton.setOnMouseEntered(e ->
            hoverButton.setStyle("-fx-background-color: #c0392b; -fx-text-fill: white; " +
                "-fx-font-size: 14px; -fx-padding: 10px 20px;")
        );
        hoverButton.setOnMouseExited(e ->
            hoverButton.setStyle("-fx-background-color: #e74c3c; -fx-text-fill: white; " +
                "-fx-font-size: 14px; -fx-padding: 10px 20px;")
        );

        VBox root = new VBox(15, titleLabel, inlineButton, classButton, hoverButton);
        root.setPadding(new Insets(20));

        Scene scene = new Scene(root, 350, 250);
        scene.getStylesheets().add(getClass().getResource("login-style.css").toExternalForm());
        stage.setTitle("CSS Styling Demo");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
