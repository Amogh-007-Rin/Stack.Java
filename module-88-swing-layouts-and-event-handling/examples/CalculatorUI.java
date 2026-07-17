import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import java.awt.GridLayout;

public class CalculatorUI {
    private JTextField display;
    private double firstOperand = 0;
    private String operator = "";

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CalculatorUI().build());
    }

    private void build() {
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 350);
        frame.setLocationRelativeTo(null);

        display = new JTextField();
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);

        JPanel buttonPanel = new JPanel(new GridLayout(4, 4, 5, 5));
        String[] labels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "C", "0", "=", "+"
        };

        for (String label : labels) {
            JButton button = new JButton(label);
            button.addActionListener(e -> handleButton(label));
            buttonPanel.add(button);
        }

        frame.add(display, BorderLayout.NORTH);
        frame.add(buttonPanel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    private void handleButton(String value) {
        switch (value) {
            case "C":
                display.setText("");
                firstOperand = 0;
                operator = "";
                break;
            case "=":
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
                break;
            case "+": case "-": case "*": case "/":
                if (!display.getText().isEmpty()) {
                    firstOperand = Double.parseDouble(display.getText());
                    operator = value;
                    display.setText("");
                }
                break;
            default:
                display.setText(display.getText() + value);
        }
    }
}
