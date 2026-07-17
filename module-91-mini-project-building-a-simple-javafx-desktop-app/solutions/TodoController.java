import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class TodoController {
    @FXML private TextField taskInput;
    @FXML private ListView<Task> taskList;
    @FXML private Label statsLabel;

    private final ObservableList<Task> tasks = FXCollections.observableArrayList();

    @FXML
    private void initialize() {
        taskList.setItems(tasks);
        taskList.setCellFactory(lv -> new ListCell<Task>() {
            private final CheckBox checkBox = new CheckBox();
            private final HBox container = new HBox(10, checkBox);

            {
                checkBox.setOnAction(e -> {
                    Task task = getItem();
                    if (task != null) {
                        task.setCompleted(checkBox.isSelected());
                        updateStyle(task);
                        updateStats();
                    }
                });
            }

            @Override
            protected void updateItem(Task task, boolean empty) {
                super.updateItem(task, empty);
                if (empty || task == null) {
                    setText(null);
                    setGraphic(null);
                } else {
                    checkBox.setText(task.getDescription());
                    checkBox.setSelected(task.isCompleted());
                    updateStyle(task);
                    setGraphic(container);
                }
            }

            private void updateStyle(Task task) {
                if (task.isCompleted()) {
                    checkBox.setStyle("-fx-text-fill: #888; -fx-strikethrough: true;");
                } else {
                    checkBox.setStyle("-fx-text-fill: #333; -fx-strikethrough: false;");
                }
            }
        });

        updateStats();
    }

    @FXML
    private void handleAdd(ActionEvent event) {
        String text = taskInput.getText().trim();
        if (text.isEmpty()) {
            taskInput.setStyle("-fx-border-color: red;");
            return;
        }
        taskInput.setStyle(null);
        tasks.add(new Task(text));
        taskInput.clear();
        updateStats();
    }

    @FXML
    private void handleDelete(ActionEvent event) {
        Task selected = taskList.getSelectionModel().getSelectedItem();
        if (selected != null) {
            tasks.remove(selected);
            updateStats();
        }
    }

    @FXML
    private void handleClearCompleted(ActionEvent event) {
        tasks.removeIf(Task::isCompleted);
        updateStats();
    }

    private void updateStats() {
        int total = tasks.size();
        long completed = tasks.stream().filter(Task::isCompleted).count();
        statsLabel.setText("Total: " + total + " | Completed: " + completed);
    }
}
