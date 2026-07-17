import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.GridLayout;

public class GridLayoutDemo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("GridLayout Demo");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 300);
            frame.setLocationRelativeTo(null);

            JPanel panel = new JPanel(new GridLayout(3, 3, 5, 5));
            for (int i = 1; i <= 9; i++) {
                panel.add(new JButton(String.valueOf(i)));
            }

            frame.add(panel);
            frame.setVisible(true);
        });
    }
}
