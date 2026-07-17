public class FXMLStructureDemo {
    public static void main(String[] args) {
        System.out.println("=== JavaFX FXML Structure ===");
        System.out.println("FXML separates UI layout from Java code (MVC pattern).");
        System.out.println();
        System.out.println("Example FXML file (todo-view.fxml):");
        System.out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        System.out.println("<?import javafx.scene.control.*?>");
        System.out.println("<?import javafx.scene.layout.*?>");
        System.out.println("<VBox xmlns:fx=\"http://javafx.com/fxml\"");
        System.out.println("      fx:controller=\"com.example.TodoController\">");
        System.out.println("    <HBox>");
        System.out.println("        <TextField fx:id=\"taskInput\" promptText=\"Enter a task...\"/>");
        System.out.println("        <Button text=\"Add\" onAction=\"#handleAddTask\"/>");
        System.out.println("    </HBox>");
        System.out.println("    <ListView fx:id=\"taskList\"/>");
        System.out.println("    <Label fx:id=\"statusLabel\"/>");
        System.out.println("</VBox>");
        System.out.println();
        System.out.println("Corresponding controller structure:");
        System.out.println("public class TodoController {");
        System.out.println("    @FXML private TextField taskInput;");
        System.out.println("    @FXML private ListView<Task> taskList;");
        System.out.println("    @FXML private Label statusLabel;");
        System.out.println("    @FXML");
        System.out.println("    private void handleAddTask() { ... }");
        System.out.println("}");
        System.out.println();
        System.out.println("Loading FXML in main Application class:");
        System.out.println("FXMLLoader loader = new FXMLLoader(getClass().getResource(\"todo-view.fxml\"));");
        System.out.println("Scene scene = new Scene(loader.load());");
    }
}
