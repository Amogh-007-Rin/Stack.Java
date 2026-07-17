import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exercise3Solution extends Application {
    @Override
    public void start(Stage stage) {
        TextArea textArea = new TextArea();
        textArea.setPromptText("Start typing...");

        TextField fileNameField = new TextField();
        fileNameField.setPromptText("File name");

        Button newButton = new Button("New");
        newButton.setOnAction(e -> textArea.clear());

        Button saveButton = new Button("Save");
        saveButton.setOnAction(e -> {
            String name = fileNameField.getText();
            if (!name.isEmpty()) {
                textArea.appendText("[Saved as: " + name + "]\n");
            }
        });

        Button dateButton = new Button("Append Date");
        dateButton.setOnAction(e -> {
            String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            textArea.appendText(now + "\n");
        });

        HBox topBar = new HBox(10, fileNameField, newButton, saveButton, dateButton);
        BorderPane root = new BorderPane();
        root.setTop(topBar);
        root.setCenter(textArea);

        Scene scene = new Scene(root, 500, 400);
        stage.setTitle("Simple Notepad");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
