import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import java.awt.FlowLayout;

public class TextInputDemo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Text Input Demo");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 150);
            frame.setLocationRelativeTo(null);

            JPanel panel = new JPanel(new FlowLayout());
            JTextField textField = new JTextField(15);
            JButton button = new JButton("Show Text");
            JLabel label = new JLabel("Enter text above and click the button");

            button.addActionListener(e -> {
                String input = textField.getText();
                if (input.isEmpty()) {
                    label.setText("You didn't enter anything!");
                } else {
                    label.setText("You entered: " + input);
                }
            });

            panel.add(textField);
            panel.add(button);
            panel.add(label);
            frame.add(panel);
            frame.setVisible(true);
        });
    }
}
