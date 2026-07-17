import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Exercise1Solution {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Greeting App");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(350, 150);
            frame.setLocationRelativeTo(null);

            JPanel panel = new JPanel();
            JTextField nameField = new JTextField(15);
            JButton greetButton = new JButton("Greet");
            JLabel resultLabel = new JLabel("Enter your name above");

            greetButton.addActionListener(e -> {
                String name = nameField.getText().trim();
                if (name.isEmpty()) {
                    resultLabel.setText("Please enter a name.");
                } else {
                    resultLabel.setText("Hello, " + name + "!");
                }
            });

            panel.add(nameField);
            panel.add(greetButton);
            panel.add(resultLabel);
            frame.add(panel);
            frame.setVisible(true);
        });
    }
}
