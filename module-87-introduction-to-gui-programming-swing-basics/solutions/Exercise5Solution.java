import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Exercise5Solution {
    private static String savedText = "";

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Window Preferences");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 150);
            frame.setLocationRelativeTo(null);

            JPanel panel = new JPanel();
            JTextField textField = new JTextField(15);
            JButton saveButton = new JButton("Save");
            JButton loadButton = new JButton("Load");
            JLabel displayLabel = new JLabel("No saved text");

            saveButton.addActionListener(e -> {
                savedText = textField.getText();
                displayLabel.setText("Saved: \"" + savedText + "\"");
            });

            loadButton.addActionListener(e -> {
                if (savedText.isEmpty()) {
                    displayLabel.setText("Nothing saved yet.");
                } else {
                    displayLabel.setText("Loaded: \"" + savedText + "\"");
                }
            });

            panel.add(textField);
            panel.add(saveButton);
            panel.add(loadButton);
            panel.add(displayLabel);
            frame.add(panel);
            frame.setVisible(true);
        });
    }
}
