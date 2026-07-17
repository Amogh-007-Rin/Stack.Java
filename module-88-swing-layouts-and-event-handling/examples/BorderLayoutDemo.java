import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;

public class BorderLayoutDemo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("BorderLayout Demo");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);
            frame.setLocationRelativeTo(null);

            frame.add(new JButton("North"), BorderLayout.NORTH);
            frame.add(new JButton("South"), BorderLayout.SOUTH);
            frame.add(new JButton("East"), BorderLayout.EAST);
            frame.add(new JButton("West"), BorderLayout.WEST);
            frame.add(new JButton("Center"), BorderLayout.CENTER);

            frame.setVisible(true);
        });
    }
}
