import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.FlowLayout;

public class FlowLayoutDemo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("FlowLayout Demo");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 200);
            frame.setLocationRelativeTo(null);

            JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
            for (int i = 1; i <= 8; i++) {
                panel.add(new JButton("Button " + i));
            }

            frame.add(panel);
            frame.setVisible(true);
        });
    }
}
