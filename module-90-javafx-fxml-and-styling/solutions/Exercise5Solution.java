import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Exercise5Solution extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Exercise5Solution.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Exercise5SolutionController controller = loader.getController();
        controller.setScene(scene);
        scene.getStylesheets().add(getClass().getResource("light-theme.css").toExternalForm());
        stage.setTitle("Theme Switcher");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
