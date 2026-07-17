import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Exercise4Solution {
    private static StringBuilder repeatedText = new StringBuilder();

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Text Repeater");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);
            frame.setLocationRelativeTo(null);

            JPanel panel = new JPanel();
            JTextField textField = new JTextField(15);
            JButton repeatButton = new JButton("Repeat");
            JLabel outputLabel = new JLabel("<html>Repeated text will appear here</html>");

            repeatButton.addActionListener(e -> {
                String text = textField.getText().trim();
                if (text.isEmpty()) {
                    return;
                }
                if (repeatedText.length() > 0) {
                    repeatedText.append("<br>");
                }
                repeatedText.append(text);
                outputLabel.setText("<html>" + repeatedText.toString() + "</html>");
            });

            panel.add(textField);
            panel.add(repeatButton);
            panel.add(outputLabel);
            frame.add(panel);
            frame.setVisible(true);
        });
    }
}
