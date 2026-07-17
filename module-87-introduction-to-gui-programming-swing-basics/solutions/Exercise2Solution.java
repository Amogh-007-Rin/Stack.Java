import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Exercise2Solution {
    private static int count = 0;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Counter App");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 150);
            frame.setLocationRelativeTo(null);

            JPanel panel = new JPanel();
            JLabel countLabel = new JLabel("Count: 0");
            JButton incrementButton = new JButton("Increment");
            JButton resetButton = new JButton("Reset");

            incrementButton.addActionListener(e -> {
                count++;
                countLabel.setText("Count: " + count);
            });

            resetButton.addActionListener(e -> {
                count = 0;
                countLabel.setText("Count: 0");
            });

            panel.add(countLabel);
            panel.add(incrementButton);
            panel.add(resetButton);
            frame.add(panel);
            frame.setVisible(true);
        });
    }
}
