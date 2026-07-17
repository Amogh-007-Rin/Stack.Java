import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import java.awt.Font;

public class HelloWorldSwing {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Hello World - Swing");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);
            frame.setLocationRelativeTo(null);

            JPanel panel = new JPanel();
            JLabel label = new JLabel("Hello, World!", SwingConstants.CENTER);
            label.setFont(new Font("Serif", Font.BOLD, 24));
            panel.add(label);

            frame.add(panel);
            frame.setVisible(true);
        });
    }
}
