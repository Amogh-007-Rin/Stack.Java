import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class Exercise2SolutionController {
    @FXML private ListView<Contact> contactList;
    @FXML private Label nameLabel;
    @FXML private Label phoneLabel;
    @FXML private Label emailLabel;

    @FXML
    private void initialize() {
        contactList.setItems(Exercise2Solution.contacts);
        contactList.getSelectionModel().selectedItemProperty().addListener((obs, oldVal, newVal) -> {
            if (newVal != null) {
                nameLabel.setText("Name: " + newVal.getName());
                phoneLabel.setText("Phone: " + newVal.getPhone());
                emailLabel.setText("Email: " + newVal.getEmail());
            }
        });
    }
}
