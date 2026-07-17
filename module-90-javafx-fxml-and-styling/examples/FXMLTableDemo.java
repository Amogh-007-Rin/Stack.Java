import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FXMLTableDemo extends Application {
    public static ObservableList<Person> personData = FXCollections.observableArrayList(
        new Person("Alice", "Johnson", 28),
        new Person("Bob", "Smith", 35),
        new Person("Charlie", "Brown", 22)
    );

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLTableDemo.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("login-style.css").toExternalForm());
        stage.setTitle("Table Demo");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
