import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EventListenerDemo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Event Listener Demo");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500, 250);
            frame.setLocationRelativeTo(null);

            JPanel panel = new JPanel(new FlowLayout());

            JLabel statusLabel = new JLabel("Interact with the components below");
            JButton actionButton = new JButton("Action");
            JTextField textField = new JTextField(15);

            actionButton.addActionListener((ActionEvent e) -> {
                statusLabel.setText("Button clicked!");
            });

            actionButton.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    statusLabel.setText("Mouse over button");
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    statusLabel.setText("Mouse left button");
                }
            });

            textField.addKeyListener(new KeyAdapter() {
                @Override
                public void keyTyped(KeyEvent e) {
                    statusLabel.setText("Key typed: " + e.getKeyChar());
                }
            });

            panel.add(actionButton);
            panel.add(textField);
            panel.add(statusLabel);
            frame.add(panel);
            frame.setVisible(true);
        });
    }
}
