import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import java.awt.GridLayout;

public class Exercise1Solution {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Temperature Converter");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(350, 200);
            frame.setLocationRelativeTo(null);

            JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10));
            JTextField inputField = new JTextField();
            JLabel unitLabel = new JLabel("Celsius", JLabel.CENTER);
            JButton toFahrenheit = new JButton("To Fahrenheit");
            JButton toCelsius = new JButton("To Celsius");
            JLabel resultLabel = new JLabel("Result will appear here", JLabel.CENTER);

            toFahrenheit.addActionListener(e -> {
                try {
                    double celsius = Double.parseDouble(inputField.getText());
                    double fahrenheit = (celsius * 9.0 / 5.0) + 32;
                    resultLabel.setText(fahrenheit + " °F");
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input");
                }
            });

            toCelsius.addActionListener(e -> {
                try {
                    double fahrenheit = Double.parseDouble(inputField.getText());
                    double celsius = (fahrenheit - 32) * 5.0 / 9.0;
                    resultLabel.setText(celsius + " °C");
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input");
                }
            });

            panel.add(inputField);
            panel.add(unitLabel);
            panel.add(toFahrenheit);
            panel.add(toCelsius);
            panel.add(new JLabel()); // spacer
            panel.add(resultLabel);

            frame.add(panel);
            frame.setVisible(true);
        });
    }
}
