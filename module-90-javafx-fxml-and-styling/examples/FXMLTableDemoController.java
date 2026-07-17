import javafx.fxml.FXML;
import javafx.scene.control.TableView;

public class FXMLTableDemoController {
    @FXML
    private TableView<Person> personTable;

    @FXML
    private void initialize() {
        personTable.setItems(FXMLTableDemo.personData);
    }
}
