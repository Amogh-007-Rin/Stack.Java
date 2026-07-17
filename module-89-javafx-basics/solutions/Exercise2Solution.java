import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Exercise2Solution extends Application {
    private int count = 0;

    @Override
    public void start(Stage stage) {
        Label countLabel = new Label("0");
        countLabel.setStyle("-fx-font-size: 24px;");

        Button incrementButton = new Button("Increment");
        Button decrementButton = new Button("Decrement");

        incrementButton.setOnAction(e -> {
            count++;
            countLabel.setText(String.valueOf(count));
        });

        decrementButton.setOnAction(e -> {
            if (count > 0) {
                count--;
                countLabel.setText(String.valueOf(count));
            }
        });

        HBox buttonBox = new HBox(10, incrementButton, decrementButton);
        VBox root = new VBox(20, countLabel, buttonBox);
        Scene scene = new Scene(root, 300, 150);
        stage.setTitle("Bouncing Ball Counter");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
