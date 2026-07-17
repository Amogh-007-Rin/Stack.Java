import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import java.awt.GridLayout;

public class Exercise5Solution {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Multiplication Table");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500, 500);
            frame.setLocationRelativeTo(null);

            JPanel gridPanel = new JPanel(new GridLayout(10, 10, 2, 2));
            JLabel statusLabel = new JLabel("Click a cell to see the formula", JLabel.CENTER);

            for (int row = 1; row <= 10; row++) {
                for (int col = 1; col <= 10; col++) {
                    int r = row;
                    int c = col;
                    JButton cell = new JButton(String.valueOf(r * c));
                    cell.addActionListener(e ->
                        statusLabel.setText(r + " x " + c + " = " + (r * c))
                    );
                    gridPanel.add(cell);
                }
            }

            frame.add(gridPanel, BorderLayout.CENTER);
            frame.add(statusLabel, BorderLayout.SOUTH);
            frame.setVisible(true);
        });
    }
}
