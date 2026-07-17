import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import java.awt.Dimension;
import java.awt.Toolkit;

public class SimpleWindow {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Simple Window");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500, 400);

            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            int x = (screenSize.width - frame.getWidth()) / 2;
            int y = (screenSize.height - frame.getHeight()) / 2;
            frame.setLocation(x, y);

            JLabel label = new JLabel("Welcome to Swing!", JLabel.CENTER);
            label.setHorizontalAlignment(JLabel.CENTER);
            frame.add(label);

            frame.setVisible(true);
        });
    }
}
