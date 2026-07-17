import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.Color;

public class Exercise3Solution {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Color Picker");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(350, 200);
            frame.setLocationRelativeTo(null);

            JPanel colorPanel = new JPanel();
            JLabel statusLabel = new JLabel("Current color: None");

            JButton redButton = new JButton("Red");
            JButton greenButton = new JButton("Green");
            JButton blueButton = new JButton("Blue");

            redButton.addActionListener(e -> {
                colorPanel.setBackground(Color.RED);
                statusLabel.setText("Current color: Red");
            });

            greenButton.addActionListener(e -> {
                colorPanel.setBackground(Color.GREEN);
                statusLabel.setText("Current color: Green");
            });

            blueButton.addActionListener(e -> {
                colorPanel.setBackground(Color.BLUE);
                statusLabel.setText("Current color: Blue");
            });

            colorPanel.add(redButton);
            colorPanel.add(greenButton);
            colorPanel.add(blueButton);
            colorPanel.add(statusLabel);

            frame.add(colorPanel);
            frame.setVisible(true);
        });
    }
}
