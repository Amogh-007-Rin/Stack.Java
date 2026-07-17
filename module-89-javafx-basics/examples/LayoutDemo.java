import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LayoutDemo extends Application {
    @Override
    public void start(Stage stage) {
        BorderPane borderPane = new BorderPane();

        HBox topBar = new HBox(10, new Button("File"), new Button("Edit"), new Button("Help"));
        borderPane.setTop(topBar);

        VBox sideBar = new VBox(10, new Label("Navigation"), new Button("Home"), new Button("Settings"));
        borderPane.setLeft(sideBar);

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(10));
        grid.add(new Label("Name:"), 0, 0);
        grid.add(new Label("Email:"), 0, 1);
        grid.add(new Button("Submit"), 0, 2);

        borderPane.setCenter(grid);

        HBox statusBar = new HBox(new Label("Status: Ready"));
        borderPane.setBottom(statusBar);

        Scene scene = new Scene(borderPane, 500, 300);
        stage.setTitle("Layout Demo");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
