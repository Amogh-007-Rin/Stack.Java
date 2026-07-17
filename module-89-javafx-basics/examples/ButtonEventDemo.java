import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ButtonEventDemo extends Application {
    private int clickCount = 0;

    @Override
    public void start(Stage stage) {
        Label label = new Label("Button not clicked yet");
        Button button = new Button("Click Me");

        button.setOnAction(e -> {
            clickCount++;
            label.setText("Clicked " + clickCount + " time(s)");
        });

        VBox root = new VBox(10, label, button);
        Scene scene = new Scene(root, 300, 150);
        stage.setTitle("Button Event Demo");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
