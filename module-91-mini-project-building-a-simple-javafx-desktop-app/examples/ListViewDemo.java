import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ListViewDemo extends Application {
    private final ObservableList<String> items = FXCollections.observableArrayList();

    @Override
    public void start(Stage stage) {
        items.addAll("Learn JavaFX", "Build a to-do app", "Master FXML");

        ListView<String> listView = new ListView<>(items);
        TextField inputField = new TextField();
        inputField.setPromptText("New item");

        Button addButton = new Button("Add");
        addButton.setOnAction(e -> {
            String text = inputField.getText().trim();
            if (!text.isEmpty()) {
                items.add(text);
                inputField.clear();
            }
        });

        Button removeButton = new Button("Remove Selected");
        removeButton.setOnAction(e -> {
            String selected = listView.getSelectionModel().getSelectedItem();
            if (selected != null) {
                items.remove(selected);
            }
        });

        VBox root = new VBox(10, new Label("ListView Demo"), inputField, addButton, removeButton, listView);
        Scene scene = new Scene(root, 350, 400);
        stage.setTitle("ListView Demo");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
