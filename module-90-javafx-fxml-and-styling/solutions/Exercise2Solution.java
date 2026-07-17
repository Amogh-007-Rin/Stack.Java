import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Exercise2Solution extends Application {
    public static ObservableList<Contact> contacts = FXCollections.observableArrayList(
        new Contact("Alice Johnson", "555-0101", "alice@example.com"),
        new Contact("Bob Smith", "555-0102", "bob@example.com"),
        new Contact("Carol Davis", "555-0103", "carol@example.com"),
        new Contact("David Lee", "555-0104", "david@example.com")
    );

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Exercise2Solution.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("exercise1-style.css").toExternalForm());
        stage.setTitle("Contact Manager");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
