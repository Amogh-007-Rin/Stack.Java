import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;

public class Exercise5SolutionController {
    private Scene scene;

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    @FXML
    private void applyDarkTheme(ActionEvent event) {
        if (scene != null) {
            scene.getStylesheets().clear();
            scene.getStylesheets().add(getClass().getResource("dark-theme.css").toExternalForm());
        }
    }

    @FXML
    private void applyLightTheme(ActionEvent event) {
        if (scene != null) {
            scene.getStylesheets().clear();
            scene.getStylesheets().add(getClass().getResource("light-theme.css").toExternalForm());
        }
    }
}
