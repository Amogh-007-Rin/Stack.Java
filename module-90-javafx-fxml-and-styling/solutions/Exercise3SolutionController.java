import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Exercise3SolutionController {
    @FXML private TextField display;
    private double firstOperand = 0;
    private String operator = "";

    @FXML
    private void handleDigit(ActionEvent event) {
        String value = ((Button) event.getSource()).getText();
        display.setText(display.getText() + value);
    }

    @FXML
    private void handleOperator(ActionEvent event) {
        if (!display.getText().isEmpty()) {
            firstOperand = Double.parseDouble(display.getText());
            operator = ((Button) event.getSource()).getText();
            display.setText("");
        }
    }

    @FXML
    private void handleEquals(ActionEvent event) {
        if (!operator.isEmpty() && !display.getText().isEmpty()) {
            double second = Double.parseDouble(display.getText());
            double result = switch (operator) {
                case "+" -> firstOperand + second;
                case "-" -> firstOperand - second;
                case "*" -> firstOperand * second;
                case "/" -> second != 0 ? firstOperand / second : 0;
                default -> 0;
            };
            display.setText(String.valueOf(result));
            operator = "";
        }
    }

    @FXML
    private void handleClear(ActionEvent event) {
        display.setText("");
        firstOperand = 0;
        operator = "";
    }
}
