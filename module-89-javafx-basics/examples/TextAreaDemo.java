import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TextAreaDemo extends Application {
    @Override
    public void start(Stage stage) {
        TextField textField = new TextField();
        textField.setPromptText("Type something and press Add");

        TextArea textArea = new TextArea();
        textArea.setEditable(false);

        Button addButton = new Button("Add");
        addButton.setOnAction(e -> {
            String text = textField.getText();
            if (!text.isEmpty()) {
                textArea.appendText(text + "\n");
                textField.clear();
            }
        });

        Button clearButton = new Button("Clear");
        clearButton.setOnAction(e -> textArea.clear());

        VBox root = new VBox(10, textField, addButton, clearButton, textArea);
        Scene scene = new Scene(root, 350, 300);
        stage.setTitle("TextArea Demo");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
